import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.dotascreen.ui.theme.FontFamily

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