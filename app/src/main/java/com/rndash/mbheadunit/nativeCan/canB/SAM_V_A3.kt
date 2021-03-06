
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for SAM_V_A3 (ID 0x0070)
**/

object SAM_V_A3 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of SAM_V_A3
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.SAM_V_A3)

	/** Gets rain sensor activated **/
	fun get_rs_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 7, 1) != 0
	
	/** Sets rain sensor activated **/
	fun set_rs_akt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets wiper outside parking position **/
	fun get_kl_31b_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 6, 1) != 0
	
	/** Sets wiper outside parking position **/
	fun set_kl_31b_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets washing activated **/
	fun get_kl_86_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 5, 1) != 0
	
	/** Sets washing activated **/
	fun set_kl_86_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets configuration of rain sensor **/
	fun get_konfig_rs() : KONFIG_RS = when(CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 2, 3)) {
		 0 -> KONFIG_RS.UEMPF0
		 1 -> KONFIG_RS.UEMPF1
		 2 -> KONFIG_RS.UEMPF2
		 3 -> KONFIG_RS.VOR_EMPF
		 4 -> KONFIG_RS.EMPF0
		 5 -> KONFIG_RS.EMPF1
		 6 -> KONFIG_RS.EMPF2
		 7 -> KONFIG_RS.NEW_INI
		 else -> throw Exception("Invalid raw value for KONFIG_RS")
	}
	
	/** Sets configuration of rain sensor **/
	fun set_konfig_rs(f: CanFrame, p: KONFIG_RS) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 3, p.raw)
	}
	
	/** Gets Parity from bit 0 to 6 (even) **/
	fun get_parity_sam_v() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 0, 1) != 0
	
	/** Sets Parity from bit 0 to 6 (even) **/
	fun set_parity_sam_v(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets rain sensor on / off (position interval) **/
	fun get_rs_int() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 15, 1) != 0
	
	/** Sets rain sensor on / off (position interval) **/
	fun set_rs_int(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 15, 1, if(p) 1 else 0)
	}
	
	/** Gets wiper outside of parking position **/
	fun get_kl_31b_rs() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 14, 1) != 0
	
	/** Sets wiper outside of parking position **/
	fun set_kl_31b_rs(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 14, 1, if(p) 1 else 0)
	}
	
	/** Gets washing activated **/
	fun get_kl_86_rs() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 13, 1) != 0
	
	/** Sets washing activated **/
	fun set_kl_86_rs(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets SAM_V initialization **/
	fun get_sam_v_init() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 12, 1) != 0
	
	/** Sets SAM_V initialization **/
	fun set_sam_v_init(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets rain sensor operation not possible **/
	fun get_rs_nm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 11, 1) != 0
	
	/** Sets rain sensor operation not possible **/
	fun set_rs_nm(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets Rain sensor diagnosis **/
	fun get_diag_rs() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 10, 1) != 0
	
	/** Sets Rain sensor diagnosis **/
	fun set_diag_rs(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets byte identifier **/
	fun get_byte_kenn() : Int = CanBusNative.getECUParameterB(CanBAddrs.SAM_V_A3, 8, 2)
	
	/** Sets byte identifier **/
	fun set_byte_kenn(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 2, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.SAM_V_A3.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame SAM_V_A3 (0x0070):
		|	rain sensor activated: ${get_rs_akt()}
		|	wiper outside parking position: ${get_kl_31b_ein()}
		|	washing activated: ${get_kl_86_ein()}
		|	configuration of rain sensor: ${get_konfig_rs()}
		|	Parity from bit 0 to 6 (even): ${get_parity_sam_v()}
		|	rain sensor on / off (position interval): ${get_rs_int()}
		|	wiper outside of parking position: ${get_kl_31b_rs()}
		|	washing activated: ${get_kl_86_rs()}
		|	SAM_V initialization: ${get_sam_v_init()}
		|	rain sensor operation not possible: ${get_rs_nm()}
		|	Rain sensor diagnosis: ${get_diag_rs()}
		|	byte identifier: ${get_byte_kenn()}
	""".trimMargin("|")
}
