package com.example.a20191215_01_lifecycle

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    override fun setEvents() {

    }

    override fun setValue() {

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        val alert = AlertDialog.Builder(mContext)

        alert.setTitle("게시글 작성 중지 확인")
        alert.setMessage("정말 글 작성 중단하시겠습니까? 작성하신 내용은 모두 삭제됩니다")
        alert.setPositiveButton("확인",DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
        alert.setNegativeButton("취소",null)
        alert.show()
    }
}
