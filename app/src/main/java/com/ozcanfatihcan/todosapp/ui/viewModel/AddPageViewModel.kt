package com.ozcanfatihcan.todosapp.ui.viewModel

import androidx.lifecycle.ViewModel
import com.ozcanfatihcan.todosapp.data.repo.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddPageViewModel @Inject constructor(var todoRepository: TodoRepository): ViewModel() {

    fun saveTodo(todo_name:String,todo_detail:String,todo_time:String){
        CoroutineScope(Dispatchers.Main).launch{
            todoRepository.saveTodo(todo_name,todo_detail,todo_time)
        }
    }
}