package ExercicioPOO;
// import ExercicioPOO.Fatura;

public class Main {
    public static void main (String [] args) {
        
        Fatura calCenterFatura = new Fatura("472000", "calcenter informatica do povo brasileiro", 6, -40);

        System.out.println("O número da empersa é " + calCenterFatura.getNumero() + " o valor total da fatura é " + calCenterFatura.getTotalFatura());
    }
}
     // Fatura calCenterFatura = new Fatura("472000", "calcenter informatica do povo brasileiro", 6, -40);

        // System.out.println("O número da empersa é " + calCenterFatura.getNumero() + " o valor total da fatura é " + calCenterFatura.getTotalFatura());


                // int[] sequenceList = new int[10];
        
                // int element = 5;
                // for (int i = 0; i < 10; i++) {
                //     sequenceList[i] += (element + i * 2);
                // }
        
                // System.out.println(sequenceList[3] - (element-1));


                // public static void main(String[] args) throws Exception {
                //     for(int i = 0 ; i < 4 ; i ++) {
                //         System.out.print(Arrays.toString(calc(i+1)));
                //         System.out.print(" ");
                //     }
                // }
                
                // static int[] calc(int number) throws Exception {
                //     if(number > 0 ) {
                //         int[] elements = new int[2];
                //         int cp = number;
                //         elements[0] = --cp;
                //         elements[1] = number + 1;
                //         return elements;
                //     }
                //     throw new Exception();
                // }