package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R

@Composable
fun VideoPreviewRow(previewResList: List<Int>, contentPadding: PaddingValues, modifier: Modifier) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ) {
        items(previewResList) { image ->
            Image(
                painter = painterResource(image),
                contentDescription = "",
                modifier = modifier.clip(shape = RoundedCornerShape(14.dp)
                )
            )
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