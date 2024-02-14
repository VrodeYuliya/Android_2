package com.raywenderlich.android.lab1.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

/**
 * Класс, определяющий экраны, которые есть в нашем приложении.
 *
 * Эти объекты должны соответствовать файлам, которые есть в пакете screens
 */
sealed class Screen {
    object Navigation : Screen()
    object Text : Screen()
    object TextField : Screen()
    object Buttons : Screen()
    object ProgressIndicator : Screen()
    object AlertDialog : Screen()
}

object FundamentalsRouter {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.Navigation)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}