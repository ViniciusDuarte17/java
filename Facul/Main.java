

public class Main {
    public static void main(String [] args) {
        System.out.println("Olá facul");
        Operadores op = new Operadores();
        op.multiplicar(5, 2);
        op.multiplicar(2.25, 5.125);

        Produto prod1 = new Produto("Aqui você compra o que quiser", 100);

        prod1.toSystemOut();
    }

}

    // Exemplo de sobre carga no java

     class Operadores {
        public void multiplicar(double num1, double num2) {
            System.out.println("Multiplicação: " + num1 * num2);
        }

        public void multiplicar(int num1, int num2) {
            System.out.println("Multiplicação: " + num1 * num2);
        }
    }

