package com.ozcanfatihcan.todosapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.databinding.FragmentCompletedPageBinding

class CompletedPageFragment : Fragment() {
    private lateinit var binding: FragmentCompletedPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_completed_page,container,false)
        binding.completedPageFragment=this

        binding.completedSearch.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
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
    override fun onResume() {
        super.onResume()
    }
}