import fes.aragon.camisas.Camisas;

import  fes.aragon.descuentos.Descuentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Camisas productoT21 = new Camisas(1, 190);
        Camisas productoT22 = new Camisas(2, 230);
        Camisas productoT23 = new Camisas(3, 310);
        Camisas productoT24 = new Camisas(4, 310);
        Camisas productoT25 = new Camisas(5, 310);
        Camisas productoT26 = new Camisas(6, 190);

ArrayList<Camisas> lista =new ArrayList<Camisas>();
lista.add(productoT21);
lista.add(productoT22);
lista.add(productoT23);
lista.add(productoT24);
lista.add(productoT25);
lista.add(productoT26);



int longitud=lista.size();
/*
System.out.println(lista.size());
 */

Descuentos prueba= new Descuentos();


System.out.println("-----------------------\n Una camisa:");
System.out.println(prueba.unaADosCamisas(lista));
System.out.println("-----------------------\nTres-Cinco camisas:");
System.out.println(prueba.treACinco(lista));
System.out.println("-----------------------\nCinco o mas camisas:");
System.out.println(prueba.cincoPlus(lista));


    }
}

