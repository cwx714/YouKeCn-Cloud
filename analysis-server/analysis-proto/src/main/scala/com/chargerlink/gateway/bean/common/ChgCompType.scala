// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait ChgCompType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = ChgCompType
  def isChgCompNone: Boolean = false
  def isChgCompSys: Boolean = false
  def isChgCompTcu: Boolean = false
  def isChgCompCcm: Boolean = false
  def isChgCompBms: Boolean = false
  def isChgCompPkl: Boolean = false
  def isChgCompPkd: Boolean = false
  def isChgCompMeter: Boolean = false
  def isChgCompLcd: Boolean = false
  def isChgCompCard: Boolean = false
  def isChgCompFan: Boolean = false
  def isChgCompConn: Boolean = false
  def isChgCompPsm: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgCompType] = com.chargerlink.gateway.bean.common.ChgCompType
}

object ChgCompType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgCompType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgCompType] = this
  @SerialVersionUID(0L)
  case object CHG_COMP_NONE extends ChgCompType {
    val value = 0
    val index = 0
    val name = "CHG_COMP_NONE"
    override def isChgCompNone: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_SYS extends ChgCompType {
    val value = 1
    val index = 1
    val name = "CHG_COMP_SYS"
    override def isChgCompSys: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_TCU extends ChgCompType {
    val value = 2
    val index = 2
    val name = "CHG_COMP_TCU"
    override def isChgCompTcu: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_CCM extends ChgCompType {
    val value = 3
    val index = 3
    val name = "CHG_COMP_CCM"
    override def isChgCompCcm: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_BMS extends ChgCompType {
    val value = 4
    val index = 4
    val name = "CHG_COMP_BMS"
    override def isChgCompBms: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_PKL extends ChgCompType {
    val value = 5
    val index = 5
    val name = "CHG_COMP_PKL"
    override def isChgCompPkl: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_PKD extends ChgCompType {
    val value = 6
    val index = 6
    val name = "CHG_COMP_PKD"
    override def isChgCompPkd: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_METER extends ChgCompType {
    val value = 7
    val index = 7
    val name = "CHG_COMP_METER"
    override def isChgCompMeter: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_LCD extends ChgCompType {
    val value = 8
    val index = 8
    val name = "CHG_COMP_LCD"
    override def isChgCompLcd: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_CARD extends ChgCompType {
    val value = 9
    val index = 9
    val name = "CHG_COMP_CARD"
    override def isChgCompCard: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_FAN extends ChgCompType {
    val value = 10
    val index = 10
    val name = "CHG_COMP_FAN"
    override def isChgCompFan: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_CONN extends ChgCompType {
    val value = 11
    val index = 11
    val name = "CHG_COMP_CONN"
    override def isChgCompConn: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_COMP_PSM extends ChgCompType {
    val value = 12
    val index = 12
    val name = "CHG_COMP_PSM"
    override def isChgCompPsm: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ChgCompType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(CHG_COMP_NONE, CHG_COMP_SYS, CHG_COMP_TCU, CHG_COMP_CCM, CHG_COMP_BMS, CHG_COMP_PKL, CHG_COMP_PKD, CHG_COMP_METER, CHG_COMP_LCD, CHG_COMP_CARD, CHG_COMP_FAN, CHG_COMP_CONN, CHG_COMP_PSM)
  def fromValue(value: Int): ChgCompType = value match {
    case 0 => CHG_COMP_NONE
    case 1 => CHG_COMP_SYS
    case 2 => CHG_COMP_TCU
    case 3 => CHG_COMP_CCM
    case 4 => CHG_COMP_BMS
    case 5 => CHG_COMP_PKL
    case 6 => CHG_COMP_PKD
    case 7 => CHG_COMP_METER
    case 8 => CHG_COMP_LCD
    case 9 => CHG_COMP_CARD
    case 10 => CHG_COMP_FAN
    case 11 => CHG_COMP_CONN
    case 12 => CHG_COMP_PSM
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumChargerProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumChargerProto.scalaDescriptor.enums(0)
}