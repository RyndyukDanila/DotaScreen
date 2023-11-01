package com.example.dotascreen.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
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
                Color("#44A9F43D".toColorInt())
        val border
            @Composable
            get() =
                Color("#1F2430".toColorInt())
        val divider
            @Composable
            get() =
                Color("#1A1F29".toColorInt())
    }

    object ButtonColors {
        val main
            @Composable
            get() =
                Color("#F4D144".toColorInt())
    }

    object TextColors {
        val primary
            @Composable
            get() =
                Color.White
        val secondary
            @Composable
            get() =
                Color("#EEF2FBB2".toColorInt())
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
                Color("#FFFFFF66".toColorInt())
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
    }
}