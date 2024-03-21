package com.ozcanfatihcan.todosapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.databinding.FragmentToDoPageBinding
import com.ozcanfatihcan.todosapp.ui.adapter.TaskAdapter
import com.ozcanfatihcan.todosapp.ui.viewModel.ToDoPageViewModel
import com.ozcanfatihcan.todosapp.util.gecisYap
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ToDoPageFragment : Fragment() {
    private lateinit var binding: FragmentToDoPageBinding
    private lateinit var viewModel:ToDoPageViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_to_do_page,container,false)
        binding.todoPageFragment=this

        binding.todoSearch.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let { viewModel.searchTodo(it) }
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let { viewModel.searchTodo(it) }
                return true
            }
        })

        viewModel.todoList.observe(viewLifecycleOwner){
            val todoAdapter=TaskAdapter(requireContext(),it,viewModel)
            binding.taskAdapter=todoAdapter
        }


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:ToDoPageViewModel by viewModels()
       viewModel=tempViewModel
    }
    override fun onResume() {
        super.onResume()
        viewModel.getTodo()
    }

    fun todoAdd(it: View){
        Navigation.gecisYap(it,R.id.addPageFragment)
    }
}