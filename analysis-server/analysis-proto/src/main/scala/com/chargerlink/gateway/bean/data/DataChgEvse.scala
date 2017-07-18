// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.data



/** * 充电桩状态数据的消息定义。
  *
  * @param evseTime
  *  / (必填)充电桩数据采集时间(北京时间的毫秒时间戳)。单位：毫秒。
  * @param evseStatus
  *  / (必填)充电桩工作状态。
  * @param measureList
  *  / (可选)充电桩遥测数据列表。只包含ComponentType不为COMPONENT_TYPE_CCM/COMPONENT_TYPE_CONN/COMPONENT_TYPE_PKL/COMPONENT_TYPE_PKD的遥测数据。
  * @param alarmList
  *  / (可选)充电桩报警数据列表。只包含ComponentType不为COMPONENT_TYPE_CCM/COMPONENT_TYPE_CONN/COMPONENT_TYPE_PKL/COMPONENT_TYPE_PKD的报警数据。
  */
@SerialVersionUID(0L)
final case class DataChgEvse(
    evseTime: Long,
    evseStatus: com.chargerlink.gateway.bean.common.ChgEvseStatus,
    measureList: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgMeasure] = _root_.scala.collection.Seq.empty,
    alarmList: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgAlarm] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[DataChgEvse] with com.trueaccord.lenses.Updatable[DataChgEvse] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(10, evseTime)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(11, evseStatus.value)
      measureList.foreach(measureList => __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(measureList.serializedSize) + measureList.serializedSize)
      alarmList.foreach(alarmList => __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmList.serializedSize) + alarmList.serializedSize)
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
      _output__.writeInt64(10, evseTime)
      _output__.writeEnum(11, evseStatus.value)
      measureList.foreach { __v =>
        _output__.writeTag(20, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmList.foreach { __v =>
        _output__.writeTag(30, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.data.DataChgEvse = {
      var __evseTime = this.evseTime
      var __evseStatus = this.evseStatus
      val __measureList = (_root_.scala.collection.immutable.Vector.newBuilder[com.chargerlink.gateway.bean.data.DataChgMeasure] ++= this.measureList)
      val __alarmList = (_root_.scala.collection.immutable.Vector.newBuilder[com.chargerlink.gateway.bean.data.DataChgAlarm] ++= this.alarmList)
      var __requiredFields0: Long = 0x3L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 80 =>
            __evseTime = _input__.readInt64()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 88 =>
            __evseStatus = com.chargerlink.gateway.bean.common.ChgEvseStatus.fromValue(_input__.readEnum())
            __requiredFields0 &= 0xfffffffffffffffdL
          case 162 =>
            __measureList += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.chargerlink.gateway.bean.data.DataChgMeasure.defaultInstance)
          case 242 =>
            __alarmList += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.chargerlink.gateway.bean.data.DataChgAlarm.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.data.DataChgEvse(
          evseTime = __evseTime,
          evseStatus = __evseStatus,
          measureList = __measureList.result(),
          alarmList = __alarmList.result()
      )
    }
    def withEvseTime(__v: Long): DataChgEvse = copy(evseTime = __v)
    def withEvseStatus(__v: com.chargerlink.gateway.bean.common.ChgEvseStatus): DataChgEvse = copy(evseStatus = __v)
    def clearMeasureList = copy(measureList = _root_.scala.collection.Seq.empty)
    def addMeasureList(__vs: com.chargerlink.gateway.bean.data.DataChgMeasure*): DataChgEvse = addAllMeasureList(__vs)
    def addAllMeasureList(__vs: TraversableOnce[com.chargerlink.gateway.bean.data.DataChgMeasure]): DataChgEvse = copy(measureList = measureList ++ __vs)
    def withMeasureList(__v: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgMeasure]): DataChgEvse = copy(measureList = __v)
    def clearAlarmList = copy(alarmList = _root_.scala.collection.Seq.empty)
    def addAlarmList(__vs: com.chargerlink.gateway.bean.data.DataChgAlarm*): DataChgEvse = addAllAlarmList(__vs)
    def addAllAlarmList(__vs: TraversableOnce[com.chargerlink.gateway.bean.data.DataChgAlarm]): DataChgEvse = copy(alarmList = alarmList ++ __vs)
    def withAlarmList(__v: _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgAlarm]): DataChgEvse = copy(alarmList = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 10 => evseTime
        case 11 => evseStatus.javaValueDescriptor
        case 20 => measureList
        case 30 => alarmList
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 10 => _root_.scalapb.descriptors.PLong(evseTime)
        case 11 => _root_.scalapb.descriptors.PEnum(evseStatus.scalaValueDescriptor)
        case 20 => _root_.scalapb.descriptors.PRepeated(measureList.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 30 => _root_.scalapb.descriptors.PRepeated(alarmList.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.data.DataChgEvse
}

object DataChgEvse extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataChgEvse] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataChgEvse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.data.DataChgEvse = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.data.DataChgEvse(
      __fieldsMap(__fields.get(0)).asInstanceOf[Long],
      com.chargerlink.gateway.bean.common.ChgEvseStatus.fromValue(__fieldsMap(__fields.get(1)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgMeasure]],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgAlarm]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.data.DataChgEvse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.data.DataChgEvse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).get.as[Long],
        com.chargerlink.gateway.bean.common.ChgEvseStatus.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(20).get).map(_.as[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgMeasure]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(30).get).map(_.as[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgAlarm]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DataChargerProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DataChargerProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 20 => __out = com.chargerlink.gateway.bean.data.DataChgMeasure
      case 30 => __out = com.chargerlink.gateway.bean.data.DataChgAlarm
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 11 => com.chargerlink.gateway.bean.common.ChgEvseStatus
    }
  }
  lazy val defaultInstance = com.chargerlink.gateway.bean.data.DataChgEvse(
    evseTime = 0L,
    evseStatus = com.chargerlink.gateway.bean.common.ChgEvseStatus.CHG_EVSE_STATUS_WORKING
  )
  implicit class DataChgEvseLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.data.DataChgEvse]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.data.DataChgEvse](_l) {
    def evseTime: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.evseTime)((c_, f_) => c_.copy(evseTime = f_))
    def evseStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.ChgEvseStatus] = field(_.evseStatus)((c_, f_) => c_.copy(evseStatus = f_))
    def measureList: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgMeasure]] = field(_.measureList)((c_, f_) => c_.copy(measureList = f_))
    def alarmList: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.chargerlink.gateway.bean.data.DataChgAlarm]] = field(_.alarmList)((c_, f_) => c_.copy(alarmList = f_))
  }
  final val EVSE_TIME_FIELD_NUMBER = 10
  final val EVSE_STATUS_FIELD_NUMBER = 11
  final val MEASURE_LIST_FIELD_NUMBER = 20
  final val ALARM_LIST_FIELD_NUMBER = 30
}