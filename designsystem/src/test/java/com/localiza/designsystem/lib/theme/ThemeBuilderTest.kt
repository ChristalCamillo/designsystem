package com.localiza.designsystem.lib.theme

import com.localiza.designsystem.lib.brands.default.BaseTheme
import com.localiza.designsystem.lib.brands.default.SeminovosTheme
import com.localiza.designsystem.lib.brands.default.SeminovosTheme.tokens
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

internal class ThemeBuilderTest {
    private val primaryAccentColor: ThemeColorAccent = mockk(relaxed = true, relaxUnitFun = true)
    private val secondaryAccentColor: ThemeColorAccent = mockk(relaxed = true, relaxUnitFun = true)
    private val successAccentColor: ThemeColorAccent = mockk(relaxed = true, relaxUnitFun = true)
    private val warningAccentColor: ThemeColorAccent = mockk(relaxed = true, relaxUnitFun = true)
    private val criticalAccentColor: ThemeColorAccent = mockk(relaxed = true, relaxUnitFun = true)
    private val infoAccentColor: ThemeColorAccent = mockk(relaxed = true, relaxUnitFun = true)
    private val defaultTheme: LDSTheme = BaseTheme
    private val seminovosTheme: LDSTheme = SeminovosTheme
    private lateinit var themeBuilder: ThemeBuilder

    @Before
    fun setup() {
        themeBuilder = ThemeBuilder()
    }

    @Test
    fun `check if default theme is constructed`() {
        var theme = ThemeBuilder().build()
        assertEquals(defaultTheme.tokens, theme.tokens)
        assertEquals(defaultTheme.tokens.color, theme.tokens.color)
    }

    @Test
    fun `check if seminovos theme is constructed`() {
        var theme = ThemeBuilder(seminovosTheme).build()
        assertEquals(seminovosTheme.tokens, theme.tokens)
        assertEquals(seminovosTheme.tokens.color, theme.tokens.color)
    }

    @Test
    fun `GIVEN themeBuilder WHEN change colorAccent primary THEN check if is color is set`() {
        // GIVEN:
        // WHEN:
        var theme = themeBuilder.primaryAccentColor(primaryAccentColor).build()
        // THEN:
        assertEquals(primaryAccentColor, theme.tokens.color.accent.primary)
    }

    @Test
    fun `GIVEN themeBuilder WHEN change colorAccent secondary THEN check if is color is set`() {
        // GIVEN:
        // WHEN:
        var theme = themeBuilder.secondaryAccentColor(secondaryAccentColor).build()
        // THEN:
        assertEquals(secondaryAccentColor, theme.tokens.color.accent.secondary)
    }

    @Test
    fun `GIVEN themeBuilder WHEN change colorAccent success THEN check if is color is set`() {
        // GIVEN:
        // WHEN:
        var theme = themeBuilder.successAccentColor(successAccentColor).build()
        // THEN:
        assertEquals(successAccentColor, theme.tokens.color.accent.success)
    }

    @Test
    fun `GIVEN themeBuilder WHEN change colorAccent warning THEN check if is color is set`() {
        // GIVEN:
        // WHEN:
        var theme = themeBuilder.warningAccentColor(warningAccentColor).build()
        // THEN:
        assertEquals(warningAccentColor, theme.tokens.color.accent.warning)
    }

    @Test
    fun `GIVEN themeBuilder WHEN change colorAccent critical THEN check if is color is set`() {
        // GIVEN:
        // WHEN:
        var theme = themeBuilder.criticalAccentColor(criticalAccentColor).build()
        // THEN:
        assertEquals(criticalAccentColor, theme.tokens.color.accent.critical)
    }

    @Test
    fun `GIVEN themeBuilder WHEN change colorAccent info THEN check if is color is set`() {
        // GIVEN:
        // WHEN:
        var theme = themeBuilder.infoAccentColor(infoAccentColor).build()
        // THEN:
        assertEquals(infoAccentColor, theme.tokens.color.accent.info)
    }
}
