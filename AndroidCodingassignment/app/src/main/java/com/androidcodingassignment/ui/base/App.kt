package com.androidcodingassignment.ui.base

import android.app.Application
import com.androidcodingassignment.di.AppComponent
import com.androidcodingassignment.di.AppModule
import com.androidcodingassignment.di.DaggerAppComponent


class App: Application() {

    lateinit var appComponent: AppComponent

    companion object{
        var application : App? = null
    }

    override fun onCreate() {

        try {
        appComponent = initDagger()

        }catch (e:Exception){


        }
        super.onCreate()


        application = this

    }



    fun getApp() : App?{
        return application
    }

    private fun initDagger() : AppComponent = DaggerAppComponent.builder()
        .appModule(AppModule(applicationContext))
        .build()
    }