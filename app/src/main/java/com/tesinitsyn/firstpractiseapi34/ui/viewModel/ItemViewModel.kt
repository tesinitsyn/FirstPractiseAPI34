package com.tesinitsyn.firstpractiseapi34.ui.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.tesinitsyn.firstpractiseapi34.data.item.Item
import com.tesinitsyn.firstpractiseapi34.data.item.ItemDB
import com.tesinitsyn.firstpractiseapi34.data.item.ItemRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ItemViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: ItemRepository
    val getAllData: LiveData<List<Item>>

    init {
        val itemDAO = ItemDB.getDatabase(application).itemDAO()
        repository = ItemRepository(itemDAO)
        getAllData = repository.getAllDAO
    }

    fun addItem(item: Item) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addItem(item)
        }
    }

}