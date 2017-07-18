// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait UploadType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = UploadType
  def isUploadTrack: Boolean = false
  def isUploadShare: Boolean = false
  def isUploadMonitor: Boolean = false
  def isUploadAlarm: Boolean = false
  def isUploadDiag: Boolean = false
  def isUploadOther: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[UploadType] = com.chargerlink.gateway.bean.common.UploadType
}

object UploadType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[UploadType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[UploadType] = this
  @SerialVersionUID(0L)
  case object UPLOAD_TRACK extends UploadType {
    val value = 0
    val index = 0
    val name = "UPLOAD_TRACK"
    override def isUploadTrack: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object UPLOAD_SHARE extends UploadType {
    val value = 1
    val index = 1
    val name = "UPLOAD_SHARE"
    override def isUploadShare: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object UPLOAD_MONITOR extends UploadType {
    val value = 2
    val index = 2
    val name = "UPLOAD_MONITOR"
    override def isUploadMonitor: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object UPLOAD_ALARM extends UploadType {
    val value = 3
    val index = 3
    val name = "UPLOAD_ALARM"
    override def isUploadAlarm: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object UPLOAD_DIAG extends UploadType {
    val value = 10
    val index = 4
    val name = "UPLOAD_DIAG"
    override def isUploadDiag: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object UPLOAD_OTHER extends UploadType {
    val value = 100
    val index = 5
    val name = "UPLOAD_OTHER"
    override def isUploadOther: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends UploadType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(UPLOAD_TRACK, UPLOAD_SHARE, UPLOAD_MONITOR, UPLOAD_ALARM, UPLOAD_DIAG, UPLOAD_OTHER)
  def fromValue(value: Int): UploadType = value match {
    case 0 => UPLOAD_TRACK
    case 1 => UPLOAD_SHARE
    case 2 => UPLOAD_MONITOR
    case 3 => UPLOAD_ALARM
    case 10 => UPLOAD_DIAG
    case 100 => UPLOAD_OTHER
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumBaseProto.javaDescriptor.getEnumTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumBaseProto.scalaDescriptor.enums(4)
}