package com.ozcanfatihcan.todosapp.util

import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

fun Navigation.gecisYap(it:View,fragmentName:Int){
    findNavController(it).navigate(fragmentName)
}
fun Navigation.gecisYap(it:View,fragmentName:NavDirections){
    findNavController(it).navigate(fragmentName)
}
