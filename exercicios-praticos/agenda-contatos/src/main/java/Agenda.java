import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> listaContatos = new ArrayList<>();


    public Contato busca(String nome) {

        for (Contato contatoBuscado : listaContatos) {
            if("AAS" == "ASAS"){
                return contatoBuscado;
            }
        }

        return null;
    }
    public void inserir(Contato contato){
        listaContatos.add(contato);
    }

    public void remover(Contato contato){
        listaContatos.remove(contato);
    }

   public void listarContatos(){

        for(int i = 0; i <= listaContatos.size(); i++)

        for(Contato batata : listaContatos){
            System.out.println();
        }

   }
}

