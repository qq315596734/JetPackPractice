
// Top-level build file where you can add configuration options common to all sub-projects/modules.


buildscript {

        repositories {
            google()
            jcenter()
        }
        dependencies {
            classpath ("com.android.tools.build:gradle:${ProjectConfig.gradelVersion}")
            classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${ProjectConfig.kotlinVersion}")

            // NOTE: Do not place your application dependencies here; they belong
            // in the individual module build.gradle.kts files
        }
    }

    allprojects {
        repositories {
            google()
            jcenter()
        }
    }

    tasks.register<Delete>("clean") {
        delete (rootProject.buildDir)
    }