package com.raywenderlich.android.lab1.screens

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.raywenderlich.android.lab1.router.Screen


@Composable
fun ScaffoldScreen(){
    MyScaffold()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}
@SuppressLint("UnusedMaterialScaffoldPaddingParametr", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyScaffold() {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val scope: CoroutineScope = rememberCoroutineScope()

    Scaffold (
        scaffoldState = scaffoldState,
        contentColor = colorResource(id = R.color.colorPrimary),
        content = {
            MyRow()
        },
        topBar = { MyTopAppBar(scaffoldState = scaffoldState,scope = scope) },
        bottomBar = { MyBottomAppBar()},
        drawerContent = { MyColumn()}
    )
}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope){
    val drawerState = scaffoldState.drawerState

    TopAppBar(
        navigationIcon = {
            IconButton(content = {
                Icon(
                    Icons.Default.Menu,
                    tint = Color.White,
                    contentDescription = stringResource(id = R.string.menu)
                )
            },
                onClick = {
                    scope.launch { if (drawerState.isClosed) drawerState.open() else drawerState.close() }
                }
            )
        },
        title = { Text(text = stringResource(id = R.string.myComposeApp), color = Color.White) },
        backgroundColor = colorResource(id = R.color.colorPrimary)
    )
}

@Composable
fun MyBottomAppBar(){
    BottomAppBar (
        content = {},
        backgroundColor = colorResource(id = R.color.colorPrimary)
    )
}