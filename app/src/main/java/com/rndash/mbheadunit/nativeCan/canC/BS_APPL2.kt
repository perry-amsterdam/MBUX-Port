
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for BS_APPL2 (ID 0x0635)
**/

object BS_APPL2 {

    	/** Gets application **/
	fun get_appl2() : Int = CanBusNative.getECUParameterC(CanCAddrs.BS_APPL2, 0, 64)
	
	/** Sets application **/
	fun set_appl2(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}
