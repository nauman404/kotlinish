package com.kotlinish

import android.app.Application
import android.content.Context

class AppApplication : Application(){

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
    }


    override fun onCreate() {
        super.onCreate()
    }
}
