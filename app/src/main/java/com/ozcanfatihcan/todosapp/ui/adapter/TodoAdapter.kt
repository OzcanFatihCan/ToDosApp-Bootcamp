package com.ozcanfatihcan.todosapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ozcanfatihcan.todosapp.R
import com.ozcanfatihcan.todosapp.data.entity.Todos
import com.ozcanfatihcan.todosapp.databinding.TodoTaskCardDesignBinding
import com.ozcanfatihcan.todosapp.ui.fragment.ToDoPageFragmentDirections
import com.ozcanfatihcan.todosapp.ui.viewModel.ToDoPageViewModel
import com.ozcanfatihcan.todosapp.util.gecisYap

class TodoAdapter(var mContext:Context,var todoList: List<Todos>,var viewModel: ToDoPageViewModel):RecyclerView.Adapter<TodoAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design:TodoTaskCardDesignBinding):RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val design:TodoTaskCardDesignBinding=DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.todo_task_card_design,parent, false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val todosVariable=todoList.get(position)
        val d=holder.design

        d.todoObje=todosVariable

        d.buttonDelete.setOnClickListener {
            Snackbar.make(it,"${todosVariable.todo_name} silinsin mi?", Snackbar.LENGTH_SHORT)
                .setAction("EVET"){
                    viewModel.deleteTodo(todosVariable.todo_id)
                }
                .show()
        }

        d.toDoCard.setOnClickListener {
            val gecis=ToDoPageFragmentDirections.gotoDetailFragment(todoModel=todosVariable)
            Navigation.gecisYap(it,gecis)
        }

    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}