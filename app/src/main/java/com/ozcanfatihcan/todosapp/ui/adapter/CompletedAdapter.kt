package com.ozcanfatihcan.todosapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.data.entity.Todos
import com.ozcanfatihcan.todosapp.databinding.CompleteTaskCardDesignBinding


class CompletedAdapter(var mContext: Context,
                       var completedList:List<Todos>)
    :RecyclerView.Adapter<CompletedAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CompleteTaskCardDesignBinding): RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val design: CompleteTaskCardDesignBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.todo_task_card_design, parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val completeObje=completedList.get(position)
        val d=holder.design

        d.completeObject=completeObje

        d.completedCard.setOnClickListener {

        }


    }

    override fun getItemCount(): Int {
        return completedList.size
    }
}