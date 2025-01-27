plugins {
    kotlin("jvm") version "2.1.10"
}

repositories {
    mavenCentral()
}

tasks {
    sourceSets {
        main {
            java.srcDirs("src")
        }
    }

    wrapper {
        gradleVersion = "8.1.1"
    }
}
