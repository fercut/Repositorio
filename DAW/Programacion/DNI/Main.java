import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        
       DNI nuevo=new DNI();
       int numero = nuevo.pideDNI();
       nuevo.letraDNI(numero);
       JOptionPane.showMessageDialog(null,nuevo.toString());
} 
}