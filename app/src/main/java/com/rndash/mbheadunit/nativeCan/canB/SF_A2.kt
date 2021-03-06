
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for SF_A2 (ID 0x02D0)
**/

object SF_A2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of SF_A2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.SF_A2)

	/** Gets Perform mirror positioning **/
	fun get_esh_auto_rest() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SF_A2, 5, 1) != 0
	
	/** Sets Perform mirror positioning **/
	fun set_esh_auto_rest(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets Save manually set position **/
	fun get_mf_man_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SF_A2, 2, 1) != 0
	
	/** Sets Save manually set position **/
	fun set_mf_man_sp(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Approach travel position active **/
	fun get_auto_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SF_A2, 1, 1) != 0
	
	/** Sets Approach travel position active **/
	fun set_auto_akt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Approach entry / exit position active **/
	fun get_esh_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SF_A2, 0, 1) != 0
	
	/** Sets Approach entry / exit position active **/
	fun set_esh_akt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.SF_A2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame SF_A2 (0x02D0):
		|	Perform mirror positioning: ${get_esh_auto_rest()}
		|	Save manually set position: ${get_mf_man_sp()}
		|	Approach travel position active: ${get_auto_akt()}
		|	Approach entry / exit position active: ${get_esh_akt()}
	""".trimMargin("|")
}
