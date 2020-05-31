package com.ubis.jickbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ubis.jickbangcopy.adapters.roomadapter
import com.ubis.jickbangcopy.datas.room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : BaseActivity() {

    lateinit var roomAdapter : roomadapter

    val rooms = ArrayList<room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setValues() {

        roomListView.setOnItemLongClickListener { parent, view, position, id ->

            val alert = AlertDialog.Builder(mContext)
            alert.setTitle("테스트")
            alert.setMessage("테스트테스트")

            alert.show()
            return@setOnItemLongClickListener true
        }

    }

    override fun setupEvents() {
        rooms.add(room(8000, "관악구 신림동", 1, "신림동 최고의 방"))
        rooms.add(room(25000, "관악구 봉천동", 2, "봉천동 최고의 방"))
        rooms.add(room(15000, "관악구 신림동", -1, "신림동 최고의 방"))
        rooms.add(room(7000, "관악구 은천동", 0, "은천동 최고의 방"))
        rooms.add(room(12000, "관악구 은천동", 2, "은천동 최고의 방"))
        rooms.add(room(10000, "관악구 신림동", -2, "신림동 최고의 방"))

        roomAdapter = roomadapter(mContext, R.layout.roomlistview, rooms)
        roomListView.adapter = roomAdapter


    }




}
