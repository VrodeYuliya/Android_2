package com.raywenderlich.android.lab1.screens

import androidx.compose.material.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import com.raywenderlich.android.lab1.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource

@Composable
fun AlertDialogScreen() {

    MyAlertDialog()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyAlertDialog() {
    val shouldShowDialog = remember { mutableStateOf(true) }

    if(shouldShowDialog.value) {
        AlertDialog(
            onDismissRequest = {
                shouldShowDialog.value = false
                FundamentalsRouter.navigateTo(Screen.Navigation)
            },
            title = { Text(text = stringResource(id = R.string.title_alertDialog)) },
            text = { Text(text = stringResource(id = R.string.alertDialog_about)) },
            confirmButton = {
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                    onClick = {
                        shouldShowDialog.value = false
                        FundamentalsRouter.navigateTo(Screen.Navigation)
                    }
                ) {
                    Text(
                        text = stringResource(id = R.string.massage_button),
                        color = Color.White
                    )
                }

            }
        )
    }
}