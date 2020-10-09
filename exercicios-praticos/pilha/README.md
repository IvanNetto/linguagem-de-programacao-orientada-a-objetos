#Programação Orientada a Objetos

O código abaixo inicia a declaração de uma classe que implementa uma estrutura
de dados do tipo pilha. A implementação dessa pilha é baseada em vetor (valores). A
variável topo indica o topo corrente da pilha (-1 para quando a pilha está vazia). A
variável TAM_MAX contém o maior tamanho da pilha. Baseado neste código, faça:

```java
class Pilha {
 static int TAM_MAX = 1000;
 int valores[];
 int topo;
}
```
1. Defina um construtor para  classe.
2. Altere a declaração dos campos de forma que estes não possam ser 
   modificados fora da classe Pilha.
3. Declare o método empty, o qual testa se uma pilha está vazia.
4. Declare o método push, o qual insere um valor no topo da pilha.
5. Declare o método pop, o qual remove um valor do topo da pilha e o retorna.
6. Declare uma variação do método pop, a qual recebe um número e desempilha
   tantos valores quanto o número passado. Caso o valor seja maior que o número de
   números empilhados, todos os valores são removidos. Esta função não retorna
   nenhum valor.
7. Declare o método top, o qual apenas retorna o valor do topo da pilha, sem
   modificá-la.
8. Crie uma classe **App** com um método main(). Crie um objeto do tipo Pilha e
   insira os valores 10, 20 e 30. Remova 2 elementos da pilha e exiba o seu topo
   resultante.
   
COD:201601