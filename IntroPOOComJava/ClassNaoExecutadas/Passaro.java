package IntroPOOComJava.ClassNaoExecutadas;

public class Passaro extends Animal {

    public Passaro(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    protected void soar() {
        // TODO Auto-generated method stub
        System.out.println("Rio Riu");
    }

    
    

}
