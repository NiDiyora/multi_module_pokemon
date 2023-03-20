import Version.nav_version

object Version {

    const val core = "1.7.0"
    const val lifecycle = "2.6.0"
    const val compose_activity = "1.3.1"
    const val compose_ui_version = "1.2.0"
    const val material = "1.3.1"
    const val junit = "4.13.2"
    const val ext_junit = "1.1.5"
    const val espresso_core = "3.5.1"
    const val dagger_hilt = "2.44"
    const val retrofit_version = "2.9.0"
    const val retrofit_converter = "2.5.0"
    const val retrofit_logging = "4.2.1"
    const val hilt_navigation = "1.0.0"
    const val nav_version = "2.5.3"
}

object Deps {
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val lifeCycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
    const val compose_activity = "androidx.activity:activity-compose:${Version.compose_activity}"
}

object ComposeUI {
    const val compose_ui = "androidx.compose.ui:ui:${Version.compose_ui_version}"
    const val tooling_preview =
        "androidx.compose.ui:ui-tooling-preview:${Version.compose_ui_version}"
    const val material = "androidx.compose.material:material:${Version.material}"
    const val navigation = "androidx.navigation:navigation-compose:${Version.nav_version}"
}

object DebugImplementation {
    const val ui_tooling = "androidx.compose.ui:ui-tooling:${Version.compose_ui_version}"
    const val ui_test_manifest =
        "androidx.compose.ui:ui-test-manifest:${Version.compose_ui_version}"
}

object TestImplementation {
    const val junit = "junit:junit:${Version.junit}"
    const val ext_junit = "androidx.test.ext:junit:${Version.ext_junit}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Version.espresso_core}"
    const val ui_test_junit = "androidx.compose.ui:ui-test-junit4:${Version.compose_ui_version}"

}

object DaggerHilt {
    const val hilt_android = "com.google.dagger:hilt-android:${Version.dagger_hilt}"
    const val hilt_compiler = "com.google.dagger:hilt-android-compiler:${Version.dagger_hilt}"
    const val hilt_navigation = "androidx.hilt:hilt-navigation-fragment:${Version.hilt_navigation}"
    const val hilt_ktx_compiler = "androidx.hilt:hilt-compiler:${Version.hilt_navigation}"
    const val hilt_navigation_compose = "androidx.hilt:hilt-navigation-compose:1.0.0"

}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit_version}"
    const val retrofit_converter =
        "com.squareup.retrofit2:converter-gson:${Version.retrofit_converter}"
    const val logging_retrofit =
        "com.squareup.okhttp3:logging-interceptor:${Version.retrofit_logging}"
}
