
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_HSE (ID 0x050E)
**/

object GS_HSE {

    	/** Gets manual control on the test bench **/
	fun get_hse() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HSE, 0, 64)
	
	/** Sets manual control on the test bench **/
	fun set_hse(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}
