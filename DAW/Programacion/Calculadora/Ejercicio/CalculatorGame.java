
import Calculadora.Utils;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CalculatorGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        int contj1 = 0;
        int contj2 = 0;
        int eleccionj1 = 0;
        int eleccionj2 = 0;
        int[] numeros = new int[10];
        int[] aux = new int[4];

        System.out.println("Bienvenido a calculator game. El jugador que llegue a 31 o se pase pierde.");
        System.out.println("Empieza el jugador 1.");

        System.out.println("Jugador 1. Elija un numero:");
        eleccionj1 = sc.nextInt();
        cantidad += eleccionj1;
        contj1++;
        numeros = Utils2.InsertarNumeroEnArray(numeros, eleccionj1);
        
        do{ 

            System.out.println("La cantidad actual es " + cantidad);

            System.out.println("Turno del jugador 2. ELige un numero entre " + Arrays.toString(Utils2.ObtenerNumerosRelacionados(eleccionj1)) + " y que no sea " + Arrays.toString(numeros));
            eleccionj2 = sc.nextInt();
            aux = Utils2.ObtenerNumerosRelacionados(eleccionj1);
            while(Utils2.ComprobarNumeroExisteEnArray(numeros, eleccionj2) || (eleccionj2 < 0 || eleccionj2 > 9) || !Utils2.ComprobarNumeroExisteEnArray(aux, eleccionj2)){
                System.out.println("El numero escogido no está disponible. Escoja otro.");
                eleccionj2 = sc.nextInt();
            }
            cantidad += eleccionj2;
            contj2++;
            if(cantidad > 31){
                break;
            }
            numeros = Utils2.InsertarNumeroEnArray(numeros, eleccionj2);

            System.out.println("La cantidad actual es " + cantidad);

            System.out.println("Turno del jugador 1. ELige un numero entre " + Arrays.toString(Utils2.ObtenerNumerosRelacionados(eleccionj2) ) + " y que no sea " + Arrays.toString(numeros));
            eleccionj1 = sc.nextInt();
            aux = Utils2.ObtenerNumerosRelacionados(eleccionj2);
            while(Utils2.ComprobarNumeroExisteEnArray(numeros, eleccionj1) || (eleccionj1 < 0 || eleccionj1 > 9) || !Utils2.ComprobarNumeroExisteEnArray(aux, eleccionj1)){
                System.out.println("El numero escogido no está disponible. Escoja otro.");
                eleccionj1 = sc.nextInt();
            }
            cantidad += eleccionj1;
            contj1++;
            numeros = Utils2.InsertarNumeroEnArray(numeros, eleccionj1);

        }while(cantidad < 31);

        if(contj1 > contj2){
            System.out.println("Ha ganado el jugador 2.");
        }else{
            System.out.println("Ha ganado el jugador 1.");
        }
    }
}
