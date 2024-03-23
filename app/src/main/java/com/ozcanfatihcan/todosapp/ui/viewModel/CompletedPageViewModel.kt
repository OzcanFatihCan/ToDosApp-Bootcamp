package com.ozcanfatihcan.todosapp.ui.viewModel

import android.util.Log
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
                val completedItems=completedRepository.getCompleted()
                completedList.value=completedItems
                Log.d("CompletedPageViewModel", "Toplam ${completedItems.size} görev listelendi.")
            } catch (e: Exception) {
                Log.e("CompletedPageViewModel", "Hata: ${e.message}")
            }
        }
    }

    fun searchCompleted(searchWord:String){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                //  completedList.value=completedRepository.searchCompleted(searchWord)
            }catch (e:Exception){ }
        }
    }

    fun deleteCompleted(todo_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            completedRepository.deleteCompleted(todo_id)
            getCompleted()
        }
    }
}