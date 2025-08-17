package com.projeto.mobile

import android.app.Application
import com.projeto.mobile.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class `App.kt` : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}