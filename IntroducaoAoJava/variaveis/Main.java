package IntroducaoAoJava.variaveis;

public class Main {
   
    public static void main (String [] args) {
     String nome = "vinicius";

     System.out.println("Olá, " + nome);

     int a;
     int b = 2;

     a = 3;

     int soma = a + b;
     int subtracao = a - b;
     int mutiplicacao = a * b;
     float divisao = (float) a / b;   

     System.out.println(soma);
     System.out.println(subtracao);
     System.out.println(mutiplicacao);
     System.out.println(divisao);
     
    }
}