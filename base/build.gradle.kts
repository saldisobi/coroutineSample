plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}
apply(from = "${rootProject.projectDir}/android.gradle")

dependencies {
    // Kotlin
    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.coreKtx)
    implementation(Libs.coroutinesCore)

    // Logging
    implementation(Libs.timber)

    // Dependency Injection
    implementation(Libs.dagger)
    kapt(Libs.daggerCompiler)

    // AndroidX
    implementation(Libs.lifecycleViewmodel)

    // Testing
    testImplementation(project(Modules.testCore))
    testRuntimeOnly(Libs.junitJupiterEngine)
}
