package com.localiza.designsystem.theme

import android.content.Context
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.localiza.designsystem.theme.brands.default.BaseTheme
import com.localiza.designsystem.theme.types.spacing.ThemeSpacing

private val LocalThemeColor = staticCompositionLocalOf<ThemeColor> {
    error("No ThemeColor provided")
}

private val LocalLDSTheme = staticCompositionLocalOf<LDSTheme> {
    error("No LDSTheme provided")
}

object LDSAppTheme {
    val colors: ThemeColor
        @Composable
        @ReadOnlyComposable
        get() = LocalThemeColor.current
    val theme : LDSTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalLDSTheme.current
}

fun ThemeColor.toMaterialColors(): ColorScheme{
    return lightColorScheme(primary = this.accent.primary.default, secondary = this.accent.secondary.default, error = this.accent.critical.default)
}

@Composable
fun LDSTheme(
    theme: LDSTheme,
    content: @Composable () -> Unit,
) {
    val color = theme.tokens.color
    val themeColorState = remember(
        color
    ) {
        color
    }

    val themeState = remember(
        theme
    ) {
        theme
    }
    CompositionLocalProvider(LocalThemeColor  provides themeColorState,
        LocalLDSTheme provides    themeState,
        content = content)
}