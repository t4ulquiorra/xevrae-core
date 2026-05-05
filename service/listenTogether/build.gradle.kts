plugins {
    id("com.android.library")
    kotlin("android")
    id("com.google.protobuf")
}

android {
    namespace = "com.xevrae.listentogether"
    compileSdk = 35
    defaultConfig { minSdk = 24 }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${libs.versions.protobuf.get()}"
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                create("java") { option("lite") }
            }
        }
    }
}

dependencies {
    implementation(libs.protobuf.javalite)
    implementation(libs.okhttp)
    implementation(libs.kotlinx.coroutines.android)
}
