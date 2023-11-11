package IntroPOOComJava.ClassNaoExecutadas;

public class Animal {
   
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoEspirito;
    
    public Animal(String nome, String cor, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        
    }

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



    protected void comer (){}

    protected void dormir(){}

    protected void soar(){
        System.out.println(" cri cri ");
    }


    @Override
    public String toString() {
        return "Cachorros {nome=" + nome + "}";
    }
    
}
