package com.androidcodingassignment.model

import com.google.gson.annotations.SerializedName

class SectionDataModel {
    @SerializedName("data")
    var data:ArrayList<Data>?=null



class Data {
    @SerializedName("title")
    var title: String? = null

    @SerializedName("sectionItem")
    var sectionItem: ArrayList<SectionItem>? = null

}
    class SectionItem {
        @SerializedName("image1")
        var image1 : String?=null
        @SerializedName("image2")
        var image2 : String?=null

        @SerializedName("image3")
        var image3 : String?=null
    }

}