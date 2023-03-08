### com.localiza.monitoring
Biblioteca para designsystem de aplicações android no contexto da Localiza

## Requisitos
1.	minSdk = 21
2.	targetSdk = 33

### INSTALAÇÃO
Adicione esse maven repo em seu projeto ( no arquivo settings.gradle ou em seu build.gradle root dependendo das confis do seu projeto) :
```
maven {
            url 'https://localiza.pkgs.visualstudio.com/_packaging/LocalizaMobile/maven/v1'
            name 'LocalizaMobile'
            credentials {
                username="[USE AQUI A VARIAVEL DE AMBIENTE PARA O SEU NOME]"
                password="[USE AQUI A VARIAVEL DE AMBEINTE PARA O SEU TOKEN]"
            }
            authentication {
                basic(BasicAuthentication)
            }
        }
    
```
No build gradle do seu projeto adicione :
```
implementation(group: 'br.com.localiza', name: 'designSystem', version: '0.0.2-alpha')
```
## Features

* [Cores](features/cores.md)
