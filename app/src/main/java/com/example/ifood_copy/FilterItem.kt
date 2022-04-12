package com.example.ifood_copy

import android.content.Context
import android.view.ContextThemeWrapper
import androidx.annotation.DrawableRes
import com.google.android.material.chip.Chip

data class FilterItem(
    val text: String,
    val id: Int,
    @DrawableRes val icon: Int? = null,
    @DrawableRes val closeIcon: Int? = null,
    val iconSize: Float = 26.0f,

    )

fun FilterItem.toChip(context: Context) : Chip {
    val chip = Chip(ContextThemeWrapper(context, com.google.android.material.R.style.Widget_MaterialComponents_Chip_Choice))

    chip.text = text
    return chip
}