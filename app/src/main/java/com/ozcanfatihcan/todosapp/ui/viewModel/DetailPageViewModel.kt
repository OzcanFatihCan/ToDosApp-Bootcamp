package com.ozcanfatihcan.todosapp.ui.viewModel

import androidx.lifecycle.ViewModel
import com.ozcanfatihcan.todosapp.data.repo.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailPageViewModel @Inject constructor(var todoRepository: TodoRepository):ViewModel() {

    fun updateTodo(todo_id:Int,todo_name:String,todo_detail:String,todo_time:String){
        CoroutineScope(Dispatchers.Main).launch {
            todoRepository.updateTodo(todo_id,todo_name,todo_detail,todo_time)
        }
    }
}