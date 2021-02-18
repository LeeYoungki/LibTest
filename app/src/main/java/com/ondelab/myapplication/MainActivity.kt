package com.ondelab.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ondelab.testlib.ToastClass

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastClass.showToast(this,"test gg")
        val toast = ToastClass("Zxc")
        toast.showToast(this,"test cc")
        Log.e(TAG, "onCreate: ${toast.t1("ggg")}" )
    }
}