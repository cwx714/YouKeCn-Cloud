// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.data



/** * 充电桩报警数据的消息定义。
  *
  * @param code
  *  / (必填)告警代码。
  * @param name
  *  / (可选)扩展告警名。当告警代码为0时有效。
  * @param info
  *  / (可选)告警相关信息。
  * @param level
  *  / (必填)告警等级。
  * @param timestamp
  *  / (必填)告警发生时的时间(北京时间的毫秒时间戳)。单位：毫秒。
  * @param compType
  *  / (必填)告警所关联的设备组件类型。
  * @param compIdx
  *  / (可选)告警所关联的设备组件编号。如：风扇1、风扇2；电表1、电表2等。null：表示只有1个设备组件。
  * @param plugId
  *  / (可选)告警所关联的充电接口ID。null：表示不属于充电接口的设备组件。
  * @param devOrderId
  *  / (可选)告警所关联的充电交易记录ID。
  */
@SerialVersionUID(0L)
final case class DataChgAlarm(
    code: com.chargerlink.gateway.bean.common.ChgAlarmCode,
    name: scala.Option[String] = None,
    info: scala.Option[String] = None,
    level: scala.Option[com.chargerlink.gateway.bean.common.ChgAlarmLevel] = None,
    timestamp: scala.Option[Long] = None,
    compType: com.chargerlink.gateway.bean.common.ChgCompType,
    compIdx: scala.Option[Int] = None,
    plugId: scala.Option[Int] = None,
    devOrderId: scala.Option[Long] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[DataChgAlarm] with com.trueaccord.lenses.Updatable[DataChgAlarm] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, code.value)
      if (name.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, name.get) }
      if (info.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, info.get) }
      if (level.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, level.get.value) }
      if (timestamp.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(5, timestamp.get) }
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(6, compType.value)
      if (compIdx.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(7, compIdx.get) }
      if (plugId.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(8, plugId.get) }
      if (devOrderId.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(9, devOrderId.get) }
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
      _output__.writeEnum(1, code.value)
      name.foreach { __v =>
        _output__.writeString(2, __v)
      };
      info.foreach { __v =>
        _output__.writeString(3, __v)
      };
      level.foreach { __v =>
        _output__.writeEnum(4, __v.value)
      };
      timestamp.foreach { __v =>
        _output__.writeInt64(5, __v)
      };
      _output__.writeEnum(6, compType.value)
      compIdx.foreach { __v =>
        _output__.writeUInt32(7, __v)
      };
      plugId.foreach { __v =>
        _output__.writeUInt32(8, __v)
      };
      devOrderId.foreach { __v =>
        _output__.writeInt64(9, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.data.DataChgAlarm = {
      var __code = this.code
      var __name = this.name
      var __info = this.info
      var __level = this.level
      var __timestamp = this.timestamp
      var __compType = this.compType
      var __compIdx = this.compIdx
      var __plugId = this.plugId
      var __devOrderId = this.devOrderId
      var __requiredFields0: Long = 0x3L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __code = com.chargerlink.gateway.bean.common.ChgAlarmCode.fromValue(_input__.readEnum())
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __name = Some(_input__.readString())
          case 26 =>
            __info = Some(_input__.readString())
          case 32 =>
            __level = Some(com.chargerlink.gateway.bean.common.ChgAlarmLevel.fromValue(_input__.readEnum()))
          case 40 =>
            __timestamp = Some(_input__.readInt64())
          case 48 =>
            __compType = com.chargerlink.gateway.bean.common.ChgCompType.fromValue(_input__.readEnum())
            __requiredFields0 &= 0xfffffffffffffffdL
          case 56 =>
            __compIdx = Some(_input__.readUInt32())
          case 64 =>
            __plugId = Some(_input__.readUInt32())
          case 72 =>
            __devOrderId = Some(_input__.readInt64())
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.data.DataChgAlarm(
          code = __code,
          name = __name,
          info = __info,
          level = __level,
          timestamp = __timestamp,
          compType = __compType,
          compIdx = __compIdx,
          plugId = __plugId,
          devOrderId = __devOrderId
      )
    }
    def withCode(__v: com.chargerlink.gateway.bean.common.ChgAlarmCode): DataChgAlarm = copy(code = __v)
    def getName: String = name.getOrElse("")
    def clearName: DataChgAlarm = copy(name = None)
    def withName(__v: String): DataChgAlarm = copy(name = Some(__v))
    def getInfo: String = info.getOrElse("")
    def clearInfo: DataChgAlarm = copy(info = None)
    def withInfo(__v: String): DataChgAlarm = copy(info = Some(__v))
    def getLevel: com.chargerlink.gateway.bean.common.ChgAlarmLevel = level.getOrElse(com.chargerlink.gateway.bean.common.ChgAlarmLevel.CHG_ALARM_LEVEL_CRITICAL)
    def clearLevel: DataChgAlarm = copy(level = None)
    def withLevel(__v: com.chargerlink.gateway.bean.common.ChgAlarmLevel): DataChgAlarm = copy(level = Some(__v))
    def getTimestamp: Long = timestamp.getOrElse(0L)
    def clearTimestamp: DataChgAlarm = copy(timestamp = None)
    def withTimestamp(__v: Long): DataChgAlarm = copy(timestamp = Some(__v))
    def withCompType(__v: com.chargerlink.gateway.bean.common.ChgCompType): DataChgAlarm = copy(compType = __v)
    def getCompIdx: Int = compIdx.getOrElse(0)
    def clearCompIdx: DataChgAlarm = copy(compIdx = None)
    def withCompIdx(__v: Int): DataChgAlarm = copy(compIdx = Some(__v))
    def getPlugId: Int = plugId.getOrElse(0)
    def clearPlugId: DataChgAlarm = copy(plugId = None)
    def withPlugId(__v: Int): DataChgAlarm = copy(plugId = Some(__v))
    def getDevOrderId: Long = devOrderId.getOrElse(0L)
    def clearDevOrderId: DataChgAlarm = copy(devOrderId = None)
    def withDevOrderId(__v: Long): DataChgAlarm = copy(devOrderId = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => code.javaValueDescriptor
        case 2 => name.orNull
        case 3 => info.orNull
        case 4 => level.map(_.javaValueDescriptor).orNull
        case 5 => timestamp.orNull
        case 6 => compType.javaValueDescriptor
        case 7 => compIdx.orNull
        case 8 => plugId.orNull
        case 9 => devOrderId.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(code.scalaValueDescriptor)
        case 2 => name.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => info.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => level.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => timestamp.map(_root_.scalapb.descriptors.PLong).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => _root_.scalapb.descriptors.PEnum(compType.scalaValueDescriptor)
        case 7 => compIdx.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => plugId.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => devOrderId.map(_root_.scalapb.descriptors.PLong).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.data.DataChgAlarm
}

object DataChgAlarm extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataChgAlarm] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataChgAlarm] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.data.DataChgAlarm = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.data.DataChgAlarm(
      com.chargerlink.gateway.bean.common.ChgAlarmCode.fromValue(__fieldsMap(__fields.get(0)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.chargerlink.gateway.bean.common.ChgAlarmLevel.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[Long]],
      com.chargerlink.gateway.bean.common.ChgCompType.fromValue(__fieldsMap(__fields.get(5)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[Long]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.data.DataChgAlarm] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.data.DataChgAlarm(
        com.chargerlink.gateway.bean.common.ChgAlarmCode.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.chargerlink.gateway.bean.common.ChgAlarmLevel.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[scala.Option[Long]]),
        com.chargerlink.gateway.bean.common.ChgCompType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[scala.Option[Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[scala.Option[Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[scala.Option[Long]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DataChargerProto.javaDescriptor.getMessageTypes.get(9)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DataChargerProto.scalaDescriptor.messages(9)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.chargerlink.gateway.bean.common.ChgAlarmCode
      case 4 => com.chargerlink.gateway.bean.common.ChgAlarmLevel
      case 6 => com.chargerlink.gateway.bean.common.ChgCompType
    }
  }
  lazy val defaultInstance = com.chargerlink.gateway.bean.data.DataChgAlarm(
    code = com.chargerlink.gateway.bean.common.ChgAlarmCode.CHG_ALARM_SYS_STORAGE_FULL,
    compType = com.chargerlink.gateway.bean.common.ChgCompType.CHG_COMP_NONE
  )
  implicit class DataChgAlarmLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.data.DataChgAlarm]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.data.DataChgAlarm](_l) {
    def code: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.ChgAlarmCode] = field(_.code)((c_, f_) => c_.copy(code = f_))
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def info: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getInfo)((c_, f_) => c_.copy(info = Some(f_)))
    def optionalInfo: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.info)((c_, f_) => c_.copy(info = f_))
    def level: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.ChgAlarmLevel] = field(_.getLevel)((c_, f_) => c_.copy(level = Some(f_)))
    def optionalLevel: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.chargerlink.gateway.bean.common.ChgAlarmLevel]] = field(_.level)((c_, f_) => c_.copy(level = f_))
    def timestamp: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.getTimestamp)((c_, f_) => c_.copy(timestamp = Some(f_)))
    def optionalTimestamp: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Long]] = field(_.timestamp)((c_, f_) => c_.copy(timestamp = f_))
    def compType: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.ChgCompType] = field(_.compType)((c_, f_) => c_.copy(compType = f_))
    def compIdx: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getCompIdx)((c_, f_) => c_.copy(compIdx = Some(f_)))
    def optionalCompIdx: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.compIdx)((c_, f_) => c_.copy(compIdx = f_))
    def plugId: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getPlugId)((c_, f_) => c_.copy(plugId = Some(f_)))
    def optionalPlugId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.plugId)((c_, f_) => c_.copy(plugId = f_))
    def devOrderId: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.getDevOrderId)((c_, f_) => c_.copy(devOrderId = Some(f_)))
    def optionalDevOrderId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Long]] = field(_.devOrderId)((c_, f_) => c_.copy(devOrderId = f_))
  }
  final val CODE_FIELD_NUMBER = 1
  final val NAME_FIELD_NUMBER = 2
  final val INFO_FIELD_NUMBER = 3
  final val LEVEL_FIELD_NUMBER = 4
  final val TIMESTAMP_FIELD_NUMBER = 5
  final val COMP_TYPE_FIELD_NUMBER = 6
  final val COMP_IDX_FIELD_NUMBER = 7
  final val PLUG_ID_FIELD_NUMBER = 8
  final val DEV_ORDER_ID_FIELD_NUMBER = 9
}