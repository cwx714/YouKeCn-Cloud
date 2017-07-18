// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait ChgStopType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = ChgStopType
  def isChgStopNormal: Boolean = false
  def isChgStopLocalCard: Boolean = false
  def isChgStopLocalPin: Boolean = false
  def isChgStopRemoteUser: Boolean = false
  def isChgStopRemoteAdmin: Boolean = false
  def isChgStopEmergencyStop: Boolean = false
  def isChgStopEvDisconnect: Boolean = false
  def isChgStopReboot: Boolean = false
  def isChgStopOffline: Boolean = false
  def isChgStopPowerLoss: Boolean = false
  def isChgStopSystemFault: Boolean = false
  def isChgStopBmsFault: Boolean = false
  def isChgStopLowBalance: Boolean = false
  def isChgStopOther: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgStopType] = com.chargerlink.gateway.bean.common.ChgStopType
}

object ChgStopType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgStopType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgStopType] = this
  @SerialVersionUID(0L)
  case object CHG_STOP_NORMAL extends ChgStopType {
    val value = 0
    val index = 0
    val name = "CHG_STOP_NORMAL"
    override def isChgStopNormal: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_LOCAL_CARD extends ChgStopType {
    val value = 1
    val index = 1
    val name = "CHG_STOP_LOCAL_CARD"
    override def isChgStopLocalCard: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_LOCAL_PIN extends ChgStopType {
    val value = 2
    val index = 2
    val name = "CHG_STOP_LOCAL_PIN"
    override def isChgStopLocalPin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_REMOTE_USER extends ChgStopType {
    val value = 3
    val index = 3
    val name = "CHG_STOP_REMOTE_USER"
    override def isChgStopRemoteUser: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_REMOTE_ADMIN extends ChgStopType {
    val value = 4
    val index = 4
    val name = "CHG_STOP_REMOTE_ADMIN"
    override def isChgStopRemoteAdmin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_EMERGENCY_STOP extends ChgStopType {
    val value = 5
    val index = 5
    val name = "CHG_STOP_EMERGENCY_STOP"
    override def isChgStopEmergencyStop: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_EV_DISCONNECT extends ChgStopType {
    val value = 6
    val index = 6
    val name = "CHG_STOP_EV_DISCONNECT"
    override def isChgStopEvDisconnect: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_REBOOT extends ChgStopType {
    val value = 7
    val index = 7
    val name = "CHG_STOP_REBOOT"
    override def isChgStopReboot: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_OFFLINE extends ChgStopType {
    val value = 8
    val index = 8
    val name = "CHG_STOP_OFFLINE"
    override def isChgStopOffline: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_POWER_LOSS extends ChgStopType {
    val value = 9
    val index = 9
    val name = "CHG_STOP_POWER_LOSS"
    override def isChgStopPowerLoss: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_SYSTEM_FAULT extends ChgStopType {
    val value = 10
    val index = 10
    val name = "CHG_STOP_SYSTEM_FAULT"
    override def isChgStopSystemFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_BMS_FAULT extends ChgStopType {
    val value = 11
    val index = 11
    val name = "CHG_STOP_BMS_FAULT"
    override def isChgStopBmsFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_LOW_BALANCE extends ChgStopType {
    val value = 12
    val index = 12
    val name = "CHG_STOP_LOW_BALANCE"
    override def isChgStopLowBalance: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_STOP_OTHER extends ChgStopType {
    val value = 255
    val index = 13
    val name = "CHG_STOP_OTHER"
    override def isChgStopOther: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ChgStopType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(CHG_STOP_NORMAL, CHG_STOP_LOCAL_CARD, CHG_STOP_LOCAL_PIN, CHG_STOP_REMOTE_USER, CHG_STOP_REMOTE_ADMIN, CHG_STOP_EMERGENCY_STOP, CHG_STOP_EV_DISCONNECT, CHG_STOP_REBOOT, CHG_STOP_OFFLINE, CHG_STOP_POWER_LOSS, CHG_STOP_SYSTEM_FAULT, CHG_STOP_BMS_FAULT, CHG_STOP_LOW_BALANCE, CHG_STOP_OTHER)
  def fromValue(value: Int): ChgStopType = value match {
    case 0 => CHG_STOP_NORMAL
    case 1 => CHG_STOP_LOCAL_CARD
    case 2 => CHG_STOP_LOCAL_PIN
    case 3 => CHG_STOP_REMOTE_USER
    case 4 => CHG_STOP_REMOTE_ADMIN
    case 5 => CHG_STOP_EMERGENCY_STOP
    case 6 => CHG_STOP_EV_DISCONNECT
    case 7 => CHG_STOP_REBOOT
    case 8 => CHG_STOP_OFFLINE
    case 9 => CHG_STOP_POWER_LOSS
    case 10 => CHG_STOP_SYSTEM_FAULT
    case 11 => CHG_STOP_BMS_FAULT
    case 12 => CHG_STOP_LOW_BALANCE
    case 255 => CHG_STOP_OTHER
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumChargerProto.javaDescriptor.getEnumTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumChargerProto.scalaDescriptor.enums(6)
}