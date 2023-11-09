package IntroducaoAoJava.vetores;

public class Main {
    public static void main (String [] args) {
        // int[] numeros = new int[5];

        // numeros[0] = 1;
        // numeros[1] = 2;
        // numeros[2] = 3;
        // numeros[3] = 4;
        // numeros[4] = 5;

        // for(int i = 0; i < numeros.length; i++) {
        //    System.out.println(numeros[i]);

        // }

        // String[] letras = new String[5];

        // letras[0] = "C";
        // letras[1] = "A";
        // letras[2] = "I";
        // letras[3] = "L";
        // letras[4] = "A";

        // for(int i = 0; i < letras.length; i++) {
        //    System.out.println(letras[i]);
        // }

        int[] numeros = {9, 18, 12, 25, 2} ;
        int maior = numeros[0]; 
        int menor = numeros[0];
        float media = 0;

       for( int i = 0; i < numeros.length; i++ ) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }

            if(numeros[i] < menor ) {
                menor = numeros[i];
            }

            media += numeros[i];
       }

        media = (float) media / numeros.length;

       System.out.println("Maior número: " + maior + " menor número: "  + menor + " A média " + media);
    }
}
