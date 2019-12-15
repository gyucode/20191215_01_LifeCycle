package com.example.a20191215_01_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    override fun setEvents() {

    }

    override fun setValue() {

    }
}
