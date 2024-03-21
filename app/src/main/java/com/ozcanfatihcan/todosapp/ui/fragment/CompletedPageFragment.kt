package com.ozcanfatihcan.todosapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.databinding.FragmentCompletedPageBinding
import com.ozcanfatihcan.todosapp.ui.viewModel.CompletedPageViewModel

class CompletedPageFragment : Fragment() {
    private lateinit var binding: FragmentCompletedPageBinding
    private lateinit var viewModel:CompletedPageViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_completed_page,container,false)
        binding.completedPageFragment=this

        binding.completedSearch.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let { viewModel.searchCompleted(it) }
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                 query?.let { viewModel.searchCompleted(it) }
                return true
            }
        })

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:CompletedPageViewModel by viewModels()
        viewModel=tempViewModel
    }
    override fun onResume() {
        super.onResume()
        viewModel.getCompleted()
    }
}