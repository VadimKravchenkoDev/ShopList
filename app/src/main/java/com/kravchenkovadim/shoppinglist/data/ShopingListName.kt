package com.kravchenkovadim.shoppinglist.data


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_list_name")
data class ShoppingListName(
    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val time: String,
    val allItemsCount: Int,
    val allSelectedItemCount: Int
)
