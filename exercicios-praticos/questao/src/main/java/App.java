import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Questao> listaQuestoes = new ArrayList<>();

        listaQuestoes.add(new Discursiva("Qual é o número da última versão de Java?", "8"));

        ArrayList<ItemVerdadeiroFalso> listaItemVerdadeiroFalso = new ArrayList<>();

        listaItemVerdadeiroFalso.add(new ItemVerdadeiroFalso("Java foi lançada há mais de 20 anos atrás", true));
        listaItemVerdadeiroFalso.add(new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false));
        listaItemVerdadeiroFalso.add(new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true));
        listaQuestoes.add(new VerdadeiroFalso(listaItemVerdadeiroFalso));

        Prova prova = new Prova(listaQuestoes);
        prova.imprimir();


    }
}
