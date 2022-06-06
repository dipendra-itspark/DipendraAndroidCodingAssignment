package com.androidcodingassignment.di
import com.androidcodingassignment.ui.main.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,  ViewModelFactoryModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)


}