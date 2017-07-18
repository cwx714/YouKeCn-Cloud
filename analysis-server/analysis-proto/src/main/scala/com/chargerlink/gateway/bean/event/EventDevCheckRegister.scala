// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.event



/** * 终端设备注册激活请求事件的消息定义。
  *
  * @param deviceInfo
  *  / (必填)注册激活的设备信息。其中：regist_status必须为false；如果device_id为空串，则表示业务平台必须在应答消息中返回新生成的唯一设备ID。
  * @param activateCode
  *  / (可选)设备激活验证码。如果为空，则表示业务平台不通过激活码验证激活的设备。
  */
@SerialVersionUID(0L)
final case class EventDevCheckRegister(
    deviceInfo: com.chargerlink.gateway.bean.device.DeviceInfo,
    activateCode: scala.Option[String] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EventDevCheckRegister] with com.trueaccord.lenses.Updatable[EventDevCheckRegister] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(deviceInfo.serializedSize) + deviceInfo.serializedSize
      if (activateCode.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, activateCode.get) }
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
      _output__.writeTag(1, 2)
      _output__.writeUInt32NoTag(deviceInfo.serializedSize)
      deviceInfo.writeTo(_output__)
      activateCode.foreach { __v =>
        _output__.writeString(2, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.event.EventDevCheckRegister = {
      var __deviceInfo = this.deviceInfo
      var __activateCode = this.activateCode
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __deviceInfo = _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __deviceInfo)
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __activateCode = Some(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.event.EventDevCheckRegister(
          deviceInfo = __deviceInfo,
          activateCode = __activateCode
      )
    }
    def withDeviceInfo(__v: com.chargerlink.gateway.bean.device.DeviceInfo): EventDevCheckRegister = copy(deviceInfo = __v)
    def getActivateCode: String = activateCode.getOrElse("")
    def clearActivateCode: EventDevCheckRegister = copy(activateCode = None)
    def withActivateCode(__v: String): EventDevCheckRegister = copy(activateCode = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => deviceInfo
        case 2 => activateCode.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => deviceInfo.toPMessage
        case 2 => activateCode.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.event.EventDevCheckRegister
}

object EventDevCheckRegister extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckRegister] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckRegister] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.event.EventDevCheckRegister = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.event.EventDevCheckRegister(
      __fieldsMap(__fields.get(0)).asInstanceOf[com.chargerlink.gateway.bean.device.DeviceInfo],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.event.EventDevCheckRegister] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.event.EventDevCheckRegister(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[com.chargerlink.gateway.bean.device.DeviceInfo],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EventDeviceProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EventDeviceProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = com.chargerlink.gateway.bean.device.DeviceInfo
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.event.EventDevCheckRegister(
    deviceInfo = com.chargerlink.gateway.bean.device.DeviceInfo.defaultInstance
  )
  implicit class EventDevCheckRegisterLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckRegister]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckRegister](_l) {
    def deviceInfo: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.device.DeviceInfo] = field(_.deviceInfo)((c_, f_) => c_.copy(deviceInfo = f_))
    def activateCode: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getActivateCode)((c_, f_) => c_.copy(activateCode = Some(f_)))
    def optionalActivateCode: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.activateCode)((c_, f_) => c_.copy(activateCode = f_))
  }
  final val DEVICE_INFO_FIELD_NUMBER = 1
  final val ACTIVATE_CODE_FIELD_NUMBER = 2
}
