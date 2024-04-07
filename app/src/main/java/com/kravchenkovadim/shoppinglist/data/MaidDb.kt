package com.kravchenkovadim.shoppinglist.data

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [ShoppingListItem::class, AddItem::class, NoteItem::class],
    version = 1
)

abstract class MaidDb : RoomDatabase() {
    abstract val shoppingListDao: ShoppingListDao
}