package pat.project.vodovossample.dagger.deps.features

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.vodovossample.dagger.component.AppComponent
import pat.project.vodovossample.dagger.DependenciesKey
import pat.project.vodovossample.dependency.Dependencies
import pat.project.vodovossample.sample.di.SampleScreenDeps

@Module
interface SampleScreenDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(SampleScreenDeps::class)
    fun bindSampleScreenDeps(impl: AppComponent): Dependencies
}