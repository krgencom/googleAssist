package com.loomsdk.appassistlib

import android.util.Log


object SLog {

    private var debug = false

    init {
    }

    fun setDebug(debug:Boolean) {
        this.debug = debug
    }

    fun f(_log:String = "") {
        val abc = " ${logInfo()} ${_log}"

        Log.e("SLog", " ${logInfo()} ${_log}" )
    }


    fun logInfo(): String {
        var st: StackTraceElement = Thread.currentThread().stackTrace[4]
        var sb: StringBuffer = StringBuffer()

        sb.append("[" + st.fileName + "]")
        sb.append("[" + st.methodName + "]")
        sb.append("[Row:" + st.lineNumber + "]")
        return sb.toString()
    }

}


//
//package com.loomsdk.appassistlib
//
//import android.util.Log
//
//object SLog {
//
//    private var debug = false
//
//    init {
//    }
//
//    fun setDebug(debug:Boolean) {
//        this.debug = debug
//    }
//
//    fun f(_log:String = "") {
//        if (!debug) {
//            return
//        }
//        Log.e("SLog", " ${logInfo()} ${_log}" )
//    }
//
//
//    private fun logInfo(): String {
//        var st: StackTraceElement = Thread.currentThread().stackTrace[4]
//        var sb: StringBuffer = StringBuffer()
//        sb.append("[" + st.fileName + "]")
//        sb.append("[" + st.methodName + "]")
//        sb.append("[Row:" + st.lineNumber + "]")
//        return sb.toString()
//    }
//
//}