pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "Learning Kotlin"
include(":app")
include(":app:src:main:java:es:deiividdev:learningkotlin:episodes:data")
include(":app:src:main:java:es:deiividdev:learningkotlin:episodes:domain")
include(":app:src:main:java:es:deiividdev:learningkotlin:episodes:presentation")