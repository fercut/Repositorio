import javax.swing.*;

public class DNI {

    private int numero=0;
    private String letra="";

    public DNI(){
        
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return " El numero y letra de tu DNI es: " + numero + letra;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int pideDNI(){

        int numero=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el DNI al que quieres calcular la letra?"));
        

        if(numero>99999999 || numero<1000000){
            pideDNI();
        }
        this.numero=numero;
        return numero;
    }

    public String letraDNI(int dni){
        String letra="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        this.letra=Character.toString(letra.charAt(resto));
        return this.letra;
    }
} 