package com.kravchenkovadim.shoppinglist.data

import kotlinx.coroutines.flow.Flow

class ShoppingListRepoImp(
    private val dao : ShoppingListDao
) : ShoppingListRepository{
    override suspend fun insertItem(item: ShoppingListItem) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: ShoppingListItem) {
      dao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<ShoppingListItem>> {
        return dao.getAllItems()
    }
}