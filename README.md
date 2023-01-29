# Projeto do curso: Testes Unitários com JUnit (Algaworks)

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) e [Maven](https://maven.apache.org/download.cgi). 
Além disto é bom ter um editor para trabalhar com o código como [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)

### 🎲 Rodando os testes do projeto

```bash
# Clone este repositório
$ git clone <https://github.com/tonyblack10/curso-junit-algaworks>

# Vá para a pasta server
$ cd curso-junit-algaworks

# Executando os testes com o maven
$ mvn test

# Executando os testes e gerando relatório de cobertura com o maven e Jacoco
$ mvn test jacoco:report

```

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [JUnit 5](https://junit.org/junit5/)
- [Maven](https://maven.apache.org/)
- [Mockito](https://site.mockito.org/)
- [Jacoco](https://www.eclemma.org/jacoco/)
- [AssertJ](https://joel-costigliola.github.io/assertj/)
