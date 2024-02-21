package com.raywenderlich.android.lab1.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun BoxScreen() {
    MyBox()
    BackButtonHandler {
        FundamentalsRouter.navigateTo (Screen.Navigation)
    }
}
        @Composable
        fun MyBox(modifier: Modifier = Modifier,
                  contententModifier: Modifier = Modifier
                  ) {
            Box(modifier = modifier.fillMaxSize()) {
                Text(
                    text = stringResource(id = R.string.first),
                    fontSize = 22.sp,
                    modifier = contententModifier.align(Alignment.TopStart)
                )

                        Text ( text = stringResource(id = R.string.second),
                                fontSize = 22.sp,
                                modifier = contententModifier.align(Alignment.Center)
                        )
                                        Text(
                                            text = stringResource(id = R.string.third),
                                            fontSize = 22.sp,
                                            modifier = contententModifier.align(Alignment. BottomEnd)
                )
            }
    }