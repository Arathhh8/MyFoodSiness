package com.example.MyFoodSiness


import androidx.annotation.DrawableRes

data class News(
    val id:Long,
    @DrawableRes
    var image:Int?,
    val title:String,
    val resume:String,
    val price:String
)