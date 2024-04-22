package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.Entry
import com.example.brainwave.data.util.Resource
import com.example.brainwave.domain.repository.EntriesRepository

class GetEntryUseCase(private val entriesRepository: EntriesRepository) {
    suspend fun execute(): Resource<Entry> {
        return entriesRepository.getEntry()
    }
}