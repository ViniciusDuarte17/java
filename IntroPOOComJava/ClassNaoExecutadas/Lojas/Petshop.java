package IntroPOOComJava.ClassNaoExecutadas.Lojas;

import IntroPOOComJava.ClassNaoExecutadas.Animal;
import IntroPOOComJava.ClassNaoExecutadas.Cachorros;

public class Petshop {
    
    public void darBanho (Animal animal) {
        animal.setEstadoEspirito("Limpo");
    }

    public void tosar(Cachorros cachorro) {
        cachorro.setEstadoEspirito("tosado");
    }

    public void deixarNoHotel(Animal animal ) {
        animal.setEstadoEspirito("To com saudade");
    }
}
