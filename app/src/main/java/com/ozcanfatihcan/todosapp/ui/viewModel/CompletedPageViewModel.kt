package com.ozcanfatihcan.todosapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ozcanfatihcan.todosapp.data.entity.Completed
import com.ozcanfatihcan.todosapp.data.repo.CompletedRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CompletedPageViewModel @Inject constructor(var completedRepository: CompletedRepository):ViewModel() {

    val completedList= MutableLiveData<List<Completed>>()

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