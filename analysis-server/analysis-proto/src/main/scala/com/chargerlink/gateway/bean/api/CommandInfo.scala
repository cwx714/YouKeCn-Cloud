// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.api



/** * 发送给终端设备的命令请求/事件应答的消息定义。其中：命令请求详情的定义分别在以下文件中：ApiVehicle.proto、ApiCharger.proto、ApiRecorder.proto、EventBase.proto。
  *
  * @param deviceType
  *  / (必填)终端设备类型。
  * @param deviceId
  *  / (必填)终端设备ID。
  * @param commandId
  *  / (可选)命令唯一ID(设备内唯一即可)。null或空：表示接入平台不需要等待终端的应答消息就可以返回应答，其他值：表示接入平台需要收到终端的应答消息后才返回应答。
  * @param timeout
  *  / (可选)应答超时时间。单位：毫秒。null或小于等于0：表示一直等待应答。
  */
@SerialVersionUID(0L)
final case class CommandInfo(
    deviceType: com.chargerlink.gateway.bean.common.DeviceType,
    deviceId: String,
    commandId: scala.Option[String] = None,
    timeout: scala.Option[Int] = None,
    detail: com.chargerlink.gateway.bean.api.CommandInfo.Detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.Empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[CommandInfo] with com.trueaccord.lenses.Updatable[CommandInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, deviceType.value)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, deviceId)
      if (commandId.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, commandId.get) }
      if (timeout.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, timeout.get) }
      if (detail.eventResult.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(detail.eventResult.get.serializedSize) + detail.eventResult.get.serializedSize }
      if (detail.vehicleGbV1.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(detail.vehicleGbV1.get.serializedSize) + detail.vehicleGbV1.get.serializedSize }
      if (detail.recorderAmiV1.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(detail.recorderAmiV1.get.serializedSize) + detail.recorderAmiV1.get.serializedSize }
      if (detail.chargerClV2.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(detail.chargerClV2.get.serializedSize) + detail.chargerClV2.get.serializedSize }
      if (detail.parkingClV2.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(detail.parkingClV2.get.serializedSize) + detail.parkingClV2.get.serializedSize }
      if (detail.otherDevice.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(detail.otherDevice.get.serializedSize) + detail.otherDevice.get.serializedSize }
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
      commandId.foreach { __v =>
        _output__.writeString(3, __v)
      };
      timeout.foreach { __v =>
        _output__.writeInt32(4, __v)
      };
      detail.eventResult.foreach { __v =>
        _output__.writeTag(10, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      detail.vehicleGbV1.foreach { __v =>
        _output__.writeTag(100, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      detail.recorderAmiV1.foreach { __v =>
        _output__.writeTag(200, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      detail.chargerClV2.foreach { __v =>
        _output__.writeTag(300, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      detail.parkingClV2.foreach { __v =>
        _output__.writeTag(400, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      detail.otherDevice.foreach { __v =>
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.api.CommandInfo = {
      var __deviceType = this.deviceType
      var __deviceId = this.deviceId
      var __commandId = this.commandId
      var __timeout = this.timeout
      var __requiredFields0: Long = 0x3L
      var __detail = this.detail
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
            __commandId = Some(_input__.readString())
          case 32 =>
            __timeout = Some(_input__.readInt32())
          case 82 =>
            __detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.EventResult(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, detail.eventResult.getOrElse(com.chargerlink.gateway.bean.event.EventResult.defaultInstance)))
          case 802 =>
            __detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.VehicleGbV1(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, detail.vehicleGbV1.getOrElse(com.chargerlink.gateway.bean.api.CommandVehicleGB_v1.defaultInstance)))
          case 1602 =>
            __detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.RecorderAmiV1(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, detail.recorderAmiV1.getOrElse(com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1.defaultInstance)))
          case 2402 =>
            __detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.ChargerClV2(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, detail.chargerClV2.getOrElse(com.chargerlink.gateway.bean.api.CommandChargerCL_v2.defaultInstance)))
          case 3202 =>
            __detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.ParkingClV2(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, detail.parkingClV2.getOrElse(com.chargerlink.gateway.bean.api.CommandParkingCL_v2.defaultInstance)))
          case 7994 =>
            __detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.OtherDevice(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, detail.otherDevice.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.api.CommandInfo(
          deviceType = __deviceType,
          deviceId = __deviceId,
          commandId = __commandId,
          timeout = __timeout,
          detail = __detail
      )
    }
    def withDeviceType(__v: com.chargerlink.gateway.bean.common.DeviceType): CommandInfo = copy(deviceType = __v)
    def withDeviceId(__v: String): CommandInfo = copy(deviceId = __v)
    def getCommandId: String = commandId.getOrElse("")
    def clearCommandId: CommandInfo = copy(commandId = None)
    def withCommandId(__v: String): CommandInfo = copy(commandId = Some(__v))
    def getTimeout: Int = timeout.getOrElse(0)
    def clearTimeout: CommandInfo = copy(timeout = None)
    def withTimeout(__v: Int): CommandInfo = copy(timeout = Some(__v))
    def getEventResult: com.chargerlink.gateway.bean.event.EventResult = detail.eventResult.getOrElse(com.chargerlink.gateway.bean.event.EventResult.defaultInstance)
    def withEventResult(__v: com.chargerlink.gateway.bean.event.EventResult): CommandInfo = copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.EventResult(__v))
    def getVehicleGbV1: com.chargerlink.gateway.bean.api.CommandVehicleGB_v1 = detail.vehicleGbV1.getOrElse(com.chargerlink.gateway.bean.api.CommandVehicleGB_v1.defaultInstance)
    def withVehicleGbV1(__v: com.chargerlink.gateway.bean.api.CommandVehicleGB_v1): CommandInfo = copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.VehicleGbV1(__v))
    def getRecorderAmiV1: com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1 = detail.recorderAmiV1.getOrElse(com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1.defaultInstance)
    def withRecorderAmiV1(__v: com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1): CommandInfo = copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.RecorderAmiV1(__v))
    def getChargerClV2: com.chargerlink.gateway.bean.api.CommandChargerCL_v2 = detail.chargerClV2.getOrElse(com.chargerlink.gateway.bean.api.CommandChargerCL_v2.defaultInstance)
    def withChargerClV2(__v: com.chargerlink.gateway.bean.api.CommandChargerCL_v2): CommandInfo = copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.ChargerClV2(__v))
    def getParkingClV2: com.chargerlink.gateway.bean.api.CommandParkingCL_v2 = detail.parkingClV2.getOrElse(com.chargerlink.gateway.bean.api.CommandParkingCL_v2.defaultInstance)
    def withParkingClV2(__v: com.chargerlink.gateway.bean.api.CommandParkingCL_v2): CommandInfo = copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.ParkingClV2(__v))
    def getOtherDevice: com.google.protobuf.any.Any = detail.otherDevice.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def withOtherDevice(__v: com.google.protobuf.any.Any): CommandInfo = copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.OtherDevice(__v))
    def clearDetail: CommandInfo = copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.Empty)
    def withDetail(__v: com.chargerlink.gateway.bean.api.CommandInfo.Detail): CommandInfo = copy(detail = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => deviceType.javaValueDescriptor
        case 2 => deviceId
        case 3 => commandId.orNull
        case 4 => timeout.orNull
        case 10 => detail.eventResult.orNull
        case 100 => detail.vehicleGbV1.orNull
        case 200 => detail.recorderAmiV1.orNull
        case 300 => detail.chargerClV2.orNull
        case 400 => detail.parkingClV2.orNull
        case 999 => detail.otherDevice.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(deviceType.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PString(deviceId)
        case 3 => commandId.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => timeout.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => detail.eventResult.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 100 => detail.vehicleGbV1.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 200 => detail.recorderAmiV1.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 300 => detail.chargerClV2.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 400 => detail.parkingClV2.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => detail.otherDevice.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.api.CommandInfo
}

object CommandInfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.api.CommandInfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.api.CommandInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.api.CommandInfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.api.CommandInfo(
      com.chargerlink.gateway.bean.common.DeviceType.fromValue(__fieldsMap(__fields.get(0)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap(__fields.get(1)).asInstanceOf[String],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[Int]],
      detail = __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.event.EventResult]].map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.EventResult) orElse
__fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.api.CommandVehicleGB_v1]].map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.VehicleGbV1) orElse
__fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1]].map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.RecorderAmiV1) orElse
__fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.api.CommandChargerCL_v2]].map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.ChargerClV2) orElse
__fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.api.CommandParkingCL_v2]].map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.ParkingClV2) orElse
__fieldsMap.get(__fields.get(9)).asInstanceOf[scala.Option[com.google.protobuf.any.Any]].map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.OtherDevice) getOrElse com.chargerlink.gateway.bean.api.CommandInfo.Detail.Empty
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.api.CommandInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.api.CommandInfo(
        com.chargerlink.gateway.bean.common.DeviceType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).get.as[String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[Int]]),
        detail = __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.event.EventResult]]).map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.EventResult) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(100).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.api.CommandVehicleGB_v1]]).map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.VehicleGbV1) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(200).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1]]).map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.RecorderAmiV1) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(300).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.api.CommandChargerCL_v2]]).map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.ChargerClV2) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(400).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.api.CommandParkingCL_v2]]).map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.ParkingClV2) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).flatMap(_.as[scala.Option[com.google.protobuf.any.Any]]).map(com.chargerlink.gateway.bean.api.CommandInfo.Detail.OtherDevice) getOrElse com.chargerlink.gateway.bean.api.CommandInfo.Detail.Empty
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ApiBaseProto.javaDescriptor.getMessageTypes.get(8)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ApiBaseProto.scalaDescriptor.messages(8)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 10 => __out = com.chargerlink.gateway.bean.event.EventResult
      case 100 => __out = com.chargerlink.gateway.bean.api.CommandVehicleGB_v1
      case 200 => __out = com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1
      case 300 => __out = com.chargerlink.gateway.bean.api.CommandChargerCL_v2
      case 400 => __out = com.chargerlink.gateway.bean.api.CommandParkingCL_v2
      case 999 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.chargerlink.gateway.bean.common.DeviceType
    }
  }
  lazy val defaultInstance = com.chargerlink.gateway.bean.api.CommandInfo(
    deviceType = com.chargerlink.gateway.bean.common.DeviceType.DEVICE_VEHICLE_GB_V1,
    deviceId = ""
  )
  sealed trait Detail extends _root_.com.trueaccord.scalapb.GeneratedOneof {
    def isEmpty: Boolean = false
    def isDefined: Boolean = true
    def isEventResult: Boolean = false
    def isVehicleGbV1: Boolean = false
    def isRecorderAmiV1: Boolean = false
    def isChargerClV2: Boolean = false
    def isParkingClV2: Boolean = false
    def isOtherDevice: Boolean = false
    def eventResult: scala.Option[com.chargerlink.gateway.bean.event.EventResult] = None
    def vehicleGbV1: scala.Option[com.chargerlink.gateway.bean.api.CommandVehicleGB_v1] = None
    def recorderAmiV1: scala.Option[com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1] = None
    def chargerClV2: scala.Option[com.chargerlink.gateway.bean.api.CommandChargerCL_v2] = None
    def parkingClV2: scala.Option[com.chargerlink.gateway.bean.api.CommandParkingCL_v2] = None
    def otherDevice: scala.Option[com.google.protobuf.any.Any] = None
  }
  object Detail extends {
    @SerialVersionUID(0L)
    case object Empty extends com.chargerlink.gateway.bean.api.CommandInfo.Detail {
      override def isEmpty: Boolean = true
      override def isDefined: Boolean = false
      override def number: Int = 0
      override def value: scala.Any = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    case class EventResult(value: com.chargerlink.gateway.bean.event.EventResult) extends com.chargerlink.gateway.bean.api.CommandInfo.Detail {
      override def isEventResult: Boolean = true
      override def eventResult: scala.Option[com.chargerlink.gateway.bean.event.EventResult] = Some(value)
      override def number: Int = 10
    }
    @SerialVersionUID(0L)
    case class VehicleGbV1(value: com.chargerlink.gateway.bean.api.CommandVehicleGB_v1) extends com.chargerlink.gateway.bean.api.CommandInfo.Detail {
      override def isVehicleGbV1: Boolean = true
      override def vehicleGbV1: scala.Option[com.chargerlink.gateway.bean.api.CommandVehicleGB_v1] = Some(value)
      override def number: Int = 100
    }
    @SerialVersionUID(0L)
    case class RecorderAmiV1(value: com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1) extends com.chargerlink.gateway.bean.api.CommandInfo.Detail {
      override def isRecorderAmiV1: Boolean = true
      override def recorderAmiV1: scala.Option[com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1] = Some(value)
      override def number: Int = 200
    }
    @SerialVersionUID(0L)
    case class ChargerClV2(value: com.chargerlink.gateway.bean.api.CommandChargerCL_v2) extends com.chargerlink.gateway.bean.api.CommandInfo.Detail {
      override def isChargerClV2: Boolean = true
      override def chargerClV2: scala.Option[com.chargerlink.gateway.bean.api.CommandChargerCL_v2] = Some(value)
      override def number: Int = 300
    }
    @SerialVersionUID(0L)
    case class ParkingClV2(value: com.chargerlink.gateway.bean.api.CommandParkingCL_v2) extends com.chargerlink.gateway.bean.api.CommandInfo.Detail {
      override def isParkingClV2: Boolean = true
      override def parkingClV2: scala.Option[com.chargerlink.gateway.bean.api.CommandParkingCL_v2] = Some(value)
      override def number: Int = 400
    }
    @SerialVersionUID(0L)
    case class OtherDevice(value: com.google.protobuf.any.Any) extends com.chargerlink.gateway.bean.api.CommandInfo.Detail {
      override def isOtherDevice: Boolean = true
      override def otherDevice: scala.Option[com.google.protobuf.any.Any] = Some(value)
      override def number: Int = 999
    }
  }
  implicit class CommandInfoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.CommandInfo]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.api.CommandInfo](_l) {
    def deviceType: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.DeviceType] = field(_.deviceType)((c_, f_) => c_.copy(deviceType = f_))
    def deviceId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.deviceId)((c_, f_) => c_.copy(deviceId = f_))
    def commandId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getCommandId)((c_, f_) => c_.copy(commandId = Some(f_)))
    def optionalCommandId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.commandId)((c_, f_) => c_.copy(commandId = f_))
    def timeout: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getTimeout)((c_, f_) => c_.copy(timeout = Some(f_)))
    def optionalTimeout: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.timeout)((c_, f_) => c_.copy(timeout = f_))
    def eventResult: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.EventResult] = field(_.getEventResult)((c_, f_) => c_.copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.EventResult(f_)))
    def vehicleGbV1: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.CommandVehicleGB_v1] = field(_.getVehicleGbV1)((c_, f_) => c_.copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.VehicleGbV1(f_)))
    def recorderAmiV1: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.CommandRecorderAMI_v1] = field(_.getRecorderAmiV1)((c_, f_) => c_.copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.RecorderAmiV1(f_)))
    def chargerClV2: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.CommandChargerCL_v2] = field(_.getChargerClV2)((c_, f_) => c_.copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.ChargerClV2(f_)))
    def parkingClV2: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.CommandParkingCL_v2] = field(_.getParkingClV2)((c_, f_) => c_.copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.ParkingClV2(f_)))
    def otherDevice: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getOtherDevice)((c_, f_) => c_.copy(detail = com.chargerlink.gateway.bean.api.CommandInfo.Detail.OtherDevice(f_)))
    def detail: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.api.CommandInfo.Detail] = field(_.detail)((c_, f_) => c_.copy(detail = f_))
  }
  final val DEVICE_TYPE_FIELD_NUMBER = 1
  final val DEVICE_ID_FIELD_NUMBER = 2
  final val COMMAND_ID_FIELD_NUMBER = 3
  final val TIMEOUT_FIELD_NUMBER = 4
  final val EVENT_RESULT_FIELD_NUMBER = 10
  final val VEHICLE_GB_V1_FIELD_NUMBER = 100
  final val RECORDER_AMI_V1_FIELD_NUMBER = 200
  final val CHARGER_CL_V2_FIELD_NUMBER = 300
  final val PARKING_CL_V2_FIELD_NUMBER = 400
  final val OTHER_DEVICE_FIELD_NUMBER = 999
}