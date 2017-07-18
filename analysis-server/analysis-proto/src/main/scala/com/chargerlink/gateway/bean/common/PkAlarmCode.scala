// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait PkAlarmCode extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = PkAlarmCode
  def isPkAlarmSysStorageFull: Boolean = false
  def isPkAlarmSysCommFault: Boolean = false
  def isPkAlarmSysSimFault: Boolean = false
  def isPkAlarmSysDialFault: Boolean = false
  def isPkAlarmSysConnectFault: Boolean = false
  def isPkAlarmSysConnectLost: Boolean = false
  def isPkAlarmSysPowerFault: Boolean = false
  def isPkAlarmVendorExtension: Boolean = false
  def isPkAlarmNoneFirst: Boolean = false
  def isPkAlarmNoneLast: Boolean = false
  def isPkAlarmSysFirst: Boolean = false
  def isPkAlarmSysLast: Boolean = false
  def isPkAlarmPklFirst: Boolean = false
  def isPkAlarmPklLast: Boolean = false
  def isPkAlarmPkdFirst: Boolean = false
  def isPkAlarmPkdLast: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PkAlarmCode] = com.chargerlink.gateway.bean.common.PkAlarmCode
}

object PkAlarmCode extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PkAlarmCode] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PkAlarmCode] = this
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_STORAGE_FULL extends PkAlarmCode {
    val value = 100
    val index = 0
    val name = "PK_ALARM_SYS_STORAGE_FULL"
    override def isPkAlarmSysStorageFull: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_COMM_FAULT extends PkAlarmCode {
    val value = 101
    val index = 1
    val name = "PK_ALARM_SYS_COMM_FAULT"
    override def isPkAlarmSysCommFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_SIM_FAULT extends PkAlarmCode {
    val value = 102
    val index = 2
    val name = "PK_ALARM_SYS_SIM_FAULT"
    override def isPkAlarmSysSimFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_DIAL_FAULT extends PkAlarmCode {
    val value = 103
    val index = 3
    val name = "PK_ALARM_SYS_DIAL_FAULT"
    override def isPkAlarmSysDialFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_CONNECT_FAULT extends PkAlarmCode {
    val value = 104
    val index = 4
    val name = "PK_ALARM_SYS_CONNECT_FAULT"
    override def isPkAlarmSysConnectFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_CONNECT_LOST extends PkAlarmCode {
    val value = 105
    val index = 5
    val name = "PK_ALARM_SYS_CONNECT_LOST"
    override def isPkAlarmSysConnectLost: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_POWER_FAULT extends PkAlarmCode {
    val value = 106
    val index = 6
    val name = "PK_ALARM_SYS_POWER_FAULT"
    override def isPkAlarmSysPowerFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_VENDOR_EXTENSION extends PkAlarmCode {
    val value = 0
    val index = 7
    val name = "PK_ALARM_VENDOR_EXTENSION"
    override def isPkAlarmVendorExtension: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_NONE_FIRST extends PkAlarmCode {
    val value = 1
    val index = 8
    val name = "PK_ALARM_NONE_FIRST"
    override def isPkAlarmNoneFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_NONE_LAST extends PkAlarmCode {
    val value = 99
    val index = 9
    val name = "PK_ALARM_NONE_LAST"
    override def isPkAlarmNoneLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_FIRST extends PkAlarmCode {
    val value = 100
    val index = 10
    val name = "PK_ALARM_SYS_FIRST"
    override def isPkAlarmSysFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_SYS_LAST extends PkAlarmCode {
    val value = 199
    val index = 11
    val name = "PK_ALARM_SYS_LAST"
    override def isPkAlarmSysLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_PKL_FIRST extends PkAlarmCode {
    val value = 500
    val index = 12
    val name = "PK_ALARM_PKL_FIRST"
    override def isPkAlarmPklFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_PKL_LAST extends PkAlarmCode {
    val value = 599
    val index = 13
    val name = "PK_ALARM_PKL_LAST"
    override def isPkAlarmPklLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_PKD_FIRST extends PkAlarmCode {
    val value = 600
    val index = 14
    val name = "PK_ALARM_PKD_FIRST"
    override def isPkAlarmPkdFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PK_ALARM_PKD_LAST extends PkAlarmCode {
    val value = 699
    val index = 15
    val name = "PK_ALARM_PKD_LAST"
    override def isPkAlarmPkdLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends PkAlarmCode with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(PK_ALARM_SYS_STORAGE_FULL, PK_ALARM_SYS_COMM_FAULT, PK_ALARM_SYS_SIM_FAULT, PK_ALARM_SYS_DIAL_FAULT, PK_ALARM_SYS_CONNECT_FAULT, PK_ALARM_SYS_CONNECT_LOST, PK_ALARM_SYS_POWER_FAULT, PK_ALARM_VENDOR_EXTENSION, PK_ALARM_NONE_FIRST, PK_ALARM_NONE_LAST, PK_ALARM_SYS_FIRST, PK_ALARM_SYS_LAST, PK_ALARM_PKL_FIRST, PK_ALARM_PKL_LAST, PK_ALARM_PKD_FIRST, PK_ALARM_PKD_LAST)
  def fromValue(value: Int): PkAlarmCode = value match {
    case 0 => PK_ALARM_VENDOR_EXTENSION
    case 1 => PK_ALARM_NONE_FIRST
    case 99 => PK_ALARM_NONE_LAST
    case 100 => PK_ALARM_SYS_STORAGE_FULL
    case 101 => PK_ALARM_SYS_COMM_FAULT
    case 102 => PK_ALARM_SYS_SIM_FAULT
    case 103 => PK_ALARM_SYS_DIAL_FAULT
    case 104 => PK_ALARM_SYS_CONNECT_FAULT
    case 105 => PK_ALARM_SYS_CONNECT_LOST
    case 106 => PK_ALARM_SYS_POWER_FAULT
    case 199 => PK_ALARM_SYS_LAST
    case 500 => PK_ALARM_PKL_FIRST
    case 599 => PK_ALARM_PKL_LAST
    case 600 => PK_ALARM_PKD_FIRST
    case 699 => PK_ALARM_PKD_LAST
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumParkingProto.javaDescriptor.getEnumTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumParkingProto.scalaDescriptor.enums(5)
}