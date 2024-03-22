package com.ozcanfatihcan.todosapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "Completed")
data class Completed(@PrimaryKey(autoGenerate = true)
                     @ColumnInfo(name="todo_id") @NotNull var todo_id:Int,
                     @ColumnInfo(name="todo_name") @NotNull var todo_name:String,
                     @ColumnInfo(name="todo_detail") @NotNull var todo_detail:String,
                     @ColumnInfo(name="todo_time") @NotNull var todo_time:String): Serializable {
}