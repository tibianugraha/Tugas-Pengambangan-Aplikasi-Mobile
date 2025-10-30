plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")    // id("org.jetbrains.kotlin.plugin.compose") // <-- Jadikan komentar atau hapus
    id("org.jetbrains.kotlin.kapt")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.mesenmakanansunda"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mesenmakanansunda"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    // buildFeatures {
    //     compose = true // <-- Jadikan komentar atau hapus blok ini
    // }

    // composeOptions {
    //     kotlinCompilerExtensionVersion = "1.7.0" // <-- Jadikan komentar atau hapus
    // }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

// Di C:/Users/Lenovo/AndroidStudioProjects/MesenMakananSunda/app/build.gradle.kts

dependencies {
    // Dependensi inti yang benar
    implementation("androidx.core:core-ktx:1.13.1")

    // Pustaka material sudah termasuk appcompat, jadi Anda tidak perlu mendeklarasikannya secara terpisah.
    implementation("com.google.android.material:material:1.12.0")

    // Dependensi lainnya
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    kapt("com.github.bumptech.glide:compiler:4.16.0") // Pastikan plugin kapt sudah diterapkan

    // Dependensi untuk testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

