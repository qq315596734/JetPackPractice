plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    //kotlin 语言解决findviewbyid 的插件
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(ProjectConfig.compileSdkVersion)
    buildToolsVersion(ProjectConfig.buildToolVersion)

    defaultConfig {
        applicationId (ProjectConfig.applicationId)
        minSdkVersion (ProjectConfig.minSdkVersion)
        targetSdkVersion(ProjectConfig.targetSdkVersion)
        versionCode(VersionConfig.versionCode)
        versionName(VersionConfig.versionName)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(LibConfig.kotlin_stdlib)
    implementation (LibConfig.androidx_core_ktx)
    implementation (LibConfig.androidx_constraintlayout)
    implementation (LibConfig.androidx_appcompat)
}