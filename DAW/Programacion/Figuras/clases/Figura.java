
package clases;

import javax.swing.JOptionPane;

public class Figura{

    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimensiones;
    
    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    public Figura(Figura fig) {
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Superheroe getSuperheroe() {
        return superheroe;
    }
    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }
    public Dimension getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }
    @Override
    public String toString() {
        return "Figura [codigo=" + codigo + ", precio=" + precio + ", superheroe=" + superheroe + ", dimensiones="
                + dimensiones + "]";
    }

    public void subirPrecio(double cantidad){
        this.precio+=cantidad;
        if(cantidad<=0){
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("La cantidad introducida no es valida, por favor introduzcala correctamente."));
            this.precio+=cantidad;
        }
    }

} 