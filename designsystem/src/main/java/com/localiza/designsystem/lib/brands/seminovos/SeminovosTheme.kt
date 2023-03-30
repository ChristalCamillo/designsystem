package com.localiza.designsystem.lib.brands.default

import androidx.compose.ui.graphics.Color
import com.localiza.designsystem.lib.colors.LDSColors
import com.localiza.designsystem.lib.theme.LDSTheme
import com.localiza.designsystem.lib.theme.ThemeBuilder
import com.localiza.designsystem.lib.theme.ThemeColorAccent
import com.localiza.designsystem.lib.theme.ThemeColorAccentContrast
import com.localiza.designsystem.lib.theme.ThemeColorEmphasis
import com.localiza.designsystem.lib.theme.ThemeColorState

object SeminovosTheme : LDSTheme() {
    init {
        tokens = ThemeBuilder().primaryAccentColor(ThemeColorAccentSeminovosThemePrimary()).build().tokens
    }
}

class ThemeColorAccentSeminovosThemePrimary : ThemeColorAccent {
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentSeminovosThemePrimaryContrast()
    override var default: Color = LDSColors.orange60
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentSeminovosThemePrimaryEmphasis()
    override var state: ThemeColorState = ThemeColorAccentSeminovosThemePrimaryState()
}

// PRIMARY
class ThemeColorAccentSeminovosThemePrimaryContrast : ThemeColorAccentContrast {
    override var activated: Color = LDSColors.green100
    override var disabled: Color = LDSColors.gray60
    override var default: Color = LDSColors.green100
    override var focused: Color = LDSColors.white
    override var high: Color = LDSColors.white
    override var higher: Color = LDSColors.green0
    override var hovered: Color = LDSColors.green100
    override var low: Color = LDSColors.green100
    override var lower: Color = LDSColors.green100
    override var pressed: Color = LDSColors.white
}

class ThemeColorAccentSeminovosThemePrimaryEmphasis : ThemeColorEmphasis {
    override var high: Color = LDSColors.green70
    override var low: Color = LDSColors.green5
    override var lower: Color = LDSColors.green0
    override var higher: Color = LDSColors.green100
}

class ThemeColorAccentSeminovosThemePrimaryState : ThemeColorState {
    override var activated: Color = LDSColors.orange60
    override var disabled: Color = LDSColors.green20
    override var focused: Color = LDSColors.green100
    override var hovered: Color = LDSColors.green40
    override var pressed: Color = LDSColors.green60
}
