# Programação Orientada a Objetos

Suponha que as classes abaixo, as quais iniciam uma
aplicação em Java para manipulação de questões de uma prova:

OBS: Utilize as coleções do Java (Ex: ArrayList)

``` java
class Questao {
    private String enunciado;

    public Questao(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado() {
        return this.enunciado;
    }

}

class Discursiva extends Questao {
    private String gabarito;

    public Discursiva(String enunciado, String gabarito) {
        super(enunciado);
        this.gabarito = gabarito;
    }

    public String getGabarito() {
        return this.gabarito;
    }

    public String toString() {
        return this.getEnunciado() + "\n";
    }
}

public class App {
    public static void main(String[] args) {
        Questao[] prova = new Questao[2];

        prova[0] = new Discursiva("Qual é o número da última versão de Java?", "8");

        ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];
        itens[0] = new ItemVerdadeiroFalso("Java foi lançada há mais de 20 anos atrás", true);
        itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);
        itens[2] = new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true);
        prova[1] = new VerdadeiroFalso(itens);

        int num = 1;

        for (Questao q : prova) {
            System.out.print(num + ") ");
            System.out.println(q); // Chamada do método toString() para cada questão q
            num++;
        }        
    }
}
```

Após implementada, para os objetos criados na main(), esta aplicação deve ter a
seguinte saída:

> 1 - Qual é o número da última versão de Java?

>  2 - Assinale verdadeiro ou falso para os itens: \
 ( ) Java foi lançada há mais de 20 anos atrás\
 ( ) OO surgiu com a linguagem Java\
 ( ) Eclipse é um editor de texto multilinguagem

1. Implemente as classes ItemVerdadeiroFalso e VerdadeiroFalso usadas na main().
   Observe os valores passados na construção dos objetos para inferir sua estrutura.

2. Implemente uma classe chamada Prova, de forma a incorporar a construção dos
   objetos criados diretamente na main(). Dica: Do que se constitui uma prova?

3. Nesta classe Prova criada, implemente um método de impressão de forma a
   incorporar a impressão anterior feita diretamente na main().

4. Reescreva a main criando uma instância da classe Prova e chame o método de
   impressão criado. 