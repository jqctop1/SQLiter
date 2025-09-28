rootProject.name = "sqliter"

include(":sqliter-driver")

pluginManagement {
  val KOTLIN_VERSION: String by settings
  plugins {
    kotlin("multiplatform") version KOTLIN_VERSION
  }
  repositories {
    maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
  }
}

dependencyResolutionManagement {
  repositories {
    maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
    mavenLocal()
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
  }
}
