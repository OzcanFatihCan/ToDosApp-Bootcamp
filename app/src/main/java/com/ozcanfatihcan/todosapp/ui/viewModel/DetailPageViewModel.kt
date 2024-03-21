package com.ozcanfatihcan.todosapp.ui.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailPageViewModel:ViewModel() {

    fun updateTodo(todo_id:Int,todo_name:String,todo_detail:String,todo_time:String){
        CoroutineScope(Dispatchers.Main).launch {
           // todoRepository.todoUpdate(todo_id,todo_name,todo_detail,todo_time)
        }
    }
}