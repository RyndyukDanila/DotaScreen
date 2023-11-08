package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.dotascreen.ui.theme.AppTheme

@Composable
fun ScrollableChipsRow(
    list: List<String>,
    modifier: Modifier,
    contentPadding: PaddingValues
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier,
    ) {
        items(list) { item ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = AppTheme.BgColors.tag,
                    disabledContainerColor = AppTheme.BgColors.tag,
                ),
                shape = RoundedCornerShape(10.dp),
            ) {
                Text(
                    text = item,
                    style = AppTheme.TextStyle.Mono_10_12,
                    color = AppTheme.TextColors.tag,
                    modifier = Modifier.padding(
                        vertical = 5.dp,
                        horizontal = 10.dp
                    )
                )
            }
        }
    }
}