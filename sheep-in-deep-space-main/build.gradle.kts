/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `kotlin-dsl`
    application
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation(project(":sheep-in-deep-space-core"))
}

application {
    // Define the main class for the application.
    mainClass.set("dev.drf.deep.space.sheep.AppKt")
}
