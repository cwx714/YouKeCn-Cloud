// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.api



/** * 注册终端设备的上行实时上报数据消息推送的请求。
  *
  * @param recordInterval
  *  / (必填)回调数据的时间间隔。接入平台在指定时间间隔内只产生1条推送消息。单位：秒。
  * @param withDataTypes
  *  / (可选)注册的上报数据类型的推送条件。只有数据类型在此列表中的上报数据消息才会被推送。空列表：表示注册所有类型的上报数据消息。
  * @param withDeviceTypes
  *  / (可选)注册的终端类型的推送条件。只有在此列表中的终端类型产生的消息才会被推送。空列表：表示注册所有设备类型的上报数据消息。
  * @param withDeviceIds
  *  / (可选)注册的终端ID的推送条件。只有在此列表中的终端ID产生的消息才会被推送。空列表：表示注册所有设备ID的上报数据消息。
  */
@SerialVersionUID(0L)
final case class PushDataRequest(
    recordInterval: Int,
    withDataTypes: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.common.DataType] = _root_.scala.collection.Seq.empty,
    withDeviceTypes: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.common.DeviceType] = _root_.scala.collection.Seq.empty,
    withDeviceIds: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PushDataRequest] with com.trueaccord.lenses.Updatable[PushDataRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, recordInterval)
      withDataTypes.foreach(withDataTypes => __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, withDataTypes.value))
      withDeviceTypes.foreach(withDeviceTypes => __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(3, withDeviceTypes.value))
      withDeviceIds.foreach(withDeviceIds => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, withDeviceIds))
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
      _output__.writeUInt32(1, recordInterval)
      withDataTypes.foreach { __v =>
        _output__.writeEnum(2, __v.value)
      };
      withDeviceTypes.foreach { __v =>
        _output__.writeEnum(3, __v.value)
      };
      withDeviceIds.foreach { __v =>
        _output__.writeString(4, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.api.PushDataRequest = {
      var __recordInterval = this.recordInterval
      val __withDataTypes = (_root_.scala.collection.immutable.Vector.newBuilder[com.chargerlink.gateway.bean.common.DataType] ++= this.withDataTypes)
      val __withDeviceTypes = (_root_.scala.collection.immutable.Vector.newBuilder[com.chargerlink.gateway.bean.common.DeviceType] ++= this.withDeviceTypes)
      val __withDeviceIds = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.withDeviceIds)
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __recordInterval = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __withDataTypes += com.chargerlink.gateway.bean.common.DataType.fromValue(_input__.readEnum())
          case 18 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __withDataTypes += com.chargerlink.gateway.bean.common.DataType.fromValue(_input__.readEnum)
            }
            _input__.popLimit(oldLimit)
          }
          case 24 =>
            __withDeviceTypes += com.chargerlink.gateway.bean.common.DeviceType.fromValue(_input__.readEnum())
          case 26 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __withDeviceTypes += com.chargerlink.gateway.bean.common.DeviceType.fromValue(_input__.readEnum)
            }
            _input__.popLimit(oldLimit)
          }
          case 34 =>
            __withDeviceIds += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.api.PushDataRequest(
          recordInterval = __recordInterval,
          withDataTypes = __withDataTypes.result(),
          withDeviceTypes = __withDeviceTypes.result(),
          withDeviceIds = __withDeviceIds.result()
      )
    }
    def withRecordInterval(__v: Int): PushDataRequest = copy(recordInterval = __v)
    def clearWithDataTypes = copy(withDataTypes = _root_.scala.collection.Seq.empty)
    def addWithDataTypes(__vs: com.chargerlink.gateway.bean.common.DataType*): PushDataRequest = addAllWithDataTypes(__vs)
    def addAllWithDataTypes(__vs: TraversableOnce[com.chargerlink.gateway.bean.common.DataType]): PushDataRequest = copy(withDataTypes = withDataTypes ++ __vs)
    def withWithDataTypes(__v: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.common.DataType]): PushDataRequest = copy(withDataTypes = __v)
    def clearWithDeviceTypes = copy(withDeviceTypes = _root_.scala.collection.Seq.empty)
    def addWithDeviceTypes(__vs: com.chargerlink.gateway.bean.common.DeviceType*): PushDataRequest = addAllWithDeviceTypes(__vs)
    def addAllWithDeviceTypes(__vs: TraversableOnce[com.chargerlink.gateway.bean.common.DeviceType]): PushDataRequest = copy(withDeviceTypes = withDeviceTypes ++ __vs)
    def withWithDeviceTypes(__v: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.common.DeviceType]): PushDataRequest = copy(withDeviceTypes = __v)
    def clearWithDeviceIds = copy(withDeviceIds = _root_.scala.collection.Seq.empty)
    def addWithDeviceIds(__vs: String*): PushDataRequest = addAllWithDeviceIds(__vs)
    def addAllWithDeviceIds(__vs: TraversableOnce[String]): PushDataRequest = copy(withDeviceIds = withDeviceIds ++ __vs)
    def withWithDeviceIds(__v: _root_.scala.collection.Seq[String]): PushDataRequest = copy(withDeviceIds = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => recordInterval
        case 2 => withDataTypes.map(_.javaValueDescriptor)(_root_.scala.collection.breakOut)
        case 3 => withDeviceTypes.map(_.javaValueDescriptor)(_root_.scala.collection.breakOut)
        case 4 => withDeviceIds
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(recordInterval)
        case 2 => _root_.scalapb.descriptors.PRepeated(withDataTypes.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor))(_root_.scala.collection.breakOut))
        case 3 => _root_.scalapb.descriptors.PRepeated(withDeviceTypes.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor))(_root_.scala.collection.breakOut))
        case 4 => _root_.scalapb.descriptors.PRepeated(withDeviceIds.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.api.PushDataRequest
}

object PushDataRequest extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.api.PushDataRequest] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.api.PushDataRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.api.PushDataRequest = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.api.PushDataRequest(
      __fieldsMap(__fields.get(0)).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.chargerlink.gateway.bean.common.DataType.fromValue(__e.getNumber))(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.chargerlink.gateway.bean.common.DeviceType.fromValue(__e.getNumber))(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.collection.Seq[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.api.PushDataRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.api.PushDataRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[_root_.scalapb.descriptors.EnumValueDescriptor]]).getOrElse(_root_.scala.collection.Seq.empty).map(__e => com.chargerlink.gateway.bean.common.DataType.fromValue(__e.number))(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[_root_.scalapb.descriptors.EnumValueDescriptor]]).getOrElse(_root_.scala.collection.Seq.empty).map(__e => com.chargerlink.gateway.bean.common.DeviceType.fromValue(__e.number))(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiBaseProto.javaDescriptor.getMessageTypes.get(12)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiBaseProto.scalaDescriptor.messages(12)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => com.chargerlink.gateway.bean.common.DataType
      case 3 => com.chargerlink.gateway.bean.common.DeviceType
    }
  }
  lazy val defaultInstance = com.chargerlink.gateway.bean.api.PushDataRequest(
    recordInterval = 0
  )
  implicit class PushDataRequestLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.PushDataRequest]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.api.PushDataRequest](_l) {
    def recordInterval: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.recordInterval)((c_, f_) => c_.copy(recordInterval = f_))
    def withDataTypes: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.chargerlink.gateway.bean.common.DataType]] = field(_.withDataTypes)((c_, f_) => c_.copy(withDataTypes = f_))
    def withDeviceTypes: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.chargerlink.gateway.bean.common.DeviceType]] = field(_.withDeviceTypes)((c_, f_) => c_.copy(withDeviceTypes = f_))
    def withDeviceIds: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.withDeviceIds)((c_, f_) => c_.copy(withDeviceIds = f_))
  }
  final val RECORD_INTERVAL_FIELD_NUMBER = 1
  final val WITH_DATA_TYPES_FIELD_NUMBER = 2
  final val WITH_DEVICE_TYPES_FIELD_NUMBER = 3
  final val WITH_DEVICE_IDS_FIELD_NUMBER = 4
}