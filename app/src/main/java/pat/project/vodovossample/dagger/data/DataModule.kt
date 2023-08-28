package pat.project.vodovossample.dagger.data

import dagger.Module
import dagger.Provides
import pat.project.vodovossample.sample.domain.repository.SampleScreenRepository
import pat.project.vodovossample.api.ProductApi
import pat.project.vodovossample.data.repository.SampleScreenRepositoryImpl


@Module(includes = [ApiNetworkModule::class])
class DataModule {
    @Provides
    fun providesSampleScreenRepository(
        productApi: ProductApi,
        @BackendVodovos host : String
    ): SampleScreenRepository = SampleScreenRepositoryImpl(
        productApi,
        host
    )

}
