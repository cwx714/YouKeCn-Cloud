// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.data



/** * 可充电储能装置温度数据的消息定义。对应电动车国标'0x09可充电储能装置温度数据'。
  *
  * @param index
  *  / (必填，国标字段)可充电储能装置子系统号。
  * @param tempList
  *  / (必填，国标字段)单体电池温度探针温度值列表。单位：1°C，偏移：-40°C，范围：-40°C～210°C，0xFE：异常，0xFF：无效。
  */
@SerialVersionUID(0L)
final case class DataVehBmsTemp(
    index: Int,
    tempList: _root_.scala.collection.Seq[Int] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[DataVehBmsTemp] with com.trueaccord.lenses.Updatable[DataVehBmsTemp] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, index)
      tempList.foreach(tempList => __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(2, tempList))
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      _output__.writeUInt32(1, index)
      tempList.foreach { __v =>
        _output__.writeUInt32(2, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.chargerlink.gateway.bean.data.DataVehBmsTemp = {
      var __index = this.index
      val __tempList = (_root_.scala.collection.immutable.Vector.newBuilder[Int] ++= this.tempList)
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __index = _input__.readUInt32()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __tempList += _input__.readUInt32()
          case 18 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __tempList += _input__.readUInt32
            }
            _input__.popLimit(oldLimit)
          }
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      com.chargerlink.gateway.bean.data.DataVehBmsTemp(
          index = __index,
          tempList = __tempList.result()
      )
    }
    def withIndex(__v: Int): DataVehBmsTemp = copy(index = __v)
    def clearTempList = copy(tempList = _root_.scala.collection.Seq.empty)
    def addTempList(__vs: Int*): DataVehBmsTemp = addAllTempList(__vs)
    def addAllTempList(__vs: TraversableOnce[Int]): DataVehBmsTemp = copy(tempList = tempList ++ __vs)
    def withTempList(__v: _root_.scala.collection.Seq[Int]): DataVehBmsTemp = copy(tempList = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => index
        case 2 => tempList
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(index)
        case 2 => _root_.scalapb.descriptors.PRepeated(tempList.map(_root_.scalapb.descriptors.PInt)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToSingleLineUnicodeString(this)
    def companion = com.chargerlink.gateway.bean.data.DataVehBmsTemp
}

object DataVehBmsTemp extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataVehBmsTemp] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.chargerlink.gateway.bean.data.DataVehBmsTemp] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.chargerlink.gateway.bean.data.DataVehBmsTemp = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.chargerlink.gateway.bean.data.DataVehBmsTemp(
      __fieldsMap(__fields.get(0)).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[Int]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.chargerlink.gateway.bean.data.DataVehBmsTemp] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.chargerlink.gateway.bean.data.DataVehBmsTemp(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[Int],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[Int]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DataVehicleProto.javaDescriptor.getMessageTypes.get(9)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DataVehicleProto.scalaDescriptor.messages(9)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.chargerlink.gateway.bean.data.DataVehBmsTemp(
    index = 0
  )
  implicit class DataVehBmsTempLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.chargerlink.gateway.bean.data.DataVehBmsTemp]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.chargerlink.gateway.bean.data.DataVehBmsTemp](_l) {
    def index: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.index)((c_, f_) => c_.copy(index = f_))
    def tempList: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[Int]] = field(_.tempList)((c_, f_) => c_.copy(tempList = f_))
  }
  final val INDEX_FIELD_NUMBER = 1
  final val TEMP_LIST_FIELD_NUMBER = 2
}