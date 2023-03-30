package com.localiza.designsystem.lib.theme

import com.localiza.designsystem.lib.brands.default.BaseTheme
import com.localiza.designsystem.lib.theme.types.spacing.ThemeSpacing

class ThemeBuilder(private var theme: LDSThemeData = BaseTheme) {
    fun primaryAccentColor(color: ThemeColorAccent): ThemeBuilder {
        this.theme.tokens.color.accent.primary = color
        return this
    }
    fun secondaryAccentColor(color: ThemeColorAccent): ThemeBuilder {
        this.theme.tokens.color.accent.secondary = color
        return this
    }
    fun successAccentColor(color: ThemeColorAccent): ThemeBuilder {
        this.theme.tokens.color.accent.success = color
        return this
    }
    fun warningAccentColor(color: ThemeColorAccent): ThemeBuilder {
        this.theme.tokens.color.accent.warning = color
        return this
    }
    fun criticalAccentColor(color: ThemeColorAccent): ThemeBuilder {
        this.theme.tokens.color.accent.critical = color
        return this
    }
    fun infoAccentColor(color: ThemeColorAccent): ThemeBuilder {
        this.theme.tokens.color.accent.info = color
        return this
    }
    fun grayNeutralColor(color: ThemeColorNeutral): ThemeBuilder {
        this.theme.tokens.color.neutral.gray = color
        return this
    }
    fun spacing(themeSpacing: ThemeSpacing): ThemeBuilder {
        this.theme.tokens.spacing = themeSpacing
        return this
    }

    fun build(): LDSThemeData {
        return theme
    }
}
