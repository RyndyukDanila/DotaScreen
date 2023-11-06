package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme

@Composable
fun VideoPreviewRow(
    previewResList: List<Int>,
    contentPadding: PaddingValues,
    modifier: Modifier,
    ){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ) {
        items(previewResList) { image ->
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(image),
                    contentDescription = "",
                    modifier = modifier.clip(
                        shape = RoundedCornerShape(14.dp)
                    )
                )
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(AppTheme.BgColors.play),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Rounded.PlayArrow,
                        contentDescription = "Play Video",
                        tint = Color.White
                    )
                }

            }
        }
    }
}

@Preview
@Composable
fun VideoPreviewRowPreview() {
    VideoPreviewRow(
        previewResList = listOf(
            R.drawable.bg_video_preview_1,
            R.drawable.bg_video_preview_2
        ),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
        modifier = Modifier.height(128.dp)
    )
}