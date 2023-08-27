package pat.project.vodovossample.dependency

import android.app.Activity
import pat.project.vodovossample.Destinations
import pat.project.vodovossample.FeatureEntry


internal val Activity.depsApplication: HasDependencies?
    get() = application as? HasDependencies

//Dependencies
inline fun <reified D : Dependencies> Activity.findDependencies(): D {
    return findDependenciesByClass(D::class.java)
}

@Suppress("UNCHECKED_CAST")
fun <D : Dependencies> Activity.findDependenciesByClass(clazz: Class<D>): D {
    return depsApplication?.depsMap?.get(clazz) as? D ?: throw IllegalStateException("No Dependencies $clazz in application")
}


//Destinations
val Activity.destinationsProvider: Destinations
    get() = depsApplication?.depsNav ?: throw IllegalStateException("Nav graph destinations not found in application")

inline fun <reified K : FeatureEntry> Activity.findDestinations(): K {
    return findDestinationsByClass(K::class.java)
}
@Suppress("UNCHECKED_CAST")
fun <K : FeatureEntry> Activity.findDestinationsByClass(clazz: Class<K>): K {
    return depsApplication?.depsNav?.get(clazz) as? K ?: throw IllegalStateException("No Destination $clazz in application")
}

