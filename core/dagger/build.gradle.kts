plugins {
    id("com.android.library")
    kotlin("android")
}
@Suppress("UnstableApiUsage")
android {
    namespace = "pat.project.vodovossample.dagger"
    compileSdk = Dependencies.Config.compileSdk
    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
    }
}

dependencies {
    api(Dependencies.Dagger.lib)
    api(project(":core:dependency"))
    implementation(project(":common:router"))
}
