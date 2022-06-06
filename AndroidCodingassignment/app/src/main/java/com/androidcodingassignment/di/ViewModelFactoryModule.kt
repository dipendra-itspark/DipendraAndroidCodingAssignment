package com.androidcodingassignment.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androidcodingassignment.ui.base.ViewModelFactory
import com.example.demorecyclerview.ui.ViewModel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindsViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
    /*
    * add your all viewmodel here
    * */

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun launcher(viewmodel: MainViewModel):ViewModel


}