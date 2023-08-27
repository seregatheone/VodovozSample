package pat.project.vodovossample.dagger.component

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import pat.project.vodovossample.application.VodovosSampleApplication
import pat.project.vodovossample.dagger.data.DataModule
import pat.project.vodovossample.dagger.data.InteractorsModule
import pat.project.vodovossample.dagger.deps.FeatureDepsModule
import pat.project.vodovossample.dagger.navigation.NavigationModule
import javax.inject.Scope
import javax.inject.Singleton

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Component(
    modules = [
        AppModule::class,
        FeatureDepsModule::class,
        NavigationModule::class,
        DataModule::class,
        InteractorsModule::class,
    ]
)
@AppScope
@Singleton
interface AppComponent : FeaturesScreenDepsOrder {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(application: VodovosSampleApplication)
}

@Module
class AppModule {
    @AppScope
    @Provides
    fun provideContext(
        application: Application
    ): Context = application.applicationContext
}
