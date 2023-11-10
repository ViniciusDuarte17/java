package ExercicioPOO;

public class Fatura {
    private String numero;
    private String descricao;
    private int qntCompradaItem;
    private double preco;
    
    //constructor
    // Fatura(){}
    Fatura(String numero, String descricao, int qntCompradaItem, double preco){
        this.numero = numero;
        this.descricao = descricao;
        this.qntCompradaItem = qntCompradaItem;
        this.preco = preco;
    }

    // metados gets

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQntCompradaItem() {
        return qntCompradaItem;
    }

    public double getPreco() {
        return preco;
    }

    // metados sets

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void getQntCompradaItem (int qntCompradaItem) {
        this.qntCompradaItem = qntCompradaItem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public double getTotalFatura () {
        // pegando a quantidade comprada de item vezes o preço

        if(preco < 0) {
            return 0.0;
        }

        double result = this.preco * qntCompradaItem;

        if(result < 0) {
            return 0;
        }
        
        return result;
    }

}
