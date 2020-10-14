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


    }
}
