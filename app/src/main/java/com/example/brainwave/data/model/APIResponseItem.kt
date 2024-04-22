package com.example.brainwave.data.model


import com.google.gson.annotations.SerializedName

data class APIResponseItem(
    @SerializedName("date_added")
    val dateAdded: String,
    @SerializedName("entries")
    val entries: List<Entry>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("text")
    val text: String
)