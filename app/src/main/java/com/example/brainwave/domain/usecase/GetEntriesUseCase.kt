package com.example.brainwave.domain.usecase

import com.example.brainwave.data.model.Entry
import com.example.brainwave.domain.repository.EntriesRepository
import kotlinx.coroutines.flow.Flow

class GetEntriesUseCase(private val entriesRepository: EntriesRepository) {
    fun execute(): Flow<List<Entry>> {
        return entriesRepository.getEntries()
    }
}