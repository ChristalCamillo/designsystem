package com.localiza.designsystem.theme.types.spacing

import com.localiza.designsystem.lib.theme.types.spacing.ArrowFunctionThemeSpacing
import com.localiza.designsystem.lib.theme.types.spacing.NumberArrayThemeSpacing
import com.localiza.designsystem.lib.theme.types.spacing.NumberThemeSpacing
import org.junit.Assert.assertEquals
import org.junit.Test

class ThemeSpacingTest {
    private val themeSpacingNumber = NumberThemeSpacing(8)
    private val themeSpacingArray = NumberArrayThemeSpacing(mutableMapOf(0 to 0,1 to 12, 2 to 14))
    private val themeSpacingFunction = ArrowFunctionThemeSpacing { num -> (num * 2) }
    @Test
    fun testThemeSpacingHandlerShouldReturnSpacing(){
        var result = themeSpacingNumber.spacing(2)
        assertEquals(16,result)
        result = themeSpacingArray.spacing(2)
        assertEquals(14,result)
        result = themeSpacingFunction.spacing(2)
        assertEquals(4,result)
    }

    @Test
    fun testThemeSpacingShouldReturnTokenFromNumberSpacing(){
        var result = themeSpacingNumber.themeSpacingToTokens(3)
        var  expectedResult: MutableMap<Int,Int> = mutableMapOf(
        0 to 0,
        1 to 8,
        2 to 16
        )
        assertEquals(expectedResult,result)
    }

    @Test
    fun testThemeSpacingShouldReturnTokensFromArraySpacing(){
        var result = themeSpacingArray.themeSpacingToTokens(4)
        var  expectedResult: MutableMap<Int,Int> = mutableMapOf(
            0 to 0,
            1 to 12,
            2 to 14,
            3 to 0
        )
        assertEquals(expectedResult,result)
    }

    @Test
    fun testThemeSpacingShouldReturnTokensFromFunctionSpacing(){
        var result = themeSpacingFunction.themeSpacingToTokens(3)
        var  expectedResult: MutableMap<Int,Int> = mutableMapOf(
            0 to 0,
            1 to 2,
            2 to 4
        )
        assertEquals(expectedResult,result)
    }
}