plugins {
//    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.7.10")
    implementation("com.android.tools.build:gradle:7.2.1")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.19.0")
}