package com.ozcanfatihcan.todosapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ozcanfatihcan.todosapp.data.entity.Completed
import com.ozcanfatihcan.todosapp.data.entity.Todos

@Database(entities = [Todos::class,Completed::class], version = 1)
abstract class DatabaseTodos:RoomDatabase() {
    abstract fun getTodosDao():TodosDao
    abstract fun getCompletedDao():CompletedDao
}