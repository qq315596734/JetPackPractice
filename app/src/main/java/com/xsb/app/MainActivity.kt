package com.xsb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xsb.app.lifecycle.LifecycleActivity
import com.xsb.app.livedata.LiveDataActivity
import com.xsb.app.viewmodel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_lifecycle.setOnClickListener {
            startActivity(Intent(this, LifecycleActivity::class.java))
        }

        btn_livedata.setOnClickListener {
            startActivity(Intent(this, LiveDataActivity::class.java))
        }

        btn_viewmodel.setOnClickListener {
            startActivity(Intent(this, ViewModelActivity::class.java))
        }




    }
}