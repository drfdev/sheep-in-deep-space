/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")

    // project
    implementation(project(":sheep-in-deep-space-model"))

    // tests
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.5.21")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
