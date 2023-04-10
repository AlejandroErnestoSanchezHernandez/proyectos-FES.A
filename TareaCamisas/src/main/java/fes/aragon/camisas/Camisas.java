package fes.aragon.camisas;

/**
 * Autor= Sanchez Hernandez Alejandro Ernesto
 * id=1 Camisa de manga corta
 *    2 Camisa Casual de manga larga
 *    3 Camisa formal de manga larga
 */
public class Camisas {

    public  Camisas(double id, double p){
        this.id = id;
        this.precio = p;
    }
    private double id;
    private double precio;

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Camisas:" +

                "precio=" + precio
                ;
    }
}
