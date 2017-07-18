// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait ChgServiceType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = ChgServiceType
  def isChgServiceChargeAuto: Boolean = false
  def isChgServiceChargeElec: Boolean = false
  def isChgServiceChargeTime: Boolean = false
  def isChgServiceChargeMoney: Boolean = false
  def isChgServiceDischargeElec: Boolean = false
  def isChgServiceDischargeAuto: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgServiceType] = com.chargerlink.gateway.bean.common.ChgServiceType
}

object ChgServiceType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgServiceType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgServiceType] = this
  @SerialVersionUID(0L)
  case object CHG_SERVICE_CHARGE_AUTO extends ChgServiceType {
    val value = 0
    val index = 0
    val name = "CHG_SERVICE_CHARGE_AUTO"
    override def isChgServiceChargeAuto: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_SERVICE_CHARGE_ELEC extends ChgServiceType {
    val value = 1
    val index = 1
    val name = "CHG_SERVICE_CHARGE_ELEC"
    override def isChgServiceChargeElec: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_SERVICE_CHARGE_TIME extends ChgServiceType {
    val value = 2
    val index = 2
    val name = "CHG_SERVICE_CHARGE_TIME"
    override def isChgServiceChargeTime: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_SERVICE_CHARGE_MONEY extends ChgServiceType {
    val value = 3
    val index = 3
    val name = "CHG_SERVICE_CHARGE_MONEY"
    override def isChgServiceChargeMoney: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_SERVICE_DISCHARGE_ELEC extends ChgServiceType {
    val value = 4
    val index = 4
    val name = "CHG_SERVICE_DISCHARGE_ELEC"
    override def isChgServiceDischargeElec: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_SERVICE_DISCHARGE_AUTO extends ChgServiceType {
    val value = 5
    val index = 5
    val name = "CHG_SERVICE_DISCHARGE_AUTO"
    override def isChgServiceDischargeAuto: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ChgServiceType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(CHG_SERVICE_CHARGE_AUTO, CHG_SERVICE_CHARGE_ELEC, CHG_SERVICE_CHARGE_TIME, CHG_SERVICE_CHARGE_MONEY, CHG_SERVICE_DISCHARGE_ELEC, CHG_SERVICE_DISCHARGE_AUTO)
  def fromValue(value: Int): ChgServiceType = value match {
    case 0 => CHG_SERVICE_CHARGE_AUTO
    case 1 => CHG_SERVICE_CHARGE_ELEC
    case 2 => CHG_SERVICE_CHARGE_TIME
    case 3 => CHG_SERVICE_CHARGE_MONEY
    case 4 => CHG_SERVICE_DISCHARGE_ELEC
    case 5 => CHG_SERVICE_DISCHARGE_AUTO
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumChargerProto.javaDescriptor.getEnumTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumChargerProto.scalaDescriptor.enums(4)
}