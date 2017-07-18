// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.chargerlink.gateway.bean.common



sealed trait ChgAlarmCode extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = ChgAlarmCode
  def isChgAlarmSysStorageFull: Boolean = false
  def isChgAlarmSysCommFault: Boolean = false
  def isChgAlarmSysSimFault: Boolean = false
  def isChgAlarmSysDialFault: Boolean = false
  def isChgAlarmSysConnectFault: Boolean = false
  def isChgAlarmSysConnectLost: Boolean = false
  def isChgAlarmSysPowerFault: Boolean = false
  def isChgAlarmMeterFault: Boolean = false
  def isChgAlarmCardFault: Boolean = false
  def isChgAlarmLcdFault: Boolean = false
  def isChgAlarmTcuSocketFault: Boolean = false
  def isChgAlarmTcuCpuHighFault: Boolean = false
  def isChgAlarmTcuMemLowFault: Boolean = false
  def isChgAlarmCcmEmergencyFault: Boolean = false
  def isChgAlarmCcmLockFault: Boolean = false
  def isChgAlarmCcmBreakerFault: Boolean = false
  def isChgAlarmCcmSpdFault: Boolean = false
  def isChgAlarmCcmSmogFault: Boolean = false
  def isChgAlarmCcmDoorFault: Boolean = false
  def isChgAlarmCcmWaterFault: Boolean = false
  def isChgAlarmCcmDcContactorFault: Boolean = false
  def isChgAlarmCcmDcFuseFault: Boolean = false
  def isChgAlarmCcmInsulationModule: Boolean = false
  def isChgAlarmCcmInsulationCheck: Boolean = false
  def isChgAlarmCcmFanFault: Boolean = false
  def isChgAlarmCcmCc1Fault: Boolean = false
  def isChgAlarmCcmOverTempWarn: Boolean = false
  def isChgAlarmCcmPlugOverTempFault: Boolean = false
  def isChgAlarmCcmGunHolderFault: Boolean = false
  def isChgAlarmCcmInputUnderVol: Boolean = false
  def isChgAlarmCcmInputOverVol: Boolean = false
  def isChgAlarmCcmAssistFault: Boolean = false
  def isChgAlarmCcmBleedTimeout: Boolean = false
  def isChgAlarmCcmSwitchFault: Boolean = false
  def isChgAlarmCcmOuputUnderVol: Boolean = false
  def isChgAlarmCcmOutputOverVol: Boolean = false
  def isChgAlarmCcmOutputOverCur: Boolean = false
  def isChgAlarmCcmInsulationWarn: Boolean = false
  def isChgAlarmCcmDcAdhesionFault: Boolean = false
  def isChgAlarmCcmPlugOverTempWarn: Boolean = false
  def isChgAlarmCcmOverTempFault: Boolean = false
  def isChgAlarmCcmAcContactorFault: Boolean = false
  def isChgAlarmCcmAcAdhesionFault: Boolean = false
  def isChgAlarmCcmParaAdhesionFault: Boolean = false
  def isChgAlarmBmsCellOverVol: Boolean = false
  def isChgAlarmBmsCellOverTemp: Boolean = false
  def isChgAlarmBmsCommFault: Boolean = false
  def isChgAlarmBmsCommTimeout: Boolean = false
  def isChgAlarmBmsBatteryInversed: Boolean = false
  def isChgAlarmBmsBatteryMissed: Boolean = false
  def isChgAlarmBmsBatteryOverVol: Boolean = false
  def isChgAlarmBmsOverSoc: Boolean = false
  def isChgAlarmBmsInsulationFault: Boolean = false
  def isChgAlarmBmsContactorFault: Boolean = false
  def isChgAlarmPsmFault: Boolean = false
  def isChgAlarmPsmInputFault: Boolean = false
  def isChgAlarmPsmInputOverVol: Boolean = false
  def isChgAlarmPsmInputUnderVol: Boolean = false
  def isChgAlarmPsmInputMissPhase: Boolean = false
  def isChgAlarmPsmOutputShort: Boolean = false
  def isChgAlarmPsmOutputOverCur: Boolean = false
  def isChgAlarmPsmOutputOverVol: Boolean = false
  def isChgAlarmPsmOutputUnderVol: Boolean = false
  def isChgAlarmPsmOutputFault: Boolean = false
  def isChgAlarmPsmOverTemp: Boolean = false
  def isChgAlarmPsmCommFault: Boolean = false
  def isChgAlarmPsmFanFault: Boolean = false
  def isChgAlarmPsmCloseException: Boolean = false
  def isChgAlarmVendorExtension: Boolean = false
  def isChgAlarmNoneFirst: Boolean = false
  def isChgAlarmNoneLast: Boolean = false
  def isChgAlarmSysFirst: Boolean = false
  def isChgAlarmSysLast: Boolean = false
  def isChgAlarmBcmFirst: Boolean = false
  def isChgAlarmBcmLast: Boolean = false
  def isChgAlarmCcmFirst: Boolean = false
  def isChgAlarmCcmLast: Boolean = false
  def isChgAlarmBmsFirst: Boolean = false
  def isChgAlarmBmsLast: Boolean = false
  def isChgAlarmPklFirst: Boolean = false
  def isChgAlarmPklLast: Boolean = false
  def isChgAlarmPkdFirst: Boolean = false
  def isChgAlarmPkdLast: Boolean = false
  def isChgAlarmMeterFirst: Boolean = false
  def isChgAlarmMeterLast: Boolean = false
  def isChgAlarmLcdFirst: Boolean = false
  def isChgAlarmLcdLast: Boolean = false
  def isChgAlarmCardFirst: Boolean = false
  def isChgAlarmCardLast: Boolean = false
  def isChgAlarmFanFirst: Boolean = false
  def isChgAlarmFanLast: Boolean = false
  def isChgAlarmConnFirst: Boolean = false
  def isChgAlarmConnLast: Boolean = false
  def isChgAlarmPsmFirst: Boolean = false
  def isChgAlarmPsmLast: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgAlarmCode] = com.chargerlink.gateway.bean.common.ChgAlarmCode
}

object ChgAlarmCode extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgAlarmCode] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[ChgAlarmCode] = this
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_STORAGE_FULL extends ChgAlarmCode {
    val value = 100
    val index = 0
    val name = "CHG_ALARM_SYS_STORAGE_FULL"
    override def isChgAlarmSysStorageFull: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_COMM_FAULT extends ChgAlarmCode {
    val value = 101
    val index = 1
    val name = "CHG_ALARM_SYS_COMM_FAULT"
    override def isChgAlarmSysCommFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_SIM_FAULT extends ChgAlarmCode {
    val value = 102
    val index = 2
    val name = "CHG_ALARM_SYS_SIM_FAULT"
    override def isChgAlarmSysSimFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_DIAL_FAULT extends ChgAlarmCode {
    val value = 103
    val index = 3
    val name = "CHG_ALARM_SYS_DIAL_FAULT"
    override def isChgAlarmSysDialFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_CONNECT_FAULT extends ChgAlarmCode {
    val value = 104
    val index = 4
    val name = "CHG_ALARM_SYS_CONNECT_FAULT"
    override def isChgAlarmSysConnectFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_CONNECT_LOST extends ChgAlarmCode {
    val value = 105
    val index = 5
    val name = "CHG_ALARM_SYS_CONNECT_LOST"
    override def isChgAlarmSysConnectLost: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_POWER_FAULT extends ChgAlarmCode {
    val value = 106
    val index = 6
    val name = "CHG_ALARM_SYS_POWER_FAULT"
    override def isChgAlarmSysPowerFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_METER_FAULT extends ChgAlarmCode {
    val value = 107
    val index = 7
    val name = "CHG_ALARM_METER_FAULT"
    override def isChgAlarmMeterFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CARD_FAULT extends ChgAlarmCode {
    val value = 108
    val index = 8
    val name = "CHG_ALARM_CARD_FAULT"
    override def isChgAlarmCardFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_LCD_FAULT extends ChgAlarmCode {
    val value = 109
    val index = 9
    val name = "CHG_ALARM_LCD_FAULT"
    override def isChgAlarmLcdFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_Alarm_TCU_SOCKET_FAULT extends ChgAlarmCode {
    val value = 110
    val index = 10
    val name = "CHG_Alarm_TCU_SOCKET_FAULT"
    override def isChgAlarmTcuSocketFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_TCU_CPU_HIGH_FAULT extends ChgAlarmCode {
    val value = 111
    val index = 11
    val name = "CHG_ALARM_TCU_CPU_HIGH_FAULT"
    override def isChgAlarmTcuCpuHighFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_TCU_MEM_LOW_FAULT extends ChgAlarmCode {
    val value = 112
    val index = 12
    val name = "CHG_ALARM_TCU_MEM_LOW_FAULT"
    override def isChgAlarmTcuMemLowFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_EMERGENCY_FAULT extends ChgAlarmCode {
    val value = 300
    val index = 13
    val name = "CHG_ALARM_CCM_EMERGENCY_FAULT"
    override def isChgAlarmCcmEmergencyFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_LOCK_FAULT extends ChgAlarmCode {
    val value = 301
    val index = 14
    val name = "CHG_ALARM_CCM_LOCK_FAULT"
    override def isChgAlarmCcmLockFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_BREAKER_FAULT extends ChgAlarmCode {
    val value = 302
    val index = 15
    val name = "CHG_ALARM_CCM_BREAKER_FAULT"
    override def isChgAlarmCcmBreakerFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_SPD_FAULT extends ChgAlarmCode {
    val value = 303
    val index = 16
    val name = "CHG_ALARM_CCM_SPD_FAULT"
    override def isChgAlarmCcmSpdFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_SMOG_FAULT extends ChgAlarmCode {
    val value = 304
    val index = 17
    val name = "CHG_ALARM_CCM_SMOG_FAULT"
    override def isChgAlarmCcmSmogFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_DOOR_FAULT extends ChgAlarmCode {
    val value = 305
    val index = 18
    val name = "CHG_ALARM_CCM_DOOR_FAULT"
    override def isChgAlarmCcmDoorFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_WATER_FAULT extends ChgAlarmCode {
    val value = 306
    val index = 19
    val name = "CHG_ALARM_CCM_WATER_FAULT"
    override def isChgAlarmCcmWaterFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_DC_CONTACTOR_FAULT extends ChgAlarmCode {
    val value = 307
    val index = 20
    val name = "CHG_ALARM_CCM_DC_CONTACTOR_FAULT"
    override def isChgAlarmCcmDcContactorFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_DC_FUSE_FAULT extends ChgAlarmCode {
    val value = 308
    val index = 21
    val name = "CHG_ALARM_CCM_DC_FUSE_FAULT"
    override def isChgAlarmCcmDcFuseFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_INSULATION_MODULE extends ChgAlarmCode {
    val value = 309
    val index = 22
    val name = "CHG_ALARM_CCM_INSULATION_MODULE"
    override def isChgAlarmCcmInsulationModule: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_INSULATION_CHECK extends ChgAlarmCode {
    val value = 310
    val index = 23
    val name = "CHG_ALARM_CCM_INSULATION_CHECK"
    override def isChgAlarmCcmInsulationCheck: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_FAN_FAULT extends ChgAlarmCode {
    val value = 311
    val index = 24
    val name = "CHG_ALARM_CCM_FAN_FAULT"
    override def isChgAlarmCcmFanFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_CC1_FAULT extends ChgAlarmCode {
    val value = 312
    val index = 25
    val name = "CHG_ALARM_CCM_CC1_FAULT"
    override def isChgAlarmCcmCc1Fault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_OVER_TEMP_WARN extends ChgAlarmCode {
    val value = 313
    val index = 26
    val name = "CHG_ALARM_CCM_OVER_TEMP_WARN"
    override def isChgAlarmCcmOverTempWarn: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_PLUG_OVER_TEMP_FAULT extends ChgAlarmCode {
    val value = 314
    val index = 27
    val name = "CHG_ALARM_CCM_PLUG_OVER_TEMP_FAULT"
    override def isChgAlarmCcmPlugOverTempFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_GUN_HOLDER_FAULT extends ChgAlarmCode {
    val value = 315
    val index = 28
    val name = "CHG_ALARM_CCM_GUN_HOLDER_FAULT"
    override def isChgAlarmCcmGunHolderFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_INPUT_UNDER_VOL extends ChgAlarmCode {
    val value = 316
    val index = 29
    val name = "CHG_ALARM_CCM_INPUT_UNDER_VOL"
    override def isChgAlarmCcmInputUnderVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_INPUT_OVER_VOL extends ChgAlarmCode {
    val value = 317
    val index = 30
    val name = "CHG_ALARM_CCM_INPUT_OVER_VOL"
    override def isChgAlarmCcmInputOverVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_ASSIST_FAULT extends ChgAlarmCode {
    val value = 318
    val index = 31
    val name = "CHG_ALARM_CCM_ASSIST_FAULT"
    override def isChgAlarmCcmAssistFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_BLEED_TIMEOUT extends ChgAlarmCode {
    val value = 319
    val index = 32
    val name = "CHG_ALARM_CCM_BLEED_TIMEOUT"
    override def isChgAlarmCcmBleedTimeout: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_SWITCH_FAULT extends ChgAlarmCode {
    val value = 320
    val index = 33
    val name = "CHG_ALARM_CCM_SWITCH_FAULT"
    override def isChgAlarmCcmSwitchFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_OUPUT_UNDER_VOL extends ChgAlarmCode {
    val value = 321
    val index = 34
    val name = "CHG_ALARM_CCM_OUPUT_UNDER_VOL"
    override def isChgAlarmCcmOuputUnderVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_OUTPUT_OVER_VOL extends ChgAlarmCode {
    val value = 322
    val index = 35
    val name = "CHG_ALARM_CCM_OUTPUT_OVER_VOL"
    override def isChgAlarmCcmOutputOverVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_OUTPUT_OVER_CUR extends ChgAlarmCode {
    val value = 323
    val index = 36
    val name = "CHG_ALARM_CCM_OUTPUT_OVER_CUR"
    override def isChgAlarmCcmOutputOverCur: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_INSULATION_WARN extends ChgAlarmCode {
    val value = 324
    val index = 37
    val name = "CHG_ALARM_CCM_INSULATION_WARN"
    override def isChgAlarmCcmInsulationWarn: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_DC_ADHESION_FAULT extends ChgAlarmCode {
    val value = 325
    val index = 38
    val name = "CHG_ALARM_CCM_DC_ADHESION_FAULT"
    override def isChgAlarmCcmDcAdhesionFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_PLUG_OVER_TEMP_WARN extends ChgAlarmCode {
    val value = 326
    val index = 39
    val name = "CHG_ALARM_CCM_PLUG_OVER_TEMP_WARN"
    override def isChgAlarmCcmPlugOverTempWarn: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_OVER_TEMP_FAULT extends ChgAlarmCode {
    val value = 327
    val index = 40
    val name = "CHG_ALARM_CCM_OVER_TEMP_FAULT"
    override def isChgAlarmCcmOverTempFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_AC_CONTACTOR_FAULT extends ChgAlarmCode {
    val value = 328
    val index = 41
    val name = "CHG_ALARM_CCM_AC_CONTACTOR_FAULT"
    override def isChgAlarmCcmAcContactorFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_AC_ADHESION_FAULT extends ChgAlarmCode {
    val value = 329
    val index = 42
    val name = "CHG_ALARM_CCM_AC_ADHESION_FAULT"
    override def isChgAlarmCcmAcAdhesionFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_PARA_ADHESION_FAULT extends ChgAlarmCode {
    val value = 330
    val index = 43
    val name = "CHG_ALARM_CCM_PARA_ADHESION_FAULT"
    override def isChgAlarmCcmParaAdhesionFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_CELL_OVER_VOL extends ChgAlarmCode {
    val value = 400
    val index = 44
    val name = "CHG_ALARM_BMS_CELL_OVER_VOL"
    override def isChgAlarmBmsCellOverVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_CELL_OVER_TEMP extends ChgAlarmCode {
    val value = 401
    val index = 45
    val name = "CHG_ALARM_BMS_CELL_OVER_TEMP"
    override def isChgAlarmBmsCellOverTemp: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_COMM_FAULT extends ChgAlarmCode {
    val value = 402
    val index = 46
    val name = "CHG_ALARM_BMS_COMM_FAULT"
    override def isChgAlarmBmsCommFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_COMM_TIMEOUT extends ChgAlarmCode {
    val value = 403
    val index = 47
    val name = "CHG_ALARM_BMS_COMM_TIMEOUT"
    override def isChgAlarmBmsCommTimeout: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_BATTERY_INVERSED extends ChgAlarmCode {
    val value = 404
    val index = 48
    val name = "CHG_ALARM_BMS_BATTERY_INVERSED"
    override def isChgAlarmBmsBatteryInversed: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_BATTERY_MISSED extends ChgAlarmCode {
    val value = 405
    val index = 49
    val name = "CHG_ALARM_BMS_BATTERY_MISSED"
    override def isChgAlarmBmsBatteryMissed: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_BATTERY_OVER_VOL extends ChgAlarmCode {
    val value = 406
    val index = 50
    val name = "CHG_ALARM_BMS_BATTERY_OVER_VOL"
    override def isChgAlarmBmsBatteryOverVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_OVER_SOC extends ChgAlarmCode {
    val value = 407
    val index = 51
    val name = "CHG_ALARM_BMS_OVER_SOC"
    override def isChgAlarmBmsOverSoc: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_INSULATION_FAULT extends ChgAlarmCode {
    val value = 408
    val index = 52
    val name = "CHG_ALARM_BMS_INSULATION_FAULT"
    override def isChgAlarmBmsInsulationFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_CONTACTOR_FAULT extends ChgAlarmCode {
    val value = 409
    val index = 53
    val name = "CHG_ALARM_BMS_CONTACTOR_FAULT"
    override def isChgAlarmBmsContactorFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_FAULT extends ChgAlarmCode {
    val value = 1200
    val index = 54
    val name = "CHG_ALARM_PSM_FAULT"
    override def isChgAlarmPsmFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_INPUT_FAULT extends ChgAlarmCode {
    val value = 1201
    val index = 55
    val name = "CHG_ALARM_PSM_INPUT_FAULT"
    override def isChgAlarmPsmInputFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_INPUT_OVER_VOL extends ChgAlarmCode {
    val value = 1202
    val index = 56
    val name = "CHG_ALARM_PSM_INPUT_OVER_VOL"
    override def isChgAlarmPsmInputOverVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_INPUT_UNDER_VOL extends ChgAlarmCode {
    val value = 1203
    val index = 57
    val name = "CHG_ALARM_PSM_INPUT_UNDER_VOL"
    override def isChgAlarmPsmInputUnderVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_INPUT_MISS_PHASE extends ChgAlarmCode {
    val value = 1204
    val index = 58
    val name = "CHG_ALARM_PSM_INPUT_MISS_PHASE"
    override def isChgAlarmPsmInputMissPhase: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_OUTPUT_SHORT extends ChgAlarmCode {
    val value = 1205
    val index = 59
    val name = "CHG_ALARM_PSM_OUTPUT_SHORT"
    override def isChgAlarmPsmOutputShort: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_OUTPUT_OVER_CUR extends ChgAlarmCode {
    val value = 1206
    val index = 60
    val name = "CHG_ALARM_PSM_OUTPUT_OVER_CUR"
    override def isChgAlarmPsmOutputOverCur: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_OUTPUT_OVER_VOL extends ChgAlarmCode {
    val value = 1207
    val index = 61
    val name = "CHG_ALARM_PSM_OUTPUT_OVER_VOL"
    override def isChgAlarmPsmOutputOverVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_OUTPUT_UNDER_VOL extends ChgAlarmCode {
    val value = 1208
    val index = 62
    val name = "CHG_ALARM_PSM_OUTPUT_UNDER_VOL"
    override def isChgAlarmPsmOutputUnderVol: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_OUTPUT_FAULT extends ChgAlarmCode {
    val value = 1209
    val index = 63
    val name = "CHG_ALARM_PSM_OUTPUT_FAULT"
    override def isChgAlarmPsmOutputFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_OVER_TEMP extends ChgAlarmCode {
    val value = 1210
    val index = 64
    val name = "CHG_ALARM_PSM_OVER_TEMP"
    override def isChgAlarmPsmOverTemp: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_COMM_FAULT extends ChgAlarmCode {
    val value = 1211
    val index = 65
    val name = "CHG_ALARM_PSM_COMM_FAULT"
    override def isChgAlarmPsmCommFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_FAN_FAULT extends ChgAlarmCode {
    val value = 1212
    val index = 66
    val name = "CHG_ALARM_PSM_FAN_FAULT"
    override def isChgAlarmPsmFanFault: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_CLOSE_EXCEPTION extends ChgAlarmCode {
    val value = 1213
    val index = 67
    val name = "CHG_ALARM_PSM_CLOSE_EXCEPTION"
    override def isChgAlarmPsmCloseException: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_VENDOR_EXTENSION extends ChgAlarmCode {
    val value = 0
    val index = 68
    val name = "CHG_ALARM_VENDOR_EXTENSION"
    override def isChgAlarmVendorExtension: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_NONE_FIRST extends ChgAlarmCode {
    val value = 1
    val index = 69
    val name = "CHG_ALARM_NONE_FIRST"
    override def isChgAlarmNoneFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_NONE_LAST extends ChgAlarmCode {
    val value = 99
    val index = 70
    val name = "CHG_ALARM_NONE_LAST"
    override def isChgAlarmNoneLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_FIRST extends ChgAlarmCode {
    val value = 100
    val index = 71
    val name = "CHG_ALARM_SYS_FIRST"
    override def isChgAlarmSysFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_SYS_LAST extends ChgAlarmCode {
    val value = 199
    val index = 72
    val name = "CHG_ALARM_SYS_LAST"
    override def isChgAlarmSysLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BCM_FIRST extends ChgAlarmCode {
    val value = 200
    val index = 73
    val name = "CHG_ALARM_BCM_FIRST"
    override def isChgAlarmBcmFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BCM_LAST extends ChgAlarmCode {
    val value = 299
    val index = 74
    val name = "CHG_ALARM_BCM_LAST"
    override def isChgAlarmBcmLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_FIRST extends ChgAlarmCode {
    val value = 300
    val index = 75
    val name = "CHG_ALARM_CCM_FIRST"
    override def isChgAlarmCcmFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CCM_LAST extends ChgAlarmCode {
    val value = 399
    val index = 76
    val name = "CHG_ALARM_CCM_LAST"
    override def isChgAlarmCcmLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_FIRST extends ChgAlarmCode {
    val value = 400
    val index = 77
    val name = "CHG_ALARM_BMS_FIRST"
    override def isChgAlarmBmsFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_BMS_LAST extends ChgAlarmCode {
    val value = 499
    val index = 78
    val name = "CHG_ALARM_BMS_LAST"
    override def isChgAlarmBmsLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PKL_FIRST extends ChgAlarmCode {
    val value = 500
    val index = 79
    val name = "CHG_ALARM_PKL_FIRST"
    override def isChgAlarmPklFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PKL_LAST extends ChgAlarmCode {
    val value = 599
    val index = 80
    val name = "CHG_ALARM_PKL_LAST"
    override def isChgAlarmPklLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PKD_FIRST extends ChgAlarmCode {
    val value = 600
    val index = 81
    val name = "CHG_ALARM_PKD_FIRST"
    override def isChgAlarmPkdFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PKD_LAST extends ChgAlarmCode {
    val value = 699
    val index = 82
    val name = "CHG_ALARM_PKD_LAST"
    override def isChgAlarmPkdLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_METER_FIRST extends ChgAlarmCode {
    val value = 700
    val index = 83
    val name = "CHG_ALARM_METER_FIRST"
    override def isChgAlarmMeterFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_METER_LAST extends ChgAlarmCode {
    val value = 799
    val index = 84
    val name = "CHG_ALARM_METER_LAST"
    override def isChgAlarmMeterLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_LCD_FIRST extends ChgAlarmCode {
    val value = 800
    val index = 85
    val name = "CHG_ALARM_LCD_FIRST"
    override def isChgAlarmLcdFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_LCD_LAST extends ChgAlarmCode {
    val value = 899
    val index = 86
    val name = "CHG_ALARM_LCD_LAST"
    override def isChgAlarmLcdLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CARD_FIRST extends ChgAlarmCode {
    val value = 900
    val index = 87
    val name = "CHG_ALARM_CARD_FIRST"
    override def isChgAlarmCardFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CARD_LAST extends ChgAlarmCode {
    val value = 999
    val index = 88
    val name = "CHG_ALARM_CARD_LAST"
    override def isChgAlarmCardLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_FAN_FIRST extends ChgAlarmCode {
    val value = 1000
    val index = 89
    val name = "CHG_ALARM_FAN_FIRST"
    override def isChgAlarmFanFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_FAN_LAST extends ChgAlarmCode {
    val value = 1099
    val index = 90
    val name = "CHG_ALARM_FAN_LAST"
    override def isChgAlarmFanLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CONN_FIRST extends ChgAlarmCode {
    val value = 1100
    val index = 91
    val name = "CHG_ALARM_CONN_FIRST"
    override def isChgAlarmConnFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_CONN_LAST extends ChgAlarmCode {
    val value = 1199
    val index = 92
    val name = "CHG_ALARM_CONN_LAST"
    override def isChgAlarmConnLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_FIRST extends ChgAlarmCode {
    val value = 1200
    val index = 93
    val name = "CHG_ALARM_PSM_FIRST"
    override def isChgAlarmPsmFirst: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CHG_ALARM_PSM_LAST extends ChgAlarmCode {
    val value = 1299
    val index = 94
    val name = "CHG_ALARM_PSM_LAST"
    override def isChgAlarmPsmLast: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends ChgAlarmCode with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(CHG_ALARM_SYS_STORAGE_FULL, CHG_ALARM_SYS_COMM_FAULT, CHG_ALARM_SYS_SIM_FAULT, CHG_ALARM_SYS_DIAL_FAULT, CHG_ALARM_SYS_CONNECT_FAULT, CHG_ALARM_SYS_CONNECT_LOST, CHG_ALARM_SYS_POWER_FAULT, CHG_ALARM_METER_FAULT, CHG_ALARM_CARD_FAULT, CHG_ALARM_LCD_FAULT, CHG_Alarm_TCU_SOCKET_FAULT, CHG_ALARM_TCU_CPU_HIGH_FAULT, CHG_ALARM_TCU_MEM_LOW_FAULT, CHG_ALARM_CCM_EMERGENCY_FAULT, CHG_ALARM_CCM_LOCK_FAULT, CHG_ALARM_CCM_BREAKER_FAULT, CHG_ALARM_CCM_SPD_FAULT, CHG_ALARM_CCM_SMOG_FAULT, CHG_ALARM_CCM_DOOR_FAULT, CHG_ALARM_CCM_WATER_FAULT, CHG_ALARM_CCM_DC_CONTACTOR_FAULT, CHG_ALARM_CCM_DC_FUSE_FAULT, CHG_ALARM_CCM_INSULATION_MODULE, CHG_ALARM_CCM_INSULATION_CHECK, CHG_ALARM_CCM_FAN_FAULT, CHG_ALARM_CCM_CC1_FAULT, CHG_ALARM_CCM_OVER_TEMP_WARN, CHG_ALARM_CCM_PLUG_OVER_TEMP_FAULT, CHG_ALARM_CCM_GUN_HOLDER_FAULT, CHG_ALARM_CCM_INPUT_UNDER_VOL, CHG_ALARM_CCM_INPUT_OVER_VOL, CHG_ALARM_CCM_ASSIST_FAULT, CHG_ALARM_CCM_BLEED_TIMEOUT, CHG_ALARM_CCM_SWITCH_FAULT, CHG_ALARM_CCM_OUPUT_UNDER_VOL, CHG_ALARM_CCM_OUTPUT_OVER_VOL, CHG_ALARM_CCM_OUTPUT_OVER_CUR, CHG_ALARM_CCM_INSULATION_WARN, CHG_ALARM_CCM_DC_ADHESION_FAULT, CHG_ALARM_CCM_PLUG_OVER_TEMP_WARN, CHG_ALARM_CCM_OVER_TEMP_FAULT, CHG_ALARM_CCM_AC_CONTACTOR_FAULT, CHG_ALARM_CCM_AC_ADHESION_FAULT, CHG_ALARM_CCM_PARA_ADHESION_FAULT, CHG_ALARM_BMS_CELL_OVER_VOL, CHG_ALARM_BMS_CELL_OVER_TEMP, CHG_ALARM_BMS_COMM_FAULT, CHG_ALARM_BMS_COMM_TIMEOUT, CHG_ALARM_BMS_BATTERY_INVERSED, CHG_ALARM_BMS_BATTERY_MISSED, CHG_ALARM_BMS_BATTERY_OVER_VOL, CHG_ALARM_BMS_OVER_SOC, CHG_ALARM_BMS_INSULATION_FAULT, CHG_ALARM_BMS_CONTACTOR_FAULT, CHG_ALARM_PSM_FAULT, CHG_ALARM_PSM_INPUT_FAULT, CHG_ALARM_PSM_INPUT_OVER_VOL, CHG_ALARM_PSM_INPUT_UNDER_VOL, CHG_ALARM_PSM_INPUT_MISS_PHASE, CHG_ALARM_PSM_OUTPUT_SHORT, CHG_ALARM_PSM_OUTPUT_OVER_CUR, CHG_ALARM_PSM_OUTPUT_OVER_VOL, CHG_ALARM_PSM_OUTPUT_UNDER_VOL, CHG_ALARM_PSM_OUTPUT_FAULT, CHG_ALARM_PSM_OVER_TEMP, CHG_ALARM_PSM_COMM_FAULT, CHG_ALARM_PSM_FAN_FAULT, CHG_ALARM_PSM_CLOSE_EXCEPTION, CHG_ALARM_VENDOR_EXTENSION, CHG_ALARM_NONE_FIRST, CHG_ALARM_NONE_LAST, CHG_ALARM_SYS_FIRST, CHG_ALARM_SYS_LAST, CHG_ALARM_BCM_FIRST, CHG_ALARM_BCM_LAST, CHG_ALARM_CCM_FIRST, CHG_ALARM_CCM_LAST, CHG_ALARM_BMS_FIRST, CHG_ALARM_BMS_LAST, CHG_ALARM_PKL_FIRST, CHG_ALARM_PKL_LAST, CHG_ALARM_PKD_FIRST, CHG_ALARM_PKD_LAST, CHG_ALARM_METER_FIRST, CHG_ALARM_METER_LAST, CHG_ALARM_LCD_FIRST, CHG_ALARM_LCD_LAST, CHG_ALARM_CARD_FIRST, CHG_ALARM_CARD_LAST, CHG_ALARM_FAN_FIRST, CHG_ALARM_FAN_LAST, CHG_ALARM_CONN_FIRST, CHG_ALARM_CONN_LAST, CHG_ALARM_PSM_FIRST, CHG_ALARM_PSM_LAST)
  def fromValue(value: Int): ChgAlarmCode = value match {
    case 0 => CHG_ALARM_VENDOR_EXTENSION
    case 1 => CHG_ALARM_NONE_FIRST
    case 99 => CHG_ALARM_NONE_LAST
    case 100 => CHG_ALARM_SYS_STORAGE_FULL
    case 101 => CHG_ALARM_SYS_COMM_FAULT
    case 102 => CHG_ALARM_SYS_SIM_FAULT
    case 103 => CHG_ALARM_SYS_DIAL_FAULT
    case 104 => CHG_ALARM_SYS_CONNECT_FAULT
    case 105 => CHG_ALARM_SYS_CONNECT_LOST
    case 106 => CHG_ALARM_SYS_POWER_FAULT
    case 107 => CHG_ALARM_METER_FAULT
    case 108 => CHG_ALARM_CARD_FAULT
    case 109 => CHG_ALARM_LCD_FAULT
    case 110 => CHG_Alarm_TCU_SOCKET_FAULT
    case 111 => CHG_ALARM_TCU_CPU_HIGH_FAULT
    case 112 => CHG_ALARM_TCU_MEM_LOW_FAULT
    case 199 => CHG_ALARM_SYS_LAST
    case 200 => CHG_ALARM_BCM_FIRST
    case 299 => CHG_ALARM_BCM_LAST
    case 300 => CHG_ALARM_CCM_EMERGENCY_FAULT
    case 301 => CHG_ALARM_CCM_LOCK_FAULT
    case 302 => CHG_ALARM_CCM_BREAKER_FAULT
    case 303 => CHG_ALARM_CCM_SPD_FAULT
    case 304 => CHG_ALARM_CCM_SMOG_FAULT
    case 305 => CHG_ALARM_CCM_DOOR_FAULT
    case 306 => CHG_ALARM_CCM_WATER_FAULT
    case 307 => CHG_ALARM_CCM_DC_CONTACTOR_FAULT
    case 308 => CHG_ALARM_CCM_DC_FUSE_FAULT
    case 309 => CHG_ALARM_CCM_INSULATION_MODULE
    case 310 => CHG_ALARM_CCM_INSULATION_CHECK
    case 311 => CHG_ALARM_CCM_FAN_FAULT
    case 312 => CHG_ALARM_CCM_CC1_FAULT
    case 313 => CHG_ALARM_CCM_OVER_TEMP_WARN
    case 314 => CHG_ALARM_CCM_PLUG_OVER_TEMP_FAULT
    case 315 => CHG_ALARM_CCM_GUN_HOLDER_FAULT
    case 316 => CHG_ALARM_CCM_INPUT_UNDER_VOL
    case 317 => CHG_ALARM_CCM_INPUT_OVER_VOL
    case 318 => CHG_ALARM_CCM_ASSIST_FAULT
    case 319 => CHG_ALARM_CCM_BLEED_TIMEOUT
    case 320 => CHG_ALARM_CCM_SWITCH_FAULT
    case 321 => CHG_ALARM_CCM_OUPUT_UNDER_VOL
    case 322 => CHG_ALARM_CCM_OUTPUT_OVER_VOL
    case 323 => CHG_ALARM_CCM_OUTPUT_OVER_CUR
    case 324 => CHG_ALARM_CCM_INSULATION_WARN
    case 325 => CHG_ALARM_CCM_DC_ADHESION_FAULT
    case 326 => CHG_ALARM_CCM_PLUG_OVER_TEMP_WARN
    case 327 => CHG_ALARM_CCM_OVER_TEMP_FAULT
    case 328 => CHG_ALARM_CCM_AC_CONTACTOR_FAULT
    case 329 => CHG_ALARM_CCM_AC_ADHESION_FAULT
    case 330 => CHG_ALARM_CCM_PARA_ADHESION_FAULT
    case 399 => CHG_ALARM_CCM_LAST
    case 400 => CHG_ALARM_BMS_CELL_OVER_VOL
    case 401 => CHG_ALARM_BMS_CELL_OVER_TEMP
    case 402 => CHG_ALARM_BMS_COMM_FAULT
    case 403 => CHG_ALARM_BMS_COMM_TIMEOUT
    case 404 => CHG_ALARM_BMS_BATTERY_INVERSED
    case 405 => CHG_ALARM_BMS_BATTERY_MISSED
    case 406 => CHG_ALARM_BMS_BATTERY_OVER_VOL
    case 407 => CHG_ALARM_BMS_OVER_SOC
    case 408 => CHG_ALARM_BMS_INSULATION_FAULT
    case 409 => CHG_ALARM_BMS_CONTACTOR_FAULT
    case 499 => CHG_ALARM_BMS_LAST
    case 500 => CHG_ALARM_PKL_FIRST
    case 599 => CHG_ALARM_PKL_LAST
    case 600 => CHG_ALARM_PKD_FIRST
    case 699 => CHG_ALARM_PKD_LAST
    case 700 => CHG_ALARM_METER_FIRST
    case 799 => CHG_ALARM_METER_LAST
    case 800 => CHG_ALARM_LCD_FIRST
    case 899 => CHG_ALARM_LCD_LAST
    case 900 => CHG_ALARM_CARD_FIRST
    case 999 => CHG_ALARM_CARD_LAST
    case 1000 => CHG_ALARM_FAN_FIRST
    case 1099 => CHG_ALARM_FAN_LAST
    case 1100 => CHG_ALARM_CONN_FIRST
    case 1199 => CHG_ALARM_CONN_LAST
    case 1200 => CHG_ALARM_PSM_FAULT
    case 1201 => CHG_ALARM_PSM_INPUT_FAULT
    case 1202 => CHG_ALARM_PSM_INPUT_OVER_VOL
    case 1203 => CHG_ALARM_PSM_INPUT_UNDER_VOL
    case 1204 => CHG_ALARM_PSM_INPUT_MISS_PHASE
    case 1205 => CHG_ALARM_PSM_OUTPUT_SHORT
    case 1206 => CHG_ALARM_PSM_OUTPUT_OVER_CUR
    case 1207 => CHG_ALARM_PSM_OUTPUT_OVER_VOL
    case 1208 => CHG_ALARM_PSM_OUTPUT_UNDER_VOL
    case 1209 => CHG_ALARM_PSM_OUTPUT_FAULT
    case 1210 => CHG_ALARM_PSM_OVER_TEMP
    case 1211 => CHG_ALARM_PSM_COMM_FAULT
    case 1212 => CHG_ALARM_PSM_FAN_FAULT
    case 1213 => CHG_ALARM_PSM_CLOSE_EXCEPTION
    case 1299 => CHG_ALARM_PSM_LAST
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = EnumChargerProto.javaDescriptor.getEnumTypes.get(10)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = EnumChargerProto.scalaDescriptor.enums(10)
}