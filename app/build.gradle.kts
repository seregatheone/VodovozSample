import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = Dependencies.Config.id
    compileSdk = Dependencies.Config.compileSdk

    defaultConfig {
        applicationId = Dependencies.Config.id
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
        versionCode = Dependencies.Config.versionCode
        versionName = Dependencies.Config.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    flavorDimensions.add("Vodovos")
    productFlavors {
        create("stage") {
            dimension = Vodovos.dimension
            versionNameSuffix = Vodovos.Stage.versionNameSuffix
            applicationIdSuffix = Vodovos.Stage.applicationIdSuffix
            buildConfigField("String", "BACKEND_VODOVOS", Vodovos.Stage.vodovosBackend)
            resValue("string", "app_name", Vodovos.Stage.resName + "-${Dependencies.Config.versionName}")
        }
        create("production") {
            dimension = Vodovos.dimension
            buildConfigField(
                "String",
                "BACKEND_VODOVOS",
                Vodovos.Production.vodovosBackend
            )
            resValue("string", "app_name", Vodovos.Production.resName)
        }
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Dependencies.Config.jVersion
        targetCompatibility = Dependencies.Config.jVersion
    }
    kotlinOptions {
        jvmTarget = Dependencies.Config.jvmTarget
        freeCompilerArgs += listOf("-opt-in=androidx.compose.material3.ExperimentalMaterial3Api")
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Config.kotlinCompilerExtensionVersion
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {


    implementation(Dependencies.AppCenter.libAnalytics)
    implementation(Dependencies.AppCenter.libCrashes)
    implementation(Dependencies.Core.Ktx.lib)
    implementation(Dependencies.MaterialDesign.plugin_3)
    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.uiToolingPreview)
    debugImplementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Navigation.navigation)
    implementation(Dependencies.Dagger.lib)
    kapt(Dependencies.Dagger.daggerCompiler)
    implementation(Dependencies.AppCompat.lib)
}