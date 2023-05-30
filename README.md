# Projeto de automação usando Java+Cucumber+Selenium+Gherkin
Projeto desenvolvido com o propósito de automatizar as funcionalidades da plataforma Swag Labs para treinamento de automação.

## Pre-Requisitos
* Java 11 JDK
* Maven 3.8.6
* Navegadores Web: Chrome; Edge e FireFox
* IDE: IntelliJ
* Plugins da IntelliJ IDE
    * Cucumber for Java
    * Gherkin
    * Ideolog
    * Selenium Plugin
    * Lombok
    * SonarLint

## Estrutura do Projeto.
| Diretório                   | Finalidade                                                                       |
|-----------------------------|----------------------------------------------------------------------------------|
| src\main\java\PageObjects   | Local para criar as pastas das pages visando manutenção do projeto               |
| src\main\java\steps         | Local para criar as classes que representam os steps definition do cucumber      |
| src\main\java\utils         | Local para armazenar as classes de configuração base do projeto                  |
| src\test\java\runner        | Local que armazena a classe responsável pela execução do projeto                 |
| src\test\resources          | Local que armazena global properties e properties de relatórios,                 |  
| src\test\resources\drivers  | Local que armazena os drivers de navegador                                       |
| src\test\resources\features | Local que armazena as features de teste (cenários de testes em linguagem Gherkin |
| teste                       | Local que armazena as features de teste (cenários de testes em linguagem Gherkin |