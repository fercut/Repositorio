import java.text.DecimalFormat;
import java.util.Scanner;

public class CambioCaja {
    public static void main(String[] args) {
        // declaro las variables a operar
        double cobro, pago;
        double vuelta;

        // Recojo el cobro por consola
        Scanner cb = new Scanner(System.in);
        System.out.println("Introduzca el importe de la compra");
        cobro = cb.nextFloat();

        // Recojo el pago por consola
        Scanner pg = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de pago en efectivo");
        pago = pg.nextFloat();

        // Informo de cuanto es la vuelta en efectivo
        vuelta = pago - cobro;
        // Con este metodo indico que el resultado solo tenga 2 cifras decimales
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("La vuelta de su tiket es de " + df.format(vuelta) + " euros");

        // Declaro billetes y monedas
        double bit500 = 500.0, bit200 = 200.0, bit100 = 100.0, bit50 = 50.0,
                bit20 = 20.0, bit10 = 10.0, bit5 = 5.0;
        double mon200 = 2.0, mon100 = 1.0, mon50 = 0.5, mon20 = 0.2, mon10 = 0.1,
                mon5 = 0.05, mon2 = 0.018, mon1 = 0.009;

        System.out.println("Su cambio es de: ");

        // Aplicamus un bucle while que le decimos que hasta que "vuelta" no sea "0" no
        // salga del mismo y valla imprimiendo cada resta en consola
        while (vuelta != 0) {
            if (vuelta >= bit500) {
                vuelta = vuelta - 500;
                System.out.print("un billete de 500, ");
            } else if (vuelta >= bit200) {
                vuelta = vuelta - 200;
                System.out.print("un billete de 200, ");
            } else if (vuelta >= bit100) {
                vuelta = vuelta - 100;
                System.out.print("un billete de 100, ");
            } else if (vuelta >= bit50) {
                vuelta = vuelta - 50;
                System.out.print("un billete de 50, ");
            } else if (vuelta >= bit20) {
                vuelta = vuelta - 20;
                System.out.print("un billete de 20, ");
            } else if (vuelta >= bit10) {
                vuelta = vuelta - 10;
                System.out.print("un billete de 10, ");
            } else if (vuelta >= bit5) {
                vuelta = vuelta - 5;
                System.out.print("un billete de 5, ");
            } else if (vuelta >= mon200) {
                vuelta = vuelta - 2;
                System.out.print("una moneda de 2 euros, ");
            } else if (vuelta >= mon100) {
                vuelta = vuelta - 1;
                System.out.print("una moneda de 1 euros, ");
            } else if (vuelta >= mon50) {
                vuelta = vuelta - 0.5;
                System.out.print("una moneda de 50 cnt, ");
            } else if (vuelta >= mon20) {
                vuelta = vuelta - 0.2;
                System.out.print("una moneda de 20 cnt, ");
            } else if (vuelta >= mon10) {
                vuelta = vuelta - 0.1;
                System.out.print("una moneda de 10 cnt, ");
            } else if (vuelta >= mon5) {
                vuelta = vuelta - 0.05;
                System.out.print("una moneda de 5 cnt, ");
            } else if (vuelta >= mon2) {
                vuelta = vuelta - 0.02;
                System.out.print("una moneda de 2 cnt, ");
            } else if (vuelta >= mon1) {
                vuelta = vuelta - 0.01;
                System.out.print("una moneda de 1 cnt, ");
            }
        }
    }
}