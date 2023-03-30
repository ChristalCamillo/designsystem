package com.localiza.designsystem.theme

import com.localiza.designsystem.lib.theme.ThemeBuilder
import com.localiza.designsystem.lib.theme.types.spacing.ArrowFunctionThemeSpacing
import com.localiza.designsystem.lib.theme.types.spacing.NumberArrayThemeSpacing
import com.localiza.designsystem.lib.theme.types.spacing.NumberThemeSpacing
import org.junit.Assert
import org.junit.Test

class ThemeBuilderTest {
    private val themeSpacingNumber = NumberThemeSpacing(8)
    private val themeSpacingArray = NumberArrayThemeSpacing(mutableMapOf(0 to 0, 1 to 12, 2 to 14))
    private val themeSpacingFunction = ArrowFunctionThemeSpacing { num -> num * 2 }
    @Test
    fun testBuildChangeSpace() {
        val theme = ThemeBuilder().spacing(themeSpacingNumber).build()
        assert(theme.tokens.spacing is NumberThemeSpacing)
        val themeSpacing = theme.tokens.spacing as NumberThemeSpacing
        assert(themeSpacing.spacingBreak == 8)
        val array = theme.spacingTokens()
        assert(array[0] == 0)
        assert(array[5] == 40)
        assert(array[2] == 16)
    }
    @Test
    fun testThemeSpacingHandlerShouldReturnSpacing() {
        val theme = ThemeBuilder().spacing(themeSpacingNumber).build()
        val numberSpacingResult = theme.spacing(2)
        Assert.assertEquals(2 * 8, numberSpacingResult)
    }
    @Test
    fun testThemeSpacingHandlerShouldReturnSpacingWhenSpacingIsArray() {
        val theme = ThemeBuilder().spacing(themeSpacingArray).build()
        val arraySpacingResult = theme.spacing(0)
        Assert.assertEquals(0, arraySpacingResult)
    }
    @Test
    fun testThemeSpacingHandlerShouldReturnSpacingWhenSpacingIsClosure() {
        val theme = ThemeBuilder().spacing(themeSpacingFunction).build()
        val functionSpacingResult = theme.spacing(1)
        Assert.assertEquals(2, functionSpacingResult)
    }
    @Test
    fun testBuildChangeSpacingWithArrayAndReturnElement() {
        val theme = ThemeBuilder().spacing(themeSpacingArray).build()
        assert(theme.tokens.spacing is NumberArrayThemeSpacing)
        val array = theme.spacingTokens()
        assert(array[1] == 12)
        assert(array[2] == 14)
        assert(array[3] == 0)
    }
    @Test
    fun testBuildChangeSpacingWithFunctionAndReturnElement() {
        val theme = ThemeBuilder().spacing(themeSpacingFunction).build()
        assert(theme.tokens.spacing is ArrowFunctionThemeSpacing)
        val array = theme.spacingTokens()
        assert(array[1] == 2)
        assert(array[3] == 6)
    }
}
