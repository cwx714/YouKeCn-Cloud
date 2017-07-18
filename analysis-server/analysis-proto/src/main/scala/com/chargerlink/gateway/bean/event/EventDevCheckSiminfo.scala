// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.event



/** * 通用终端设备查询SIM卡流量请求事件的消息定义。
  *
  * @param msisdn
  *  / (可选)设备SIM卡的手机号(去掉+86前缀)。
  * @param iccid
  *  / (可选)设备SIM卡的ICCID号。
  * @param imsi
  *  / (可选)设备SIM卡的IMSI号。
  */
@SerialVersionUID(0L)
final case class EventDevCheckSiminfo(
    msisdn: scala.Option[String] = None,
    iccid: scala.Option[String] = None,
    imsi: scala.Option[String] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EventDevCheckSiminfo] with com.trueaccord.lenses.Updatable[EventDevCheckSiminfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (msisdn.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, msisdn.get) }
      if (iccid.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, iccid.get) }
      if (imsi.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, imsi.get) }
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
      msisdn.foreach { __v =>
        _output__.writeString(1, __v)
      };
      iccid.foreach { __v =>
        _output__.writeString(2, __v)
      };
      imsi.foreach { __v =>
        _output__.writeString(3, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.event.EventDevCheckSiminfo = {
      var __msisdn = this.msisdn
      var __iccid = this.iccid
      var __imsi = this.imsi
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __msisdn = Some(_input__.readString())
          case 18 =>
            __iccid = Some(_input__.readString())
          case 26 =>
            __imsi = Some(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      com.chargerlink.gateway.bean.event.EventDevCheckSiminfo(
          msisdn = __msisdn,
          iccid = __iccid,
          imsi = __imsi
      )
    }
    def getMsisdn: String = msisdn.getOrElse("")
    def clearMsisdn: EventDevCheckSiminfo = copy(msisdn = None)
    def withMsisdn(__v: String): EventDevCheckSiminfo = copy(msisdn = Some(__v))
    def getIccid: String = iccid.getOrElse("")
    def clearIccid: EventDevCheckSiminfo = copy(iccid = None)
    def withIccid(__v: String): EventDevCheckSiminfo = copy(iccid = Some(__v))
    def getImsi: String = imsi.getOrElse("")
    def clearImsi: EventDevCheckSiminfo = copy(imsi = None)
    def withImsi(__v: String): EventDevCheckSiminfo = copy(imsi = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => msisdn.orNull
        case 2 => iccid.orNull
        case 3 => imsi.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => msisdn.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => iccid.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => imsi.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.event.EventDevCheckSiminfo
}

object EventDevCheckSiminfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckSiminfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckSiminfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.event.EventDevCheckSiminfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.event.EventDevCheckSiminfo(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.event.EventDevCheckSiminfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.event.EventDevCheckSiminfo(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EventDeviceProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EventDeviceProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.event.EventDevCheckSiminfo(
  )
  implicit class EventDevCheckSiminfoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckSiminfo]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckSiminfo](_l) {
    def msisdn: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getMsisdn)((c_, f_) => c_.copy(msisdn = Some(f_)))
    def optionalMsisdn: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.msisdn)((c_, f_) => c_.copy(msisdn = f_))
    def iccid: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getIccid)((c_, f_) => c_.copy(iccid = Some(f_)))
    def optionalIccid: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.iccid)((c_, f_) => c_.copy(iccid = f_))
    def imsi: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getImsi)((c_, f_) => c_.copy(imsi = Some(f_)))
    def optionalImsi: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.imsi)((c_, f_) => c_.copy(imsi = f_))
  }
  final val MSISDN_FIELD_NUMBER = 1
  final val ICCID_FIELD_NUMBER = 2
  final val IMSI_FIELD_NUMBER = 3
}
