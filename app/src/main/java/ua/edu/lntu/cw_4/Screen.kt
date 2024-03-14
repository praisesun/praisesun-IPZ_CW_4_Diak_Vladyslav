package ua.edu.lntu.cw_4package

sealed class Screen(val route:String){
    data object TaskListScreen : Screen(route = "task_list_screen")

    class TaskDetailScreen(name: String, description: String, isActive: Boolean) :
        Screen(route = "list_item_screen?name=$name&description=$description&isActive=$isActive")
}