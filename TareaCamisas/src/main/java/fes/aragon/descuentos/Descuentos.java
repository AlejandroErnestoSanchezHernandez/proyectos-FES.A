package fes.aragon.descuentos;

import java.util.ArrayList;
import fes.aragon.camisas.Camisas;

/**
 * Autor = Sanchez Hernandez Alejandro Ernesto
 */
public class Descuentos {

    /*public static  Camisas unaADosCamisas (ArrayList<Camisas> lista){
        int longitud=lista.size();
        Camisas fin = new Camisas(0,0);
        Integer suma = 0;
        if (longitud==1 || longitud==2){
            System.out.println("No hay descuento");
            for (int i=0;i< longitud;i++){
                Camisas num = lista.get(lista.size()-1);
                Integer ultNum=num.getPrecio();
                 suma = suma+ultNum;
                 lista.remove(lista.size()-1);
            }
        }
        fin.setPrecio(suma);
        return fin;
    }*/
    public static  Camisas unaADosCamisas (ArrayList<Camisas> lista){
        int longitud=lista.size();
        Camisas fin = new Camisas(0,0);
        double suma = 0;
        if (longitud==1 || longitud==2){
            System.out.println("No hay descuento");
            for (int i=0;i< longitud;i++){
                Camisas num = lista.get(lista.size()-1);
                double ultNum=num.getPrecio();
                suma = suma+ultNum;
                lista.remove(lista.size()-1);
            }
        }
        fin.setPrecio(suma);
        return fin;
    }

    public static Camisas  treACinco(ArrayList<Camisas> lista){
        int longitud=lista.size();
        Camisas fin = new Camisas(0,0);
        double suma = 0;
        double sumaDoble=0;
        double descuento=0;
        double datoFin=0;
        if (longitud==3 || longitud==4 || longitud==5){
            for (int i=0;i< longitud;i++) {
                Camisas num = lista.get(lista.size() - 1);
                double ultNum = num.getPrecio();
                suma = suma + ultNum;
                lista.remove(lista.size()-1);
            }
             sumaDoble = suma;
             descuento = sumaDoble*1.05;
        }
        fin.setPrecio(descuento);
        return fin;
    }

    public static Camisas  cincoPlus(ArrayList<Camisas> lista){
        int longitud=lista.size();
        Camisas fin = new Camisas(0,0);
        double suma = 0;
        double sumaDoble=0;
        double descuento=0;
        double datoFin=0;
        if ( longitud >=5){
            for (int i=0;i< longitud;i++) {
                Camisas num = lista.get(lista.size() - 1);
                double ultNum = num.getPrecio();
                suma = suma + ultNum;
                lista.remove(lista.size()-1);
            }
            sumaDoble = suma;
            descuento = sumaDoble*1.08;
        }
        fin.setPrecio(descuento);
        return fin;
    }

}


