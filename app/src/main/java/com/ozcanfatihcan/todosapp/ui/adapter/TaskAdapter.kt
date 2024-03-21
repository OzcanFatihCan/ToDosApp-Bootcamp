package com.ozcanfatihcan.todosapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.data.entity.Todos
import com.ozcanfatihcan.todosapp.databinding.TodoTaskCardDesignBinding
import com.ozcanfatihcan.todosapp.ui.viewModel.ToDoPageViewModel

class TaskAdapter(var mContext: Context,
                  var todosList:List<Todos>,
                  var viewModel:ToDoPageViewModel)
                  :RecyclerView.Adapter<TaskAdapter.CardDesignHolder>() {
    inner class CardDesignHolder(var design:TodoTaskCardDesignBinding):RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val design:TodoTaskCardDesignBinding= DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.todo_task_card_design, parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val todoObje=todosList.get(position)
        val d=holder.design

        d.todosObject=todoObje

        d.buttonCheck.setOnClickListener {

        }

        d.buttonDelete.setOnClickListener {
            Snackbar.make(it,"${todoObje.todo_name} görevi silinsin mi?", Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    viewModel.deleteTodo(todoObje.todo_id)
                }
                .show()
        }

        d.toDoCard.setOnClickListener {

        }


    }

    override fun getItemCount(): Int {
        return todosList.size
    }
}