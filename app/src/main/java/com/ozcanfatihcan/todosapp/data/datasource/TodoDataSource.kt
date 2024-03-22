package com.ozcanfatihcan.todosapp.data.datasource

import com.ozcanfatihcan.todosapp.data.entity.Completed
import com.ozcanfatihcan.todosapp.data.entity.Todos
import com.ozcanfatihcan.todosapp.room.CompletedDao
import com.ozcanfatihcan.todosapp.room.TodosDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TodoDataSource(var tDao:TodosDao, var cDao:CompletedDao) {
    suspend fun saveTodo(todo_name:String,todo_detail:String,todo_time:String){
        val newTodo=Todos(todo_id = 0,todo_name,todo_detail,todo_time)
        tDao.saveTodo(newTodo)
    }
    suspend fun updateTodo(todo_id:Int,todo_name:String,todo_detail:String,todo_time:String){
        val newTodo=Todos(todo_id,todo_name,todo_detail,todo_time)
        tDao.updateTodo(newTodo)
    }

    suspend fun deleteTodo(todo_id:Int){
        val newTodo=Todos(todo_id,"","","")
        tDao.deleteTodo(newTodo)
    }


    suspend fun getTodo():List<Todos> =
        withContext(Dispatchers.IO){
            return@withContext tDao.getTodo()
        }
    suspend fun getCompleted():List<Completed> =
        withContext(Dispatchers.IO){
            return@withContext cDao.getCompleted()
        }

    suspend fun searchTodo(searchWord:String):List<Todos> =
        withContext(Dispatchers.IO){
            return@withContext tDao.searchTodo(searchWord)
        }

    /*
        suspend fun searchCompleted(searchWord:String):List<Completed> =
            withContext(Dispatchers.IO){
                return@withContext cDao.searchCompleted(searchWord)
            }

        */
}