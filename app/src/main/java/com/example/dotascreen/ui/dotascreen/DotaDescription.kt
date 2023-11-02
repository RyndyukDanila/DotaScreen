package com.example.dotascreen.ui.dotascreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotascreen.R
import com.example.dotascreen.ui.theme.AppTheme

@Composable
fun DotaDescription() {
    Text(
        text = stringResource(id = R.string.description),
        style = AppTheme.TextStyle.Regular_12_19,
        color = AppTheme.TextColors.secondary,
        modifier = Modifier.padding(start = 24.dp, end = 24.dp),
    )
}