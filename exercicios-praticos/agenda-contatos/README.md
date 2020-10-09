# Programação Orientada a Objetos

Implemente uma agenda telefônica usando uma lista de objetos. Cada contato da
agenda deve ser representado como uma classe, a qual conterá informações como **nome**,
**telefone**, **endereço**. A agenda deve ser implementada como uma outra
classe, a qual conterá a lista de objetos (contatos). Uma agenda pode armazenar até 1000
contatos. Deve ser criada uma terceira classe, chamada App, a qual utilizará as
classes criadas anteriormente. Além disso faça:

1. Implemente um método de busca na agenda, o qual recebe um nome, ou parte
   deste, e retorna o contato. Caso haja mais de um contato, a busca deve retornar
   apenas o primeiro.
   
2. Implemente métodos de inserção, alteração e remoção de contatos da agenda.
   Caso o nome de um contato sendo inserido já exista na agenda, a inserção se torna
   uma alteração. A remoção atribui null a posição do contato removido.
   
3. Implemente um método para listar os contatos de uma agenda. Para auxiliar tal
   listagem, crie um método toString(), na classe contato, o qual retorna uma string
   (qualquer formato) com o conteúdo de um contato.
   
4. Insira o seguintes contatos na agenda a ser criada na classe App:

    NOME | TELEFONE | ENDEREÇO 
    ---| ---|---
    Fulano | 99999999 | Rua A 
    Ciclano | 88888888 | Rua B 
    Beltrano | 88889999 | Rua C
    
5. Ainda na classe Principal, chame o método de inserção novamente para o contato
   Fulano, 77777777, Rua D; remova o contato Ciclano e liste o conteúdo da
   agenda.
   
COD: 201601