// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.api



object ApiBaseProto {
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """ChJiZWFuL0FwaUJhc2UucHJvdG8SE0NoYXJnZXJMaW5rLkdhdGV3YXkaE2JlYW4vRW51bUJhc2UucHJvdG8aFWJlYW4vRGV2a
  WNlQmFzZS5wcm90bxoUYmVhbi9FdmVudEJhc2UucHJvdG8aFWJlYW4vQXBpVmVoaWNsZS5wcm90bxoWYmVhbi9BcGlSZWNvcmRlc
  i5wcm90bxoVYmVhbi9BcGlDaGFyZ2VyLnByb3RvGhViZWFuL0FwaVBhcmtpbmcucHJvdG8aGWdvb2dsZS9wcm90b2J1Zi9hbnkuc
  HJvdG8icgoQSW1wb3J0RGV2aWNlSW5mbxJACgtkZXZpY2VfbGlzdBgBIAMoCzIfLkNoYXJnZXJMaW5rLkdhdGV3YXkuRGV2aWNlS
  W5mb1IKZGV2aWNlTGlzdBIcCglvdmVyd3JpdGUYAiACKAhSCW92ZXJ3cml0ZSJwCg9RdWVyeURldmljZUluZm8SQAoLZGV2aWNlX
  3R5cGUYASACKA4yHy5DaGFyZ2VyTGluay5HYXRld2F5LkRldmljZVR5cGVSCmRldmljZVR5cGUSGwoJZGV2aWNlX2lkGAIgAigJU
  ghkZXZpY2VJZCLJAQoNUXVlcnlEYXRhTGlzdBJACgtkZXZpY2VfdHlwZRgBIAIoDjIfLkNoYXJnZXJMaW5rLkdhdGV3YXkuRGV2a
  WNlVHlwZVIKZGV2aWNlVHlwZRIbCglkZXZpY2VfaWQYAiACKAlSCGRldmljZUlkEh0KCnN1Yl9kZXZpY2UYAyABKAlSCXN1YkRld
  mljZRIdCgpzdGFydF90aW1lGAQgAigDUglzdGFydFRpbWUSGwoJc3RvcF90aW1lGAUgAigDUghzdG9wVGltZSLpAQoOUXVlcnlBb
  GFybUxpc3QSQAoLZGV2aWNlX3R5cGUYASACKA4yHy5DaGFyZ2VyTGluay5HYXRld2F5LkRldmljZVR5cGVSCmRldmljZVR5cGUSG
  woJZGV2aWNlX2lkGAIgAigJUghkZXZpY2VJZBIdCgpzdWJfZGV2aWNlGAMgASgJUglzdWJEZXZpY2USHQoKc3RhcnRfdGltZRgEI
  AIoA1IJc3RhcnRUaW1lEhsKCXN0b3BfdGltZRgFIAIoA1IIc3RvcFRpbWUSHQoKYWxhcm1fY29kZRgGIAEoDVIJYWxhcm1Db2RlI
  okCCg5RdWVyeUV2ZW50TGlzdBJACgtkZXZpY2VfdHlwZRgBIAIoDjIfLkNoYXJnZXJMaW5rLkdhdGV3YXkuRGV2aWNlVHlwZVIKZ
  GV2aWNlVHlwZRIbCglkZXZpY2VfaWQYAiACKAlSCGRldmljZUlkEh0KCnN1Yl9kZXZpY2UYAyABKAlSCXN1YkRldmljZRIdCgpzd
  GFydF90aW1lGAQgAigDUglzdGFydFRpbWUSGwoJc3RvcF90aW1lGAUgAigDUghzdG9wVGltZRI9CgpldmVudF90eXBlGAYgASgOM
  h4uQ2hhcmdlckxpbmsuR2F0ZXdheS5FdmVudFR5cGVSCWV2ZW50VHlwZSKrAQoOUXVlcnlUcmFja0xpc3QSQAoLZGV2aWNlX3R5c
  GUYASACKA4yHy5DaGFyZ2VyTGluay5HYXRld2F5LkRldmljZVR5cGVSCmRldmljZVR5cGUSGwoJZGV2aWNlX2lkGAIgAigJUghkZ
  XZpY2VJZBIdCgpzdGFydF90aW1lGAMgAigDUglzdGFydFRpbWUSGwoJc3RvcF90aW1lGAQgAigDUghzdG9wVGltZSKKAQoOUXVlc
  nlUcmFja0luZm8SQAoLZGV2aWNlX3R5cGUYASACKA4yHy5DaGFyZ2VyTGluay5HYXRld2F5LkRldmljZVR5cGVSCmRldmljZVR5c
  GUSGwoJZGV2aWNlX2lkGAIgAigJUghkZXZpY2VJZBIZCgh0cmFja19pZBgDIAEoA1IHdHJhY2tJZCKOAQoOUXVlcnlNZWRpYUluZ
  m8SQAoLZGV2aWNlX3R5cGUYASACKA4yHy5DaGFyZ2VyTGluay5HYXRld2F5LkRldmljZVR5cGVSCmRldmljZVR5cGUSGwoJZGV2a
  WNlX2lkGAIgAigJUghkZXZpY2VJZBIdCgpzZXNzaW9uX2lkGAMgAigDUglzZXNzaW9uSWQi+wQKC0NvbW1hbmRJbmZvEkAKC2Rld
  mljZV90eXBlGAEgAigOMh8uQ2hhcmdlckxpbmsuR2F0ZXdheS5EZXZpY2VUeXBlUgpkZXZpY2VUeXBlEhsKCWRldmljZV9pZBgCI
  AIoCVIIZGV2aWNlSWQSHQoKY29tbWFuZF9pZBgDIAEoCVIJY29tbWFuZElkEhgKB3RpbWVvdXQYBCABKAVSB3RpbWVvdXQSRQoMZ
  XZlbnRfcmVzdWx0GAogASgLMiAuQ2hhcmdlckxpbmsuR2F0ZXdheS5FdmVudFJlc3VsdEgAUgtldmVudFJlc3VsdBJOCg12ZWhpY
  2xlX2diX3YxGGQgASgLMiguQ2hhcmdlckxpbmsuR2F0ZXdheS5Db21tYW5kVmVoaWNsZUdCX3YxSABSC3ZlaGljbGVHYlYxElUKD
  3JlY29yZGVyX2FtaV92MRjIASABKAsyKi5DaGFyZ2VyTGluay5HYXRld2F5LkNvbW1hbmRSZWNvcmRlckFNSV92MUgAUg1yZWNvc
  mRlckFtaVYxEk8KDWNoYXJnZXJfY2xfdjIYrAIgASgLMiguQ2hhcmdlckxpbmsuR2F0ZXdheS5Db21tYW5kQ2hhcmdlckNMX3YyS
  ABSC2NoYXJnZXJDbFYyEk8KDXBhcmtpbmdfY2xfdjIYkAMgASgLMiguQ2hhcmdlckxpbmsuR2F0ZXdheS5Db21tYW5kUGFya2luZ
  0NMX3YySABSC3BhcmtpbmdDbFYyEjoKDG90aGVyX2RldmljZRjnByABKAsyFC5nb29nbGUucHJvdG9idWYuQW55SABSC290aGVyR
  GV2aWNlQggKBmRldGFpbCK+CAoNQ29tbWFuZFJlc3VsdBJACgtkZXZpY2VfdHlwZRgBIAIoDjIfLkNoYXJnZXJMaW5rLkdhdGV3Y
  XkuRGV2aWNlVHlwZVIKZGV2aWNlVHlwZRIbCglkZXZpY2VfaWQYAiACKAlSCGRldmljZUlkEh0KCmNvbW1hbmRfaWQYAyABKAlSC
  WNvbW1hbmRJZBJGCgVlcnJvchgKIAEoCzIuLkNoYXJnZXJMaW5rLkdhdGV3YXkuQ29tbWFuZFJlc3VsdC5SZXN1bHRFcnJvckgAU
  gVlcnJvchJMCgdzdWNjZXNzGAsgASgLMjAuQ2hhcmdlckxpbmsuR2F0ZXdheS5Db21tYW5kUmVzdWx0LlJlc3VsdFN1Y2Nlc3NIA
  FIHc3VjY2VzcxJNCg12ZWhpY2xlX2diX3YxGGQgASgLMicuQ2hhcmdlckxpbmsuR2F0ZXdheS5SZXN1bHRWZWhpY2xlR0JfdjFIA
  FILdmVoaWNsZUdiVjESVAoPcmVjb3JkZXJfYW1pX3YxGMgBIAEoCzIpLkNoYXJnZXJMaW5rLkdhdGV3YXkuUmVzdWx0UmVjb3JkZ
  XJBTUlfdjFIAFINcmVjb3JkZXJBbWlWMRJOCg1jaGFyZ2VyX2NsX3YyGKwCIAEoCzInLkNoYXJnZXJMaW5rLkdhdGV3YXkuUmVzd
  Wx0Q2hhcmdlckNMX3YySABSC2NoYXJnZXJDbFYyEk4KDXBhcmtpbmdfY2xfdjIYkAMgASgLMicuQ2hhcmdlckxpbmsuR2F0ZXdhe
  S5SZXN1bHRQYXJraW5nQ0xfdjJIAFILcGFya2luZ0NsVjISOgoMb3RoZXJfZGV2aWNlGOcHIAEoCzIULmdvb2dsZS5wcm90b2J1Z
  i5BbnlIAFILb3RoZXJEZXZpY2UaswEKC1Jlc3VsdEVycm9yEksKCmVycm9yX2NvZGUYASACKA4yLC5DaGFyZ2VyTGluay5HYXRld
  2F5LkNvbW1hbmRSZXN1bHQuRXJyb3JDb2RlUgllcnJvckNvZGUSGwoJZXJyb3JfbXNnGAIgASgJUghlcnJvck1zZxIdCgpleHRyY
  V9jb2RlGAMgASgFUglleHRyYUNvZGUSGwoJZXh0cmFfbXNnGAQgASgJUghleHRyYU1zZxoPCg1SZXN1bHRTdWNjZXNzIsYBCglFc
  nJvckNvZGUSFQoRQVVUSE9SSVRZX0lOVkFMSUQQChISCg5ERVZJQ0VfVU5LTk9XThALEhIKDkRFVklDRV9JTlZBTElEEAwSEwoPU
  kVRVUVTVF9VTktOT1dOEBQSEwoPUkVRVUVTVF9JTlZBTElEEBUSEwoPUkVRVUVTVF9USU1FT1VUEBYSFAoQUkVTUE9OU0VfVElNR
  U9VVBAeEhIKDlJFU1BPTlNFX0VSUk9SEB8SEQoNR0VORVJJQ19FUlJPUhBkQggKBmRldGFpbCL7AQoQUHVzaEFsYXJtUmVxdWVzd
  BJIChB3aXRoX2FsYXJtX3R5cGVzGAEgAygOMh4uQ2hhcmdlckxpbmsuR2F0ZXdheS5BbGFybVR5cGVSDndpdGhBbGFybVR5cGVzE
  igKEHdpdGhfYWxhcm1fY29kZXMYAiADKA1SDndpdGhBbGFybUNvZGVzEksKEXdpdGhfZGV2aWNlX3R5cGVzGAMgAygOMh8uQ2hhc
  mdlckxpbmsuR2F0ZXdheS5EZXZpY2VUeXBlUg93aXRoRGV2aWNlVHlwZXMSJgoPd2l0aF9kZXZpY2VfaWRzGAQgAygJUg13aXRoR
  GV2aWNlSWRzItEBChBQdXNoRXZlbnRSZXF1ZXN0EkgKEHdpdGhfZXZlbnRfdHlwZXMYASADKA4yHi5DaGFyZ2VyTGluay5HYXRld
  2F5LkV2ZW50VHlwZVIOd2l0aEV2ZW50VHlwZXMSSwoRd2l0aF9kZXZpY2VfdHlwZXMYAiADKA4yHy5DaGFyZ2VyTGluay5HYXRld
  2F5LkRldmljZVR5cGVSD3dpdGhEZXZpY2VUeXBlcxImCg93aXRoX2RldmljZV9pZHMYAyADKAlSDXdpdGhEZXZpY2VJZHMi9gEKD
  1B1c2hEYXRhUmVxdWVzdBInCg9yZWNvcmRfaW50ZXJ2YWwYASACKA1SDnJlY29yZEludGVydmFsEkUKD3dpdGhfZGF0YV90eXBlc
  xgCIAMoDjIdLkNoYXJnZXJMaW5rLkdhdGV3YXkuRGF0YVR5cGVSDXdpdGhEYXRhVHlwZXMSSwoRd2l0aF9kZXZpY2VfdHlwZXMYA
  yADKA4yHy5DaGFyZ2VyTGluay5HYXRld2F5LkRldmljZVR5cGVSD3dpdGhEZXZpY2VUeXBlcxImCg93aXRoX2RldmljZV9pZHMYB
  CADKAlSDXdpdGhEZXZpY2VJZHMiowIKFVB1c2hEYXRhQnlBcmVhUmVxdWVzdBInCg9yZWNvcmRfaW50ZXJ2YWwYASACKA1SDnJlY
  29yZEludGVydmFsEkUKD3dpdGhfZGF0YV90eXBlcxgCIAMoDjIdLkNoYXJnZXJMaW5rLkdhdGV3YXkuRGF0YVR5cGVSDXdpdGhEY
  XRhVHlwZXMSJQoObGVmdF9sb25naXR1ZGUYAyACKAFSDWxlZnRMb25naXR1ZGUSIQoMdG9wX2xhdGl0dWRlGAQgAigBUgt0b3BMY
  XRpdHVkZRInCg9yaWdodF9sb25naXR1ZGUYBSACKAFSDnJpZ2h0TG9uZ2l0dWRlEicKD2JvdHRvbV9sYXRpdHVkZRgGIAIoAVIOY
  m90dG9tTGF0aXR1ZGVCaQogY29tLmNoYXJnZXJsaW5rLmdhdGV3YXkuYmVhbi5hcGlQAFogY29tLmNoYXJnZXJsaW5rLmdhdGV3Y
  XkuYmVhbi5hcGmqAiBjb20uY2hhcmdlcmxpbmsuZ2F0ZXdheS5iZWFuLmFwaQ=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, Seq(
      com.chargerlink.gateway.bean.common.EnumBaseProto.scalaDescriptor,
      com.chargerlink.gateway.bean.device.DeviceBaseProto.scalaDescriptor,
      com.chargerlink.gateway.bean.event.EventBaseProto.scalaDescriptor,
      com.chargerlink.gateway.bean.api.ApiVehicleProto.scalaDescriptor,
      com.chargerlink.gateway.bean.api.ApiRecorderProto.scalaDescriptor,
      com.chargerlink.gateway.bean.api.ApiChargerProto.scalaDescriptor,
      com.chargerlink.gateway.bean.api.ApiParkingProto.scalaDescriptor,
      com.google.protobuf.any.AnyProto.scalaDescriptor
    ))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.chargerlink.gateway.bean.common.EnumBaseProto.javaDescriptor,
      com.chargerlink.gateway.bean.device.DeviceBaseProto.javaDescriptor,
      com.chargerlink.gateway.bean.event.EventBaseProto.javaDescriptor,
      com.chargerlink.gateway.bean.api.ApiVehicleProto.javaDescriptor,
      com.chargerlink.gateway.bean.api.ApiRecorderProto.javaDescriptor,
      com.chargerlink.gateway.bean.api.ApiChargerProto.javaDescriptor,
      com.chargerlink.gateway.bean.api.ApiParkingProto.javaDescriptor,
      com.google.protobuf.any.AnyProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}