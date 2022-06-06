package com.androidcodingassignment.ui.main.view


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.androidcodingassignment.R
import com.androidcodingassignment.databinding.ActivityMainBinding
import com.androidcodingassignment.ui.base.App
import com.androidcodingassignment.ui.base.ViewModelFactory
import com.androidcodingassignment.ui.main.adapter.SectionHeaderAdaptor
import com.example.demorecyclerview.ui.ViewModel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var viewModel: MainViewModel
    @Inject
    lateinit var factory: ViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel= ViewModelProvider(this,factory).get(MainViewModel::class.java)
inIt()
         }

    private fun inIt() {
        //here we will get data through viewmodel function
        val sectionHeaderAdaptor=SectionHeaderAdaptor()
        binding.apply {
            itemAdapter=sectionHeaderAdaptor
            lifecycleOwner=this@MainActivity
        }
        viewModel.getSectionData()
viewModel.sectionListData.observe(this,{
    it.let (sectionHeaderAdaptor::submitList)

})
    }


}