package com.github.ptmcgit.tckotlindsl

import jetbrains.buildServer.configs.kotlin.*

fun hello() {
    println("Hello World!")
}

fun doProject() {
    project {
        description = "For playing around with Kotlin DSL."
    }
}
