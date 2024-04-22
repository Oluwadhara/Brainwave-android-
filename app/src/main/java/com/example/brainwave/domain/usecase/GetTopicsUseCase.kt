package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.APIResponse
import com.example.brainwave.data.util.Resource
import com.example.brainwave.domain.repository.TopicsRepository

class GetTopicsUseCase(private val topicsRepository: TopicsRepository) {
    suspend fun execute(): Resource<APIResponse> {
        return topicsRepository.getTopics()
    }
}