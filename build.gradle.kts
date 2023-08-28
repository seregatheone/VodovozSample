buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Gradle.plugin)
        classpath(Dependencies.Kotlin.plugin)
    }
}

allprojects {
    tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java).all {
        kotlinOptions.freeCompilerArgs = kotlinOptions.freeCompilerArgs.toMutableList().apply {
            add("-Xjvm-default=all-compatibility")
        }.toList()
        kotlinOptions.jvmTarget = Dependencies.Config.jvmTarget
    }
}

tasks.register("clean").configure {
    delete(rootProject.buildDir)
}
