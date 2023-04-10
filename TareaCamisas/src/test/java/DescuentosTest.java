import fes.aragon.camisas.Camisas;
import fes.aragon.descuentos.Descuentos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class DescuentosTest {
    @DisplayName( "Prueba metodo 1  una o dos camisas ")
    @Test
    public void test1(){
        Camisas producto1 = new Camisas(1,190);
        Camisas producto2 = new Camisas(2,230);
        Camisas producto3 = new Camisas(3,310);
        Camisas producto4 = new Camisas(4,310);
        Camisas producto5 = new Camisas(5,310);

        ArrayList<Camisas> lista =new ArrayList<Camisas>();
        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        lista.add(producto5);
        Descuentos prueba = new Descuentos();
        Camisas fin =new Camisas(0,0.0);
        final Camisas expected =prueba.unaADosCamisas(lista);
        Assertions.assertEquals(expected.getPrecio(),0.0);
        Assertions.assertNotEquals(1,expected.getPrecio());
    }
    @DisplayName( "Prueba metodo 2:  dos a 3 camisas ")
    @Test
    public void test3() {
        Camisas productoT21 = new Camisas(1, 190);

        ArrayList<Camisas> listaT21 = new ArrayList<Camisas>();
        listaT21.add(productoT21);
        Descuentos pruebaT21 = new Descuentos();
       final Camisas expectedT21 = pruebaT21.treACinco(listaT21);
        Assertions.assertEquals(0.0,expectedT21.getPrecio());
        Assertions.assertNotEquals(12121.21,expectedT21.getPrecio());

    }

    @DisplayName( "Prueba metodo 2:  dos a 3 camisas ")
    @Test
    public void test4() {
        Camisas productoT21 = new Camisas(1, 190);
        Camisas productoT22 = new Camisas(2, 230);
        Camisas productoT23 = new Camisas(3, 310);
        Camisas productoT24 = new Camisas(4, 310);
        Camisas productoT25 = new Camisas(5, 310);
        Camisas productoT26 = new Camisas(6, 190);

        ArrayList<Camisas> listaT21 = new ArrayList<Camisas>();
        listaT21.add(productoT21);
        listaT21.add(productoT22);
        listaT21.add(productoT23);
        listaT21.add(productoT24);
        listaT21.add(productoT25);
        listaT21.add(productoT26);

        Descuentos pruebaT21 = new Descuentos();
        final Camisas expectedT21 = pruebaT21.cincoPlus(listaT21);
        Assertions.assertEquals( 1663.2,expectedT21.getPrecio());
        Assertions.assertNotEquals(0.0,expectedT21.getPrecio());

    }
}
