
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for PSM_3B8h (ID 0x03B8)
**/

object PSM_3B8h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of PSM_3B8h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.PSM_3B8h)

	/** Gets speed limit active **/
	fun get_psm_v_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 2, 1) != 0
	
	/** Sets speed limit active **/
	fun set_psm_v_akt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets speed limit **/
	fun get_psm_v_tgl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 1, 1) != 0
	
	/** Sets speed limit **/
	fun set_psm_v_tgl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets speed limit **/
	fun get_psm_v_par() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 0, 1) != 0
	
	/** Sets speed limit **/
	fun set_psm_v_par(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets speed limit **/
	fun get_psm_v_soll() : Int = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 8, 8)
	
	/** Sets speed limit **/
	fun set_psm_v_soll(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets Disable accelerator pedal module **/
	fun get_psm_fpm_sp() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 20, 1) != 0
	
	/** Sets Disable accelerator pedal module **/
	fun set_psm_fpm_sp(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 20, 1, if(p) 1 else 0)
	}
	
	/** Gets Motor remote stop active **/
	fun get_psm_fern_stop() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 19, 1) != 0
	
	/** Sets Motor remote stop active **/
	fun set_psm_fern_stop(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets Motor remote start active **/
	fun get_psm_fern_start() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 18, 1) != 0
	
	/** Sets Motor remote start active **/
	fun set_psm_fern_start(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets speed limitation **/
	fun get_psm_dz_tgl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 17, 1) != 0
	
	/** Sets speed limitation **/
	fun set_psm_dz_tgl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets speed limitation **/
	fun get_psm_dz_par() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.PSM_3B8h, 16, 1) != 0
	
	/** Sets speed limitation **/
	fun set_psm_dz_par(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.PSM_3B8h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame PSM_3B8h (0x03B8):
		|	speed limit active: ${get_psm_v_akt()}
		|	speed limit: ${get_psm_v_tgl()}
		|	speed limit: ${get_psm_v_par()}
		|	speed limit: ${get_psm_v_soll()}
		|	Disable accelerator pedal module: ${get_psm_fpm_sp()}
		|	Motor remote stop active: ${get_psm_fern_stop()}
		|	Motor remote start active: ${get_psm_fern_start()}
		|	speed limitation: ${get_psm_dz_tgl()}
		|	speed limitation: ${get_psm_dz_par()}
	""".trimMargin("|")
}
