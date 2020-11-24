package com.xsb.app.viewmodel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.xsb.app.R
import kotlinx.android.synthetic.main.activity_livedata.*
import kotlinx.android.synthetic.main.activity_viewmodel.*


/**
 * Create by panchenhuan on 2020/11/23
 * Description:
 */
class ViewModelActivity : AppCompatActivity() {

    val TAG = "ViewModelActivity"

    private var x = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        val userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

//
//        edittext.text = userViewModel.x.toString()
//        textView.setOnClickListener {
//            userViewModel.x = 100
//            edittext.text = userViewModel.x.toString()
//        }


        edittext.text = x.toString()
        textView.setOnClickListener {
            x = 100
            edittext.text = x.toString()
        }


    }

    override fun onStop() {
        super.onStop()

        Log.e(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }
}