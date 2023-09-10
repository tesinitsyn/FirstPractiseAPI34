package com.tesinitsyn.firstpractiseapi34.data.item

import androidx.lifecycle.LiveData

class ItemRepository(private val itemDAO: ItemDAO) {

    var getAllDAO: LiveData<List<Item>> = itemDAO.getAll()

    suspend fun addItem(item: Item) {
        itemDAO.insert(item)
    }
}