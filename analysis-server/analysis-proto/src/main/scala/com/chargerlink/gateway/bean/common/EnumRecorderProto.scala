// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



object EnumRecorderProto {
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """ChdiZWFuL0VudW1SZWNvcmRlci5wcm90bxITQ2hhcmdlckxpbmsuR2F0ZXdheUJyCiNjb20uY2hhcmdlcmxpbmsuZ2F0ZXdhe
  S5iZWFuLmNvbW1vblAAWiNjb20uY2hhcmdlcmxpbmsuZ2F0ZXdheS5iZWFuLmNvbW1vbqoCI2NvbS5jaGFyZ2VybGluay5nYXRld
  2F5LmJlYW4uY29tbW9u"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, Seq(
    ))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}