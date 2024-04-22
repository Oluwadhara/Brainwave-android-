package com.example.brainwave.domain.repository

import com.example.brainwave.data.model.Entry
import com.example.brainwave.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface EntriesRepository {
    fun getEntries(): Flow<List<Entry>>
    suspend fun getEntry(): Resource<Entry>
    suspend fun editEntry(entry: Entry)
    suspend fun addEntry(entry: Entry)
    suspend fun deleteEntry(entry: Entry)
}