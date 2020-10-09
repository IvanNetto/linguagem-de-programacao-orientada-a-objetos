#Programação Orientada a Objetos

O Código abaixo apresenta um trecho da classe Pedido, a qual é utilizada num sistema de gerencia de pedidos de clientes.
Baseado neste código, faça:

```java
class Pedido {
 int numero;
 Cliente cliente;
}
```

1. Defina uma classe Cliente. Neste sistema só é necessário armazenar nomes,
   telefones e endereços dos clientes.
   Crie um construtor para facilitar a criação destes.

2. Altere a classe Pedido para conter também um campo data (objeto da classe
   java.time.LocalDate), a qual representa a data de realização do pedido, e
   um campo preço. Crie também um construtor para facilitar a criação de objetos
   desta classe.
   
3. Neste sistema, o cliente também pode solicitar que seu pedido seja entregue de
   forma expressa. Altere este sistema, sabendo que este tipo terá um novo campo
   data, a qual conterá a data de entrega do pedido. Pedidos expressos terão seu
   preço original acrescido de 20%.

4. Cria testes para os pedidos comuns e expressos no valor de 500 dinheiros na data 
   (contrutor padrão da classe LocalDate).
   
Obs: Criar os testes no método main() e também utilizando o framework de testes.

COD: 201402 