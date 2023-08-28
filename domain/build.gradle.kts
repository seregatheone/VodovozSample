plugins {
    id("com.android.library")
    kotlin("android")
}
android {
    namespace = "pat.project.vodovossample.domain"
    compileSdk = Dependencies.Config.compileSdk
    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
    }
}

dependencies {
    implementation(Dependencies.Core.Ktx.lib)
    implementation(Dependencies.Coroutines.lib)

    implementation(project(":common:domain"))

    implementation(project(":features:sample:domain"))
}
