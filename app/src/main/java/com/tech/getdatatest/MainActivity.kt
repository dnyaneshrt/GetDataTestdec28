package com.tech.getdatatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var et1: EditText? = null
    var et2: EditText? = null

    var btn1: Button? = null
    var btn2: Button? = null

    var tv1: TextView? = null
    var tv2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        btn1?.setOnClickListener {
            tv1?.text=et1?.text
        }

        btn2?.setOnClickListener {
            tv2?.text = et2?.text
        }
    }

    private fun init() {
        et1 = findViewById(R.id.et_name)
        et2 = findViewById(R.id.et_number)

        btn1 = findViewById(R.id.btn_get_name)
        btn2 = findViewById(R.id.btn_get_number)

        tv1 = findViewById(R.id.tv_name)
        tv2 = findViewById(R.id.tv_number)
    }
}