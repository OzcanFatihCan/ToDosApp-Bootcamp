package com.ozcanfatihcan.todosapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ozcanfatihcan.todosapp.data.entity.Todos

@Dao
interface TodosDao {
    @Query("SELECT * FROM Todos")
    suspend fun getTodo():List<Todos>

    @Insert
    suspend fun saveTodo(todos: Todos)

    @Delete
    suspend fun deleteTodo(todos: Todos)

    @Update
    suspend fun updateTodo(todos: Todos)

    @Query("SELECT * FROM Todos WHERE todo_name LIKE '%' || :searchWord || '%' ")
    suspend fun searchTodo(searchWord:String):List<Todos>
}

