package com.ozcanfatihcan.todosapp.data.entity

import java.io.Serializable

data class Todos(var todo_id:Int,
                 var todo_name:String,
                 var todo_detail:String,
                 var todo_time:String):Serializable {
}