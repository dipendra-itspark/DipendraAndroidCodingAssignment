package com.androidcodingassignment.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.DiffUtil.*
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.androidcodingassignment.databinding.ItemImageRowBinding
import com.androidcodingassignment.databinding.ItemRowBinding
import com.androidcodingassignment.model.SectionDataModel

class SectionItemAdaptor: ListAdapter<SectionDataModel.SectionItem, SectionItemAdaptor.SectionItemViewHolder>(Companion){
    companion object: ItemCallback<SectionDataModel.SectionItem>(){
        override fun areItemsTheSame(
            oldItem: SectionDataModel.SectionItem,
            newItem: SectionDataModel.SectionItem
        ): Boolean {
return true
        }

        override fun areContentsTheSame(
            oldItem: SectionDataModel.SectionItem,
            newItem: SectionDataModel.SectionItem
        ): Boolean {
return true
        }
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemImageRowBinding.inflate(layoutInflater)

        return SectionItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SectionItemViewHolder, position: Int) {
val sectionItemData=getItem(position)
            holder.binding.sectionItemData=sectionItemData
        holder.binding.executePendingBindings()
    }

    class SectionItemViewHolder(val binding: ItemImageRowBinding): RecyclerView.ViewHolder(binding.root)

}