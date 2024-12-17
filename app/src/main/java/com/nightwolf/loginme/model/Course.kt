package com.nightwolf.loginme.model

data class Course(
    val id: Int,
    val title: String,
    val instructor: String,
    val price: Number,
    val rating: Float,
    val imageUrl: String,
    val category: String
)
