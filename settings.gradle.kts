pluginManagement {
    repositories {
        google()
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
    versionCatalogs {
        create("libs") {
            from(files("..\\TestingAndroid\\gradle\\libs.version.toml"))
        }
    }
}

rootProject.name = "TestingAndroid"
include(":app")
include(":models")
include(":feature:home")
include(":feature:section")
include(":feature:detail")
include(":domain")
include(":data:repository")
include(":data:network")
include(":data:database")
include(":utils")
