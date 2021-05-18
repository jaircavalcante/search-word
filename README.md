# search-word
 
## _Desafio

Criação de um programa que busque por uma sentença em todos estes arquivos e exiba quantos e quais arquivos possuem esta palavra chave. A ordenação dos arquivos deve ser feito em ordem crescente e alfabética. O seu programa deve ser executado a partir da linha de comando do terminal (Linux/MacOS) e deve permitir que a sentença que deverá ser encontrada seja passada
como parâmetro de execução. 

Exemplo de comando de execução com a sentença &quot;walt disney&quot; sendo passada para o programa:
java -jar search.jar “walt disney”

## Tecnologia
- Java 8
- JUnit
- Maven

## Requisitos

- Você deve ter o código coberto por testes unitários e deve utilizar somente ferramentas nativas da linguagem que você escolher no desenvolvimento do algoritmo (Node.js ou Java).
- Lembre-se que as palavras digitadas em um sistema de busca não necessariamente estão na mesma ordem em que elas estão salvas nos arquivos.
- O &quot;match&quot; das palavras deve utilizar o critério &quot;AND&quot;. Ou seja, ambas devem existir no arquivo, independente da ordem ou das outras
palavras separarem múltiplos termos.
- O processo de busca deve ser executado em até 0.01ms.
- Você pode pré-processar e preparar a massa de arquivos em um outro script.

## Execução

- Realizar clone do repositório
- Na pasta do projeto, necessário realizar build para construção do JAR, usando o comando "mvn package".
```sh
mvn install
``` 

- Para executar utilize o comando: java -jar search-0.0.1-SNAPSHOT.jar "{palavra}"
```sh
java -jar search-0.0.1-SNAPSHOT.jar "{palavra}"
``` 

- Após rodar o comando anterior, necessário informar o PATH dos arquivos que deseja validar no momento da execução.

 