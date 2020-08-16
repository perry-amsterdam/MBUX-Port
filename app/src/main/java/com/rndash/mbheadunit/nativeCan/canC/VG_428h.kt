
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for VG_428h (ID 0x0428)
**/

object VG_428h {

    	/** Gets Current gear transfer case **/
	fun get_vg_gang() : VG_GANG = when(CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 5, 3)) {
		 0 -> VG_GANG.SH_IPG
		 1 -> VG_GANG.LO
		 2 -> VG_GANG.HI
		 4 -> VG_GANG.N
		 7 -> VG_GANG.SNV
		 else -> throw Exception("Invalid raw value for VG_GANG")
	}
	
	/** Gets VG error (ECU failure detected) **/
	fun get_vg_err() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 2, 1) != 0
	
	/** Gets VG **/
	fun get_anfn_vg() : ANFN_VG = when(CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 14, 2)) {
		 0 -> ANFN_VG.NOT_DEFINED
		 1 -> ANFN_VG.ANF_N
		 2 -> ANFN_VG.IDLE
		 3 -> ANFN_VG.SNV
		 else -> throw Exception("Invalid raw value for ANFN_VG")
	}
	
	/** Gets VG **/
	fun get_anfntgl_vg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 13, 1) != 0
	
	/** Gets VG **/
	fun get_anfnpar_vg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 12, 1) != 0
	
	
}