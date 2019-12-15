package com.example.a20191215_01_lifecycle

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this


    abstract fun setEvents()
    abstract fun setValue()
}