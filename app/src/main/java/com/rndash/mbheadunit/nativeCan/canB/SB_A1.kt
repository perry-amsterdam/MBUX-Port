
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for SB_A1 (ID 0x01B6)
**/

object SB_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of SB_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.SB_A1)

	/** Gets passenger seat backrest unlocked **/
	fun get_le_b_ent() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.SB_A1, 4, 1) != 0
	
	/** Sets passenger seat backrest unlocked **/
	fun set_le_b_ent(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.SB_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame SB_A1 (0x01B6):
		|	passenger seat backrest unlocked: ${get_le_b_ent()}
	""".trimMargin("|")
}
