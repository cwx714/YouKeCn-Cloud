// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.api



/** * 查询终端设备事件消息列表的请求消息定义。
  *
  * @param deviceType
  *  / (必填)终端设备类型。
  * @param deviceId
  *  / (必填)终端设备ID。格式由对应类型设备自行定义, 设备类型和设备ID组成设备的全局唯一标识。
  * @param subDevice
  *  / (可选)终端子设备标识。如果查询所有主设备和子设备的数据，则为null；否则为只查询主设备或指定子设备的数据，其中：主设备标识为""，充电枪的标识为"plug=充电枪ID"，地锁的标识为"lock=地锁ID"，车位传感器的标识为"detcet=传感器ID"。
  * @param startTime
  *  / (必填)查询的开始时间(北京时间的毫秒时间戳)。单位：毫秒。
  * @param stopTime
  *  / (必填)查询的结束时间(北京时间的毫秒时间戳)。单位：毫秒。
  * @param eventType
  *  / (可选)查询的事件类型。null：返回所有类型的事件消息。
  */
@SerialVersionUID(0L)
final case class QueryEventList(
    deviceType: com.chargerlink.gateway.bean.common.DeviceType,
    deviceId: String,
    subDevice: scala.Option[String] = None,
    startTime: Long,
    stopTime: Long,
    eventType: scala.Option[com.chargerlink.gateway.bean.common.EventType] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[QueryEventList] with com.trueaccord.lenses.Updatable[QueryEventList] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, deviceType.value)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, deviceId)
      if (subDevice.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, subDevice.get) }
      __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(4, startTime)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(5, stopTime)
      if (eventType.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(6, eventType.get.value) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      _output__.writeEnum(1, deviceType.value)
      _output__.writeString(2, deviceId)
      subDevice.foreach { __v =>
        _output__.writeString(3, __v)
      };
      _output__.writeInt64(4, startTime)
      _output__.writeInt64(5, stopTime)
      eventType.foreach { __v =>
        _output__.writeEnum(6, __v.value)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.api.QueryEventList = {
      var __deviceType = this.deviceType
      var __deviceId = this.deviceId
      var __subDevice = this.subDevice
      var __startTime = this.startTime
      var __stopTime = this.stopTime
      var __eventType = this.eventType
      var __requiredFields0: Long = 0xfL
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __deviceType = com.chargerlink.gateway.bean.common.DeviceType.fromValue(_input__.readEnum())
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __deviceId = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffdL
          case 26 =>
            __subDevice = Some(_input__.readString())
          case 32 =>
            __startTime = _input__.readInt64()
            __requiredFields0 &= 0xfffffffffffffffbL
          case 40 =>
            __stopTime = _input__.readInt64()
            __requiredFields0 &= 0xfffffffffffffff7L
          case 48 =>
            __eventType = Some(com.chargerlink.gateway.bean.common.EventType.fromValue(_input__.readEnum()))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.api.QueryEventList(
          deviceType = __deviceType,
          deviceId = __deviceId,
          subDevice = __subDevice,
          startTime = __startTime,
          stopTime = __stopTime,
          eventType = __eventType
      )
    }
    def withDeviceType(__v: com.chargerlink.gateway.bean.common.DeviceType): QueryEventList = copy(deviceType = __v)
    def withDeviceId(__v: String): QueryEventList = copy(deviceId = __v)
    def getSubDevice: String = subDevice.getOrElse("")
    def clearSubDevice: QueryEventList = copy(subDevice = None)
    def withSubDevice(__v: String): QueryEventList = copy(subDevice = Some(__v))
    def withStartTime(__v: Long): QueryEventList = copy(startTime = __v)
    def withStopTime(__v: Long): QueryEventList = copy(stopTime = __v)
    def getEventType: com.chargerlink.gateway.bean.common.EventType = eventType.getOrElse(com.chargerlink.gateway.bean.common.EventType.EVENT_DEVICE_REPORT_LOGIN)
    def clearEventType: QueryEventList = copy(eventType = None)
    def withEventType(__v: com.chargerlink.gateway.bean.common.EventType): QueryEventList = copy(eventType = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => deviceType.javaValueDescriptor
        case 2 => deviceId
        case 3 => subDevice.orNull
        case 4 => startTime
        case 5 => stopTime
        case 6 => eventType.map(_.javaValueDescriptor).orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(deviceType.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PString(deviceId)
        case 3 => subDevice.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => _root_.scalapb.descriptors.PLong(startTime)
        case 5 => _root_.scalapb.descriptors.PLong(stopTime)
        case 6 => eventType.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.api.QueryEventList
}

object QueryEventList extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.api.QueryEventList] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.api.QueryEventList] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.api.QueryEventList = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.api.QueryEventList(
      com.chargerlink.gateway.bean.common.DeviceType.fromValue(__fieldsMap(__fields.get(0)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap(__fields.get(1)).asInstanceOf[String],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]],
      __fieldsMap(__fields.get(3)).asInstanceOf[Long],
      __fieldsMap(__fields.get(4)).asInstanceOf[Long],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.chargerlink.gateway.bean.common.EventType.fromValue(__e.getNumber))
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.api.QueryEventList] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.api.QueryEventList(
        com.chargerlink.gateway.bean.common.DeviceType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).get.as[String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).get.as[Long],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).get.as[Long],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.chargerlink.gateway.bean.common.EventType.fromValue(__e.number))
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiBaseProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiBaseProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.chargerlink.gateway.bean.common.DeviceType
      case 6 => com.chargerlink.gateway.bean.common.EventType
    }
  }
  lazy val defaultInstance = com.chargerlink.gateway.bean.api.QueryEventList(
    deviceType = com.chargerlink.gateway.bean.common.DeviceType.DEVICE_VEHICLE_GB_V1,
    deviceId = "",
    startTime = 0L,
    stopTime = 0L
  )
  implicit class QueryEventListLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.QueryEventList]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.api.QueryEventList](_l) {
    def deviceType: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.DeviceType] = field(_.deviceType)((c_, f_) => c_.copy(deviceType = f_))
    def deviceId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.deviceId)((c_, f_) => c_.copy(deviceId = f_))
    def subDevice: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getSubDevice)((c_, f_) => c_.copy(subDevice = Some(f_)))
    def optionalSubDevice: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.subDevice)((c_, f_) => c_.copy(subDevice = f_))
    def startTime: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.startTime)((c_, f_) => c_.copy(startTime = f_))
    def stopTime: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.stopTime)((c_, f_) => c_.copy(stopTime = f_))
    def eventType: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.EventType] = field(_.getEventType)((c_, f_) => c_.copy(eventType = Some(f_)))
    def optionalEventType: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.chargerlink.gateway.bean.common.EventType]] = field(_.eventType)((c_, f_) => c_.copy(eventType = f_))
  }
  final val DEVICE_TYPE_FIELD_NUMBER = 1
  final val DEVICE_ID_FIELD_NUMBER = 2
  final val SUB_DEVICE_FIELD_NUMBER = 3
  final val START_TIME_FIELD_NUMBER = 4
  final val STOP_TIME_FIELD_NUMBER = 5
  final val EVENT_TYPE_FIELD_NUMBER = 6
}
