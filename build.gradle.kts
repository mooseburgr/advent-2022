plugins {
    kotlin("jvm") version "1.9.24"
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
