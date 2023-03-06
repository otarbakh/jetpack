package com.example.jetpack

import androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult
import androidx.compose.ui.graphics.painter.Painter

data class StoryHighlight(
    val image: Painter,
    val text : String
)
