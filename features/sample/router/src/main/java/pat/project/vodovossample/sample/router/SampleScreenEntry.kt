package pat.project.vodovossample.sample.router

import pat.project.vodovossample.ComposableFeatureEntry


abstract class SampleScreenEntry : ComposableFeatureEntry {

    final override val featureRoute = "sampleScreen"

    fun destination(): String = featureRoute

}