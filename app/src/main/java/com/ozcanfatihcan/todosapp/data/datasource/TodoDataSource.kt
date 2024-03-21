package com.ozcanfatihcan.todosapp.data.datasource

import com.ozcanfatihcan.todosapp.data.entity.Todos
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TodoDataSource {
    suspend fun saveTodo(todo_name:String,todo_detail:String,todo_time:String){
       // tDao.kaydet(todo_name,todo_detail,todo_time)
    }
    suspend fun updateTodo(todo_id:Int,todo_name:String,todo_detail:String,todo_time:String){
        //tDao.updateTodo(todo_id,todo_name,todo_detail,todo_time)
    }

    suspend fun deleteTodo(todo_id:Int){
       // tDao.sil(todo_id)
    }

    /*
    suspend fun getTodo():List<Todos> =
        withContext(Dispatchers.IO){
            return@withContext tDao.getTodo()
        }
    suspend fun searchTodo(searchWord:String):List<Todos> =
        withContext(Dispatchers.IO){
            return@withContext tDao.searchTodo(searchWord)
        }

    suspend fun getCompleted():List<Todos> =
        withContext(Dispatchers.IO){
            return@withContext cDao.getCompleted()
        }
    suspend fun searchCompleted(searchWord:String):List<Todos> =
        withContext(Dispatchers.IO){
            return@withContext cDao.searchCompleted(searchWord)
        }

    */
}