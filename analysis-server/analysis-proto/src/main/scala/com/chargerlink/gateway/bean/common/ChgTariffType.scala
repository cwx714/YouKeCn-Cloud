// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait ChgTariffType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = ChgTariffType
  def isChgTariffChargingKwh: Boolean = false
  def isChgTariffChargingHour: Boolean = false
  def isChgTariffServiceKwh: Boolean = false
  def isChgTariffServiceHour: Boolean = false
  def isChgTariffServiceCount: Boolean = false
  def isChgTariffParkingHour: Boolean = false
  def isChgTariffReserveHour: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgTariffType] = com.chargerlink.gateway.bean.common.ChgTariffType
}

object ChgTariffType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgTariffType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgTariffType] = this
  @SerialVersionUID(0L)
  case object CHG_TARIFF_CHARGING_KWH extends ChgTariffType {
    val value = 1
    val index = 0
    val name = "CHG_TARIFF_CHARGING_KWH"
    override def isChgTariffChargingKwh: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_TARIFF_CHARGING_HOUR extends ChgTariffType {
    val value = 2
    val index = 1
    val name = "CHG_TARIFF_CHARGING_HOUR"
    override def isChgTariffChargingHour: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_TARIFF_SERVICE_KWH extends ChgTariffType {
    val value = 3
    val index = 2
    val name = "CHG_TARIFF_SERVICE_KWH"
    override def isChgTariffServiceKwh: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_TARIFF_SERVICE_HOUR extends ChgTariffType {
    val value = 4
    val index = 3
    val name = "CHG_TARIFF_SERVICE_HOUR"
    override def isChgTariffServiceHour: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_TARIFF_SERVICE_COUNT extends ChgTariffType {
    val value = 6
    val index = 4
    val name = "CHG_TARIFF_SERVICE_COUNT"
    override def isChgTariffServiceCount: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_TARIFF_PARKING_HOUR extends ChgTariffType {
    val value = 20
    val index = 5
    val name = "CHG_TARIFF_PARKING_HOUR"
    override def isChgTariffParkingHour: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_TARIFF_RESERVE_HOUR extends ChgTariffType {
    val value = 30
    val index = 6
    val name = "CHG_TARIFF_RESERVE_HOUR"
    override def isChgTariffReserveHour: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ChgTariffType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(CHG_TARIFF_CHARGING_KWH, CHG_TARIFF_CHARGING_HOUR, CHG_TARIFF_SERVICE_KWH, CHG_TARIFF_SERVICE_HOUR, CHG_TARIFF_SERVICE_COUNT, CHG_TARIFF_PARKING_HOUR, CHG_TARIFF_RESERVE_HOUR)
  def fromValue(value: Int): ChgTariffType = value match {
    case 1 => CHG_TARIFF_CHARGING_KWH
    case 2 => CHG_TARIFF_CHARGING_HOUR
    case 3 => CHG_TARIFF_SERVICE_KWH
    case 4 => CHG_TARIFF_SERVICE_HOUR
    case 6 => CHG_TARIFF_SERVICE_COUNT
    case 20 => CHG_TARIFF_PARKING_HOUR
    case 30 => CHG_TARIFF_RESERVE_HOUR
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumChargerProto.javaDescriptor.getEnumTypes.get(13)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumChargerProto.scalaDescriptor.enums(13)
}