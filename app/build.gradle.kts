plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("org.jetbrains.kotlin.kapt")

}

android {
    namespace = "com.example.eshop"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.eshop"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.firebase.auth)
    implementation(libs.firebase.analytics)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.storage)
    implementation(libs.firebase.crashlytics)
    //val voyagerVersion = "1.0.0"

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    //FINE Location
    implementation(libs.play.services.location)
    implementation (libs.easypermissions)

    //pretytime
    implementation (libs.prettytime)
    implementation (libs.androidx.viewpager2)
    implementation (libs.play.services.maps)
    implementation(libs.maps.ktx)

    // Hilt Navigation
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation (libs.androidx.material)
    //view-model
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    kapt(libs.hilt.android.compiler)
    //kapt(libs.androidx.hilt.compiler)
    //kapt(libs.kotlinx.metadata.jvm)
    //kapt(libs.hilt.android.compiler.v249)
    kapt(libs.androidx.hilt.compiler.v100)
    //implementation (libs.androidx.hilt.lifecycle.viewmodel)

    // Retrofit
    implementation (libs.retrofit)
    //Gson
    implementation(libs.converter.gson)
    //Coroutine
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    //Pager
    implementation (libs.accompanist.pager)
    implementation (libs.accompanist.pager.indicators)


    // Navigator
    implementation(libs.voyager.navigator)
    // BottomSheetNavigator
    implementation(libs.voyager.bottom.sheet.navigator)
    // TabNavigator
    implementation(libs.voyager.tab.navigator)

    // Transitions
    implementation(libs.voyager.transitions)
    // Hilt integration
    implementation(libs.voyager.hilt)
    implementation(libs.voyager.tab.navigator.android.debug)

    //Coil Image
    implementation (libs.coil.compose)
    implementation(libs.androidx.espresso.core)

}