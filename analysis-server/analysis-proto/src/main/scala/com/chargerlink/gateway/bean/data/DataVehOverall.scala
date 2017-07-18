// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.data



/** * 整车数据的消息定义。对应电动车国标'0x01整车数据'。
  *
  * @param powerStatus
  *  / (必填，国标字段)车辆状态。0x01：启动状态，0x02：熄火状态，0x03：其他状态，0xFE：异常，0xFF：无效。
  * @param chargeStatus
  *  / (必填，国标字段)充电状态。0x01：停车充电，0x02：行驶充电，0x03：未充电状态，0x04：充电完成，0xFE：异常，0xFF：无效。
  * @param fuelStatus
  *  / (必填，国标字段)动力运行模式。0x01: 纯电，0x02：混动，0x03：燃油，0xFE：异常，0xFF：无效。
  * @param currentSpeed
  *  / (必填，国标字段)当前里程表车速。单位：0.1km/h，范围：0.0km/h～220.0km/h，0xFFFE：异常，0xFFFF：无效。
  * @param currentMileage
  *  / (必填，国标字段)当前里程表读数。单位：0.1km，范围：0.0km～999999.9km，0xFFFFFFFE：异常，0xFFFFFFFF：无效。
  * @param totalVoltage
  *  / (必填，国标字段)总电压。单位：0.1V，范围：0.0V～1000.0V，0xFFFE：异常，0xFFFF：无效。
  * @param totalCurrent
  *  / (必填，国标字段)总电流。单位：0.1A，偏移：-1000.0A，范围：-1000.0A～1000.0A，0xFFFE：异常，0xFFFF：无效。
  * @param socStatus
  *  / (必填，国标字段)SOC状态。单位：1%，范围：0%～100%，0xFE：异常，0xFF：无效。
  * @param dcStatus
  *  / (必填，国标字段)DC-DC状态。0x01：工作，0x02：断开，0xFE：异常，0xFF：无效。
  * @param gearStatus
  *  / (必填，国标字段)档位状态。Bit5：1-驱动有效/0-驱动无效，Bit4：1-制动有效/0-制动无效，Bit0～3：0-空挡/1～12-1档～12档/13-倒车挡/14-自动D档/15-停车P档，0xFE：异常，0xFF：无效。
  * @param resistance
  *  / (必填，国标字段)绝缘电阻值。单位：1kΩ，范围：0kΩ～60000kΩ，0xFFFE：异常，0xFFFF：无效。
  * @param powerValue
  *  / (必填，国标字段)牵引踏板信号。单位：1%，范围：0%～100%，0xFE：异常，0xFF：无效。
  * @param brakeValue
  *  / (必填，国标字段)制动踏板信号。单位：1%，范围：0%～100%，0xFE：异常，0xFF：无效。
  */
@SerialVersionUID(0L)
final case class DataVehOverall(
    powerStatus: Int,
    chargeStatus: Int,
    fuelStatus: Int,
    currentSpeed: Int,
    currentMileage: Int,
    totalVoltage: Int,
    totalCurrent: Int,
    socStatus: Int,
    dcStatus: Int,
    gearStatus: Int,
    resistance: Int,
    powerValue: Int,
    brakeValue: Int
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[DataVehOverall] with com.trueaccord.lenses.Updatable[DataVehOverall] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, powerStatus)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(2, chargeStatus)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(3, fuelStatus)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(4, currentSpeed)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(5, currentMileage)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(6, totalVoltage)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(7, totalCurrent)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(8, socStatus)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(9, dcStatus)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(10, gearStatus)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(11, resistance)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(12, powerValue)
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(13, brakeValue)
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
      _output__.writeUInt32(1, powerStatus)
      _output__.writeUInt32(2, chargeStatus)
      _output__.writeUInt32(3, fuelStatus)
      _output__.writeUInt32(4, currentSpeed)
      _output__.writeUInt32(5, currentMileage)
      _output__.writeUInt32(6, totalVoltage)
      _output__.writeUInt32(7, totalCurrent)
      _output__.writeUInt32(8, socStatus)
      _output__.writeUInt32(9, dcStatus)
      _output__.writeUInt32(10, gearStatus)
      _output__.writeUInt32(11, resistance)
      _output__.writeUInt32(12, powerValue)
      _output__.writeUInt32(13, brakeValue)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.data.DataVehOverall = {
      var __powerStatus = this.powerStatus
      var __chargeStatus = this.chargeStatus
      var __fuelStatus = this.fuelStatus
      var __currentSpeed = this.currentSpeed
      var __currentMileage = this.currentMileage
      var __totalVoltage = this.totalVoltage
      var __totalCurrent = this.totalCurrent
      var __socStatus = this.socStatus
      var __dcStatus = this.dcStatus
      var __gearStatus = this.gearStatus
      var __resistance = this.resistance
      var __powerValue = this.powerValue
      var __brakeValue = this.brakeValue
      var __requiredFields0: Long = 0x1fffL
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __powerStatus = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __chargeStatus = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffffdL
          case 24 =>
            __fuelStatus = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffffbL
          case 32 =>
            __currentSpeed = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffff7L
          case 40 =>
            __currentMileage = _input__.readUInt32()
            __requiredFields0 &= 0xffffffffffffffefL
          case 48 =>
            __totalVoltage = _input__.readUInt32()
            __requiredFields0 &= 0xffffffffffffffdfL
          case 56 =>
            __totalCurrent = _input__.readUInt32()
            __requiredFields0 &= 0xffffffffffffffbfL
          case 64 =>
            __socStatus = _input__.readUInt32()
            __requiredFields0 &= 0xffffffffffffff7fL
          case 72 =>
            __dcStatus = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffeffL
          case 80 =>
            __gearStatus = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffdffL
          case 88 =>
            __resistance = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffbffL
          case 96 =>
            __powerValue = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffff7ffL
          case 104 =>
            __brakeValue = _input__.readUInt32()
            __requiredFields0 &= 0xffffffffffffefffL
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.data.DataVehOverall(
          powerStatus = __powerStatus,
          chargeStatus = __chargeStatus,
          fuelStatus = __fuelStatus,
          currentSpeed = __currentSpeed,
          currentMileage = __currentMileage,
          totalVoltage = __totalVoltage,
          totalCurrent = __totalCurrent,
          socStatus = __socStatus,
          dcStatus = __dcStatus,
          gearStatus = __gearStatus,
          resistance = __resistance,
          powerValue = __powerValue,
          brakeValue = __brakeValue
      )
    }
    def withPowerStatus(__v: Int): DataVehOverall = copy(powerStatus = __v)
    def withChargeStatus(__v: Int): DataVehOverall = copy(chargeStatus = __v)
    def withFuelStatus(__v: Int): DataVehOverall = copy(fuelStatus = __v)
    def withCurrentSpeed(__v: Int): DataVehOverall = copy(currentSpeed = __v)
    def withCurrentMileage(__v: Int): DataVehOverall = copy(currentMileage = __v)
    def withTotalVoltage(__v: Int): DataVehOverall = copy(totalVoltage = __v)
    def withTotalCurrent(__v: Int): DataVehOverall = copy(totalCurrent = __v)
    def withSocStatus(__v: Int): DataVehOverall = copy(socStatus = __v)
    def withDcStatus(__v: Int): DataVehOverall = copy(dcStatus = __v)
    def withGearStatus(__v: Int): DataVehOverall = copy(gearStatus = __v)
    def withResistance(__v: Int): DataVehOverall = copy(resistance = __v)
    def withPowerValue(__v: Int): DataVehOverall = copy(powerValue = __v)
    def withBrakeValue(__v: Int): DataVehOverall = copy(brakeValue = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => powerStatus
        case 2 => chargeStatus
        case 3 => fuelStatus
        case 4 => currentSpeed
        case 5 => currentMileage
        case 6 => totalVoltage
        case 7 => totalCurrent
        case 8 => socStatus
        case 9 => dcStatus
        case 10 => gearStatus
        case 11 => resistance
        case 12 => powerValue
        case 13 => brakeValue
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(powerStatus)
        case 2 => _root_.scalapb.descriptors.PInt(chargeStatus)
        case 3 => _root_.scalapb.descriptors.PInt(fuelStatus)
        case 4 => _root_.scalapb.descriptors.PInt(currentSpeed)
        case 5 => _root_.scalapb.descriptors.PInt(currentMileage)
        case 6 => _root_.scalapb.descriptors.PInt(totalVoltage)
        case 7 => _root_.scalapb.descriptors.PInt(totalCurrent)
        case 8 => _root_.scalapb.descriptors.PInt(socStatus)
        case 9 => _root_.scalapb.descriptors.PInt(dcStatus)
        case 10 => _root_.scalapb.descriptors.PInt(gearStatus)
        case 11 => _root_.scalapb.descriptors.PInt(resistance)
        case 12 => _root_.scalapb.descriptors.PInt(powerValue)
        case 13 => _root_.scalapb.descriptors.PInt(brakeValue)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.data.DataVehOverall
}

object DataVehOverall extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataVehOverall] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataVehOverall] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.data.DataVehOverall = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.data.DataVehOverall(
      __fieldsMap(__fields.get(0)).asInstanceOf[Int],
      __fieldsMap(__fields.get(1)).asInstanceOf[Int],
      __fieldsMap(__fields.get(2)).asInstanceOf[Int],
      __fieldsMap(__fields.get(3)).asInstanceOf[Int],
      __fieldsMap(__fields.get(4)).asInstanceOf[Int],
      __fieldsMap(__fields.get(5)).asInstanceOf[Int],
      __fieldsMap(__fields.get(6)).asInstanceOf[Int],
      __fieldsMap(__fields.get(7)).asInstanceOf[Int],
      __fieldsMap(__fields.get(8)).asInstanceOf[Int],
      __fieldsMap(__fields.get(9)).asInstanceOf[Int],
      __fieldsMap(__fields.get(10)).asInstanceOf[Int],
      __fieldsMap(__fields.get(11)).asInstanceOf[Int],
      __fieldsMap(__fields.get(12)).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.data.DataVehOverall] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.data.DataVehOverall(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(12).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(13).get).get.as[Int]
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DataVehicleProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DataVehicleProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.data.DataVehOverall(
    powerStatus = 0,
    chargeStatus = 0,
    fuelStatus = 0,
    currentSpeed = 0,
    currentMileage = 0,
    totalVoltage = 0,
    totalCurrent = 0,
    socStatus = 0,
    dcStatus = 0,
    gearStatus = 0,
    resistance = 0,
    powerValue = 0,
    brakeValue = 0
  )
  implicit class DataVehOverallLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.data.DataVehOverall]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.data.DataVehOverall](_l) {
    def powerStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.powerStatus)((c_, f_) => c_.copy(powerStatus = f_))
    def chargeStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.chargeStatus)((c_, f_) => c_.copy(chargeStatus = f_))
    def fuelStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.fuelStatus)((c_, f_) => c_.copy(fuelStatus = f_))
    def currentSpeed: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.currentSpeed)((c_, f_) => c_.copy(currentSpeed = f_))
    def currentMileage: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.currentMileage)((c_, f_) => c_.copy(currentMileage = f_))
    def totalVoltage: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.totalVoltage)((c_, f_) => c_.copy(totalVoltage = f_))
    def totalCurrent: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.totalCurrent)((c_, f_) => c_.copy(totalCurrent = f_))
    def socStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.socStatus)((c_, f_) => c_.copy(socStatus = f_))
    def dcStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.dcStatus)((c_, f_) => c_.copy(dcStatus = f_))
    def gearStatus: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.gearStatus)((c_, f_) => c_.copy(gearStatus = f_))
    def resistance: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.resistance)((c_, f_) => c_.copy(resistance = f_))
    def powerValue: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.powerValue)((c_, f_) => c_.copy(powerValue = f_))
    def brakeValue: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.brakeValue)((c_, f_) => c_.copy(brakeValue = f_))
  }
  final val POWER_STATUS_FIELD_NUMBER = 1
  final val CHARGE_STATUS_FIELD_NUMBER = 2
  final val FUEL_STATUS_FIELD_NUMBER = 3
  final val CURRENT_SPEED_FIELD_NUMBER = 4
  final val CURRENT_MILEAGE_FIELD_NUMBER = 5
  final val TOTAL_VOLTAGE_FIELD_NUMBER = 6
  final val TOTAL_CURRENT_FIELD_NUMBER = 7
  final val SOC_STATUS_FIELD_NUMBER = 8
  final val DC_STATUS_FIELD_NUMBER = 9
  final val GEAR_STATUS_FIELD_NUMBER = 10
  final val RESISTANCE_FIELD_NUMBER = 11
  final val POWER_VALUE_FIELD_NUMBER = 12
  final val BRAKE_VALUE_FIELD_NUMBER = 13
}