package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.ui.comments
import com.example.dotascreen.ui.theme.AppTheme

const val rating: Float = 4.5f

@Composable
fun DotaScreen() {
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier
            .fillMaxSize(),
        ) {
        item {
            DotaScreenHeader()
        }
        item {
            ScrollableChipsRow(
                list = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
                modifier = Modifier.padding(top = 91.dp, bottom = 30.dp),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
            DotaDescription()
        }
        item {
            Box(
                modifier = Modifier.padding(
                    top = 18.dp,
                    bottom = 24.dp
                )
            ) {
                VideoPreviewRow(
                    previewResList = listOf(
                        R.drawable.bg_video_preview_1,
                        R.drawable.bg_video_preview_2
                    ),
                    contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
                    modifier = Modifier.height(128.dp)
                )
            }
        }
        item {
            ReviewsAndRatingsBlock()
        }
        itemsIndexed(comments) { index, item ->
            CommentBlock(
                item,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 16.dp
                    )
            )
            if (index < comments.lastIndex) {
                Divider(
                    color = AppTheme.BgColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(
                            top = 12.dp,
                            bottom = 10.dp,
                            start = 38.dp,
                            end = 38.dp
                        )
                )
            }
        }
        item {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AppTheme.ButtonColors.primary
                ),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp, end = 24.dp, top = 20.dp, bottom = 64.dp)
                    .height(64.dp)
            ) {
                Text(
                    text = stringResource(R.string.install),
                    style = AppTheme.TextStyle.Bold_20_24,
                    color = AppTheme.TextColors.button,
                    modifier = Modifier
                )
            }
        }
    }
}
