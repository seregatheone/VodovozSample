plugins{
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}
@Suppress("UnstableApiUsage")
android{
    namespace = "pat.project.vodovossample.sample.presentation"
    compileSdk = Dependencies.Config.compileSdk
    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Config.kotlinCompilerExtensionVersion
    }

}

dependencies {
    api (project(":features:sample:router"))
    api (project(":features:sample:domain"))

    implementation(project(":common:router"))
    implementation (project(":core:uiComponent"))
    implementation (project(":core:dependency"))
    implementation (project(":core:dagger"))
    implementation (Dependencies.Core.Ktx.lib)
    implementation (Dependencies.Compose.uiToolingPreview)
    implementation (Dependencies.Dagger.lib)
    kapt (Dependencies.Dagger.daggerCompiler)
    implementation(Dependencies.Navigation.navigation)

}