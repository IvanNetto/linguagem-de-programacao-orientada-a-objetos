import java.util.ArrayList;

public class VerdadeiroFalso extends Questao {

    private ArrayList<ItemVerdadeiroFalso> itens;

    public VerdadeiroFalso(ArrayList<ItemVerdadeiroFalso> itens) {
        super("Assinale verdadeiro ou falso para os itens: ");
        this.itens = itens;
    }

    public ArrayList<ItemVerdadeiroFalso> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVerdadeiroFalso> itens) {
        this.itens = itens;
    }

    public String toString() {
        String texto = "";
        for(ItemVerdadeiroFalso item : itens)
            texto += item.toString();

        return this.getEnunciado() + "\n" + texto;

    }
}
