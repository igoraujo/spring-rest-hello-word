# Primeiros passos com Spring e Rest


## Sobre o Projeto

Este projeto é uma demonstração simples de uma API Java com [Spring Boot](https://spring.io/)

## Começando

Para cirar uma API Java com Spring Boot, siga o passo-a-passo abaixo:

## Tecnologias Usadas

 - Spring Boot 2.4.0
 - Spring 5.1.4.RELEASE
 - Spring Data JPA 2.1.4.RELEASE
 - H2 In-memory Database 1.4.197
 - Tomcat Embed 9.0.14
 - JUnit 4.12
 - Maven 3
 - Java 8

### Pré-requisitos

[Maven](https://maven.apache.org/download.cgi) instalado e a IDE [IntelliJ](https://www.jetbrains.com/pt-br/idea/download/) ou outra se sua preferência

### Estrutura de Arquivos

```
  spring-rest-hello-word
  .
  ├── .idea
  ├── .mvn
  ├── src/
  │   ├── main/
  │   │   ├── java/
  │   │   │   └── com.exemple.springresthelloword/
  │   │   │       ├── error/
  │   │   │       │   ├── BookNotFoundException.java
  │   │   │       │   ├── BookUnSupportedFieldPatchException.java
  │   │   │       │   └── CustomGlobalExceptionHandler.java
  │   │   │       ├── Book.java
  │   │   │       ├── BookController.java
  │   │   │       ├── BookRepository.java
  │   │   │       └── StartBookApplication.java
  │   │   └── resourse/
  │   └── test/
  │       └── java
  │           └── com.exemple.springresthelloword       
  ├── target/
  ├── mvnw
  ├── mvnw.cmd
  ├── pom.xml
  ├── spting-rest-hello-word
  └── README.md
```

## Start Project

Para iniciar seu projeto faça o pacote básico pelo [Spring Initializr](https://start.spring.io/)

Agora só clonar o repositório e ```<lets code/>```
