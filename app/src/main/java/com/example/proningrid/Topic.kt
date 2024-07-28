package com.example.proningrid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val intId: Int,
    @DrawableRes val imageResourceId: Int
) {
}