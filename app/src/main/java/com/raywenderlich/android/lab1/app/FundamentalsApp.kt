package com.raywenderlich.android.lab1.app

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import com.raywenderlich.android.lab1.screens.*

@Composable
fun FundamentalsApp() {
    Surface(color = MaterialTheme.colors.background) {
        Crossfade(targetState = FundamentalsRouter.currentScreen) { screenState ->
            when (screenState.value) {
                is Screen.Navigation -> NavigationScreen()
                is Screen.Text -> TextScreen()
                is Screen.TextField -> TextFieldScreen()
                is Screen.Buttons -> ExploreButtonsScreen()
                is Screen.ProgressIndicator -> ProgressIndicatorScreen()
                is Screen.AlertDialog -> AlertDialogScreen()
            }
        }
    }
}