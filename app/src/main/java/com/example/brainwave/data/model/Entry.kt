package com.example.brainwave.data.model


import com.google.gson.annotations.SerializedName

data class Entry(
    @SerializedName("date_added")
    val dateAdded: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("text")
    val text: String
)