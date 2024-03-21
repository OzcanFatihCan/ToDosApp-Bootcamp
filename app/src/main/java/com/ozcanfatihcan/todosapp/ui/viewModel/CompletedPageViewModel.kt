package com.ozcanfatihcan.todosapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ozcanfatihcan.todosapp.data.entity.Todos
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CompletedPageViewModel:ViewModel() {

    val completedList= MutableLiveData<List<Todos>>()

    init {
        getCompleted()
    }

    fun getCompleted(){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                //  completedList.value=completeRepository.getCompleted()
            }catch (e:Exception){ }
        }
    }

    fun searchCompleted(searchWord:String){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                //  completedList.value=completedRepository.searchCompleted(searchWord)
            }catch (e:Exception){ }
        }
    }
}