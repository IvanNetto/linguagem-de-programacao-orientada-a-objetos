import java.util.ArrayList;

public class Prova {
    private ArrayList<Questao> questoes;

    public Prova(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }

    public void imprimir() {
        int num = 1;

        for (Questao questao : questoes) {
            System.out.print(num + ") ");
            System.out.println(questao); // Chamada do método toString() para cada questão q
            num++;
        }
    }
}
