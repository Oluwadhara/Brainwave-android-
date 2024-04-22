package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.APIResponseItem
import com.example.brainwave.data.util.Resource
import com.example.brainwave.domain.repository.TopicsRepository

class GetTopicUseCase(private val topicsRepository: TopicsRepository) {
    suspend fun execute(): Resource<APIResponseItem> {
        return topicsRepository.getTopic()
    }
}