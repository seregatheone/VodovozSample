package pat.project.vodovossample

import androidx.navigation.NavHostController

fun NavHostController.navigateAndClean(route: String) {
    this.backQueue.clear()
    navigate(route = route) {
        popUpTo(graph.startDestinationId) { inclusive = true }
    }
    graph.setStartDestination(route)
}
