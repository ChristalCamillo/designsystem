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

private val localLDSThemeData = staticCompositionLocalOf<LDSThemeData> {
    error("No LDSTheme provided")
}
/**
Receive the tokens and make them available for use in themes
 */
object LDSAppTheme {
    val colors: ThemeColor
        @Composable
        @ReadOnlyComposable
        get() = localThemeColor.current
    val theme: LDSThemeData
        @Composable
        @ReadOnlyComposable
        get() = localLDSThemeData.current
}
/**
Creates a color scheme to be used in the material components
 */
fun ThemeColor.toMaterialColors(): ColorScheme {
    return lightColorScheme(
        primary = this.accent.primary.default,
        secondary = this.accent.secondary.default,
        error = this.accent.critical.default
    )
}
/**
This composable provides the theme for the underlying tree
 */
@Composable
@Suppress("FunctionNaming")
fun LDSTheme(
    theme: LDSThemeData,
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
        localLDSThemeData provides themeState,
        content = content
    )
}
