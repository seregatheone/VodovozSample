package pat.project.vodovossample.dagger.deps

import dagger.Module
import pat.project.vodovossample.dagger.deps.features.SampleScreenDepsModule
import pat.project.vodovossample.sample.di.SampleScreenDeps

@Module(
    includes = [
        SampleScreenDepsModule::class,
    ]
)
interface FeatureDepsModule