package com.kravchenkovadim.shoppinglist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
@Dao
interface AddItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: AddItem)
    @Delete
    suspend fun deleteItem(item: AddItem)
    @Query("SELECT * FROM add_item WHERE listId = :listId")
    fun getAllItemsById(listId: Int): Flow<List<AddItem>>
    @Query("SELECT * FROM shop_list_item WHERE id = :listId")
    suspend fun getListItemById(listId: Int): ShoppingListItem
    @Update
    suspend fun insertItem(item: ShoppingListItem)

}