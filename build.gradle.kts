/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }

    maven {
        url = uri("https://maven.pkg.github.com/ptmcgit/teamcity-pipelines-dsl")
    }

    maven {
        url = uri("https://repo1.maven.org/maven2/")
    }
    maven {
        url = uri("https://download.jetbrains.com/teamcity-repository")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.7.10")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    implementation("org.jetbrains.teamcity:configs-dsl-kotlin:2021.1")
    implementation("org.jetbrains.teamcity:configs-dsl-kotlin-plugins:1.0-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.4.32")
}

group = "org.example"
version = "1.0-SNAPSHOT"
description = "consoleApp"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
