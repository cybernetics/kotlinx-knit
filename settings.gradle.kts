/*
 * Copyright 2016-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

rootProject.name = "kotlinx-knit"
include("kotlinx-knit-test")

val kotlinVersion: String by settings

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace?.startsWith("org.jetbrains.kotlin") == true) {
                useVersion(kotlinVersion)
            }
        }
    }
}