package com.loomsdk.appassist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.loomsdk.appassistlib.SLog
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        SLog.f("123")
        SLog.f("123")
    }
}