package pat.project.vodovossample.ui

import android.app.Activity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import pat.project.vodovossample.sample.router.SampleScreenEntry
import pat.project.vodovossample.dependency.destinationsProvider
import pat.project.vodovossample.dependency.findDestinations


@Composable
fun Navigation() {
    val navController = rememberNavController()
    val context = (LocalContext.current as Activity)

    val sampleScreen = context.findDestinations<SampleScreenEntry>()

    Box(Modifier.fillMaxSize()) {
        NavHost(
            navController,
            startDestination = sampleScreen.destination()
        ) {
            with(sampleScreen) {
                composable(
                    navController,
                    context.destinationsProvider,
                )
            }
        }
    }
}
