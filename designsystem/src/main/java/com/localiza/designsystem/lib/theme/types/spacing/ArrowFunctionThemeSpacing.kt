package com.localiza.designsystem.lib.theme.types.spacing

class ArrowFunctionThemeSpacing(val spacingbreaksFunction: Function1<Int, Int>) : ThemeSpacing() {
    override fun spacing(value: Int): Int {
        return spacingbreaksFunction(value)
    }
}
