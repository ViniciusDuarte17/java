package IntroPOOComJava.ClassNaoExecutadas;

public class Gato extends Animal {

    public Gato(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    protected void soar() {
      System.out.println("Miau Miau");
    }

    
    

}
