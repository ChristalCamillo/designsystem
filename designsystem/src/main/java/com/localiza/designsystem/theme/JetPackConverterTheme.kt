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

private val LocalThemeSpacing = staticCompositionLocalOf<ThemeSpacing> {
    error("No ThemeColor provided")
}

object LDSAppTheme {
    val colors: ThemeColor
        @Composable
        @ReadOnlyComposable
        get() = LocalThemeColor.current
    val spacing : ThemeSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalThemeSpacing.current
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
    val spacing = theme.tokens.spacing
    val themeSpacingState = remember(
        spacing
    ) {
        spacing
    }
    CompositionLocalProvider(LocalThemeColor  provides themeColorState,
                                     LocalThemeSpacing provides    themeSpacingState,
        content = content)
}