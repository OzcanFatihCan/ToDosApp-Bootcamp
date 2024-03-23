package com.ozcanfatihcan.todosapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.data.entity.Completed
import com.ozcanfatihcan.todosapp.databinding.CompleteTaskCardDesignBinding
import com.ozcanfatihcan.todosapp.ui.viewModel.CompletedPageViewModel


class CompletedAdapter(var mContext: Context,
                       var completedList:List<Completed>,
                       var viewModel:CompletedPageViewModel)
    :RecyclerView.Adapter<CompletedAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CompleteTaskCardDesignBinding): RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val design: CompleteTaskCardDesignBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.complete_task_card_design, parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val completeObje=completedList.get(position)
        val d=holder.design

        d.completeObject=completeObje

        d.completedDeleteButton.setOnClickListener {
            Snackbar.make(it,"${completeObje.todo_name} silinsin mi?", Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    viewModel.deleteCompleted(completeObje.todo_id)
                }
                .show()
        }

    }

    override fun getItemCount(): Int {
        return completedList.size
    }
}