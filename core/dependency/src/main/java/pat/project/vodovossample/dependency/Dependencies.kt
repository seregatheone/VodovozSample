package pat.project.vodovossample.dependency

import pat.project.vodovossample.Destinations


interface Dependencies

typealias DepsMap = Map<Class<out Dependencies>, @JvmSuppressWildcards Dependencies>

interface HasDependencies {
    val depsMap: DepsMap
    val depsNav: Destinations
}