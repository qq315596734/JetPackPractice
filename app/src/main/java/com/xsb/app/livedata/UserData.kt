package com.xsb.app.livedata

import androidx.lifecycle.MutableLiveData

/**
 * Create by panchenhuan on 2020/11/20
 * Description: 把这个类设置成单例是为了测试方便 jetpack中一般搭配viewmodel 一起使用 可以跟着单个页面或者fragmentzou
 */
object UserData {

    val user = MutableLiveData<UserModel>()

    init {
        user.value = UserModel()
    }

}