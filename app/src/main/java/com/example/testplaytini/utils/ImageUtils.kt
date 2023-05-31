package com.example.testplaytini.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.setImage(str: Any) {
    Glide.with(this)
        .load(str)
        .into(this)
}