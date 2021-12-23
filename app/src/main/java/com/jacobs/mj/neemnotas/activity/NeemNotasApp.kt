package com.jacobs.mj.neemnotas.activity

import android.app.Application
import com.jacobs.mj.neemnotas.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NeemNotasApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@NeemNotasApp)
            modules(appModule)
        }
    }
}