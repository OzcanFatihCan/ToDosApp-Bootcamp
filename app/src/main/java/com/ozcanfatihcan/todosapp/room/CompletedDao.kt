package com.ozcanfatihcan.todosapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.ozcanfatihcan.todosapp.data.entity.Completed



@Dao
interface CompletedDao {
    @Query("SELECT * FROM Completed")
    suspend fun getCompleted():List<Completed>
    @Insert
    suspend fun saveCompleted(completed: Completed)

    @Delete
    suspend fun deleteCompleted(completed: Completed)

    @Query("SELECT * FROM Completed WHERE todo_name LIKE '%' || :searchWord || '%' ")
    suspend fun searchCompleted(searchWord:String):List<Completed>
}