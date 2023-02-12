
/* 
* Nombre y apellidos -> Manuel Pacheco Sanchez
* DNI -> 31021037V
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
    public static int numFilas = 10; // TODO cambiar el 0
    public static int numColumnas = 10; // TODO cambiar el 0
    public static int barcosJugador = 5;
    public static int barcosOrdernador = 5;
    public static String[][] tablero = new String[10][10]; // TODO cambiar el 0
    public static String[][] aux = new String[10][10]; // TODO cambiar el 0

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
        }while(barcosJugador > 0 && barcosOrdernador > 0); /* TODO ¿Quedan barcos del jugador y del ordenador?*/

        //Fase 5 - Game over
        gameOver();
    }

    public static void crearMapaOceano(){
        //Primera sección del mapa del océano: 
        /*
         *  0123456789  
         */

        // TODO

        System.out.print("  ");

        for(int i = 0; i < numColumnas; i++){
            System.out.print(i);
        }

        System.out.println("");

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

        for(int i = 0; i < tablero.length; i++){

            for(int j = 0; j < tablero[i].length; j++){
                if(j == 0){
                    System.out.print(i + "|");
                    tablero[i][j] = " ";
                    aux[i][j] = " ";
                    System.out.print(tablero[i][j]);
                }else if(j == 9){
                    tablero[i][j] = " ";
                    aux[i][j] = " ";
                    System.out.print(tablero[i][j]);
                    System.out.print("|" + i);
                }else{
                    tablero[i][j] = " ";
                    aux[i][j] = " ";
                    System.out.print(tablero[i][j]);
                }
            }
            System.out.println("");
        }

        //Última sección del mapa del océano
        /*
         *  0123456789  
         */
        
        // TODO

        System.out.print("  ");

        for(int i = 0; i < numColumnas; i++){
            System.out.print(i);
        }

    }

    public static void despliegueBarcosJugador(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nDespliega tus barcos:");
        //El jugador tiene que desplegar 5 barcos
        // TODO
        
        barcosJugador = 5;
        
        //Para cada uno de los barcos
        // TODO

        for(int i = 0; i < barcosJugador; i++){  

            //El jugador tendrá que indicar las coordenadas X e Y
            // TODO
            System.out.println("Introduce la coordenada X:");
            int x = input.nextInt();
            System.out.println("Introduce la coordenada Y:");
            int y = input.nextInt();

            //Hay que tener en cuenta las posibles casuísticas que pueden darse dentro de esas coordenadas.
            
            if(tablero[y][x].equals("J")){
                while(tablero[y][x].equals("J")){
                    System.out.println("Ya tienes un barco en esas coordenadas.");
                    System.out.println("Dime otra coordenada X:");
                    x = input.nextInt();
                    System.out.println("Dime otra coordenada Y:");
                    y = input.nextInt();
                }
                tablero[y][x] = "J";
                aux[y][x] = "J";
            }else{
                tablero[y][x] = "J";
                aux[y][x] = "J";
            }

            System.out.println(i+1 + ". Barco desplegado");

            // TODO
        }
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
        System.out.println("Barcos del jugador: " + barcosJugador +
         " | Barcos del ordenador: " + barcosOrdernador);
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
            System.out.println("Introduce la coordenada X donde quieres disparar:");
            x = input.nextInt();
            System.out.println("Introduce la coordenada y donde quieres disparar:");
            y = input.nextInt();

            // Comprobar si es un disparo válido y realizar las acciones que correspondan 
            // cuando se cumpla alguna de las posibles casuísticas
            // TODO
            
            if(tablero[y][x].equals("J")){
                System.out.println("¡Vaya! Parece que te has disparado sobre uno de tus barcos.");
                tablero[y][x] = "X";
                aux[y][x] = "X";
                barcosJugador--;
            }else if(tablero[y][x].equals("O")){
                System.out.println("¡Increible! Has acertado sobre uno de los barcos del ordenador.");
                tablero[y][x] = "!";
                aux[y][x] = "!";
                barcosOrdernador--;
            }else if(tablero[y][x].equals(" ")){
                System.out.println("Has disparado sobre una parte vacía del océano.");
                tablero[y][x] = "-";
                aux[y][x] = "-";
            }else if(tablero[y][x].equals("X") || tablero[y][x].equals("!") || tablero[y][x].equals("-")){
                System.out.println("Has disparado en un lugar donde ya había caído un disparo.");
            }

            tmp++;


        }while(tmp<1); // TODO /* Disparo no válido */);  //Sigue repitiendo hasta que haya un disparo no válido.
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

            if(tablero[y][x].equals("J")){
                System.out.println("¡NO! El ordenador ha disparado sobre uno de tus barcos.");
                tablero[y][x] = "X";
                aux[y][x] = "X";
                barcosJugador--;
            }else if(tablero[y][x].equals("O")){
                System.out.println("¡SIUUUU! El ordenador se ha disparado sobre uno de sus barcos.");
                tablero[y][x] = "!";
                aux[y][x] = "!";
                barcosOrdernador--;
            }else if(tablero[y][x].equals(" ")){
                System.out.println("El ordenador ha disparado sobre una parte vacía del océano.");
                tablero[y][x] = "-";
                aux[y][x] = "-";
            }else if(tablero[y][x].equals("X") || tablero[y][x].equals("!") || tablero[y][x].equals("-")){
                System.out.println("El ordenador ha disparado en un lugar donde ya había caído un disparo.");
            }

            tmp++;

        }while(tmp<1); // TODO /* Disparo no válido */);  //Sigue repitiendo hasta que haya un disparo válido.
    }

    public static void gameOver(){
        System.out.println("Tus barcos: " + barcosJugador + 
         " | Barcos del ordenador: " + barcosOrdernador);
         // TODO/*¿Cuántos barcos quedan del jugador?*/
         // TODO/*¿Cuántos barcos quedan del ordenador?*/
        if(barcosJugador > 0) // TODO /* Condición de victoria */
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

        System.out.print("  ");

        for(int i = 0; i < numColumnas; i++){
            System.out.print(i);
        }

        System.out.println("");

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

        for(int i = 0; i < tablero.length; i++){

            for(int j = 0; j < tablero[i].length; j++){
                if(j == 0){
                    System.out.print(i + "|");
                    System.out.print(aux[i][j]);
                }else if(j == 9){
                    System.out.print(aux[i][j]);
                    System.out.print("|" + i);
                }else{
                    System.out.print(aux[i][j]);
                }
            }
            System.out.println("");
        }

        //Última sección del mapa del océano
        /*
         *  0123456789  
         */

        // TODO

        System.out.print("  ");

        for(int i = 0; i < numColumnas; i++){
            System.out.print(i);
        }

        System.out.println("");
        
    }
}