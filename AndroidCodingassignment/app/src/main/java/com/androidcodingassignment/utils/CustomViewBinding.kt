package com.androidcodingassignment.utils

import android.graphics.Color
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.androidcodingassignment.R
import com.bumptech.glide.Glide
import com.bumptech.glide.signature.ObjectKey


@BindingAdapter(value = ["setImageUrl"])
    fun ImageView.bindImageUrl(url: Any?) {
        if (url != null ) {
            val circularProgressDrawable = CircularProgressDrawable(this.context)
            circularProgressDrawable.strokeWidth = 5f
            circularProgressDrawable.centerRadius = 30f
            circularProgressDrawable.setColorSchemeColors(Color.BLUE)
            circularProgressDrawable.start()

            Glide.with(this).load(url)
    .signature(ObjectKey(System.currentTimeMillis()))
                .placeholder(R.drawable.dr)
    .into(this)
        }
    }
    @BindingAdapter(value = ["setAdapter"])
    fun RecyclerView.bindRecyclerViewAdapter(adapter: RecyclerView.Adapter<*>) {
        this.run {
            this.setHasFixedSize(true)
            this.adapter = adapter
        }
    }
