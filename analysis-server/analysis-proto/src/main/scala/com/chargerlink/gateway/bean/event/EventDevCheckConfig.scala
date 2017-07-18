// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.event



/** * 通用终端设备查询配置更新请求事件的消息定义。
  *
  * @param deviceInfo
  *  / (必填)查询的设备信息。
  * @param configInfo
  *  / (可选)设备的配置信息。
  * @param extendData
  *  / (可选)设备的扩展信息。
  */
@SerialVersionUID(0L)
final case class EventDevCheckConfig(
    deviceInfo: com.chargerlink.gateway.bean.device.DeviceInfo,
    configInfo: scala.collection.immutable.Map[String, String] = scala.collection.immutable.Map.empty,
    extendData: scala.Option[com.google.protobuf.any.Any] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EventDevCheckConfig] with com.trueaccord.lenses.Updatable[EventDevCheckConfig] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(deviceInfo.serializedSize) + deviceInfo.serializedSize
      configInfo.foreach(configInfo => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toBase(configInfo).serializedSize) + com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toBase(configInfo).serializedSize)
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
      _output__.writeUInt32NoTag(deviceInfo.serializedSize)
      deviceInfo.writeTo(_output__)
      configInfo.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toBase(__v).serializedSize)
        com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toBase(__v).writeTo(_output__)
      };
      extendData.foreach { __v =>
        _output__.writeTag(100, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.event.EventDevCheckConfig = {
      var __deviceInfo = this.deviceInfo
      val __configInfo = (scala.collection.immutable.Map.newBuilder[String, String] ++= this.configInfo)
      var __extendData = this.extendData
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
            __configInfo += com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toCustom(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry.defaultInstance))
          case 802 =>
            __extendData = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __extendData.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.event.EventDevCheckConfig(
          deviceInfo = __deviceInfo,
          configInfo = __configInfo.result(),
          extendData = __extendData
      )
    }
    def withDeviceInfo(__v: com.chargerlink.gateway.bean.device.DeviceInfo): EventDevCheckConfig = copy(deviceInfo = __v)
    def clearConfigInfo = copy(configInfo = scala.collection.immutable.Map.empty)
    def addConfigInfo(__vs: (String, String)*): EventDevCheckConfig = addAllConfigInfo(__vs)
    def addAllConfigInfo(__vs: TraversableOnce[(String, String)]): EventDevCheckConfig = copy(configInfo = configInfo ++ __vs)
    def withConfigInfo(__v: scala.collection.immutable.Map[String, String]): EventDevCheckConfig = copy(configInfo = __v)
    def getExtendData: com.google.protobuf.any.Any = extendData.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearExtendData: EventDevCheckConfig = copy(extendData = None)
    def withExtendData(__v: com.google.protobuf.any.Any): EventDevCheckConfig = copy(extendData = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => deviceInfo
        case 2 => configInfo.map(com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toBase)(_root_.scala.collection.breakOut)
        case 100 => extendData.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => deviceInfo.toPMessage
        case 2 => _root_.scalapb.descriptors.PRepeated(configInfo.map(com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
        case 100 => extendData.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.event.EventDevCheckConfig
}

object EventDevCheckConfig extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckConfig] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckConfig] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.event.EventDevCheckConfig = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.event.EventDevCheckConfig(
      __fieldsMap(__fields.get(0)).asInstanceOf[com.chargerlink.gateway.bean.device.DeviceInfo],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry]].map(com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toCustom)(_root_.scala.collection.breakOut),
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.any.Any]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.event.EventDevCheckConfig] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.event.EventDevCheckConfig(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[com.chargerlink.gateway.bean.device.DeviceInfo],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(com.chargerlink.gateway.bean.event.EventDevCheckConfig._typemapper_configInfo.toCustom)(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(100).get).flatMap(_.as[scala.Option[com.google.protobuf.any.Any]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EventDeviceProto.javaDescriptor.getMessageTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EventDeviceProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = com.chargerlink.gateway.bean.device.DeviceInfo
      case 2 => __out = com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry
      case 100 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.event.EventDevCheckConfig(
    deviceInfo = com.chargerlink.gateway.bean.device.DeviceInfo.defaultInstance
  )
  @SerialVersionUID(0L)
  final case class ConfigInfoEntry(
      key: scala.Option[String] = None,
      value: scala.Option[String] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[ConfigInfoEntry] with com.trueaccord.lenses.Updatable[ConfigInfoEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        if (key.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, key.get) }
        if (value.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, value.get) }
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
        key.foreach { __v =>
          _output__.writeString(1, __v)
        };
        value.foreach { __v =>
          _output__.writeString(2, __v)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = Some(_input__.readString())
            case 18 =>
              __value = Some(_input__.readString())
            case tag => _input__.skipField(tag)
          }
        }
        com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry(
            key = __key,
            value = __value
        )
      }
      def getKey: String = key.getOrElse("")
      def clearKey: ConfigInfoEntry = copy(key = None)
      def withKey(__v: String): ConfigInfoEntry = copy(key = Some(__v))
      def getValue: String = value.getOrElse("")
      def clearValue: ConfigInfoEntry = copy(value = None)
      def withValue(__v: String): ConfigInfoEntry = copy(value = Some(__v))
      def getFieldByNumber(__fieldNumber: Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => key.orNull
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => key.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 2 => value.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
      def companion = com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry
  }
  
  object ConfigInfoEntry extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry(
        __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[String]]),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.chargerlink.gateway.bean.event.EventDevCheckConfig.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.chargerlink.gateway.bean.event.EventDevCheckConfig.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
    def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry(
    )
    implicit class ConfigInfoEntryLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry](_l) {
      def key: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getKey)((c_, f_) => c_.copy(key = Some(f_)))
      def optionalKey: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getValue)((c_, f_) => c_.copy(value = Some(f_)))
      def optionalValue: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry, (String, String)] =
      _root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry, (String, String)](__m => (__m.getKey, __m.getValue))(__p => com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry(Some(__p._1), Some(__p._2)))
  }
  
  implicit class EventDevCheckConfigLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckConfig]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.event.EventDevCheckConfig](_l) {
    def deviceInfo: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.device.DeviceInfo] = field(_.deviceInfo)((c_, f_) => c_.copy(deviceInfo = f_))
    def configInfo: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.immutable.Map[String, String]] = field(_.configInfo)((c_, f_) => c_.copy(configInfo = f_))
    def extendData: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getExtendData)((c_, f_) => c_.copy(extendData = Some(f_)))
    def optionalExtendData: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.any.Any]] = field(_.extendData)((c_, f_) => c_.copy(extendData = f_))
  }
  final val DEVICE_INFO_FIELD_NUMBER = 1
  final val CONFIG_INFO_FIELD_NUMBER = 2
  final val EXTEND_DATA_FIELD_NUMBER = 100
  @transient
  private val _typemapper_configInfo: _root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry, (String, String)] = implicitly[_root_.com.trueaccord.scalapb.TypeMapper[com.chargerlink.gateway.bean.event.EventDevCheckConfig.ConfigInfoEntry, (String, String)]]
}