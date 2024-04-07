package com.kravchenkovadim.shoppinglist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: ShoppingListItem)
    @Delete
    suspend fun deleteItem(item: ShoppingListItem)
    @Query("SELECT * FROM shop_list_item")
    fun getAllItems(): Flow<List<ShoppingListItem>>

}