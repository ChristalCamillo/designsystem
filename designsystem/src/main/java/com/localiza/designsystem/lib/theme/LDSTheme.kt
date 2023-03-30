package com.localiza.designsystem.lib.theme

/**
LDSTheme  is the class that will represent the themes in this framework
 */
open class LDSTheme : Theme {
    override lateinit var tokens: RawTokens
    /**
     Calculate the spacing based on the item passed in the constructor
     - Parameter num: Int is the value that will be multiplied the ThemeSpacing
     When the  ThemeSpacing is:
     - numberThemeSpacing - the value of will be multiplied with the ThemeSpacing value, example: 8*2
     - numberArrayThemeSpacing- will return the value of that house within the array passed example
     ThemeSpacingValue (spacing_2x)  - irá retornar numbervalue[2]
     - ArrawFunctionThemeSpacing  - will make the function inside the passed closure
     */
    fun spacing(num: Int): Int {
        return tokens.spacing.spacing(num)
    }
    /**
     Returns a list with 8 items in the array , based on the spacing passed in the theme constructor
     */
    fun spacingTokens(): MutableMap<Int, Int> {
        return tokens.spacing.themeSpacingToTokens()
    }
}
