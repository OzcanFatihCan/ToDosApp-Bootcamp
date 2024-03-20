package com.ozcanfatihcan.todosapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.databinding.FragmentToDoPageBinding

class ToDoPageFragment : Fragment() {
    private lateinit var binding: FragmentToDoPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_to_do_page,container,false)
        binding.todoPageFragment=this

        binding.todoSearch.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                //newText?.let { viewModel.ara(it) }
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
               // query?.let { viewModel.ara(it) }
                return true
            }
        })


        return binding.root
    }
}