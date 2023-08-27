package pat.project.vodovossample.sample.di

import dagger.Component
import pat.project.vodovossample.sample.domain.interactor.SampleScreenInteractor
import pat.project.vodovossample.dagger.FeatureScoped
import pat.project.vodovossample.dependency.Dependencies
import pat.project.vodovossample.sample.ui.SampleViewModel

@FeatureScoped
@Component(
    dependencies = [SampleScreenDeps::class]
)
interface SampleComponent {
    @Component.Builder
    interface Builder {
        fun sampleScreenDeps(deps: SampleScreenDeps): Builder
        fun build(): SampleComponent
    }
    val sampleViewModel: SampleViewModel
}

interface SampleScreenDeps : Dependencies {
    val sampleScreenInteractor : SampleScreenInteractor
}
