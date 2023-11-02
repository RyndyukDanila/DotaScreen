package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dotascreen.ui.CommentUi
import com.example.dotascreen.ui.theme.AppTheme


@Composable
fun CommentBlock(
    commentUi: CommentUi,
    modifier: Modifier = Modifier
) {
    Column (modifier = modifier) {
        Row {
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(36.dp)
            ) {
                Image(
                    painter = painterResource(commentUi.user.avatar),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Column (
                modifier = Modifier
                    .padding(start = 16.dp)
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
                        .padding(top = 6.dp)
                )
            }
        }
        Text(
            text = commentUi.comment.text,
            style = AppTheme.TextStyle.Regular_12_19,
            color = AppTheme.TextColors.secondary,
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    bottom = 16.dp
                )
        )
    }
}