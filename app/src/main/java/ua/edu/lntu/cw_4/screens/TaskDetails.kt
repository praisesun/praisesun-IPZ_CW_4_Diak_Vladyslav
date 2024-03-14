package ua.edu.lntu.cw_4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ua.edu.lntu.cw_4.Task
import ua.edu.lntu.cw_4.ui.theme.IPZ_CW_4_Diak_VladyslavTheme

@Composable
fun TaskDetailScreen(modifier: Modifier = Modifier, navController: NavController, task: Task) {

    Column(modifier = Modifier.background(color = task.getColor())) {
        Text(task.name, style = TextStyle(fontSize = 64.sp))
        Text(task.description)
    }

}

@Preview
@Composable
fun TaskDetailsPreview() {
    IPZ_CW_4_Diak_VladyslavTheme {
        TaskDetails(
            navController = NavController(LocalContext.current),
            task = Task("Title", "Description", true)
        )
    }
}