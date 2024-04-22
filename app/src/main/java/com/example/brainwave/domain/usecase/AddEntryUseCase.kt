package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.Entry
import com.example.brainwave.domain.repository.EntriesRepository

class AddEntryUseCase(private val entriesRepository: EntriesRepository) {
    suspend fun execute(entry: Entry) = entriesRepository.addEntry(entry)
}