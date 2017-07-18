// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.event



/** * 充电桩TCU设备充电开始事件应答的消息定义。其中：event_id为请求消息的消息头的消息序列号。
  *
  * @param svpOrderId
  *  / (必填)业务系统生成的全局唯一充电订单号。如果请求事件消息中的全局充电订单号为空，则返回业务系统重新生成的全局充电订单号；否则，返回原事件消息中的全局充电订单号。
  * @param authStatus
  *  / (可选)业务系统返回的鉴权结果。
  */
@SerialVersionUID(0L)
final case class ResultChgChargeStarted(
    svpOrderId: String,
    authStatus: scala.Option[com.chargerlink.gateway.bean.data.DataChgAuth] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[ResultChgChargeStarted] with com.trueaccord.lenses.Updatable[ResultChgChargeStarted] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, svpOrderId)
      if (authStatus.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(authStatus.get.serializedSize) + authStatus.get.serializedSize }
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
      _output__.writeString(1, svpOrderId)
      authStatus.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.event.ResultChgChargeStarted = {
      var __svpOrderId = this.svpOrderId
      var __authStatus = this.authStatus
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __svpOrderId = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __authStatus = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __authStatus.getOrElse(com.chargerlink.gateway.bean.data.DataChgAuth.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.event.ResultChgChargeStarted(
          svpOrderId = __svpOrderId,
          authStatus = __authStatus
      )
    }
    def withSvpOrderId(__v: String): ResultChgChargeStarted = copy(svpOrderId = __v)
    def getAuthStatus: com.chargerlink.gateway.bean.data.DataChgAuth = authStatus.getOrElse(com.chargerlink.gateway.bean.data.DataChgAuth.defaultInstance)
    def clearAuthStatus: ResultChgChargeStarted = copy(authStatus = None)
    def withAuthStatus(__v: com.chargerlink.gateway.bean.data.DataChgAuth): ResultChgChargeStarted = copy(authStatus = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => svpOrderId
        case 2 => authStatus.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(svpOrderId)
        case 2 => authStatus.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.event.ResultChgChargeStarted
}

object ResultChgChargeStarted extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.ResultChgChargeStarted] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.ResultChgChargeStarted] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.event.ResultChgChargeStarted = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.event.ResultChgChargeStarted(
      __fieldsMap(__fields.get(0)).asInstanceOf[String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.data.DataChgAuth]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.event.ResultChgChargeStarted] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.event.ResultChgChargeStarted(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.data.DataChgAuth]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EventChargerProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EventChargerProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => __out = com.chargerlink.gateway.bean.data.DataChgAuth
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.event.ResultChgChargeStarted(
    svpOrderId = ""
  )
  implicit class ResultChgChargeStartedLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.ResultChgChargeStarted]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.event.ResultChgChargeStarted](_l) {
    def svpOrderId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.svpOrderId)((c_, f_) => c_.copy(svpOrderId = f_))
    def authStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.data.DataChgAuth] = field(_.getAuthStatus)((c_, f_) => c_.copy(authStatus = Some(f_)))
    def optionalAuthStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.chargerlink.gateway.bean.data.DataChgAuth]] = field(_.authStatus)((c_, f_) => c_.copy(authStatus = f_))
  }
  final val SVP_ORDER_ID_FIELD_NUMBER = 1
  final val AUTH_STATUS_FIELD_NUMBER = 2
}