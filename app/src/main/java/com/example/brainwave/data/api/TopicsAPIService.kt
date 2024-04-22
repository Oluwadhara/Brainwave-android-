package com.example.brainwave.data.api

import com.example.brainwave.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET

interface TopicsAPIService {
    @GET("/topics.json")
    suspend fun getTopics(): Response<APIResponse>
}