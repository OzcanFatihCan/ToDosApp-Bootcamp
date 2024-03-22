package com.ozcanfatihcan.todosapp.ui.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ozcanfatihcan.todosapp.data.entity.Todos
import com.ozcanfatihcan.todosapp.data.repo.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ToDoPageViewModel @Inject constructor(var todoRepository: TodoRepository):ViewModel() {
    val todoList= MutableLiveData<List<Todos>>()

    init {
        getTodo()
    }

    fun deleteTodo(todo_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            todoRepository.deleteTodo(todo_id)
            getTodo()
        }
    }

    fun getTodo(){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val todoItems = todoRepository.getTodo()
                todoList.value = todoItems
                Log.d("ToDoPageViewModel", "Toplam ${todoItems.size} görev listelendi.")
            } catch (e: Exception) {
                Log.e("ToDoPageViewModel", "Hata: ${e.message}")
            }
        }
    }

    fun searchTodo(searchWord:String){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                todoList.value=todoRepository.searchTodo(searchWord)
            }catch (e:Exception){ }
        }
    }
}