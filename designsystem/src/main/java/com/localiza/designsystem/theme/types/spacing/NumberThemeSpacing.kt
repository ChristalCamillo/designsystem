package com.localiza.designsystem.theme.types.spacing

class NumberThemeSpacing(val spacingBreak: Int) : ThemeSpacing() {
    override fun spacing(value: Int): Int {
        return spacingBreak * value
    }


}