package com.xsb.app.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.xsb.app.R

/**
 * Create by panchenhuan on 2020/11/20
 * Description:
 */
class LifecycleActivity : AppCompatActivity() {

    val TAG = "LifecycleActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        Log.e(TAG, "onCreate")
        lifecycle.addObserver(object : LifecycleObserver {

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            fun create() {
                Log.e(TAG, "lifecycle_create")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            fun resume() {
                Log.e(TAG, "lifecycle_resume")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            fun start() {
                Log.e(TAG, "lifecycle_start")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            fun pause() {
                Log.e(TAG, "lifecycle_pause")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            fun stop() {
                Log.e(TAG, "lifecycle_stop")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun destroy() {
                Log.e(TAG, "lifecycle_destroy")
            }

        })
    }


    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
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