package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme
import com.gowtham.ratingbar.RatingBar
import com.gowtham.ratingbar.RatingBarConfig
import com.gowtham.ratingbar.RatingBarStyle

@Composable
fun ReviewsAndRatingsBlock() {
    Column {
        Text(
            text = stringResource(R.string.reviews),
            style = AppTheme.TextStyle.Bold_16_19,
            color = AppTheme.TextColors.primary,
            modifier = Modifier.padding(
                start = 24.dp,
                bottom = 12.dp
            )
        )
        Row (
            modifier = Modifier
                .padding(start = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = rating.toString(),
                style = AppTheme.TextStyle.Bold_48,
                color = AppTheme.TextColors.primary,
                modifier = Modifier
                    .padding(end = 16.dp)
            )
            Column (
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(8.dp)
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
                    text = stringResource(R.string.total_reviews),
                    style = AppTheme.TextStyle.Regular_12_14,
                    color = AppTheme.TextColors.secondary,
                    modifier = Modifier
                )
            }
        }
    }
}