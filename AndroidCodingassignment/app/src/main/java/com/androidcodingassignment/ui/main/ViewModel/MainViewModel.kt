package com.example.demorecyclerview.ui.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.androidcodingassignment.data.Repository
import com.androidcodingassignment.model.SectionDataModel
import javax.inject.Inject

class MainViewModel @Inject constructor(val cloudRepository : Repository): ViewModel() {
private var _sectionListData=MutableLiveData<ArrayList<SectionDataModel.Data>>()
val sectionListData:LiveData<ArrayList<SectionDataModel.Data>>
get()=_sectionListData
fun getSectionData(){
_sectionListData.postValue(cloudRepository.getSectionItemList())

}
}
