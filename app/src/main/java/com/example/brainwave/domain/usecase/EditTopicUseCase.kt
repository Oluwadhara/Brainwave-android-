package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.APIResponseItem
import com.example.brainwave.domain.repository.TopicsRepository

class EditTopicUseCase(private val topicsRepository: TopicsRepository) {
    suspend fun execute(apiResponseItem: APIResponseItem) = topicsRepository.editTopic(apiResponseItem)
}