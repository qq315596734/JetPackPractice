package com.xsb.app.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.xsb.app.R
import kotlinx.android.synthetic.main.activity_livedata.*

/**
 * Create by panchenhuan on 2020/11/20
 * Description:
 */
class LiveData2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)

        UserData.user.observe(this,
            Observer<UserModel> {
                textview.text = "${it.name}\n${it.age}\n${it.sex}"
            })

        btn_submit.setOnClickListener {
            UserData.user.value?.name = et_name.text.toString()
            UserData.user.value?.age = et_age.text.toString().toInt()
            UserData.user.value?.sex = et_sex.text.toString()
        }
    }

}