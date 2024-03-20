// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    dependencies {
        //hilt - Dependencies
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48")
        //safeArgs - Navigation component
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
    }
}



plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}