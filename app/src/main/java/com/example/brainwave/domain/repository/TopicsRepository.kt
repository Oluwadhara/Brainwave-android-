package com.example.brainwave.domain.repository

import com.example.brainwave.data.model.APIResponse
import com.example.brainwave.data.model.APIResponseItem
import com.example.brainwave.data.util.Resource

interface TopicsRepository {

    suspend fun getTopics(): Resource<APIResponse>
    suspend fun getTopic(): Resource<APIResponseItem>
    suspend fun editTopic(apiResponseItem: APIResponseItem)
    suspend fun addTopic(apiResponseItem: APIResponseItem)
    suspend fun deleteTopic(apiResponseItem: APIResponseItem)
}