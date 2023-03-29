package com.localiza.designsystem.lib.brands.default

import androidx.compose.ui.graphics.Color
import com.localiza.designsystem.lib.LDSColors
import com.localiza.designsystem.lib.theme.*
import com.localiza.designsystem.lib.theme.types.spacing.NumberThemeSpacing
import com.localiza.designsystem.lib.theme.types.spacing.ThemeSpacing

object BaseTheme: LDSTheme() {
    override var tokens: RawTokens = RawTokensBaseTheme()
}
class RawTokensBaseTheme() : RawTokens{
    override var color: ThemeColor = ThemeColorBaseTheme()
    override var spacing : ThemeSpacing = NumberThemeSpacing(8)
}

class ThemeColorBaseTheme: ThemeColor {
    override var accent: ThemeColorAccentVariants = ThemeColorAccentBaseThemeVariant()
    override var neutral: ThemeColorNeutralVariant = ThemeColorNeutralBaseThemeVariant()
}

class ThemeColorAccentBaseThemeVariant: ThemeColorAccentVariants{
    override var primary: ThemeColorAccent = ThemeColorAccentBaseThemePrimary()
    override var secondary: ThemeColorAccent = ThemeColorAccentBaseThemeSecondary()
    override var success: ThemeColorAccent = ThemeColorAccentBaseThemeSuccess()
    override var warning: ThemeColorAccent = ThemeColorAccentBaseThemeWarning()
    override var critical: ThemeColorAccent = ThemeColorAccentBaseThemeCritical()
    override var info: ThemeColorAccent = ThemeColorAccentBaseThemeInfo()
}

//PRIMARY
class ThemeColorAccentBaseThemePrimaryContrast: ThemeColorAccentContrast{
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

class ThemeColorAccentBaseThemePrimaryEmphasis: ThemeColorEmphasis{
    override var high: Color = LDSColors.green70
    override var low: Color = LDSColors.green5
    override var lower: Color = LDSColors.green0
    override var higher: Color = LDSColors.green100
}

class ThemeColorAccentBaseThemePrimaryState: ThemeColorState{
    override var activated: Color = LDSColors.green20
    override var disabled: Color = LDSColors.green20
    override var focused: Color = LDSColors.green100
    override var hovered: Color = LDSColors.green40
    override var pressed: Color = LDSColors.green60
}

class ThemeColorAccentBaseThemePrimary: ThemeColorAccent{
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentBaseThemePrimaryContrast()
    override var default: Color = LDSColors.green20
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentBaseThemePrimaryEmphasis()
    override var state: ThemeColorState = ThemeColorAccentBaseThemePrimaryState()
}

//SECONDARY
class ThemeColorAccentBaseThemeSecondaryContrast: ThemeColorAccentContrast{
    override var activated: Color = LDSColors.gray0
    override var disabled: Color = LDSColors.gray60
    override var default: Color = LDSColors.gray0
    override var focused: Color = LDSColors.black
    override var high: Color = LDSColors.gray0
    override var higher: Color = LDSColors.gray0
    override var hovered: Color = LDSColors.white
    override var low: Color = LDSColors.gray100
    override var lower: Color = LDSColors.gray100
    override var pressed: Color = LDSColors.white
}

class ThemeColorAccentBaseThemeSecondaryEmphasis: ThemeColorEmphasis{
    override var high: Color = LDSColors.black
    override var low: Color = LDSColors.gray70
    override var lower: Color = LDSColors.gray5
    override var higher: Color = LDSColors.black
}

class ThemeColorAccentBaseThemeSecondaryState: ThemeColorState{
    override var activated: Color = LDSColors.black
    override var disabled: Color = LDSColors.gray20
    override var focused: Color = LDSColors.gray40
    override var hovered: Color = LDSColors.gray90
    override var pressed: Color = LDSColors.gray80
}

class ThemeColorAccentBaseThemeSecondary: ThemeColorAccent{
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentBaseThemeSecondaryContrast()
    override var default: Color = LDSColors.black
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentBaseThemeSecondaryEmphasis()
    override var state: ThemeColorState = ThemeColorAccentBaseThemeSecondaryState()
}

//NEUTRAL
class ThemeColorNeutralBaseThemeVariant: ThemeColorNeutralVariant{
    override var gray: ThemeColorNeutral = ThemeColorNeutralBaseTheme()
}

class ThemeColorNeutralBaseTheme : ThemeColorNeutral{
    override var default: Color = LDSColors.white
    override var contrast: ThemeColorNeutralContrast = ThemeColorNeutralBaseThemeContrast()
    override var emphasis: ThemeColorEmphasis = ThemeColorNeutralBaseThemeEmphasis()
}

class ThemeColorNeutralBaseThemeContrast: ThemeColorNeutralContrast {
    override var default: Color = LDSColors.gray90
    override var high: Color = LDSColors.white
    override var higher: Color = LDSColors.black
    override var low: Color = LDSColors.black
    override var lower: Color = LDSColors.white
}

class ThemeColorNeutralBaseThemeEmphasis: ThemeColorEmphasis{
    override var high: Color = LDSColors.gray50
    override var higher: Color = LDSColors.gray80
    override var low: Color = LDSColors.gray30
    override var lower: Color = LDSColors.gray10
}

//SUCCESS
class ThemeColorAccentBaseThemeSuccess: ThemeColorAccent{
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentBaseThemeSuccessContrast()
    override var default: Color = LDSColors.mint60
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentBaseThemeSuccessEmphasis()
    override var state: ThemeColorState = ThemeColorAccentBaseThemeSuccessState()
}

class ThemeColorAccentBaseThemeSuccessContrast: ThemeColorAccentContrast{
    override var activated: Color = LDSColors.white
    override var disabled: Color = LDSColors.gray60
    override var default: Color = LDSColors.white
    override var focused: Color = LDSColors.white
    override var high: Color = LDSColors.white
    override var higher: Color = LDSColors.mint0
    override var hovered: Color = LDSColors.white
    override var low: Color = LDSColors.mint100
    override var lower: Color = LDSColors.mint100
    override var pressed: Color = LDSColors.white
}

class ThemeColorAccentBaseThemeSuccessEmphasis: ThemeColorEmphasis{
    override var high: Color = LDSColors.mint80
    override var low: Color = LDSColors.mint20
    override var lower: Color = LDSColors.mint0
    override var higher: Color = LDSColors.mint100
}

class ThemeColorAccentBaseThemeSuccessState: ThemeColorState {
    override var activated: Color = LDSColors.mint60
    override var disabled: Color = LDSColors.gray20
    override var focused: Color = LDSColors.mint100
    override var hovered: Color = LDSColors.mint80
    override var pressed: Color = LDSColors.mint100
}

//WARNING
class ThemeColorAccentBaseThemeWarning: ThemeColorAccent{
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentBaseThemeWarningContrast()
    override var default: Color = LDSColors.amber10
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentBaseThemeWarningEmphasis()
    override var state: ThemeColorState = ThemeColorAccentBaseThemeWarningState()
}

class ThemeColorAccentBaseThemeWarningContrast: ThemeColorAccentContrast{
    override var activated: Color = LDSColors.amber100
    override var disabled: Color = LDSColors.gray60
    override var default: Color = LDSColors.amber10
    override var focused: Color = LDSColors.amber0
    override var high: Color = LDSColors.black
    override var higher: Color = LDSColors.amber0
    override var hovered: Color = LDSColors.black
    override var low: Color = LDSColors.amber100
    override var lower: Color = LDSColors.amber100
    override var pressed: Color = LDSColors.black
}

class ThemeColorAccentBaseThemeWarningEmphasis: ThemeColorEmphasis{
    override var high: Color = LDSColors.amber30
    override var low: Color = LDSColors.amber5
    override var lower: Color = LDSColors.amber0
    override var higher: Color = LDSColors.amber100
}

class ThemeColorAccentBaseThemeWarningState: ThemeColorState {
    override var activated: Color = LDSColors.amber10
    override var disabled: Color = LDSColors.gray20
    override var focused: Color = LDSColors.amber100
    override var hovered: Color = LDSColors.amber30
    override var pressed: Color = LDSColors.amber50
}

//CRITICAL
class ThemeColorAccentBaseThemeCritical: ThemeColorAccent{
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentBaseThemeCriticalContrast()
    override var default: Color = LDSColors.red60
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentBaseThemeCriticalEmphasis()
    override var state: ThemeColorState = ThemeColorAccentBaseThemeCriticalState()
}

class ThemeColorAccentBaseThemeCriticalContrast: ThemeColorAccentContrast{
    override var activated: Color = LDSColors.white
    override var disabled: Color = LDSColors.gray60
    override var default: Color = LDSColors.white
    override var focused: Color = LDSColors.white
    override var high: Color = LDSColors.red0
    override var higher: Color = LDSColors.red0
    override var hovered: Color = LDSColors.white
    override var low: Color = LDSColors.red100
    override var lower: Color = LDSColors.red100
    override var pressed: Color = LDSColors.white
}

class ThemeColorAccentBaseThemeCriticalEmphasis: ThemeColorEmphasis{
    override var high: Color = LDSColors.red80
    override var low: Color = LDSColors.red20
    override var lower: Color = LDSColors.red0
    override var higher: Color = LDSColors.red100
}

class ThemeColorAccentBaseThemeCriticalState: ThemeColorState {
    override var activated: Color = LDSColors.red60
    override var disabled: Color = LDSColors.gray20
    override var focused: Color = LDSColors.red100
    override var hovered: Color = LDSColors.red80
    override var pressed: Color = LDSColors.red100
}

//INFO
class ThemeColorAccentBaseThemeInfo: ThemeColorAccent{
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentBaseThemeInfoContrast()
    override var default: Color = LDSColors.blue60
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentBaseThemeInfoEmphasis()
    override var state: ThemeColorState = ThemeColorAccentBaseThemeInfoState()
}

class ThemeColorAccentBaseThemeInfoContrast: ThemeColorAccentContrast{
    override var activated: Color = LDSColors.white
    override var disabled: Color = LDSColors.gray60
    override var default: Color = LDSColors.white
    override var focused: Color = LDSColors.white
    override var high: Color = LDSColors.white
    override var higher: Color = LDSColors.blue0
    override var hovered: Color = LDSColors.white
    override var low: Color = LDSColors.blue100
    override var lower: Color = LDSColors.blue100
    override var pressed: Color = LDSColors.white
}

class ThemeColorAccentBaseThemeInfoEmphasis: ThemeColorEmphasis{
    override var high: Color = LDSColors.blue80
    override var low: Color = LDSColors.blue20
    override var lower: Color = LDSColors.blue0
    override var higher: Color = LDSColors.blue100
}

class ThemeColorAccentBaseThemeInfoState: ThemeColorState {
    override var activated: Color = LDSColors.blue60
    override var disabled: Color = LDSColors.gray20
    override var focused: Color = LDSColors.blue100
    override var hovered: Color = LDSColors.blue80
    override var pressed: Color = LDSColors.blue100
}
