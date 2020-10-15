public class ItemVerdadeiroFalso {

    private String enunciado;
    private boolean resposta;

    public ItemVerdadeiroFalso(String enunciado, boolean resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

   public String toString() {
        return "( )" + this.getEnunciado() + "\n";
   }
}
