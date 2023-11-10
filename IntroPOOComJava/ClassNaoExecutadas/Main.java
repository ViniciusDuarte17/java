package IntroPOOComJava.ClassNaoExecutadas;

public class Main {
    public static void main (String [] args) {
        
        Cachorros cachorros1 = new Cachorros(); 
        
        cachorros1.nome = "Morgana";
        cachorros1.cor = "Marron";
        cachorros1.altura = 60;
        cachorros1.peso = 20.5;
        cachorros1.tamanhoDoRabo = 5;

        cachorros1.latir();
        System.out.println("o cachorro pegou a " + cachorros1.pegar());

        System.out.println("O cachorro está " + cachorros1.interagir("vai dormir"));
        System.out.println("O cachorro está " + cachorros1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorros1.interagir("passei por ele e nao fiz nada"));
        System.out.println("O cachorro está " + cachorros1.interagir("alimentei"));
    }
}
