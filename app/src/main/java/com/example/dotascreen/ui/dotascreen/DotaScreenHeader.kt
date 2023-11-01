package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme

@Composable
fun DotaScreenHeader (
    modifier: Modifier = Modifier,
) {
    HeaderBackground(
        painter = painterResource(R.drawable.bg_header),
        modifier = modifier.fillMaxSize(),
    ) {

    }
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    ConstraintLayout(modifier = modifier) {
        val (icon, image, text) = createRefs()

        Image(
            painter = painter,
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = modifier
        )

        Card (
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            ),
            border = BorderStroke(
                width = 2.dp,
                AppTheme.BgColors.border
            ),
            content = {
                DotaLogo()
            },
            modifier = Modifier.constrainAs(icon) {
                bottom.linkTo(parent.bottom, margin = (-50).dp)
                start.linkTo(parent.start, margin = (22).dp)
            }
        )
    }
}

@Composable
private fun DotaLogo() {
    Image(painter = painterResource(
        R.drawable.dota_logo),
        contentDescription = "",
        Modifier
            .padding(all = 15.dp)
            .width(54.dp)
            .height(54.dp)
    )
}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        DotaScreenHeader()
    }
}