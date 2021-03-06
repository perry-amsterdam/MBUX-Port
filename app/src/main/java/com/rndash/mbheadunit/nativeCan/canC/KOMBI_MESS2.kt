
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KOMBI_MESS2 (ID 0x0681)
**/

object KOMBI_MESS2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of KOMBI_MESS2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.KOMBI_MESS2)

	/** Gets measured values **/
	fun get_mess2() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_MESS2, 0, 64)
	
	/** Sets measured values **/
	fun set_mess2(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.KOMBI_MESS2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame KOMBI_MESS2 (0x0681):
		|	measured values: ${get_mess2()}
	""".trimMargin("|")
}
