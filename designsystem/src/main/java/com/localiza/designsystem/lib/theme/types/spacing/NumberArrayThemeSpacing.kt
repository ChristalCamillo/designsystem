package com.localiza.designsystem.lib.theme.types.spacing

class NumberArrayThemeSpacing(val spacingbreaks: MutableMap<Int, Int>): ThemeSpacing() {
    override fun spacing(value: Int): Int {
        return if (value < spacingbreaks.size) spacingbreaks[value]!! else 0
    }
}