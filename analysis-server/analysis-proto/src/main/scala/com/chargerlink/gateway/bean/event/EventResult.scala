// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.event



/** * 终端设备事件应答的消息定义。其中：事件应答详情的定义分别在以下文件中：EventDevice.proto、EventVehicle.proto、EventCharger.proto、EventRecorder.proto。
  *
  * @param eventId
  *  / (必填)原始事件消息的事件唯一ID(设备内唯一即可)。
  */
@SerialVersionUID(0L)
final case class EventResult(
    eventId: String,
    resultDetail: com.chargerlink.gateway.bean.event.EventResult.ResultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.Empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EventResult] with com.trueaccord.lenses.Updatable[EventResult] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, eventId)
      if (resultDetail.devCheckRegister.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(resultDetail.devCheckRegister.get.serializedSize) + resultDetail.devCheckRegister.get.serializedSize }
      if (resultDetail.chgChargeStarted.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(resultDetail.chgChargeStarted.get.serializedSize) + resultDetail.chgChargeStarted.get.serializedSize }
      if (resultDetail.chgChargeStopped.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(resultDetail.chgChargeStopped.get.serializedSize) + resultDetail.chgChargeStopped.get.serializedSize }
      if (resultDetail.chgChargeAuth.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(resultDetail.chgChargeAuth.get.serializedSize) + resultDetail.chgChargeAuth.get.serializedSize }
      if (resultDetail.chgChargeProcess.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(resultDetail.chgChargeProcess.get.serializedSize) + resultDetail.chgChargeProcess.get.serializedSize }
      if (resultDetail.chgOrderList.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(resultDetail.chgOrderList.get.serializedSize) + resultDetail.chgOrderList.get.serializedSize }
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
      _output__.writeString(1, eventId)
      resultDetail.devCheckRegister.foreach { __v =>
        _output__.writeTag(20, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      resultDetail.chgChargeStarted.foreach { __v =>
        _output__.writeTag(300, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      resultDetail.chgChargeStopped.foreach { __v =>
        _output__.writeTag(301, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      resultDetail.chgChargeAuth.foreach { __v =>
        _output__.writeTag(302, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      resultDetail.chgChargeProcess.foreach { __v =>
        _output__.writeTag(303, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      resultDetail.chgOrderList.foreach { __v =>
        _output__.writeTag(304, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.event.EventResult = {
      var __eventId = this.eventId
      var __requiredFields0: Long = 0x1L
      var __resultDetail = this.resultDetail
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __eventId = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 162 =>
            __resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.DevCheckRegister(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, resultDetail.devCheckRegister.getOrElse(com.chargerlink.gateway.bean.event.ResultDevCheckRegister.defaultInstance)))
          case 2402 =>
            __resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStarted(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, resultDetail.chgChargeStarted.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeStarted.defaultInstance)))
          case 2410 =>
            __resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStopped(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, resultDetail.chgChargeStopped.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeStopped.defaultInstance)))
          case 2418 =>
            __resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeAuth(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, resultDetail.chgChargeAuth.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeAuth.defaultInstance)))
          case 2426 =>
            __resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeProcess(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, resultDetail.chgChargeProcess.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeProcess.defaultInstance)))
          case 2434 =>
            __resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgOrderList(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, resultDetail.chgOrderList.getOrElse(com.chargerlink.gateway.bean.event.ResultChgOrderList.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.event.EventResult(
          eventId = __eventId,
          resultDetail = __resultDetail
      )
    }
    def withEventId(__v: String): EventResult = copy(eventId = __v)
    def getDevCheckRegister: com.chargerlink.gateway.bean.event.ResultDevCheckRegister = resultDetail.devCheckRegister.getOrElse(com.chargerlink.gateway.bean.event.ResultDevCheckRegister.defaultInstance)
    def withDevCheckRegister(__v: com.chargerlink.gateway.bean.event.ResultDevCheckRegister): EventResult = copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.DevCheckRegister(__v))
    def getChgChargeStarted: com.chargerlink.gateway.bean.event.ResultChgChargeStarted = resultDetail.chgChargeStarted.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeStarted.defaultInstance)
    def withChgChargeStarted(__v: com.chargerlink.gateway.bean.event.ResultChgChargeStarted): EventResult = copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStarted(__v))
    def getChgChargeStopped: com.chargerlink.gateway.bean.event.ResultChgChargeStopped = resultDetail.chgChargeStopped.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeStopped.defaultInstance)
    def withChgChargeStopped(__v: com.chargerlink.gateway.bean.event.ResultChgChargeStopped): EventResult = copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStopped(__v))
    def getChgChargeAuth: com.chargerlink.gateway.bean.event.ResultChgChargeAuth = resultDetail.chgChargeAuth.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeAuth.defaultInstance)
    def withChgChargeAuth(__v: com.chargerlink.gateway.bean.event.ResultChgChargeAuth): EventResult = copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeAuth(__v))
    def getChgChargeProcess: com.chargerlink.gateway.bean.event.ResultChgChargeProcess = resultDetail.chgChargeProcess.getOrElse(com.chargerlink.gateway.bean.event.ResultChgChargeProcess.defaultInstance)
    def withChgChargeProcess(__v: com.chargerlink.gateway.bean.event.ResultChgChargeProcess): EventResult = copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeProcess(__v))
    def getChgOrderList: com.chargerlink.gateway.bean.event.ResultChgOrderList = resultDetail.chgOrderList.getOrElse(com.chargerlink.gateway.bean.event.ResultChgOrderList.defaultInstance)
    def withChgOrderList(__v: com.chargerlink.gateway.bean.event.ResultChgOrderList): EventResult = copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgOrderList(__v))
    def clearResultDetail: EventResult = copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.Empty)
    def withResultDetail(__v: com.chargerlink.gateway.bean.event.EventResult.ResultDetail): EventResult = copy(resultDetail = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => eventId
        case 20 => resultDetail.devCheckRegister.orNull
        case 300 => resultDetail.chgChargeStarted.orNull
        case 301 => resultDetail.chgChargeStopped.orNull
        case 302 => resultDetail.chgChargeAuth.orNull
        case 303 => resultDetail.chgChargeProcess.orNull
        case 304 => resultDetail.chgOrderList.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(eventId)
        case 20 => resultDetail.devCheckRegister.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 300 => resultDetail.chgChargeStarted.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 301 => resultDetail.chgChargeStopped.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 302 => resultDetail.chgChargeAuth.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 303 => resultDetail.chgChargeProcess.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 304 => resultDetail.chgOrderList.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.event.EventResult
}

object EventResult extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventResult] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventResult] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.event.EventResult = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.event.EventResult(
      __fieldsMap(__fields.get(0)).asInstanceOf[String],
      resultDetail = __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.event.ResultDevCheckRegister]].map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.DevCheckRegister) orElse
__fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStarted]].map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStarted) orElse
__fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStopped]].map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStopped) orElse
__fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeAuth]].map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeAuth) orElse
__fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeProcess]].map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeProcess) orElse
__fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.event.ResultChgOrderList]].map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgOrderList) getOrElse com.chargerlink.gateway.bean.event.EventResult.ResultDetail.Empty
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.event.EventResult] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.event.EventResult(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[String],
        resultDetail = __fieldsMap.get(scalaDescriptor.findFieldByNumber(20).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.event.ResultDevCheckRegister]]).map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.DevCheckRegister) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(300).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStarted]]).map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStarted) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(301).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStopped]]).map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStopped) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(302).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeAuth]]).map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeAuth) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(303).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeProcess]]).map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeProcess) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(304).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.event.ResultChgOrderList]]).map(com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgOrderList) getOrElse com.chargerlink.gateway.bean.event.EventResult.ResultDetail.Empty
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EventBaseProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EventBaseProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 20 => __out = com.chargerlink.gateway.bean.event.ResultDevCheckRegister
      case 300 => __out = com.chargerlink.gateway.bean.event.ResultChgChargeStarted
      case 301 => __out = com.chargerlink.gateway.bean.event.ResultChgChargeStopped
      case 302 => __out = com.chargerlink.gateway.bean.event.ResultChgChargeAuth
      case 303 => __out = com.chargerlink.gateway.bean.event.ResultChgChargeProcess
      case 304 => __out = com.chargerlink.gateway.bean.event.ResultChgOrderList
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.event.EventResult(
    eventId = ""
  )
  sealed trait ResultDetail extends _root_.com.trueaccord.scalapb.GeneratedOneof {
    def isEmpty: Boolean = false
    def isDefined: Boolean = true
    def isDevCheckRegister: Boolean = false
    def isChgChargeStarted: Boolean = false
    def isChgChargeStopped: Boolean = false
    def isChgChargeAuth: Boolean = false
    def isChgChargeProcess: Boolean = false
    def isChgOrderList: Boolean = false
    def devCheckRegister: scala.Option[com.chargerlink.gateway.bean.event.ResultDevCheckRegister] = None
    def chgChargeStarted: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStarted] = None
    def chgChargeStopped: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStopped] = None
    def chgChargeAuth: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeAuth] = None
    def chgChargeProcess: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeProcess] = None
    def chgOrderList: scala.Option[com.chargerlink.gateway.bean.event.ResultChgOrderList] = None
  }
  object ResultDetail extends {
    @SerialVersionUID(0L)
    case object Empty extends com.chargerlink.gateway.bean.event.EventResult.ResultDetail {
      override def isEmpty: Boolean = true
      override def isDefined: Boolean = false
      override def number: Int = 0
      override def value: scala.Any = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    case class DevCheckRegister(value: com.chargerlink.gateway.bean.event.ResultDevCheckRegister) extends com.chargerlink.gateway.bean.event.EventResult.ResultDetail {
      override def isDevCheckRegister: Boolean = true
      override def devCheckRegister: scala.Option[com.chargerlink.gateway.bean.event.ResultDevCheckRegister] = Some(value)
      override def number: Int = 20
    }
    @SerialVersionUID(0L)
    case class ChgChargeStarted(value: com.chargerlink.gateway.bean.event.ResultChgChargeStarted) extends com.chargerlink.gateway.bean.event.EventResult.ResultDetail {
      override def isChgChargeStarted: Boolean = true
      override def chgChargeStarted: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStarted] = Some(value)
      override def number: Int = 300
    }
    @SerialVersionUID(0L)
    case class ChgChargeStopped(value: com.chargerlink.gateway.bean.event.ResultChgChargeStopped) extends com.chargerlink.gateway.bean.event.EventResult.ResultDetail {
      override def isChgChargeStopped: Boolean = true
      override def chgChargeStopped: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeStopped] = Some(value)
      override def number: Int = 301
    }
    @SerialVersionUID(0L)
    case class ChgChargeAuth(value: com.chargerlink.gateway.bean.event.ResultChgChargeAuth) extends com.chargerlink.gateway.bean.event.EventResult.ResultDetail {
      override def isChgChargeAuth: Boolean = true
      override def chgChargeAuth: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeAuth] = Some(value)
      override def number: Int = 302
    }
    @SerialVersionUID(0L)
    case class ChgChargeProcess(value: com.chargerlink.gateway.bean.event.ResultChgChargeProcess) extends com.chargerlink.gateway.bean.event.EventResult.ResultDetail {
      override def isChgChargeProcess: Boolean = true
      override def chgChargeProcess: scala.Option[com.chargerlink.gateway.bean.event.ResultChgChargeProcess] = Some(value)
      override def number: Int = 303
    }
    @SerialVersionUID(0L)
    case class ChgOrderList(value: com.chargerlink.gateway.bean.event.ResultChgOrderList) extends com.chargerlink.gateway.bean.event.EventResult.ResultDetail {
      override def isChgOrderList: Boolean = true
      override def chgOrderList: scala.Option[com.chargerlink.gateway.bean.event.ResultChgOrderList] = Some(value)
      override def number: Int = 304
    }
  }
  implicit class EventResultLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.EventResult]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.event.EventResult](_l) {
    def eventId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.eventId)((c_, f_) => c_.copy(eventId = f_))
    def devCheckRegister: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.ResultDevCheckRegister] = field(_.getDevCheckRegister)((c_, f_) => c_.copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.DevCheckRegister(f_)))
    def chgChargeStarted: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.ResultChgChargeStarted] = field(_.getChgChargeStarted)((c_, f_) => c_.copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStarted(f_)))
    def chgChargeStopped: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.ResultChgChargeStopped] = field(_.getChgChargeStopped)((c_, f_) => c_.copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeStopped(f_)))
    def chgChargeAuth: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.ResultChgChargeAuth] = field(_.getChgChargeAuth)((c_, f_) => c_.copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeAuth(f_)))
    def chgChargeProcess: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.ResultChgChargeProcess] = field(_.getChgChargeProcess)((c_, f_) => c_.copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgChargeProcess(f_)))
    def chgOrderList: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.ResultChgOrderList] = field(_.getChgOrderList)((c_, f_) => c_.copy(resultDetail = com.chargerlink.gateway.bean.event.EventResult.ResultDetail.ChgOrderList(f_)))
    def resultDetail: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.EventResult.ResultDetail] = field(_.resultDetail)((c_, f_) => c_.copy(resultDetail = f_))
  }
  final val EVENT_ID_FIELD_NUMBER = 1
  final val DEV_CHECK_REGISTER_FIELD_NUMBER = 20
  final val CHG_CHARGE_STARTED_FIELD_NUMBER = 300
  final val CHG_CHARGE_STOPPED_FIELD_NUMBER = 301
  final val CHG_CHARGE_AUTH_FIELD_NUMBER = 302
  final val CHG_CHARGE_PROCESS_FIELD_NUMBER = 303
  final val CHG_ORDER_LIST_FIELD_NUMBER = 304
}