package clases;

import java.util.*;
import javax.swing.*;

public class Coleccion {

    private String nombreColeccion;
    private ArrayList <Figura> Coleccion = new ArrayList<Figura>();
    
    public Coleccion(String nombreColeccion, ArrayList<Figura> coleccion) {
        this.nombreColeccion = nombreColeccion;
        Coleccion = coleccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    
    public void añadirFigura(Figura fig){
        Coleccion.add(new Figura(fig));
    }

    public void subirPrecio(double cantidad, String id){

        if(cantidad<=0){
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("La cantidad introducida no es valida, por favor introduzcala correctamente."));          
        }
        
        if(Figura.getCodigo().equals(id)){
            Figura.setPrecio(cantidad);
        }
    }
    

} 