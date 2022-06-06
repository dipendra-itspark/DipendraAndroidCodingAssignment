package com.androidcodingassignment.data

import com.androidcodingassignment.utils.DataConstant
import com.androidcodingassignment.model.SectionDataModel
import com.google.gson.Gson
import javax.inject.Inject

class Repository @Inject constructor() {
 fun getSectionItemList():ArrayList<SectionDataModel.Data>?{
val data=Gson().fromJson(DataConstant.sectionData, SectionDataModel::class.java)
    return data.data


}

}