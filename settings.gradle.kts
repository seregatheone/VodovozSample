pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "VodovosSample"
include(
    ":app",

    ":backend:utils",
    ":backend:vodovos",

    ":common:domain",
    ":common:router",

    ":core:dagger",
    ":core:dependency",
    ":core:uiComponent",

    ":domain",
    ":data",

    ":utils",

    ":features:sample:router",
    ":features:sample:domain",
    ":features:sample:presentation",
)
