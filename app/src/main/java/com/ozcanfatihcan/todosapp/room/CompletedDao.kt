package com.ozcanfatihcan.todosapp.room

import androidx.room.Dao
import androidx.room.Query
import com.ozcanfatihcan.todosapp.data.entity.Completed


@Dao
interface CompletedDao {
    @Query("SELECT * FROM Completed")
    suspend fun getCompleted():List<Completed>
}