package IntroducaoAoJava.operadoresBooleanos;

public class Main {
    public static void main (String [] args) {

        // algoritmo para saber se vamos a praia
        
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPrai = fimDeSemana && fazendoSol;
        String mensagem;

        mensagem = vamosAPrai ? "Vamos a praia" : "Não vamos a praia";

        System.out.println(mensagem);

    }
}
