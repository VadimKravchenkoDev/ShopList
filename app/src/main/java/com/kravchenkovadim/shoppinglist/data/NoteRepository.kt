package com.kravchenkovadim.shoppinglist.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insertItem(item: NoteItem)
    suspend fun deleteItem(item: NoteItem)
    fun getAllItems(): Flow<List<NoteItem>>
    suspend fun getNoteItemById(id: Int): NoteItem
}