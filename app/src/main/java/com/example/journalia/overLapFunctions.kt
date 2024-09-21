package com.example.journalia

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val gradientColorlist = listOf(
    Color(0xFF11316a),
    Color(0xFF114553),
    Color(0xFF114553),
    Color(0xFF0f2e1f),
    Color(0xFF295c5d),
)

@Composable
fun gradient(
    isVerticalGradient: Boolean,
    colors:List<Color>
): Brush {
    val endOffset = if(isVerticalGradient){
        Offset(0f, Float.POSITIVE_INFINITY)
    }
    else{
        Offset(Float.POSITIVE_INFINITY,0f)
    }

    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )

}