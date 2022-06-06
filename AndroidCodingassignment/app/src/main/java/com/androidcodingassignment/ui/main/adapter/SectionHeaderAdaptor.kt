package com.androidcodingassignment.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.androidcodingassignment.databinding.ItemRowBinding
import com.androidcodingassignment.model.SectionDataModel

class SectionHeaderAdaptor: ListAdapter<SectionDataModel.Data, SectionHeaderAdaptor.SectionHeaderViewHolder>(Companion) {
    companion object:DiffUtil.ItemCallback<SectionDataModel.Data>(){
        override fun areItemsTheSame(
            oldItem: SectionDataModel.Data,
            newItem: SectionDataModel.Data
        ): Boolean {
return true
        }

        override fun areContentsTheSame(
            oldItem: SectionDataModel.Data,
            newItem: SectionDataModel.Data
        ): Boolean {
return true
        }


    }
    class SectionHeaderViewHolder(val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionHeaderViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRowBinding.inflate(layoutInflater)

        return SectionHeaderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SectionHeaderViewHolder, position: Int) {
val data=getItem(position)
        val itemAdaptor=SectionItemAdaptor()
        holder.binding.sectionData=data
        holder.binding.itemAdapter=itemAdaptor
        holder.binding.executePendingBindings()
        data.sectionItem.let (itemAdaptor::submitList)
    }
}