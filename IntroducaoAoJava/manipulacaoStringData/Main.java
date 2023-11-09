package IntroducaoAoJava.manipulacaoStringData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String [] args) {

        String nome = "Vinicius";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime agora = LocalDateTime.now();
        String saudacao;

        if(agora.getHour() >= 0 && agora.getHour() <= 12) {
            saudacao = "Bom dia";
        } else if(agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if( agora.getHour() >= 18 && agora.getHour() < 24 ) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá";
        }

       System.out.printf("Olá %s. Hoje é %s, %s %n", nome, diaDaSemana, saudacao.toUpperCase());
    }
}
