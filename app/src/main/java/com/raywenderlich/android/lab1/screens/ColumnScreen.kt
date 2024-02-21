package com.raywenderlich.android.lab1.screens

import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.router.Screen
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun ColumnScreen() {
    MyColumn()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}
        @Composable
        fun MyColumn() {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxSize()
            ) {
                THREE_ELEMENT_LIST.forEach { textResId ->
                    Text(
                        text = stringResource(id = textResId),

                        )
                }
            }
        }