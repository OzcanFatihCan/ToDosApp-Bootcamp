package com.ozcanfatihcan.todosapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ozcanfatihcan.todosapp.data.entity.Todos
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ToDoPageViewModel:ViewModel() {
    val todoList= MutableLiveData<List<Todos>>()

    init {
        getTodo()
    }

    fun deleteTodo(todo_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            //todoRepository.sil(todo_id)
            getTodo()
        }
    }

    fun getTodo(){
        CoroutineScope(Dispatchers.Main).launch {
            try {
              //  todoList.value=todoRepository.getTodo()
            }catch (e:Exception){ }
        }
    }

    fun search(searchWord:String){
        CoroutineScope(Dispatchers.Main).launch {
            try {
             //  todoList.value=todoRepository.search(searchWord)
            }catch (e:Exception){ }
        }
    }
}