package com.localiza.designsystem.theme.types.spacing

abstract class ThemeSpacing{
    abstract fun spacing(value:Int): Int
    fun themeSpacingToTokens(breaks: Int = 8): MutableMap<Int, Int> {
        val tokens: MutableMap<Int, Int> = mutableMapOf()
        for (i in 0 until breaks) {
            tokens[i] = spacing(i)
        }
        return tokens
    }
}