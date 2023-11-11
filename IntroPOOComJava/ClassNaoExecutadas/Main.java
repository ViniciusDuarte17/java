package IntroPOOComJava.ClassNaoExecutadas;

public class Main {
    public static void main (String [] args) {
        
        Cachorros cachorros1 = new Cachorros("Morgana", "Marron", 60, 22.5, 5 ); 
        Gato gato1 = new Gato("bartolomeu", "branca", 20,55.6 ); 
        Passaro passaro1 = new Passaro("frajola", "azul", 2, 90.5);
        
        cachorros1.soar();
        gato1.soar();
        passaro1.soar();


        // System.out.println(cachorros1.getNome());

        System.out.println("O cachorro está " + cachorros1.interagir("vai dormir"));
        System.out.println("O cachorro está " + cachorros1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorros1.interagir("passei por ele e nao fiz nada"));
        System.out.println("O cachorro está " + cachorros1.interagir("alimentei"));
    }
}
