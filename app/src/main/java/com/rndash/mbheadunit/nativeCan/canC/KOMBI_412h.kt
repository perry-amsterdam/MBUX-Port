
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KOMBI_412h (ID 0x0412)
**/

object KOMBI_412h {

    	/** Gets Status ECO warning **/
	fun get_eco_warn_st() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 4, 1) != 0
	
	/** Gets Optical warning off **/
	fun get_opt_warn_aus() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 1, 1) != 0
	
	/** Gets Acoustic warning off **/
	fun get_aku_warn_aus() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 0, 1) != 0
	
	/** Gets Set distance **/
	fun get_ist_abst() : IST_ABST = when(CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 9, 3)) {
		 0 -> IST_ABST.VERY_SMALL
		 1 -> IST_ABST.SMALL
		 2 -> IST_ABST.MEDIUM
		 3 -> IST_ABST.LARGE
		 4 -> IST_ABST.VERY_LARGE
		 5 -> IST_ABST.NOT_DEFINED
		 6 -> IST_ABST.NOT_DEFINED_6
		 7 -> IST_ABST.NOT_DEFINED_7
		 else -> throw Exception("Invalid raw value for IST_ABST")
	}
	
	/** Gets distance unit **/
	fun get_abst_s() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 8, 1) != 0
	
	/** Gets Displayed speed **/
	fun get_v_anz() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 12, 12)
	
	/** Gets direction of wheel rotation to V_ANZ **/
	fun get_drtganz() : DRTGANZ = when(CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 24, 2)) {
		 0 -> DRTGANZ.PASSIVE
		 1 -> DRTGANZ.FORWARD
		 2 -> DRTGANZ.REVERSE
		 3 -> DRTGANZ.SNV
		 else -> throw Exception("Invalid raw value for DRTGANZ")
	}
	
	/** Gets wheel speed calculated from V_ANZ **/
	fun get_danz() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 26, 14)
	
	/** Gets Flat roll warning request **/
	fun get_prw_anf() : PRW_ANF = when(CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 46, 2)) {
		 0 -> PRW_ANF.IDLE
		 1 -> PRW_ANF.OFF
		 2 -> PRW_ANF.ON
		 3 -> PRW_ANF.SNV
		 else -> throw Exception("Invalid raw value for PRW_ANF")
	}
	
	/** Gets Activate ECO in the combination menu **/
	fun get_eco_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 44, 1) != 0
	
	/** Gets engine shutdown time **/
	fun get_maz_neu() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_412h, 52, 12)
	
	
}