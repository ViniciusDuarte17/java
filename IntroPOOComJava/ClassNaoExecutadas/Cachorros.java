package IntroPOOComJava.ClassNaoExecutadas;

public class Cachorros extends Animal {
    
    static int numerosDeCachorro;
    private int tamanhoDoRabo;

    //Na linha 16 estou dizendo o que meu construtor vai ter
    Cachorros(String nome, String cor, int altura, double peso, int i){
        super(nome, cor, altura, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numerosDeCachorro ++;
    };

    //metados

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public int setTamanhoDoRabo(int tamanhoDoRabo ) {
        return this.tamanhoDoRabo = tamanhoDoRabo;
    }


    public String pegar() {
        return "Bolinha";
    };


    @Override
    protected void soar() {
        // TODO Auto-generated method stub
        System.out.println("Au Au");
    }

    public String interagir(String acao) {

        switch(acao) {
            case "carinho": this.estadoEspirito = "Feliz"; break;
            case "vai dormir": this.estadoEspirito = "bravo"; break;
            case "alimentei": this.estadoEspirito = "Labendo seu dono"; break;
            default: this.estadoEspirito = "neutro"; break;
        }

        return estadoEspirito;
    }

 

}
