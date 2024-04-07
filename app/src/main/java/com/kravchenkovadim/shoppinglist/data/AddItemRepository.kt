package com.kravchenkovadim.shoppinglist.data


import kotlinx.coroutines.flow.Flow

interface AddItemRepository {
    suspend fun insertItem(item: AddItem)
    suspend fun deleteItem(item: AddItem)
    fun getAllItemsById(listId: Int): Flow<List<AddItem>>
    suspend fun getListItemById(listId: Int): ShoppingListItem
    suspend fun insertItem(item: ShoppingListItem)
}