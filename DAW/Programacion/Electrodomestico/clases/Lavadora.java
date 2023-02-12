package clases;

public class Lavadora extends Electrodomestico {

    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return super.toString() + " con un precio = " + precio + "€, aguaCaliente = " + aguaCaliente;
    }

    public double getConsumo(double horas) {
        double consumo;
        if (aguaCaliente == false) {
            consumo = horas * super.getPotencia();
        } else {
            consumo = horas * super.getPotencia() * 0.2;
        }
        return consumo;
    }
}