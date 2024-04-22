package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.Entry
import com.example.brainwave.domain.repository.EntriesRepository

class EditEntryUseCase(private val entriesRepository: EntriesRepository) {
    suspend fun execute(entry: Entry) = entriesRepository.editEntry(entry)
}