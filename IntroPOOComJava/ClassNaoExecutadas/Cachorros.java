package IntroPOOComJava.ClassNaoExecutadas;

public class Cachorros {
    
    static int numerosDeCachorro;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoEspirito;

    // construtores
    Cachorros() {};

    //Na linha 16 estou dizendo o que meu construtor vai ter
    Cachorros(String nome, String cor, int altura, double peso, int tamanhoDoRabo){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numerosDeCachorro ++;
    };

    //metados

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public void comer() {};

    public void latir(){
        System.out.println("AU AU");
    };

    public String pegar() {
        return "Bolinha";
    };

    public String interagir(String acao) {

        switch(acao) {
            case "carinho": this.estadoEspirito = "Feliz"; break;
            case "vai dormir": this.estadoEspirito = "bravo"; break;
            case "alimentei": this.estadoEspirito = "Labendo seu dono"; break;
            default: this.estadoEspirito = "neutro"; break;
        }

        return estadoEspirito;
    }

    @Override
    public String toString() {
        return "Cachorros {nome=" + nome + "}";
    }

}
