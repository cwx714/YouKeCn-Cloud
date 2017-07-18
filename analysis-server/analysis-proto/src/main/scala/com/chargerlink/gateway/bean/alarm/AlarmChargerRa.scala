// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.alarm



/** * 接入平台根据充电桩TCU设备的实时上报数据计算出的报警数据的消息定义。报警代码：120000～130000。必须与报警代码字典表的数据一致。
  *
  * @param alarmParam
  *  / (必填)计算报警的配置参数。
  * @param dataList
  *  / (可选)报警时充电桩TCU设备实时上报的数据列表。
  * @param extendData
  *  / (可选)自定义扩展的报警数据。
  */
@SerialVersionUID(0L)
final case class AlarmChargerRa(
    alarmParam: com.chargerlink.gateway.bean.alarm.AlarmParameter,
    dataList: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataCharger] = _root_.scala.collection.Seq.empty,
    extendData: scala.Option[com.google.protobuf.any.Any] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[AlarmChargerRa] with com.trueaccord.lenses.Updatable[AlarmChargerRa] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmParam.serializedSize) + alarmParam.serializedSize
      dataList.foreach(dataList => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataList.serializedSize) + dataList.serializedSize)
      if (extendData.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(extendData.get.serializedSize) + extendData.get.serializedSize }
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
      _output__.writeUInt32NoTag(alarmParam.serializedSize)
      alarmParam.writeTo(_output__)
      dataList.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      extendData.foreach { __v =>
        _output__.writeTag(100, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.alarm.AlarmChargerRa = {
      var __alarmParam = this.alarmParam
      val __dataList = (_root_.scala.collection.immutable.Vector.newBuilder[com.chargerlink.gateway.bean.data.DataCharger] ++= this.dataList)
      var __extendData = this.extendData
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __alarmParam = _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __alarmParam)
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __dataList += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.chargerlink.gateway.bean.data.DataCharger.defaultInstance)
          case 802 =>
            __extendData = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __extendData.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.alarm.AlarmChargerRa(
          alarmParam = __alarmParam,
          dataList = __dataList.result(),
          extendData = __extendData
      )
    }
    def withAlarmParam(__v: com.chargerlink.gateway.bean.alarm.AlarmParameter): AlarmChargerRa = copy(alarmParam = __v)
    def clearDataList = copy(dataList = _root_.scala.collection.Seq.empty)
    def addDataList(__vs: com.chargerlink.gateway.bean.data.DataCharger*): AlarmChargerRa = addAllDataList(__vs)
    def addAllDataList(__vs: TraversableOnce[com.chargerlink.gateway.bean.data.DataCharger]): AlarmChargerRa = copy(dataList = dataList ++ __vs)
    def withDataList(__v: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataCharger]): AlarmChargerRa = copy(dataList = __v)
    def getExtendData: com.google.protobuf.any.Any = extendData.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearExtendData: AlarmChargerRa = copy(extendData = None)
    def withExtendData(__v: com.google.protobuf.any.Any): AlarmChargerRa = copy(extendData = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => alarmParam
        case 2 => dataList
        case 100 => extendData.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => alarmParam.toPMessage
        case 2 => _root_.scalapb.descriptors.PRepeated(dataList.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 100 => extendData.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.alarm.AlarmChargerRa
}

object AlarmChargerRa extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.alarm.AlarmChargerRa] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.alarm.AlarmChargerRa] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.alarm.AlarmChargerRa = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.alarm.AlarmChargerRa(
      __fieldsMap(__fields.get(0)).asInstanceOf[com.chargerlink.gateway.bean.alarm.AlarmParameter],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataCharger]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.any.Any]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.alarm.AlarmChargerRa] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.alarm.AlarmChargerRa(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[com.chargerlink.gateway.bean.alarm.AlarmParameter],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataCharger]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(100).get).flatMap(_.as[scala.Option[com.google.protobuf.any.Any]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AlarmChargerProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AlarmChargerProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = com.chargerlink.gateway.bean.alarm.AlarmParameter
      case 2 => __out = com.chargerlink.gateway.bean.data.DataCharger
      case 100 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.alarm.AlarmChargerRa(
    alarmParam = com.chargerlink.gateway.bean.alarm.AlarmParameter.defaultInstance
  )
  implicit class AlarmChargerRaLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmChargerRa]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmChargerRa](_l) {
    def alarmParam: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmParameter] = field(_.alarmParam)((c_, f_) => c_.copy(alarmParam = f_))
    def dataList: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataCharger]] = field(_.dataList)((c_, f_) => c_.copy(dataList = f_))
    def extendData: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getExtendData)((c_, f_) => c_.copy(extendData = Some(f_)))
    def optionalExtendData: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.any.Any]] = field(_.extendData)((c_, f_) => c_.copy(extendData = f_))
  }
  final val ALARM_PARAM_FIELD_NUMBER = 1
  final val DATA_LIST_FIELD_NUMBER = 2
  final val EXTEND_DATA_FIELD_NUMBER = 100
}
