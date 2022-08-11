

plugins {
    //  id ("org.gradle.signing")
    //id ("org.gradle.maven-publish")
    id ("org.jetbrains.kotlin.jvm") version "1.6.21"
    //id ("org.sonarqube") version "3.3"
}

group = "com.github.ptmcgit"
version = "0.9-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://download.jetbrains.com/teamcity-repository")
    }
    maven {
        url = uri(project.findProperty("teamcity.server.url") ?: "http://teamcity.boomtownroi.com:80/")
        isAllowInsecureProtocol = true
    }
}

configurations {
    testImplementation.get().extendsFrom(configurations.compileOnly.get())
}

dependencies {
    //implementation("org.jetbrains.teamcity:configs-dsl-kotlin-plugins:1.0-SNAPSHOT")
    //compileOnly (group = "org.jetbrains.teamcity", name = "configs-dsl-kotlin-plugins-latest", version = "2022.02")
    compileOnly (group = "org.jetbrains.teamcity", name = "configs-dsl-kotlin-latest", version = "2022.02")

    testImplementation (platform("org.junit:junit-bom:5.8.2"))
    testImplementation (group = "org.junit.jupiter", name = "junit-jupiter-api")
    testImplementation (group = "org.hamcrest", name = "hamcrest", version = "2.2")

    testRuntimeOnly (group = "org.junit.jupiter", name = "junit-jupiter-engine")
    testRuntimeOnly (group = "org.jetbrains.teamcity", name = "server-api", version = "2022.04")
}

java {
    withJavadocJar()
    withSourcesJar()
}

