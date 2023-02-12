package clases;

public class Dimension {

    private double alto;
    private double ancho;
    private double fondo;
    private double volumen;

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.fondo = 0;
    }

    public Dimension(double alto, double ancho, double fondo) {
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public double getVolumen() {

        this.volumen = this.alto * this.ancho * this.fondo;
        return volumen;
    }

    @Override
    public String toString() {
        return "Las dimenciones de la figura es: alto=" + alto + "cm , ancho " + ancho + "cm, fondo" + fondo
                + "cm . Y con un volumen de " + volumen + "cm";
    }

}