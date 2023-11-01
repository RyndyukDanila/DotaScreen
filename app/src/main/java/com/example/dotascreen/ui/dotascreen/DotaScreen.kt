package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme

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
//            ScrollableChipsRow(
//                list = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
//                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
//                contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
//            )
            Text(
                text = stringResource(id = R.string.description),
                style = AppTheme.TextStyle.Regular_12_19,
                color = AppTheme.TextColors.secondary,
                modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 128.dp, bottom = 14.dp),
            )
        }
    }
}
