
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TP_KOMBI_AGW1 (ID 0x01D0)
**/

object TP_KOMBI_AGW1 {

    	/** Gets COMBI communication to the AGW **/
	fun get_tp_kombi_agw() : Int = CanBusNative.getECUParameterB(CanBAddrs.TP_KOMBI_AGW1, 0, 64)
	
	/** Sets COMBI communication to the AGW **/
	fun set_tp_kombi_agw(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}
