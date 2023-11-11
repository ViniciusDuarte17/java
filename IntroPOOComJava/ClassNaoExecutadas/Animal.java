package IntroPOOComJava.ClassNaoExecutadas;

public abstract class Animal {
   
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

    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }


    protected void comer (){}

    protected void dormir(){}

    protected abstract void soar();


    @Override
    public String toString() {
        return "Cachorros {nome=" + nome + "}";
    }
    
}
