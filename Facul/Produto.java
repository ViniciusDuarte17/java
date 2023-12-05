public class Produto implements Imprimivel {

    private String descricao;
    private int quantidade;

    public Produto(String d, int q) {
        this.descricao = d;
        this.quantidade = q;
    }


    public String toString() {
        String resp = "Descrição: " + descricao;
        resp += nlin + "Qtde " + quantidade;
        return resp;
    }

    public void toSystemOut() {
        String resp = "Descrição: " + descricao;
        resp += nlin + "Qtde " + quantidade;
        System.out.println(resp);
    }
    
}
