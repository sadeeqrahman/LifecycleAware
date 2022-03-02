package com.encoders.lifecycleaware

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun OnCreate(){
        Log.d("OBSERVER","ON CREATE is Call")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun OnResume(){
        Log.d("OBSERVER","ON RESUME is Call")
    }
}