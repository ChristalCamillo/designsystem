package com.localiza.designsystem.lib
import androidx.compose.ui.graphics.Color

interface Theme{
    var tokens: RawTokens
}

interface RawTokens{
    var color: ThemeColor
}

interface ThemeColor{
    var accent: ThemeColorAccentVariants
    var neutral: ThemeColorNeutralVariant
}

interface ThemeColorAccentVariants{
    var primary: ThemeColorAccent
    var secondary: ThemeColorAccent
    var success: ThemeColorAccent
    var warning: ThemeColorAccent
    var critical: ThemeColorAccent
    var info: ThemeColorAccent
}

interface ThemeColorNeutralVariant {
    var gray: ThemeColorNeutral
}

interface ThemeColorAccent{
    var default: Color
    var state: ThemeColorState
    var contrast: ThemeColorAccentContrast
    var emphasis: ThemeColorEmphasis
}

interface ThemeColorNeutral{
    var default: Color
    var contrast: ThemeColorNeutralContrast
    var emphasis: ThemeColorEmphasis
}

interface ThemeColorState{
    var activated: Color
    var disabled: Color
    var focused: Color
    var hovered: Color
    var pressed: Color
}

interface ThemeColorEmphasis{
    var lower: Color
    var low: Color
    var high: Color
    var higher: Color
}

interface ThemeDefaultContrast{
    var default: Color
}

interface ThemeColorAccentContrast: ThemeDefaultContrast, ThemeColorState, ThemeColorEmphasis

interface ThemeColorNeutralContrast: ThemeDefaultContrast, ThemeColorEmphasis


