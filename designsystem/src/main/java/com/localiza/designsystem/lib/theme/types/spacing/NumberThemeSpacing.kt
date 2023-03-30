package com.localiza.designsystem.lib.theme.types.spacing

class NumberThemeSpacing(val spacingBreak: Int) : ThemeSpacing() {
    override fun spacing(value: Int): Int {
        return spacingBreak * value
    }
}
