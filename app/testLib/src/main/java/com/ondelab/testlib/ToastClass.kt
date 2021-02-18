package com.ondelab.testlib

import android.content.Context
import android.util.Log
import android.widget.Toast

const val TAG = "ToastClass"
class ToastClass(override var tt:String) : SuperTest() {

    val st = tt

    companion object {
        fun showToast(context: Context, msg: String) =
            Log.e("ToastClass", "companion msg : $msg")
    }

    fun showToast(context: Context, msg: String) {
        Log.e("ToastClass", "normal msg : $msg")
        Log.e(TAG, "showToast super:${super.t1(msg)} " )
        Log.e(TAG, "showToast:${t1(msg)} " )
        Log.e(TAG, "showToast tt pre :$tt " )
        Log.e(TAG, "showToast super tt :${super.tt} " )
        Log.e(TAG, "showToast tt :$tt " )
    }

    override fun t1(msg: String): String {
        return msg
    }
}