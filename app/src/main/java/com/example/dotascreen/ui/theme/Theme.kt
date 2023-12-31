package com.example.dotascreen.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content
    )
}

object AppTheme {
    object BgColors {
        val primary
            @Composable
            get() =
                Color("#050B18".toColorInt())
        val tag
            @Composable
            get() =
                Color("#3D44A9F4".toColorInt())
        val border
            @Composable
            get() =
                Color("#1F2430".toColorInt())
        val divider
            @Composable
            get() =
                Color("#1A1F29".toColorInt())
        val activeStar
            @Composable
            get() =
                Color("#F4D144".toColorInt())
        val inactiveStar
            @Composable
            get() =
                Color("#282E3E".toColorInt())
        val shadow
            get() =
                Color("#050B18".toColorInt())
        val play
            @Composable
            get() =
                Color("#3DFFFFFF".toColorInt())
    }

    object ButtonColors {
        val primary
            @Composable
            get() =
                Color("#F4D144".toColorInt())
        val secondary
            @Composable
            get() =
                Color("#CE3226".toColorInt())
    }

    object TextColors {
        val primary
            @Composable
            get() =
                Color.White
        val secondary
            @Composable
            get() =
                Color("#B2EEF2FB".toColorInt())
        val tag
            @Composable
            get() =
                Color("#41A0E7".toColorInt())
        val message
            @Composable
            get() =
                Color("#A8ADB7".toColorInt())
        val date
            @Composable
            get() =
                Color("#66FFFFFF".toColorInt())
        val button
            @Composable
            get() =
                Color("#050B18".toColorInt())
    }

    object TextStyle {
        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Bold_16_19
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    lineHeight = 19.sp,
                    letterSpacing = 0.6.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Bold_20_24
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 24.sp,
                    letterSpacing = 0.6.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Bold_20_26
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 26.sp,
                    letterSpacing = 0.5.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Mono_10_12
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp,
                    lineHeight = 12.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_12_14
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    letterSpacing = 0.5.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_12_19
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_12_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    letterSpacing = 0.5.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_16_19
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    lineHeight = 19.sp,
                    letterSpacing = 0.5.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )

    }
}