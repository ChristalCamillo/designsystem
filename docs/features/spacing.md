Os espaçamentos no android podem ser utilizados como margin e padding dos elementos.


## Modificando o espaçamento no Tema usando JepackCompose

Para adicionar um novo espaçamento que não seja o espaçamento que vem por default no tema você pode fazer da seguinte forma:
```kotlin
    ThemeBuilder().spacing(NumberThemeSpacing(8)).build()
``` 
Sendo que você pode passar um Int no construtor , um array de Int ou mesmo uma arrow function .
```kotlin
    ThemeBuilder().spacing(NumberThemeSpacing(4)).build() // Int
    ThemeBuilder().spacing(NumberArrayThemeSpacing(mutableMapOf(0 to 0,1 to 12, 2 to 14))).build() // Array de inteiros
    val themeSpacingFunction = ArrowFunctionThemeSpacing { num -> (num * 2) }
    ThemeBuilder().spacing(themeSpacingFunction).build() // Arrow Function
``` 

Por exemplo você passou que o espaçamento default do seu app vai ser 4 então quando a função spacing que temos dentro do tema for chamada passando .lds_spacing_2x , vai ser retornado um valor de 4*2= 8 CGFloat.
## Utilizando o tema
LDSTheme(theme = TemaCriado) {
    //utilizando o content que preferir
}
Onde TemaCriado vai ser a variavel que você irá popular com o ThemeBuilder().build() e mais as alterações desejadas como visto na seção anterior.
## Usando a função spacing dentro do tema usando JetpackCompose
```kotlin
let theme= ThemeBuilder().spacing(NumberThemeSpacing(10)).build()
 let spacing_2x = LDSAppTheme.theme.spacing(2).dp // o valor de spacing_2x será 20
```
Quando você passa um array como opção de espaçamentos você irá receber os espaçamentos pelo index do array. Caso o index não exista no array original o valor 0 será retornado
```kotlin
   
    let theme=ThemeBuilder().spacing(NumberArrayThemeSpacing(mutableMapOf(0 to 0,1 to 12, 2 to 14))).build() // Array de inteiros
   let spacing_2x = LDSAppTheme.theme.spacing(2).dp // o valor de spacing_2x será 14
``` 
No caso da closure , a função presente na closure será executada
```kotlin
   
   val themeSpacingFunction = ArrowFunctionThemeSpacing { num -> (num * 2) }
    ThemeBuilder().spacing(themeSpacingFunction).build()
   LDSAppTheme.theme.spacing(2).dp // o valor de 2 será 4
``` 

Se você precisar de um array com todos os espaçamentos , por default é retornado um array de 8 itens.Os valores de cada item vai seguir a mesma logica acima.
```kotlin

LDSAppTheme.theme.spacingTokens()
```
## XML - Alterando os valores de espaçamento do tema
```xml
  <dimen name="lds_spacing_0x">0dp</dimen>
    <dimen name="lds_spacing_1x">8dp</dimen>
    <dimen name="lds_spacing_2x">16dp</dimen>
    <dimen name="lds_spacing_3x">24dp</dimen>
    <dimen name="lds_spacing_4x">32dp</dimen>
    <dimen name="lds_spacing_5x">40dp</dimen>
    <dimen name="lds_spacing_6x">48dp</dimen>
    <dimen name="lds_spacing_7x">56dp</dimen>
    <dimen name="lds_spacing_8x">64dp</dimen>
    <dimen name="lds_spacing_9x">72dp</dimen>
    <dimen name="lds_spacing_10x">80dp</dimen>
    <dimen name="lds_spacing_11x">88dp</dimen>
    <dimen name="lds_spacing_12x">96dp</dimen>
```
    altere qualquer um desses valores para que reflita em seu tema

## Usando a função spacing dentro do tema usando XML
 Para utilizar qualquer propriedade acima em seus layout xml , faça como abaixo 
```xml
<Button
        android:id="@+id/btnActivity"
        android:layout_margin="?lds_spacing_1x"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />

```
chame a propriedade dessa forma ?lds_spacing_1x nas propriedades que quiser utilizar o espaçamento
## Features

* [Cores](color.md)
