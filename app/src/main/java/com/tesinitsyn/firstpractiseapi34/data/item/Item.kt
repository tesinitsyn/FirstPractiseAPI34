package com.tesinitsyn.firstpractiseapi34.data.item

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int, val name: String
)
