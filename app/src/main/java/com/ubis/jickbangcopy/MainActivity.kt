package com.ubis.jickbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

abstract class MainActivity() : BaseActivity(), Parcelable {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()
    }

    override fun setValues() {
        TODO("Not yet implemented")
    }

    override fun setupEvents() {
        TODO("Not yet implemented")
    }


}
