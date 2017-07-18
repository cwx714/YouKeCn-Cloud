// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.chargerlink.gateway.analyser



/** * 报表分析条件的消息定义。
  *
  * @param ruleId
  *  / (必填)报表分析条件的ID。报表分析条件ID必须是全局唯一的。如果数据分析平台存在此ID的条件，则为更新；否则为新增。
  * @param alarmCode
  *  / (更新或新增时必填)报警代码。数据来源为报警代码字典表。
  * @param alarmSource
  *  / (更新或新增时必填)报警来源。数据来源为报警代码字典表。
  * @param deviceType
  *  / (可选)分析的目标设备的设备类型。null：全部设备类型。
  * @param deviceIds
  *  / (可选)分析的目标设备的设备ID列表。空列表：全部设备ID。
  * @param configs
  *  / (可选)全局报表分析条件参数。格式为：参数ID-&gt;参数值。
  * @param conditions
  *  / (必填)按报警级别的报表分析条件参数列表。
  */
@SerialVersionUID(0L)
final case class AlarmRule(
    ruleId: Int = 0,
    alarmCode: Int = 0,
    alarmSource: Int = 0,
    deviceType: com.chargerlink.gateway.analyser.DeviceType = com.chargerlink.gateway.analyser.DeviceType.DEVICE_DEFAULT,
    deviceIds: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty,
    configs: scala.collection.immutable.Map[Int, com.chargerlink.gateway.analyser.Value] = scala.collection.immutable.Map.empty,
    conditions: _root_.scala.collection.Seq[com.chargerlink.gateway.analyser.Condition] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[AlarmRule] with com.trueaccord.lenses.Updatable[AlarmRule] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (ruleId != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, ruleId) }
      if (alarmCode != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, alarmCode) }
      if (alarmSource != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, alarmSource) }
      if (deviceType != com.chargerlink.gateway.analyser.DeviceType.DEVICE_DEFAULT) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, deviceType.value) }
      deviceIds.foreach(deviceIds => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, deviceIds))
      configs.foreach(configs => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toBase(configs).serializedSize) + com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toBase(configs).serializedSize)
      conditions.foreach(conditions => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(conditions.serializedSize) + conditions.serializedSize)
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
      {
        val __v = ruleId
        if (__v != 0) {
          _output__.writeUInt32(1, __v)
        }
      };
      {
        val __v = alarmCode
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = alarmSource
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      {
        val __v = deviceType
        if (__v != com.chargerlink.gateway.analyser.DeviceType.DEVICE_DEFAULT) {
          _output__.writeEnum(4, __v.value)
        }
      };
      deviceIds.foreach { __v =>
        _output__.writeString(5, __v)
      };
      configs.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toBase(__v).serializedSize)
        com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toBase(__v).writeTo(_output__)
      };
      conditions.foreach { __v =>
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.analyser.AlarmRule = {
      var __ruleId = this.ruleId
      var __alarmCode = this.alarmCode
      var __alarmSource = this.alarmSource
      var __deviceType = this.deviceType
      val __deviceIds = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.deviceIds)
      val __configs = (scala.collection.immutable.Map.newBuilder[Int, com.chargerlink.gateway.analyser.Value] ++= this.configs)
      val __conditions = (_root_.scala.collection.immutable.Vector.newBuilder[com.chargerlink.gateway.analyser.Condition] ++= this.conditions)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __ruleId = _input__.readUInt32()
          case 16 =>
            __alarmCode = _input__.readInt32()
          case 24 =>
            __alarmSource = _input__.readInt32()
          case 32 =>
            __deviceType = com.chargerlink.gateway.analyser.DeviceType.fromValue(_input__.readEnum())
          case 42 =>
            __deviceIds += _input__.readString()
          case 50 =>
            __configs += com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toCustom(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry.defaultInstance))
          case 58 =>
            __conditions += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.chargerlink.gateway.analyser.Condition.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.chargerlink.gateway.analyser.AlarmRule(
          ruleId = __ruleId,
          alarmCode = __alarmCode,
          alarmSource = __alarmSource,
          deviceType = __deviceType,
          deviceIds = __deviceIds.result(),
          configs = __configs.result(),
          conditions = __conditions.result()
      )
    }
    def withRuleId(__v: Int): AlarmRule = copy(ruleId = __v)
    def withAlarmCode(__v: Int): AlarmRule = copy(alarmCode = __v)
    def withAlarmSource(__v: Int): AlarmRule = copy(alarmSource = __v)
    def withDeviceType(__v: com.chargerlink.gateway.analyser.DeviceType): AlarmRule = copy(deviceType = __v)
    def clearDeviceIds = copy(deviceIds = _root_.scala.collection.Seq.empty)
    def addDeviceIds(__vs: String*): AlarmRule = addAllDeviceIds(__vs)
    def addAllDeviceIds(__vs: TraversableOnce[String]): AlarmRule = copy(deviceIds = deviceIds ++ __vs)
    def withDeviceIds(__v: _root_.scala.collection.Seq[String]): AlarmRule = copy(deviceIds = __v)
    def clearConfigs = copy(configs = scala.collection.immutable.Map.empty)
    def addConfigs(__vs: (Int, com.chargerlink.gateway.analyser.Value)*): AlarmRule = addAllConfigs(__vs)
    def addAllConfigs(__vs: TraversableOnce[(Int, com.chargerlink.gateway.analyser.Value)]): AlarmRule = copy(configs = configs ++ __vs)
    def withConfigs(__v: scala.collection.immutable.Map[Int, com.chargerlink.gateway.analyser.Value]): AlarmRule = copy(configs = __v)
    def clearConditions = copy(conditions = _root_.scala.collection.Seq.empty)
    def addConditions(__vs: com.chargerlink.gateway.analyser.Condition*): AlarmRule = addAllConditions(__vs)
    def addAllConditions(__vs: TraversableOnce[com.chargerlink.gateway.analyser.Condition]): AlarmRule = copy(conditions = conditions ++ __vs)
    def withConditions(__v: _root_.scala.collection.Seq[com.chargerlink.gateway.analyser.Condition]): AlarmRule = copy(conditions = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = ruleId
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = alarmCode
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = alarmSource
          if (__t != 0) __t else null
        }
        case 4 => {
          val __t = deviceType.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 5 => deviceIds
        case 6 => configs.map(com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toBase)(_root_.scala.collection.breakOut)
        case 7 => conditions
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(ruleId)
        case 2 => _root_.scalapb.descriptors.PInt(alarmCode)
        case 3 => _root_.scalapb.descriptors.PInt(alarmSource)
        case 4 => _root_.scalapb.descriptors.PEnum(deviceType.scalaValueDescriptor)
        case 5 => _root_.scalapb.descriptors.PRepeated(deviceIds.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 6 => _root_.scalapb.descriptors.PRepeated(configs.map(com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
        case 7 => _root_.scalapb.descriptors.PRepeated(conditions.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.analyser.AlarmRule
}

object AlarmRule extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.analyser.AlarmRule] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.analyser.AlarmRule] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.analyser.AlarmRule = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.analyser.AlarmRule(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[Int],
      com.chargerlink.gateway.analyser.DeviceType.fromValue(__fieldsMap.getOrElse(__fields.get(3), com.chargerlink.gateway.analyser.DeviceType.DEVICE_DEFAULT.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[_root_.scala.collection.Seq[String]],
      __fieldsMap.getOrElse(__fields.get(5), Nil).asInstanceOf[_root_.scala.collection.Seq[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry]].map(com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toCustom)(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(6), Nil).asInstanceOf[_root_.scala.collection.Seq[com.chargerlink.gateway.analyser.Condition]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.analyser.AlarmRule] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.analyser.AlarmRule(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[Int]).getOrElse(0),
        com.chargerlink.gateway.analyser.DeviceType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.chargerlink.gateway.analyser.DeviceType.DEVICE_DEFAULT.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.collection.Seq[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(com.chargerlink.gateway.analyser.AlarmRule._typemapper_configs.toCustom)(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.collection.Seq[com.chargerlink.gateway.analyser.Condition]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = RulesProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = RulesProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 6 => __out = com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry
      case 7 => __out = com.chargerlink.gateway.analyser.Condition
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4 => com.chargerlink.gateway.analyser.DeviceType
    }
  }
  lazy val defaultInstance = com.chargerlink.gateway.analyser.AlarmRule(
  )
  @SerialVersionUID(0L)
  final case class ConfigsEntry(
      key: Int = 0,
      value: scala.Option[com.chargerlink.gateway.analyser.Value] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[ConfigsEntry] with com.trueaccord.lenses.Updatable[ConfigsEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        if (key != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, key) }
        if (value.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.get.serializedSize) + value.get.serializedSize }
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
        {
          val __v = key
          if (__v != 0) {
            _output__.writeUInt32(1, __v)
          }
        };
        value.foreach { __v =>
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __key = _input__.readUInt32()
            case 18 =>
              __value = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(com.chargerlink.gateway.analyser.Value.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: Int): ConfigsEntry = copy(key = __v)
      def getValue: com.chargerlink.gateway.analyser.Value = value.getOrElse(com.chargerlink.gateway.analyser.Value.defaultInstance)
      def clearValue: ConfigsEntry = copy(value = None)
      def withValue(__v: com.chargerlink.gateway.analyser.Value): ConfigsEntry = copy(value = Some(__v))
      def getFieldByNumber(__fieldNumber: Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != 0) __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PInt(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
      def companion = com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry
  }
  
  object ConfigsEntry extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry(
        __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.chargerlink.gateway.analyser.Value]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Int]).getOrElse(0),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.analyser.Value]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.chargerlink.gateway.analyser.AlarmRule.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.chargerlink.gateway.analyser.AlarmRule.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 2 => __out = com.chargerlink.gateway.analyser.Value
      }
      __out
    }
    def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry(
    )
    implicit class ConfigsEntryLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry](_l) {
      def key: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.analyser.Value] = field(_.getValue)((c_, f_) => c_.copy(value = Some(f_)))
      def optionalValue: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.chargerlink.gateway.analyser.Value]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry, (Int, com.chargerlink.gateway.analyser.Value)] =
      _root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry, (Int, com.chargerlink.gateway.analyser.Value)](__m => (__m.key, __m.getValue))(__p => com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry(__p._1, Some(__p._2)))
  }
  
  implicit class AlarmRuleLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.analyser.AlarmRule]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.analyser.AlarmRule](_l) {
    def ruleId: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.ruleId)((c_, f_) => c_.copy(ruleId = f_))
    def alarmCode: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.alarmCode)((c_, f_) => c_.copy(alarmCode = f_))
    def alarmSource: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.alarmSource)((c_, f_) => c_.copy(alarmSource = f_))
    def deviceType: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.analyser.DeviceType] = field(_.deviceType)((c_, f_) => c_.copy(deviceType = f_))
    def deviceIds: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.deviceIds)((c_, f_) => c_.copy(deviceIds = f_))
    def configs: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.immutable.Map[Int, com.chargerlink.gateway.analyser.Value]] = field(_.configs)((c_, f_) => c_.copy(configs = f_))
    def conditions: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.chargerlink.gateway.analyser.Condition]] = field(_.conditions)((c_, f_) => c_.copy(conditions = f_))
  }
  final val RULE_ID_FIELD_NUMBER = 1
  final val ALARM_CODE_FIELD_NUMBER = 2
  final val ALARM_SOURCE_FIELD_NUMBER = 3
  final val DEVICE_TYPE_FIELD_NUMBER = 4
  final val DEVICE_IDS_FIELD_NUMBER = 5
  final val CONFIGS_FIELD_NUMBER = 6
  final val CONDITIONS_FIELD_NUMBER = 7
  @transient
  private val _typemapper_configs: _root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry, (Int, com.chargerlink.gateway.analyser.Value)] = implicitly[_root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.analyser.AlarmRule.ConfigsEntry, (Int, com.chargerlink.gateway.analyser.Value)]]
}
