package pat.project.vodovossample.dagger.navigation

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.vodovossample.sample.SampleScreenEntryImpl
import pat.project.vodovossample.FeatureEntry
import pat.project.vodovossample.dagger.FeatureEntryKey
import pat.project.vodovossample.sample.router.SampleScreenEntry

@Module
interface NavigationModule {
    @Binds
    @IntoMap
    @FeatureEntryKey(SampleScreenEntry::class)
    fun sampleScreenEntry(entry: SampleScreenEntryImpl): FeatureEntry
}