// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.alarm



/** * 终端设备报警消息的消息定义。其中：报警消息详情的定义分别在以下文件中：AlarmVehicle.proto、AlarmCharger.proto、AlarmRecorder.proto。
  *
  * @param deviceType
  *  / (必填)终端设备类型。
  * @param deviceId
  *  / (必填)终端设备ID。格式由对应类型设备自行定义, 设备类型和设备ID组成设备的全局唯一标识。
  * @param subDevice
  *  / (必填)子设备标识信息。其中：主设备标识为""，充电枪的标识为"plug=充电枪ID"，地锁的标识为"lock=地锁ID"，车位传感器的标识为"detcet=传感器ID"。
  * @param alarmType
  *  / (必填)报警类型。
  * @param alarmCode
  *  / (必填)报警代码。数据来源为报警代码字典表。
  * @param alarmSource
  *  / (必填)报警来源。数据来源为报警代码字典表。
  * @param alarmLevel
  *  / (必填)报警级别。0：无故障，1：轻微故障，2：次级故障，3：严重故障，其他：自定义。
  * @param alarmTime
  *  / (必填)本次报警的时间(北京时间的毫秒时间戳)。单位：毫秒。
  * @param alarmStart
  *  / (可选)报警的开始时间(北京时间的毫秒时间戳)。单位：毫秒。null：表示报警的开始/结束时间均无效。
  * @param alarmStop
  *  / (可选)报警的结束时间(北京时间的毫秒时间戳)。单位：毫秒。null：表示报警未结束/结束时间无效。
  * @param alarmCnt
  *  / (可选)持续报警的次数。null：表示为单次报警。
  */
@SerialVersionUID(0L)
final case class AlarmInfo(
    deviceType: com.chargerlink.gateway.bean.common.DeviceType,
    deviceId: String,
    subDevice: String,
    alarmType: com.chargerlink.gateway.bean.common.AlarmType,
    alarmCode: Int,
    alarmSource: Int,
    alarmLevel: Int,
    alarmTime: Long,
    alarmStart: scala.Option[Long] = None,
    alarmStop: scala.Option[Long] = None,
    alarmCnt: scala.Option[Int] = None,
    alarmDetail: com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.Empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[AlarmInfo] with com.trueaccord.lenses.Updatable[AlarmInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, deviceType.value)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, deviceId)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, subDevice)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, alarmType.value)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(5, alarmCode)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(6, alarmSource)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(7, alarmLevel)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(8, alarmTime)
      if (alarmStart.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(9, alarmStart.get) }
      if (alarmStop.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(10, alarmStop.get) }
      if (alarmCnt.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(11, alarmCnt.get) }
      if (alarmDetail.alarmVehicle.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmVehicle.get.serializedSize) + alarmDetail.alarmVehicle.get.serializedSize }
      if (alarmDetail.alarmVehicleRa.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmVehicleRa.get.serializedSize) + alarmDetail.alarmVehicleRa.get.serializedSize }
      if (alarmDetail.alarmRecorder.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmRecorder.get.serializedSize) + alarmDetail.alarmRecorder.get.serializedSize }
      if (alarmDetail.alarmRecorderRa.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmRecorderRa.get.serializedSize) + alarmDetail.alarmRecorderRa.get.serializedSize }
      if (alarmDetail.alarmCharger.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmCharger.get.serializedSize) + alarmDetail.alarmCharger.get.serializedSize }
      if (alarmDetail.alarmChargerRa.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmChargerRa.get.serializedSize) + alarmDetail.alarmChargerRa.get.serializedSize }
      if (alarmDetail.alarmParking.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmParking.get.serializedSize) + alarmDetail.alarmParking.get.serializedSize }
      if (alarmDetail.alarmParkingRa.isDefined) { __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(alarmDetail.alarmParkingRa.get.serializedSize) + alarmDetail.alarmParkingRa.get.serializedSize }
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
      _output__.writeString(3, subDevice)
      _output__.writeEnum(4, alarmType.value)
      _output__.writeInt32(5, alarmCode)
      _output__.writeInt32(6, alarmSource)
      _output__.writeUInt32(7, alarmLevel)
      _output__.writeInt64(8, alarmTime)
      alarmStart.foreach { __v =>
        _output__.writeInt64(9, __v)
      };
      alarmStop.foreach { __v =>
        _output__.writeInt64(10, __v)
      };
      alarmCnt.foreach { __v =>
        _output__.writeUInt32(11, __v)
      };
      alarmDetail.alarmVehicle.foreach { __v =>
        _output__.writeTag(100, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmDetail.alarmVehicleRa.foreach { __v =>
        _output__.writeTag(101, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmDetail.alarmRecorder.foreach { __v =>
        _output__.writeTag(200, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmDetail.alarmRecorderRa.foreach { __v =>
        _output__.writeTag(201, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmDetail.alarmCharger.foreach { __v =>
        _output__.writeTag(300, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmDetail.alarmChargerRa.foreach { __v =>
        _output__.writeTag(301, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmDetail.alarmParking.foreach { __v =>
        _output__.writeTag(400, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      alarmDetail.alarmParkingRa.foreach { __v =>
        _output__.writeTag(401, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.alarm.AlarmInfo = {
      var __deviceType = this.deviceType
      var __deviceId = this.deviceId
      var __subDevice = this.subDevice
      var __alarmType = this.alarmType
      var __alarmCode = this.alarmCode
      var __alarmSource = this.alarmSource
      var __alarmLevel = this.alarmLevel
      var __alarmTime = this.alarmTime
      var __alarmStart = this.alarmStart
      var __alarmStop = this.alarmStop
      var __alarmCnt = this.alarmCnt
      var __requiredFields0: Long = 0xffL
      var __alarmDetail = this.alarmDetail
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
            __subDevice = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffbL
          case 32 =>
            __alarmType = com.chargerlink.gateway.bean.common.AlarmType.fromValue(_input__.readEnum())
            __requiredFields0 &= 0xfffffffffffffff7L
          case 40 =>
            __alarmCode = _input__.readInt32()
            __requiredFields0 &= 0xffffffffffffffefL
          case 48 =>
            __alarmSource = _input__.readInt32()
            __requiredFields0 &= 0xffffffffffffffdfL
          case 56 =>
            __alarmLevel = _input__.readUInt32()
            __requiredFields0 &= 0xffffffffffffffbfL
          case 64 =>
            __alarmTime = _input__.readInt64()
            __requiredFields0 &= 0xffffffffffffff7fL
          case 72 =>
            __alarmStart = Some(_input__.readInt64())
          case 80 =>
            __alarmStop = Some(_input__.readInt64())
          case 88 =>
            __alarmCnt = Some(_input__.readUInt32())
          case 802 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicle(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmVehicle.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmVehicle.defaultInstance)))
          case 810 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicleRa(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmVehicleRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmVehicleRa.defaultInstance)))
          case 1602 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorder(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmRecorder.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmRecorder.defaultInstance)))
          case 1610 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorderRa(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmRecorderRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmRecorderRa.defaultInstance)))
          case 2402 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmCharger(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmCharger.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmCharger.defaultInstance)))
          case 2410 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmChargerRa(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmChargerRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmChargerRa.defaultInstance)))
          case 3202 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParking(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmParking.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmParking.defaultInstance)))
          case 3210 =>
            __alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParkingRa(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, alarmDetail.alarmParkingRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmParkingRa.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.alarm.AlarmInfo(
          deviceType = __deviceType,
          deviceId = __deviceId,
          subDevice = __subDevice,
          alarmType = __alarmType,
          alarmCode = __alarmCode,
          alarmSource = __alarmSource,
          alarmLevel = __alarmLevel,
          alarmTime = __alarmTime,
          alarmStart = __alarmStart,
          alarmStop = __alarmStop,
          alarmCnt = __alarmCnt,
          alarmDetail = __alarmDetail
      )
    }
    def withDeviceType(__v: com.chargerlink.gateway.bean.common.DeviceType): AlarmInfo = copy(deviceType = __v)
    def withDeviceId(__v: String): AlarmInfo = copy(deviceId = __v)
    def withSubDevice(__v: String): AlarmInfo = copy(subDevice = __v)
    def withAlarmType(__v: com.chargerlink.gateway.bean.common.AlarmType): AlarmInfo = copy(alarmType = __v)
    def withAlarmCode(__v: Int): AlarmInfo = copy(alarmCode = __v)
    def withAlarmSource(__v: Int): AlarmInfo = copy(alarmSource = __v)
    def withAlarmLevel(__v: Int): AlarmInfo = copy(alarmLevel = __v)
    def withAlarmTime(__v: Long): AlarmInfo = copy(alarmTime = __v)
    def getAlarmStart: Long = alarmStart.getOrElse(0L)
    def clearAlarmStart: AlarmInfo = copy(alarmStart = None)
    def withAlarmStart(__v: Long): AlarmInfo = copy(alarmStart = Some(__v))
    def getAlarmStop: Long = alarmStop.getOrElse(0L)
    def clearAlarmStop: AlarmInfo = copy(alarmStop = None)
    def withAlarmStop(__v: Long): AlarmInfo = copy(alarmStop = Some(__v))
    def getAlarmCnt: Int = alarmCnt.getOrElse(0)
    def clearAlarmCnt: AlarmInfo = copy(alarmCnt = None)
    def withAlarmCnt(__v: Int): AlarmInfo = copy(alarmCnt = Some(__v))
    def getAlarmVehicle: com.chargerlink.gateway.bean.alarm.AlarmVehicle = alarmDetail.alarmVehicle.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmVehicle.defaultInstance)
    def withAlarmVehicle(__v: com.chargerlink.gateway.bean.alarm.AlarmVehicle): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicle(__v))
    def getAlarmVehicleRa: com.chargerlink.gateway.bean.alarm.AlarmVehicleRa = alarmDetail.alarmVehicleRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmVehicleRa.defaultInstance)
    def withAlarmVehicleRa(__v: com.chargerlink.gateway.bean.alarm.AlarmVehicleRa): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicleRa(__v))
    def getAlarmRecorder: com.chargerlink.gateway.bean.alarm.AlarmRecorder = alarmDetail.alarmRecorder.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmRecorder.defaultInstance)
    def withAlarmRecorder(__v: com.chargerlink.gateway.bean.alarm.AlarmRecorder): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorder(__v))
    def getAlarmRecorderRa: com.chargerlink.gateway.bean.alarm.AlarmRecorderRa = alarmDetail.alarmRecorderRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmRecorderRa.defaultInstance)
    def withAlarmRecorderRa(__v: com.chargerlink.gateway.bean.alarm.AlarmRecorderRa): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorderRa(__v))
    def getAlarmCharger: com.chargerlink.gateway.bean.alarm.AlarmCharger = alarmDetail.alarmCharger.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmCharger.defaultInstance)
    def withAlarmCharger(__v: com.chargerlink.gateway.bean.alarm.AlarmCharger): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmCharger(__v))
    def getAlarmChargerRa: com.chargerlink.gateway.bean.alarm.AlarmChargerRa = alarmDetail.alarmChargerRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmChargerRa.defaultInstance)
    def withAlarmChargerRa(__v: com.chargerlink.gateway.bean.alarm.AlarmChargerRa): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmChargerRa(__v))
    def getAlarmParking: com.chargerlink.gateway.bean.alarm.AlarmParking = alarmDetail.alarmParking.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmParking.defaultInstance)
    def withAlarmParking(__v: com.chargerlink.gateway.bean.alarm.AlarmParking): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParking(__v))
    def getAlarmParkingRa: com.chargerlink.gateway.bean.alarm.AlarmParkingRa = alarmDetail.alarmParkingRa.getOrElse(com.chargerlink.gateway.bean.alarm.AlarmParkingRa.defaultInstance)
    def withAlarmParkingRa(__v: com.chargerlink.gateway.bean.alarm.AlarmParkingRa): AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParkingRa(__v))
    def clearAlarmDetail: AlarmInfo = copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.Empty)
    def withAlarmDetail(__v: com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail): AlarmInfo = copy(alarmDetail = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => deviceType.javaValueDescriptor
        case 2 => deviceId
        case 3 => subDevice
        case 4 => alarmType.javaValueDescriptor
        case 5 => alarmCode
        case 6 => alarmSource
        case 7 => alarmLevel
        case 8 => alarmTime
        case 9 => alarmStart.orNull
        case 10 => alarmStop.orNull
        case 11 => alarmCnt.orNull
        case 100 => alarmDetail.alarmVehicle.orNull
        case 101 => alarmDetail.alarmVehicleRa.orNull
        case 200 => alarmDetail.alarmRecorder.orNull
        case 201 => alarmDetail.alarmRecorderRa.orNull
        case 300 => alarmDetail.alarmCharger.orNull
        case 301 => alarmDetail.alarmChargerRa.orNull
        case 400 => alarmDetail.alarmParking.orNull
        case 401 => alarmDetail.alarmParkingRa.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(deviceType.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PString(deviceId)
        case 3 => _root_.scalapb.descriptors.PString(subDevice)
        case 4 => _root_.scalapb.descriptors.PEnum(alarmType.scalaValueDescriptor)
        case 5 => _root_.scalapb.descriptors.PInt(alarmCode)
        case 6 => _root_.scalapb.descriptors.PInt(alarmSource)
        case 7 => _root_.scalapb.descriptors.PInt(alarmLevel)
        case 8 => _root_.scalapb.descriptors.PLong(alarmTime)
        case 9 => alarmStart.map(_root_.scalapb.descriptors.PLong).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => alarmStop.map(_root_.scalapb.descriptors.PLong).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 11 => alarmCnt.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 100 => alarmDetail.alarmVehicle.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 101 => alarmDetail.alarmVehicleRa.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 200 => alarmDetail.alarmRecorder.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 201 => alarmDetail.alarmRecorderRa.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 300 => alarmDetail.alarmCharger.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 301 => alarmDetail.alarmChargerRa.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 400 => alarmDetail.alarmParking.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 401 => alarmDetail.alarmParkingRa.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.alarm.AlarmInfo
}

object AlarmInfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.alarm.AlarmInfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.alarm.AlarmInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.alarm.AlarmInfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.alarm.AlarmInfo(
      com.chargerlink.gateway.bean.common.DeviceType.fromValue(__fieldsMap(__fields.get(0)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap(__fields.get(1)).asInstanceOf[String],
      __fieldsMap(__fields.get(2)).asInstanceOf[String],
      com.chargerlink.gateway.bean.common.AlarmType.fromValue(__fieldsMap(__fields.get(3)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap(__fields.get(4)).asInstanceOf[Int],
      __fieldsMap(__fields.get(5)).asInstanceOf[Int],
      __fieldsMap(__fields.get(6)).asInstanceOf[Int],
      __fieldsMap(__fields.get(7)).asInstanceOf[Long],
      __fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[Long]],
      __fieldsMap.get(__fields.get(9)).asInstanceOf[scala.Option[Long]],
      __fieldsMap.get(__fields.get(10)).asInstanceOf[scala.Option[Int]],
      alarmDetail = __fieldsMap.get(__fields.get(11)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicle]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicle) orElse
__fieldsMap.get(__fields.get(12)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicleRa]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicleRa) orElse
__fieldsMap.get(__fields.get(13)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorder]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorder) orElse
__fieldsMap.get(__fields.get(14)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorderRa]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorderRa) orElse
__fieldsMap.get(__fields.get(15)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmCharger]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmCharger) orElse
__fieldsMap.get(__fields.get(16)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmChargerRa]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmChargerRa) orElse
__fieldsMap.get(__fields.get(17)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParking]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParking) orElse
__fieldsMap.get(__fields.get(18)).asInstanceOf[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParkingRa]].map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParkingRa) getOrElse com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.Empty
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.alarm.AlarmInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.alarm.AlarmInfo(
        com.chargerlink.gateway.bean.common.DeviceType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).get.as[String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).get.as[String],
        com.chargerlink.gateway.bean.common.AlarmType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).get.as[Long],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[scala.Option[Long]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[scala.Option[Long]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).flatMap(_.as[scala.Option[Int]]),
        alarmDetail = __fieldsMap.get(scalaDescriptor.findFieldByNumber(100).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicle]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicle) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(101).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicleRa]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicleRa) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(200).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorder]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorder) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(201).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorderRa]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorderRa) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(300).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmCharger]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmCharger) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(301).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmChargerRa]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmChargerRa) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(400).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParking]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParking) orElse
__fieldsMap.get(scalaDescriptor.findFieldByNumber(401).get).flatMap(_.as[scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParkingRa]]).map(com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParkingRa) getOrElse com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.Empty
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AlarmBaseProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AlarmBaseProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 100 => __out = com.chargerlink.gateway.bean.alarm.AlarmVehicle
      case 101 => __out = com.chargerlink.gateway.bean.alarm.AlarmVehicleRa
      case 200 => __out = com.chargerlink.gateway.bean.alarm.AlarmRecorder
      case 201 => __out = com.chargerlink.gateway.bean.alarm.AlarmRecorderRa
      case 300 => __out = com.chargerlink.gateway.bean.alarm.AlarmCharger
      case 301 => __out = com.chargerlink.gateway.bean.alarm.AlarmChargerRa
      case 400 => __out = com.chargerlink.gateway.bean.alarm.AlarmParking
      case 401 => __out = com.chargerlink.gateway.bean.alarm.AlarmParkingRa
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.chargerlink.gateway.bean.common.DeviceType
      case 4 => com.chargerlink.gateway.bean.common.AlarmType
    }
  }
  lazy val defaultInstance = com.chargerlink.gateway.bean.alarm.AlarmInfo(
    deviceType = com.chargerlink.gateway.bean.common.DeviceType.DEVICE_VEHICLE_GB_V1,
    deviceId = "",
    subDevice = "",
    alarmType = com.chargerlink.gateway.bean.common.AlarmType.ALARM_VEHICLE,
    alarmCode = 0,
    alarmSource = 0,
    alarmLevel = 0,
    alarmTime = 0L
  )
  sealed trait AlarmDetail extends _root_.com.trueaccord.scalapb.GeneratedOneof {
    def isEmpty: Boolean = false
    def isDefined: Boolean = true
    def isAlarmVehicle: Boolean = false
    def isAlarmVehicleRa: Boolean = false
    def isAlarmRecorder: Boolean = false
    def isAlarmRecorderRa: Boolean = false
    def isAlarmCharger: Boolean = false
    def isAlarmChargerRa: Boolean = false
    def isAlarmParking: Boolean = false
    def isAlarmParkingRa: Boolean = false
    def alarmVehicle: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicle] = None
    def alarmVehicleRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicleRa] = None
    def alarmRecorder: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorder] = None
    def alarmRecorderRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorderRa] = None
    def alarmCharger: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmCharger] = None
    def alarmChargerRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmChargerRa] = None
    def alarmParking: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParking] = None
    def alarmParkingRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParkingRa] = None
  }
  object AlarmDetail extends {
    @SerialVersionUID(0L)
    case object Empty extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isEmpty: Boolean = true
      override def isDefined: Boolean = false
      override def number: Int = 0
      override def value: scala.Any = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    case class AlarmVehicle(value: com.chargerlink.gateway.bean.alarm.AlarmVehicle) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmVehicle: Boolean = true
      override def alarmVehicle: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicle] = Some(value)
      override def number: Int = 100
    }
    @SerialVersionUID(0L)
    case class AlarmVehicleRa(value: com.chargerlink.gateway.bean.alarm.AlarmVehicleRa) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmVehicleRa: Boolean = true
      override def alarmVehicleRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmVehicleRa] = Some(value)
      override def number: Int = 101
    }
    @SerialVersionUID(0L)
    case class AlarmRecorder(value: com.chargerlink.gateway.bean.alarm.AlarmRecorder) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmRecorder: Boolean = true
      override def alarmRecorder: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorder] = Some(value)
      override def number: Int = 200
    }
    @SerialVersionUID(0L)
    case class AlarmRecorderRa(value: com.chargerlink.gateway.bean.alarm.AlarmRecorderRa) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmRecorderRa: Boolean = true
      override def alarmRecorderRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmRecorderRa] = Some(value)
      override def number: Int = 201
    }
    @SerialVersionUID(0L)
    case class AlarmCharger(value: com.chargerlink.gateway.bean.alarm.AlarmCharger) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmCharger: Boolean = true
      override def alarmCharger: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmCharger] = Some(value)
      override def number: Int = 300
    }
    @SerialVersionUID(0L)
    case class AlarmChargerRa(value: com.chargerlink.gateway.bean.alarm.AlarmChargerRa) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmChargerRa: Boolean = true
      override def alarmChargerRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmChargerRa] = Some(value)
      override def number: Int = 301
    }
    @SerialVersionUID(0L)
    case class AlarmParking(value: com.chargerlink.gateway.bean.alarm.AlarmParking) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmParking: Boolean = true
      override def alarmParking: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParking] = Some(value)
      override def number: Int = 400
    }
    @SerialVersionUID(0L)
    case class AlarmParkingRa(value: com.chargerlink.gateway.bean.alarm.AlarmParkingRa) extends com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail {
      override def isAlarmParkingRa: Boolean = true
      override def alarmParkingRa: scala.Option[com.chargerlink.gateway.bean.alarm.AlarmParkingRa] = Some(value)
      override def number: Int = 401
    }
  }
  implicit class AlarmInfoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmInfo]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmInfo](_l) {
    def deviceType: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.DeviceType] = field(_.deviceType)((c_, f_) => c_.copy(deviceType = f_))
    def deviceId: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.deviceId)((c_, f_) => c_.copy(deviceId = f_))
    def subDevice: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.subDevice)((c_, f_) => c_.copy(subDevice = f_))
    def alarmType: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.common.AlarmType] = field(_.alarmType)((c_, f_) => c_.copy(alarmType = f_))
    def alarmCode: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.alarmCode)((c_, f_) => c_.copy(alarmCode = f_))
    def alarmSource: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.alarmSource)((c_, f_) => c_.copy(alarmSource = f_))
    def alarmLevel: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.alarmLevel)((c_, f_) => c_.copy(alarmLevel = f_))
    def alarmTime: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.alarmTime)((c_, f_) => c_.copy(alarmTime = f_))
    def alarmStart: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.getAlarmStart)((c_, f_) => c_.copy(alarmStart = Some(f_)))
    def optionalAlarmStart: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Long]] = field(_.alarmStart)((c_, f_) => c_.copy(alarmStart = f_))
    def alarmStop: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.getAlarmStop)((c_, f_) => c_.copy(alarmStop = Some(f_)))
    def optionalAlarmStop: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Long]] = field(_.alarmStop)((c_, f_) => c_.copy(alarmStop = f_))
    def alarmCnt: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getAlarmCnt)((c_, f_) => c_.copy(alarmCnt = Some(f_)))
    def optionalAlarmCnt: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.alarmCnt)((c_, f_) => c_.copy(alarmCnt = f_))
    def alarmVehicle: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmVehicle] = field(_.getAlarmVehicle)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicle(f_)))
    def alarmVehicleRa: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmVehicleRa] = field(_.getAlarmVehicleRa)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmVehicleRa(f_)))
    def alarmRecorder: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmRecorder] = field(_.getAlarmRecorder)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorder(f_)))
    def alarmRecorderRa: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmRecorderRa] = field(_.getAlarmRecorderRa)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmRecorderRa(f_)))
    def alarmCharger: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmCharger] = field(_.getAlarmCharger)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmCharger(f_)))
    def alarmChargerRa: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmChargerRa] = field(_.getAlarmChargerRa)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmChargerRa(f_)))
    def alarmParking: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmParking] = field(_.getAlarmParking)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParking(f_)))
    def alarmParkingRa: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmParkingRa] = field(_.getAlarmParkingRa)((c_, f_) => c_.copy(alarmDetail = com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail.AlarmParkingRa(f_)))
    def alarmDetail: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.alarm.AlarmInfo.AlarmDetail] = field(_.alarmDetail)((c_, f_) => c_.copy(alarmDetail = f_))
  }
  final val DEVICE_TYPE_FIELD_NUMBER = 1
  final val DEVICE_ID_FIELD_NUMBER = 2
  final val SUB_DEVICE_FIELD_NUMBER = 3
  final val ALARM_TYPE_FIELD_NUMBER = 4
  final val ALARM_CODE_FIELD_NUMBER = 5
  final val ALARM_SOURCE_FIELD_NUMBER = 6
  final val ALARM_LEVEL_FIELD_NUMBER = 7
  final val ALARM_TIME_FIELD_NUMBER = 8
  final val ALARM_START_FIELD_NUMBER = 9
  final val ALARM_STOP_FIELD_NUMBER = 10
  final val ALARM_CNT_FIELD_NUMBER = 11
  final val ALARM_VEHICLE_FIELD_NUMBER = 100
  final val ALARM_VEHICLE_RA_FIELD_NUMBER = 101
  final val ALARM_RECORDER_FIELD_NUMBER = 200
  final val ALARM_RECORDER_RA_FIELD_NUMBER = 201
  final val ALARM_CHARGER_FIELD_NUMBER = 300
  final val ALARM_CHARGER_RA_FIELD_NUMBER = 301
  final val ALARM_PARKING_FIELD_NUMBER = 400
  final val ALARM_PARKING_RA_FIELD_NUMBER = 401
}