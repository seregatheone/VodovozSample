plugins {
    id("com.android.library")
    kotlin("android")
}
@Suppress("UnstableApiUsage")
android {
    namespace = "pat.project.vodovossample.ui"
    compileSdk = Dependencies.Config.compileSdk
    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Config.kotlinCompilerExtensionVersion
    }
}

dependencies {
    implementation(Dependencies.Core.Ktx.lib)
    implementation(Dependencies.MaterialDesign.plugin_3)
    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.uiToolingPreview)
    implementation(Dependencies.Compose.androidxWindow)
    implementation(Dependencies.Coil.libSvg)
    implementation(Dependencies.Coil.lib)
    debugImplementation(Dependencies.Compose.uiTooling)

    implementation(Dependencies.Compose.material)
}