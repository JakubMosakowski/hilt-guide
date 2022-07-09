@file:Suppress("unused")

object Versions {
    const val compileSdk = 32
    const val minSdk = 23
    const val targetSdk = 32
    const val gradle = "7.1.3"
    const val kotlin = "1.7.10"
    const val navigation = "2.5.0"
}

object Classpaths {
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}
