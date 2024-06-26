package com.ozcanfatihcan.todosapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.databinding.FragmentAddPageBinding
import com.ozcanfatihcan.todosapp.ui.viewModel.AddPageViewModel
import com.ozcanfatihcan.todosapp.util.gecisYap
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddPageFragment : Fragment() {
    private lateinit var binding:FragmentAddPageBinding
    private lateinit var viewModel:AddPageViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_add_page,container,false)
        binding.todoAddPage=this
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:AddPageViewModel by viewModels()
        viewModel=tempViewModel
    }
    fun saveTodo(todo_name:String,todo_detail:String,todo_time:String){
        viewModel.saveTodo(todo_name,todo_detail,todo_time)
    }
}