package clases;

public class Motorizado extends Vehiculo {

    private double consumo;
    private double deposito; // get & set
    private double capacidad; // solo get
    private boolean arrancado;

    public Motorizado(String marca, int ruedas, int velMaxima, double consumo, int deposito, double capacidad) {
        super(marca, ruedas, velMaxima);
        this.consumo = consumo;
        this.deposito = deposito;
        this.capacidad = capacidad;
        this.arrancado = false;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public void arrancar() {

    }

    public void avanzar() {

    }

    public void parar() {

    }

    @Override
    public String toString() {
        return super.toString() + ", tiene un consumo de " + consumo + " l/100km, tiene un depocito de combustible de "
                + capacidad + " litros, arrancado=" + arrancado + ", la capacidad actual de combustible es de "
                + deposito + " litros";
    }

}