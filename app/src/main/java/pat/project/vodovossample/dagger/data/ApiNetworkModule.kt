package pat.project.vodovossample.dagger.data

import dagger.Module
import dagger.Provides
import pat.project.vodovossample.data.provider.NetworkProvider
import pat.project.vodovossample.BuildConfig
import pat.project.vodovossample.api.ProductApi
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class BackendVodovos

@Module
class ApiNetworkModule {

    @Provides
    @BackendVodovos
    fun provideUrlBackendVodovos(): String = BuildConfig.BACKEND_VODOVOS


    @Provides
    fun provideNetworkProvider(
        @BackendVodovos host: String
    ): NetworkProvider = NetworkProvider(
        host,
    )

    @Provides
    fun provideProductApi(
        provider: NetworkProvider,
    ): ProductApi = provider.provideRetrofit(ProductApi::class.java)

}
