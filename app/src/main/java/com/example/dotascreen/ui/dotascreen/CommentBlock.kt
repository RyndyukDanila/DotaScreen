package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.ui.CommentUi
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun CommentBlock(
    commentUi: CommentUi,
    modifier: Modifier = Modifier
) {
    Column (modifier = modifier) {
        Row (verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(36.dp)
            ) {
                Image(
                    painter = painterResource(commentUi.user.avatar),
                    contentDescription = stringResource(R.string.description_profile_picture),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center)
                )
            }
            Column (
                modifier = Modifier
                    .padding(start = 16.dp)
                    .align(Alignment.CenterVertically),
                verticalArrangement = Arrangement.spacedBy(7.dp)
            ) {
                Text(
                    text = commentUi.user.name,
                    style = AppTheme.TextStyle.Regular_16_19,
                    color = AppTheme.TextColors.primary,
                    modifier = Modifier
                )
                Text(
                    text = commentUi.comment.date,
                    style = AppTheme.TextStyle.Regular_12_14,
                    color = AppTheme.TextColors.date,
                    modifier = Modifier
                )
            }
        }
        Text(
            text = commentUi.comment.text,
            style = AppTheme.TextStyle.Regular_12_20,
            color = AppTheme.TextColors.secondary,
            modifier = Modifier
                .padding(
                    top = 16.dp,
                    bottom = 16.dp
                )
        )
    }
}