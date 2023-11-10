package IntroPOOComJava.ClassNaoExecutadas;

public class Main {
    public static void main (String [] args) {
        
        Cachorros cachorros1 = new Cachorros("Morgana", "Marron", 60, 22.5, 5 ); 
        Cachorros cachorros2 = new Cachorros("Nina", "Marron", 60, 22.5, 5 ); 
        
        System.out.println(cachorros1);
        System.out.println(cachorros2);

        System.out.println(cachorros1.numerosDeCachorro);
        System.out.println(cachorros2.numerosDeCachorro);
        // cachorros1.latir();
        // System.out.println("o cachorro pegou a " + cachorros1.pegar());

        // System.out.println(cachorros1.getNome());

        // System.out.println("O cachorro está " + cachorros1.interagir("vai dormir"));
        // System.out.println("O cachorro está " + cachorros1.interagir("carinho"));
        // System.out.println("O cachorro está " + cachorros1.interagir("passei por ele e nao fiz nada"));
        // System.out.println("O cachorro está " + cachorros1.interagir("alimentei"));
    }
}
