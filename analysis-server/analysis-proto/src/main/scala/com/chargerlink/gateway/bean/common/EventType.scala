// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait EventType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = EventType
  def isEventDeviceReportLogin: Boolean = false
  def isEventDeviceReportActivity: Boolean = false
  def isEventDeviceReportFirmware: Boolean = false
  def isEventDeviceReportDiag: Boolean = false
  def isEventDeviceCheckRegister: Boolean = false
  def isEventDeviceCheckConfig: Boolean = false
  def isEventDeviceCheckSiminfo: Boolean = false
  def isEventDeviceCheckBind: Boolean = false
  def isEventRecorderTrackStart: Boolean = false
  def isEventRecorderTrackStop: Boolean = false
  def isEventRecorderMediaUpload: Boolean = false
  def isEventChargerChargeStarted: Boolean = false
  def isEventChargerChargeStopped: Boolean = false
  def isEventChargerChargeAuth: Boolean = false
  def isEventChargerChargeProcess: Boolean = false
  def isEventChargerOrderList: Boolean = false
  def isEventParkingLockerUnlock: Boolean = false
  def isEventParkingLockerLock: Boolean = false
  def isEventParkingDetectorFree: Boolean = false
  def isEventParkingDetectorUsed: Boolean = false
  def isEventDeviceFirst: Boolean = false
  def isEventDeviceLast: Boolean = false
  def isEventVehicleFirst: Boolean = false
  def isEventVehicleLast: Boolean = false
  def isEventRecorderFirst: Boolean = false
  def isEventRecorderLast: Boolean = false
  def isEventChargerFirst: Boolean = false
  def isEventChargerLast: Boolean = false
  def isEventParkingFirst: Boolean = false
  def isEventParkingLast: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[EventType] = com.chargerlink.gateway.bean.common.EventType
}

object EventType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[EventType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[EventType] = this
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_REPORT_LOGIN extends EventType {
    val value = 10
    val index = 0
    val name = "EVENT_DEVICE_REPORT_LOGIN"
    override def isEventDeviceReportLogin: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_REPORT_ACTIVITY extends EventType {
    val value = 11
    val index = 1
    val name = "EVENT_DEVICE_REPORT_ACTIVITY"
    override def isEventDeviceReportActivity: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_REPORT_FIRMWARE extends EventType {
    val value = 12
    val index = 2
    val name = "EVENT_DEVICE_REPORT_FIRMWARE"
    override def isEventDeviceReportFirmware: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_REPORT_DIAG extends EventType {
    val value = 13
    val index = 3
    val name = "EVENT_DEVICE_REPORT_DIAG"
    override def isEventDeviceReportDiag: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_CHECK_REGISTER extends EventType {
    val value = 20
    val index = 4
    val name = "EVENT_DEVICE_CHECK_REGISTER"
    override def isEventDeviceCheckRegister: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_CHECK_CONFIG extends EventType {
    val value = 21
    val index = 5
    val name = "EVENT_DEVICE_CHECK_CONFIG"
    override def isEventDeviceCheckConfig: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_CHECK_SIMINFO extends EventType {
    val value = 22
    val index = 6
    val name = "EVENT_DEVICE_CHECK_SIMINFO"
    override def isEventDeviceCheckSiminfo: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_CHECK_BIND extends EventType {
    val value = 23
    val index = 7
    val name = "EVENT_DEVICE_CHECK_BIND"
    override def isEventDeviceCheckBind: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_RECORDER_TRACK_START extends EventType {
    val value = 200
    val index = 8
    val name = "EVENT_RECORDER_TRACK_START"
    override def isEventRecorderTrackStart: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_RECORDER_TRACK_STOP extends EventType {
    val value = 201
    val index = 9
    val name = "EVENT_RECORDER_TRACK_STOP"
    override def isEventRecorderTrackStop: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_RECORDER_MEDIA_UPLOAD extends EventType {
    val value = 202
    val index = 10
    val name = "EVENT_RECORDER_MEDIA_UPLOAD"
    override def isEventRecorderMediaUpload: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_CHARGER_CHARGE_STARTED extends EventType {
    val value = 300
    val index = 11
    val name = "EVENT_CHARGER_CHARGE_STARTED"
    override def isEventChargerChargeStarted: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_CHARGER_CHARGE_STOPPED extends EventType {
    val value = 301
    val index = 12
    val name = "EVENT_CHARGER_CHARGE_STOPPED"
    override def isEventChargerChargeStopped: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_CHARGER_CHARGE_AUTH extends EventType {
    val value = 302
    val index = 13
    val name = "EVENT_CHARGER_CHARGE_AUTH"
    override def isEventChargerChargeAuth: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_CHARGER_CHARGE_PROCESS extends EventType {
    val value = 303
    val index = 14
    val name = "EVENT_CHARGER_CHARGE_PROCESS"
    override def isEventChargerChargeProcess: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_CHARGER_ORDER_LIST extends EventType {
    val value = 304
    val index = 15
    val name = "EVENT_CHARGER_ORDER_LIST"
    override def isEventChargerOrderList: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_PARKING_LOCKER_UNLOCK extends EventType {
    val value = 400
    val index = 16
    val name = "EVENT_PARKING_LOCKER_UNLOCK"
    override def isEventParkingLockerUnlock: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_PARKING_LOCKER_LOCK extends EventType {
    val value = 401
    val index = 17
    val name = "EVENT_PARKING_LOCKER_LOCK"
    override def isEventParkingLockerLock: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_PARKING_DETECTOR_FREE extends EventType {
    val value = 410
    val index = 18
    val name = "EVENT_PARKING_DETECTOR_FREE"
    override def isEventParkingDetectorFree: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_PARKING_DETECTOR_USED extends EventType {
    val value = 411
    val index = 19
    val name = "EVENT_PARKING_DETECTOR_USED"
    override def isEventParkingDetectorUsed: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_FIRST extends EventType {
    val value = 10
    val index = 20
    val name = "EVENT_DEVICE_FIRST"
    override def isEventDeviceFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_DEVICE_LAST extends EventType {
    val value = 99
    val index = 21
    val name = "EVENT_DEVICE_LAST"
    override def isEventDeviceLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_VEHICLE_FIRST extends EventType {
    val value = 100
    val index = 22
    val name = "EVENT_VEHICLE_FIRST"
    override def isEventVehicleFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_VEHICLE_LAST extends EventType {
    val value = 199
    val index = 23
    val name = "EVENT_VEHICLE_LAST"
    override def isEventVehicleLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_RECORDER_FIRST extends EventType {
    val value = 200
    val index = 24
    val name = "EVENT_RECORDER_FIRST"
    override def isEventRecorderFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_RECORDER_LAST extends EventType {
    val value = 299
    val index = 25
    val name = "EVENT_RECORDER_LAST"
    override def isEventRecorderLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_CHARGER_FIRST extends EventType {
    val value = 300
    val index = 26
    val name = "EVENT_CHARGER_FIRST"
    override def isEventChargerFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_CHARGER_LAST extends EventType {
    val value = 399
    val index = 27
    val name = "EVENT_CHARGER_LAST"
    override def isEventChargerLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_PARKING_FIRST extends EventType {
    val value = 400
    val index = 28
    val name = "EVENT_PARKING_FIRST"
    override def isEventParkingFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object EVENT_PARKING_LAST extends EventType {
    val value = 499
    val index = 29
    val name = "EVENT_PARKING_LAST"
    override def isEventParkingLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends EventType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(EVENT_DEVICE_REPORT_LOGIN, EVENT_DEVICE_REPORT_ACTIVITY, EVENT_DEVICE_REPORT_FIRMWARE, EVENT_DEVICE_REPORT_DIAG, EVENT_DEVICE_CHECK_REGISTER, EVENT_DEVICE_CHECK_CONFIG, EVENT_DEVICE_CHECK_SIMINFO, EVENT_DEVICE_CHECK_BIND, EVENT_RECORDER_TRACK_START, EVENT_RECORDER_TRACK_STOP, EVENT_RECORDER_MEDIA_UPLOAD, EVENT_CHARGER_CHARGE_STARTED, EVENT_CHARGER_CHARGE_STOPPED, EVENT_CHARGER_CHARGE_AUTH, EVENT_CHARGER_CHARGE_PROCESS, EVENT_CHARGER_ORDER_LIST, EVENT_PARKING_LOCKER_UNLOCK, EVENT_PARKING_LOCKER_LOCK, EVENT_PARKING_DETECTOR_FREE, EVENT_PARKING_DETECTOR_USED, EVENT_DEVICE_FIRST, EVENT_DEVICE_LAST, EVENT_VEHICLE_FIRST, EVENT_VEHICLE_LAST, EVENT_RECORDER_FIRST, EVENT_RECORDER_LAST, EVENT_CHARGER_FIRST, EVENT_CHARGER_LAST, EVENT_PARKING_FIRST, EVENT_PARKING_LAST)
  def fromValue(value: Int): EventType = value match {
    case 10 => EVENT_DEVICE_REPORT_LOGIN
    case 11 => EVENT_DEVICE_REPORT_ACTIVITY
    case 12 => EVENT_DEVICE_REPORT_FIRMWARE
    case 13 => EVENT_DEVICE_REPORT_DIAG
    case 20 => EVENT_DEVICE_CHECK_REGISTER
    case 21 => EVENT_DEVICE_CHECK_CONFIG
    case 22 => EVENT_DEVICE_CHECK_SIMINFO
    case 23 => EVENT_DEVICE_CHECK_BIND
    case 99 => EVENT_DEVICE_LAST
    case 100 => EVENT_VEHICLE_FIRST
    case 199 => EVENT_VEHICLE_LAST
    case 200 => EVENT_RECORDER_TRACK_START
    case 201 => EVENT_RECORDER_TRACK_STOP
    case 202 => EVENT_RECORDER_MEDIA_UPLOAD
    case 299 => EVENT_RECORDER_LAST
    case 300 => EVENT_CHARGER_CHARGE_STARTED
    case 301 => EVENT_CHARGER_CHARGE_STOPPED
    case 302 => EVENT_CHARGER_CHARGE_AUTH
    case 303 => EVENT_CHARGER_CHARGE_PROCESS
    case 304 => EVENT_CHARGER_ORDER_LIST
    case 399 => EVENT_CHARGER_LAST
    case 400 => EVENT_PARKING_LOCKER_UNLOCK
    case 401 => EVENT_PARKING_LOCKER_LOCK
    case 410 => EVENT_PARKING_DETECTOR_FREE
    case 411 => EVENT_PARKING_DETECTOR_USED
    case 499 => EVENT_PARKING_LAST
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumBaseProto.javaDescriptor.getEnumTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumBaseProto.scalaDescriptor.enums(3)
}