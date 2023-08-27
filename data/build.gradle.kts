plugins {
    id("com.android.library")
    kotlin("android")
}
@Suppress("UnstableApiUsage")
android {
    namespace = "pat.project.vodovossample.data"
    compileSdk = Dependencies.Config.compileSdk
    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
    }
}

dependencies {
    implementation(Dependencies.Core.Ktx.lib)
    implementation(Dependencies.Network.Retrofit.lib)
    implementation(Dependencies.Network.Gson.lib)
    implementation(Dependencies.Network.Logging.lib)
    implementation(Dependencies.Coroutines.lib)

    api(project(":backend:utils"))
    api(project(":backend:vodovos"))
    implementation(project(":common:domain"))

    implementation(project(":features:sample:domain"))
}
