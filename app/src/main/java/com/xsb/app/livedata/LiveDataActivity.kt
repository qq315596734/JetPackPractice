package com.xsb.app.livedata

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.xsb.app.R
import kotlinx.android.synthetic.main.activity_livedata.*

/**
 * Create by panchenhuan on 2020/11/20
 * Description:
 */
class LiveDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)

        UserData.user.observe(this,
            Observer<UserModel> {
                Log.e("1111111", "111111111")
                textview.text = "${it.name}\n${it.age}\n${it.sex}"
            })

        btn_submit.setOnClickListener {

            val user = UserModel()
            user.name = et_name.text.toString()
            user.age = et_age.text.toString().toInt()
            user.sex = et_sex.text.toString()
            UserData.user.value = user

//直接设置属性是不行的 必须调用setValue 或者 postValue 告诉系统数据发生了变化
//            UserData.user.value?.name = et_name.text.toString()
//            UserData.user.value?.age = et_age.text.toString().toInt()
//            UserData.user.value?.sex = et_sex.text.toString()

            startActivity(Intent(this, LiveData2Activity::class.java))
        }



    }

}