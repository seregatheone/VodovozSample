plugins {
    id("com.android.library")
    kotlin("android")
}

@Suppress("UnstableApiUsage")
android {
    namespace = "pat.project.vodovossample.sample.domain"
    compileSdk = Dependencies.Config.compileSdk
    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
    }

}

dependencies {
    implementation(Dependencies.Core.Ktx.lib)
    api(project(":common:domain"))
}
