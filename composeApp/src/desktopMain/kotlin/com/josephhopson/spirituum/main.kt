package com.josephhopson.spirituum

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Spirtuum-KMP",
    ) {
        App()
    }
}