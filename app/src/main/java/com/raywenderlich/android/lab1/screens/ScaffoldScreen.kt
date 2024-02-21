package com.raywenderlich.android.lab1.screens

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun ScaffoldScreen() {
    MyScaffold()
    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}
        @Composable
        fun MyScaffold() {
//TODO write your code here
        }
            @Composable
            fun MyTopAppBar(scaffoldState: ScaffoldState) {
//TODO write your code here
            }
                @Composable
                fun MyBottomAppBar() {
//TODO write your code here
                }