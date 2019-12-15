package com.example.a20191215_01_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setEvents()
        setValue()

        Log.d("생명주기","onCreate실행")
    }
    override fun setEvents() {
        callActivityBtn.setOnClickListener {
            val intent = Intent(mContext,SecondActivity::class.java)
            startActivity(intent)
        }

    }

    override fun setValue() {

    }

    override fun onResume() {
        super.onResume()
        Log.d("생명주기","onResume실행")

    }
    override fun onPause() {
        super.onPause()
        Log.d("생명주기","onPause실행")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("생명주기","onDestroy실행")
    }
}
