package com.ozcanfatihcan.todosapp.ui.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddPageViewModel: ViewModel() {

    fun saveTodo(todo_name:String,todo_detail:String,todo_time:String){
        CoroutineScope(Dispatchers.Main).launch{
           // todoRepository.saveTodo(todo_name,todo_detail,todo_time)
        }
    }
}