plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.adip.autoscreen"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.adip.autoscreen"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
}
