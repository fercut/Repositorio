package clases;

public class Vehiculo {

    private String marca;
    private int ruedas;
    private int velMaxima;
   
    public Vehiculo(String marca, int ruedas, int velMaxima) {
        this.marca = marca;
        this.ruedas = ruedas;
        this.velMaxima = velMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo de marca " + marca + ", tiene " + ruedas + " ruedas, una velocidad maxima de " + velMaxima + "km/h ";
    }
    
    
} 