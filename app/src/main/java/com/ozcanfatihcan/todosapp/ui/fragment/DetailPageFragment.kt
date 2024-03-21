package com.ozcanfatihcan.todosapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.databinding.FragmentDetailPageBinding

class DetailPageFragment : Fragment() {
    private lateinit var binding:FragmentDetailPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_detail_page,container,false)
        binding.todoDetailPage=this
        return binding.root
    }
}