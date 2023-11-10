package IntroPOOComJava.ClassNaoExecutadas;

public class Main {
    public static void main (String [] args) {
        
        Cachorros cachorros1 = new Cachorros("Morgana", "Marron", 60, 22.5, 5 ); 
    
        cachorros1.latir();
        System.out.println("o cachorro pegou a " + cachorros1.pegar());

        System.out.println(cachorros1.getNome());

        System.out.println("O cachorro está " + cachorros1.interagir("vai dormir"));
        System.out.println("O cachorro está " + cachorros1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorros1.interagir("passei por ele e nao fiz nada"));
        System.out.println("O cachorro está " + cachorros1.interagir("alimentei"));
    }
}
