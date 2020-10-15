import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("banana");
        lista.add("uva");
        lista.add("laranja");

        for(String fruta : lista) {
            System.out.println(fruta);
        }

        //RETORNA A POSIÇÃO DO ITEM BANANA NA LISTA
        lista.indexOf("banana");
        //RETORNA O TAMANHO DA LISTA
        lista.size();
        //RETORNA SE A LISTA ESTÁ VAZIA
        lista.isEmpty();
        //ATUALIZA A POSIÇÃO 2 COM O ITEM PERA
        lista.set(2, "pera");
        //REMOVE O ITEM NA POSIÇÃO 0
        lista.remove(0);
        //REMOVE O ITEM BANANA
        lista.remove("banana");


    }
}
