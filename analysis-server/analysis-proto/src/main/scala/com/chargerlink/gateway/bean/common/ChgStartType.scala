// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait ChgStartType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = ChgStartType
  def isChgStartLocalPlug: Boolean = false
  def isChgStartLocalAdmin: Boolean = false
  def isChgStartLocalCard: Boolean = false
  def isChgStartOnlineCard: Boolean = false
  def isChgStartLocalWallet: Boolean = false
  def isChgStartLocalPlc: Boolean = false
  def isChgStartOnlinePlc: Boolean = false
  def isChgStartLocalVin: Boolean = false
  def isChgStartOnlineVin: Boolean = false
  def isChgStartLocalBt: Boolean = false
  def isChgStartLoaclPin: Boolean = false
  def isChgStartRemoteAdmin: Boolean = false
  def isChgStartRemoteUser: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgStartType] = com.chargerlink.gateway.bean.common.ChgStartType
}

object ChgStartType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgStartType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgStartType] = this
  @SerialVersionUID(0L)
  case object CHG_START_LOCAL_PLUG extends ChgStartType {
    val value = 1
    val index = 0
    val name = "CHG_START_LOCAL_PLUG"
    override def isChgStartLocalPlug: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_LOCAL_ADMIN extends ChgStartType {
    val value = 2
    val index = 1
    val name = "CHG_START_LOCAL_ADMIN"
    override def isChgStartLocalAdmin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_LOCAL_CARD extends ChgStartType {
    val value = 3
    val index = 2
    val name = "CHG_START_LOCAL_CARD"
    override def isChgStartLocalCard: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_ONLINE_CARD extends ChgStartType {
    val value = 4
    val index = 3
    val name = "CHG_START_ONLINE_CARD"
    override def isChgStartOnlineCard: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_LOCAL_WALLET extends ChgStartType {
    val value = 5
    val index = 4
    val name = "CHG_START_LOCAL_WALLET"
    override def isChgStartLocalWallet: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_LOCAL_PLC extends ChgStartType {
    val value = 6
    val index = 5
    val name = "CHG_START_LOCAL_PLC"
    override def isChgStartLocalPlc: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_ONLINE_PLC extends ChgStartType {
    val value = 7
    val index = 6
    val name = "CHG_START_ONLINE_PLC"
    override def isChgStartOnlinePlc: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_LOCAL_VIN extends ChgStartType {
    val value = 8
    val index = 7
    val name = "CHG_START_LOCAL_VIN"
    override def isChgStartLocalVin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_ONLINE_VIN extends ChgStartType {
    val value = 9
    val index = 8
    val name = "CHG_START_ONLINE_VIN"
    override def isChgStartOnlineVin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_LOCAL_BT extends ChgStartType {
    val value = 10
    val index = 9
    val name = "CHG_START_LOCAL_BT"
    override def isChgStartLocalBt: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_LOACL_PIN extends ChgStartType {
    val value = 11
    val index = 10
    val name = "CHG_START_LOACL_PIN"
    override def isChgStartLoaclPin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_REMOTE_ADMIN extends ChgStartType {
    val value = 12
    val index = 11
    val name = "CHG_START_REMOTE_ADMIN"
    override def isChgStartRemoteAdmin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_START_REMOTE_USER extends ChgStartType {
    val value = 13
    val index = 12
    val name = "CHG_START_REMOTE_USER"
    override def isChgStartRemoteUser: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ChgStartType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(CHG_START_LOCAL_PLUG, CHG_START_LOCAL_ADMIN, CHG_START_LOCAL_CARD, CHG_START_ONLINE_CARD, CHG_START_LOCAL_WALLET, CHG_START_LOCAL_PLC, CHG_START_ONLINE_PLC, CHG_START_LOCAL_VIN, CHG_START_ONLINE_VIN, CHG_START_LOCAL_BT, CHG_START_LOACL_PIN, CHG_START_REMOTE_ADMIN, CHG_START_REMOTE_USER)
  def fromValue(value: Int): ChgStartType = value match {
    case 1 => CHG_START_LOCAL_PLUG
    case 2 => CHG_START_LOCAL_ADMIN
    case 3 => CHG_START_LOCAL_CARD
    case 4 => CHG_START_ONLINE_CARD
    case 5 => CHG_START_LOCAL_WALLET
    case 6 => CHG_START_LOCAL_PLC
    case 7 => CHG_START_ONLINE_PLC
    case 8 => CHG_START_LOCAL_VIN
    case 9 => CHG_START_ONLINE_VIN
    case 10 => CHG_START_LOCAL_BT
    case 11 => CHG_START_LOACL_PIN
    case 12 => CHG_START_REMOTE_ADMIN
    case 13 => CHG_START_REMOTE_USER
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumChargerProto.javaDescriptor.getEnumTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumChargerProto.scalaDescriptor.enums(5)
}