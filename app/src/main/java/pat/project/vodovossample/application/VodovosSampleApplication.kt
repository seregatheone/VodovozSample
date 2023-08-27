package pat.project.vodovossample.application

import android.app.Application
import pat.project.vodovossample.Destinations
import pat.project.vodovossample.dagger.component.DaggerAppComponent
import pat.project.vodovossample.dependency.DepsMap
import pat.project.vodovossample.dependency.HasDependencies
import javax.inject.Inject

class VodovosSampleApplication: Application(), HasDependencies {
    @Inject
    override lateinit var depsMap: DepsMap

    @Inject
    override lateinit var depsNav: Destinations

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }
}