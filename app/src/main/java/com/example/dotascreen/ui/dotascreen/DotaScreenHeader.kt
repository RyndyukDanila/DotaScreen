package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme
import com.gowtham.ratingbar.RatingBar
import com.gowtham.ratingbar.RatingBarConfig
import com.gowtham.ratingbar.RatingBarStyle

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
        val (icon, image) = createRefs()

        Image(
            painter = painter,
            contentDescription = stringResource(R.string.description_game_image),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(300.dp)
                .fillMaxSize()
                .drawWithCache {
                    val gradient = Brush.verticalGradient(
                        colors = listOf(AppTheme.BgColors.shadow, Color.Transparent),
                        endY = size.height / 3
                    )
                    onDrawWithContent {
                        drawContent()
                        drawRect(gradient, blendMode = BlendMode.Multiply)
                    }
                }
        )
        
        Row (
            modifier = Modifier
                .constrainAs(icon) {
                bottom.linkTo(parent.bottom, margin = (-64).dp)
                start.linkTo(parent.start, margin = (22).dp)
            }
        ) {
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
            )
            Column (
                modifier = Modifier
                    .padding(top = 34.dp, start = 12.dp)
            ) {
                Text(
                    text = stringResource(R.string.title),
                    style = AppTheme.TextStyle.Bold_20_26,
                    color = AppTheme.TextColors.primary,
                    modifier = Modifier
                )
                Row (
                    Modifier
                        .padding(top = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RatingBar(
                        value = rating,
                        onValueChange = {},
                        onRatingChanged = {},
                        config = RatingBarConfig()
                            .style(RatingBarStyle.Normal)
                            .size(12.dp)
                            .activeColor(AppTheme.BgColors.activeStar)
                            .inactiveColor(AppTheme.BgColors.inactiveStar)
                        )
                    Text(
                        text = stringResource(R.string.number_of_reviews),
                        style = AppTheme.TextStyle.Regular_12_14,
                        color = AppTheme.TextColors.date,
                        modifier = Modifier
                            .padding(
                                start = 10.dp
                            )
                    )
                }

            }
        }
        
    }
}

@Composable
private fun DotaLogo() {
    Image(painter = painterResource(
        R.drawable.dota_logo),
        contentDescription = stringResource(R.string.description_game_logo),
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