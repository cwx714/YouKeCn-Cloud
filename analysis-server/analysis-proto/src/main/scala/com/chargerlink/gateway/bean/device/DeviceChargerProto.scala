// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.device



object DeviceChargerProto {
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """ChhiZWFuL0RldmljZUNoYXJnZXIucHJvdG8SE0NoYXJnZXJMaW5rLkdhdGV3YXkaFmJlYW4vRW51bUNoYXJnZXIucHJvdG8i7
  QIKEkRldmljZUNoYXJnZXJDTF92MhIbCgl2ZW5kb3JfaWQYASABKAlSCHZlbmRvcklkEiEKDG1vZGVsX251bWJlchgCIAEoCVILb
  W9kZWxOdW1iZXISIwoNc2VyaWFsX251bWJlchgDIAEoCVIMc2VyaWFsTnVtYmVyEikKEGZpcm13YXJlX3ZlcnNpb24YBCABKAlSD
  2Zpcm13YXJlVmVyc2lvbhIpChBwcm90b2NvbF92ZXJzaW9uGAUgASgJUg9wcm90b2NvbFZlcnNpb24SJQoOY2xpZW50X3ZlcnNpb
  24YBiABKAlSDWNsaWVudFZlcnNpb24SGwoJc2ltX2ljY2lkGAcgASgJUghzaW1JY2NpZBIZCghwbHVnX251bRgKIAEoDVIHcGx1Z
  051bRI9CglwbHVnX3R5cGUYCyADKA4yIC5DaGFyZ2VyTGluay5HYXRld2F5LkNoZ1BsdWdUeXBlUghwbHVnVHlwZUJyCiNjb20uY
  2hhcmdlcmxpbmsuZ2F0ZXdheS5iZWFuLmRldmljZVAAWiNjb20uY2hhcmdlcmxpbmsuZ2F0ZXdheS5iZWFuLmRldmljZaoCI2Nvb
  S5jaGFyZ2VybGluay5nYXRld2F5LmJlYW4uZGV2aWNl"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, Seq(
      com.chargerlink.gateway.bean.common.EnumChargerProto.scalaDescriptor
    ))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.chargerlink.gateway.bean.common.EnumChargerProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}