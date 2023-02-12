/* 
* Nombre y apellidos -> 
* DNI ->
*/
/*
 * Cada casilla del tablero podrá tener uno de los siguientes valores:
 * - Barcos del jugador -> "J"
 * - Barcos del ordenador -> "O"
 * - Barcos del jugador hundidos -> "!"
 * - Barcos del ordenador hundidos -> "X"
 * - Disparos en la nada -> "-"
 * - Celda vacía -> " "
 *
 * El examen consiste en rellenar cada uno de los // TODO, por lo tanto utilizad el buscador de palabras 
 * dentro del editor que se utilice con los caracteres "// TODO" para encontrar todo lo que hay que rellenar.
 * Compilación -> javac -encoding "UTF-8" HundirFlota.java
 */

/* HUNDIR LA FLOTA */
import java.util.*;

public class HundirFlota {
    public static int numFilas = 0; // TODO cambiar el 0
    public static int numColumnas = 0; // TODO cambiar el 0
    public static int barcosJugador;
    public static int barcosOrdernador;
    public static String[][] tablero = new String[0][0]; // TODO cambiar el 0
    public static int[][] disparoFallado = new int[0][0]; // TODO cambiar el 0

    public static void main(String[] args){
        System.out.println("##### HUNDIR LA FLOTA #####");
        System.out.println("El océano está vacío\n");

        //Fase 1 – Crear el mapa del océano
        crearMapaOceano();

        //Fase 2 – Desplegar los barcos del jugador
        despliegueBarcosJugador();

        //Fase 3 - Desplegar los barcos del orcenador
        despliegueBarcosOrdernador();

        //Fase 4 Combate
        int tmp = 0;
        do {
            combate();
        }while(tmp++<5); /* TODO ¿Quedan barcos del jugador y del ordenador?*/

        //Fase 5 - Game over
        gameOver();
    }

    public static void crearMapaOceano(){
        //Primera sección del mapa del océano: 
        /*
         *  0123456789  
         */

        // TODO

        //Sección intermedia del mapa del océano:
        /*
         *0|          |0
         *1|          |1
         *2|          |2
         *3|          |3
         *4|          |4
         *5|          |5
         *6|          |6
         *7|          |7
         *8|          |8
         *9|          |9
         */
        
        // TODO

        //Última sección del mapa del océano
        /*
         *  0123456789  
         */
        
        // TODO

    }

    public static void despliegueBarcosJugador(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nDespliega tus barcos:");
        //El jugador tiene que desplegar 5 barcos
        // TODO
        //Para cada uno de los barcos
        // TODO
            //El jugador tendrá que indicar las coordenadas X e Y
            // TODO
            //Hay que tener en cuenta las posibles casuísticas que pueden darse dentro de esas coordenadas.
            // TODO
        // Se imprime el mapa actualizado
        imprimirMapaOceano();
    }

    public static void despliegueBarcosOrdernador(){
        System.out.println("\nEl ordenador está colocando sus barcos");
        //Se despliegan 5 barcos para el ordenador
        HundirFlota.barcosOrdernador = 5;
        for (int i = 1; i <= HundirFlota.barcosOrdernador; ) {
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);

            if((x >= 0 && x < numFilas) && (y >= 0 && y < numColumnas) && (tablero[x][y] == " "))
            {
                tablero[x][y] =   "O";
                System.out.println(i + ". barco desplegado");
                i++;
            }
        }
        // Se imprime el mapa actualizado
        imprimirMapaOceano();
    }

    public static void combate(){
        
        turnoJugador();
        
        turnoOrdenador();

        imprimirMapaOceano();

        System.out.println();
        System.out.println("Barcos del jugador: " + 0 +
         " | Barcos del ordenador: " + 0);
         /* TODO ¿Cuántos barcos quedan del jugador?*/
         /* TODO ¿Cuántos barcos quedan del ordenador?*/
        System.out.println();
    }

    public static void turnoJugador(){
        System.out.println("\n¡Es tu turno!");
        int x = -1, y = -1;
        int tmp = 0;
        do {
            // Introducir las coordenadas X e Y del disparo del jugador
            Scanner input = new Scanner(System.in);
            // TODO

            // Comprobar si es un disparo válido y realizar las acciones que correspondan 
            // cuando se cumpla alguna de las posibles casuísticas
            // TODO

        }while(tmp++<5); // TODO /* Disparo no válido */);  //Sigue repitiendo hasta que haya un disparo no válido.
    }

    public static void turnoOrdenador(){
        System.out.println("\n¡Turno del ordenador!");
        int x = -1, y = -1;
        int tmp = 0;
        do {
            // Coordenadas del disparo del ordenador aleatorios
            x = (int)(Math.random() * 10);
            y = (int)(Math.random() * 10);

            // Comprobar si es un disparo válido y realizar las acciones que correspondan 
            // cuando se cumpla alguna de las posibles casuísticas
            // TODO

        }while(tmp++<5); // TODO /* Disparo no válido */);  //Sigue repitiendo hasta que haya un disparo válido.
    }

    public static void gameOver(){
        System.out.println("Tus barcos: " + 0 + 
         " | Barcos del ordenador: " + 0);
         // TODO/*¿Cuántos barcos quedan del jugador?*/
         // TODO/*¿Cuántos barcos quedan del ordenador?*/
        if(true) // TODO /* Condición de victoria */
            System.out.println("¡Enhorabuena! Has ganado la batalla :)");
        else
            System.out.println("Has perdido la batalla");
        System.out.println();
    }

    public static void imprimirMapaOceano(){
        System.out.println();
        //Primera sección del mapa del océano
        /*
         *  0123456789  
         */

        // TODO

        //Sección intermedia del mapa del océano donde se indican todos los valores de la leyenda:
        // Barcos del jugador -> "J"
        // Barcos del ordenador -> "O"
        // Barcos del jugador hundidos -> "!"
        // Barcos del ordenador hundidos -> "X"
        // Disparos en la nada -> "-"
        /*
         *0|          |0
         *1|          |1
         *2|          |2
         *3|          |3
         *4|          |4
         *5|          |5
         *6|          |6
         *7|          |7
         *8|          |8
         *9|          |9
         */

        // TODO

        //Última sección del mapa del océano
        /*
         *  0123456789  
         */

        // TODO

    }
}