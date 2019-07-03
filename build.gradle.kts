import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

allprojects {
    version = "1.0"
    group = "br.com.ivanzao"
}

plugins {
    kotlin("jvm") version "1.3.40"
    kotlin("plugin.allopen") version "1.3.40"
    kotlin("plugin.noarg") version "1.3.40"
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "kotlin-spring")
    apply(plugin = "kotlin-jpa")
    apply(plugin = "jacoco")

    repositories {
        jcenter()
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "${JavaVersion.VERSION_1_8}"
            allWarningsAsErrors = true
        }
    }

    dependencies {
        compile(kotlin("stdlib-jdk8"))
        compile(kotlin("reflect"))

        implementation(Dependency.springContext)
        implementation(Dependency.logbackClassic)

        testImplementation(Dependency.junitJupiterApi)
        testImplementation(Dependency.mockitoKotlin)
        testImplementation(Dependency.assertjCore)
        testRuntime(Dependency.junitJupiterEngine)
    }
}
