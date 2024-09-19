
# Desafio Contador - Java

Este projeto consiste em um programa simples em Java que solicita dois números inteiros como parâmetros e realiza uma contagem entre eles. Se o primeiro número for maior que o segundo, o programa lança uma exceção personalizada.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

1. **Contador**: Classe responsável por receber os parâmetros e realizar a contagem.
2. **ParametrosInvalidosException**: Classe que define uma exceção personalizada que é lançada quando os parâmetros não são válidos.

## Classe `Contador`

A classe `Contador` contém o método principal `main` e o método estático `contar`.

- **Método `main`**: Este método utiliza um `Scanner` para capturar dois números inteiros do usuário. Caso o primeiro número seja maior que o segundo, ele chama uma exceção `ParametrosInvalidosException` que será capturada e tratada dentro do bloco `try-catch`. O loop continua até que dois números válidos sejam inseridos.

- **Método `contar`**: Este método realiza a contagem do número inicial até o número final. Se o número inicial for maior que o final, a exceção `ParametrosInvalidosException` é lançada.

### Exemplo de Uso

O programa solicita dois números inteiros do usuário e imprime os números entre eles.

1. Se o usuário digitar o número `5` e depois o número `10`, o programa imprimirá:

```
Imprimindo o número 0
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
```

2. Se o usuário digitar um número inicial maior que o final (por exemplo, `10` e `5`), o programa exibirá a mensagem de erro:

```
Parametros invalidos. O parametro um não pode ser maior que o parametro dois.
```

## Classe `ParametrosInvalidosException`

Esta classe estende a classe `Exception` do Java e é utilizada para criar uma exceção personalizada. Ela é acionada quando os parâmetros fornecidos não estão na ordem correta (ou seja, quando o primeiro número é maior que o segundo).

### Definição

```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
```

### Exemplo de Lançamento da Exceção

A exceção é lançada no seguinte trecho do código, dentro do método `contar`:

```java
if (parametroUm > parametroDois) {
    throw new ParametrosInvalidosException("Parametros invalidos. O parametro um não pode ser maior que o parametro dois.");
}
```

## Como Executar

1. Certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.
2. Compile o código Java com o seguinte comando:
   ```bash
   javac Contador.java ParametrosInvalidosException.java
   ```
3. Execute o programa:
   ```bash
   java Contador
   ```

O programa solicitará que você insira dois números inteiros e exibirá a contagem entre eles ou uma mensagem de erro caso os parâmetros não sejam válidos.

## Requisitos

- Java 8 ou superior
- Conhecimento básico de exceções em Java

## Autor

David lopes teixeira. Este código foi desenvolvido como parte de um desafio proposto na plataforma **Digital Innovation One (DIO)**.
