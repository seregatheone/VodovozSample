package pat.project.vodovossample.sample

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import pat.project.vodovossample.sample.ui.SampleScreen
import pat.project.vodovossample.Destinations
import pat.project.vodovossample.dependency.findDependencies
import pat.project.vodovossample.dependency.injectedViewModel
import pat.project.vodovossample.sample.di.DaggerSampleComponent
import pat.project.vodovossample.sample.router.SampleScreenEntry
import javax.inject.Inject

class SampleScreenEntryImpl @Inject constructor() : SampleScreenEntry() {
    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val context = LocalContext.current

        val viewModel = injectedViewModel {
            DaggerSampleComponent.builder()
                .sampleScreenDeps((context as Activity).findDependencies())
                .build()
                .sampleViewModel
        }

        SampleScreen(
            sampleViewModel = viewModel
        )

    }
}
