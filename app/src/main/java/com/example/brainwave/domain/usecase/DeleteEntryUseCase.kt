package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.Entry
import com.example.brainwave.domain.repository.EntriesRepository

class DeleteEntryUseCase(private val entriesRepository: EntriesRepository) {
    suspend fun execute(entry:Entry) = entriesRepository.deleteEntry(entry)
}