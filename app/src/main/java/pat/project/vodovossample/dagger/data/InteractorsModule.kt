package pat.project.vodovossample.dagger.data

import dagger.Module
import dagger.Provides
import pat.project.vodovossample.domain.interactors.SampleScreenInteractorImpl
import pat.project.vodovossample.sample.domain.interactor.SampleScreenInteractor
import pat.project.vodovossample.sample.domain.repository.SampleScreenRepository

@Module
class InteractorsModule {

    @Provides
    fun providesSampleScreenInteractor(
        sampleScreenRepository: SampleScreenRepository,
    ): SampleScreenInteractor = SampleScreenInteractorImpl(
        sampleScreenRepository
    )

}
