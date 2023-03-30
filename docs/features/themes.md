### Tema

Para Implementar um tema do design system no seu projeto veja abaixo:

## Utilizando o tema no JetpackCompose
Usando uma cor:
```
LDSAppTheme.colors.accent.primary.default
```
Setando a função de tema que engloba os componentes de Material Design (não há definição para tema light ou dark, apenas default)
```
@Composable
fun DesignsystemTheme(
    defaultTheme: LDSThemeData = SeminovosTheme,
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkTheme
        }
    }
LDSTheme(theme = defaultTheme) {
    MaterialTheme(
        colorScheme = LDSAppTheme.colors.toMaterialColors(),
        typography = Typography,
        content = content
    )
}
```
## Utilizando o tema XML

Acrescente diretamente no manifest do seu projeto:
```
<application
android:allowBackup="true"
android:icon="@mipmap/ic_launcher"
android:label="@string/app_name"
android:roundIcon="@mipmap/ic_launcher_round"
android:supportsRtl="true"
android:theme="@style/DefaultTheme">
```
Via activity
```
<activity
android:name=".MainActivity"
android:exported="true"
android:label="@string/app_name"
android:theme="@style/Theme.Designsystem">


<meta-data
android:name="android.app.lib_name"
android:value="" />
</activity>
```
Para usar só uma cor:
```
android:background="?ColorAccentWarningActivated"
```

## Criando um novo tema

O Tema Seminovos é um exemplo de criação de tema a partir do tema default:
```
object SeminovosTheme: LDSTheme() {
   init{
       tokens = ThemeBuilder().primaryAccentColor(ThemeColorAccentSeminovosThemePrimary()).build(
       ).tokens
   }
}

class ThemeColorAccentSeminovosThemePrimary: ThemeColorAccent {
    override var contrast: ThemeColorAccentContrast = ThemeColorAccentSeminovosThemePrimaryContrast()
    override var default: Color = LDSColors.orange60
    override var emphasis: ThemeColorEmphasis = ThemeColorAccentSeminovosThemePrimaryEmphasis()
    override var state: ThemeColorState = ThemeColorAccentSeminovosThemePrimaryState()
}
```
Para criar via XML, certificar de que o tema herde de DefaultTheme:
```
<resources>
    <style name="Theme.Designsystem" parent="DefaultTheme" />
</resources>
```

## Features

* [Cores](color.md)
* [Espaçamento](spacing.md)