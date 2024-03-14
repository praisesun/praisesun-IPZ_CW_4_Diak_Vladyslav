package ua.edu.lntu.cw_4package

sealed class Screen(val route:String){
    data object TaskListScreen : Screen(route = "List_Of_Tasks")
}