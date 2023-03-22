package com.localiza.designsystem.theme

import androidx.compose.ui.graphics.Color

class ThemeBuilder(var theme: LDSTheme) {
    fun primaryAccentColor(color: ThemeColorAccent){
        this.theme.tokens.color.accent.primary = color
    }
    fun secondaryAccentColor(color: ThemeColorAccent){
        this.theme.tokens.color.accent.secondary = color
    }
    fun successAccentColor(color: ThemeColorAccent) {
        this.theme.tokens.color.accent.success = color
    }
    fun warningAccentColor(color: ThemeColorAccent){
        this.theme.tokens.color.accent.warning = color
    }
    fun criticalAccentColor(color: ThemeColorAccent){
        this.theme.tokens.color.accent.critical = color
    }
    fun infoAccentColor(color: ThemeColorAccent){
        this.theme.tokens.color.accent.info = color
    }
    fun grayNeutralColor(color: ThemeColorNeutral){
        this.theme.tokens.color.neutral.gray = color
    }

    fun build(): LDSTheme{
        return theme
    }
}