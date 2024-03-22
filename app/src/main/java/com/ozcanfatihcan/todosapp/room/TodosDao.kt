package com.ozcanfatihcan.todosapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ozcanfatihcan.todosapp.data.entity.Todos

@Dao
interface TodosDao {
    @Query("SELECT * FROM Todos")
    suspend fun getTodo():List<Todos>

    @Insert
    suspend fun saveTodo(todos: Todos)
}

