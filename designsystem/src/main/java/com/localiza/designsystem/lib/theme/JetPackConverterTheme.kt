package com.localiza.designsystem.lib.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

private val localThemeColor = staticCompositionLocalOf<ThemeColor> {
    error("No ThemeColor provided")
}

private val localLDSTheme = staticCompositionLocalOf<LDSTheme> {
    error("No LDSTheme provided")
}

object LDSAppTheme {
    val colors: ThemeColor
        @Composable
        @ReadOnlyComposable
        get() = localThemeColor.current
    val theme: LDSTheme
        @Composable
        @ReadOnlyComposable
        get() = localLDSTheme.current
}

fun ThemeColor.toMaterialColors(): ColorScheme {
    return lightColorScheme(
        primary = this.accent.primary.default,
        secondary = this.accent.secondary.default,
        error = this.accent.critical.default
    )
}

@Composable
fun makeLDSTheme(
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
    CompositionLocalProvider(
        localThemeColor provides themeColorState,
        localLDSTheme provides themeState,
        content = content
    )
}
