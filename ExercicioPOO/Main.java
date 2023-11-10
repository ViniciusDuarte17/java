package ExercicioPOO;
// import ExercicioPOO.Fatura;

public class Main {
    public static void main (String [] args) {
        
        Fatura calCenterFatura = new Fatura("472000", "calcenter informatica do povo brasileiro", 6, -40);

        System.out.println("O número da empersa é " + calCenterFatura.getNumero() + " o valor total da fatura é " + calCenterFatura.getTotalFatura());
    }
}
