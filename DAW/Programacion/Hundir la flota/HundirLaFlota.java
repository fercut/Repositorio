import java.lang.ref.Cleaner;
import java.util.*;

public class HundirLaFlota {
    public static int numFilas = 10; 
    public static int numColumnas = 10; 
    public static int barcosJugador = 5;
    public static int barcosOrdenador = 5;
    public static String[][] tablero = new String[10][10];
    public static String[][] aux = new String[10][10];
    public static Scanner consola = new Scanner(System.in);


        public static void imprimirMapaOceano(){
            
            int aux=0;
            System.out.print("  0123456789");
            for(int i=0;i<tablero.length; i++){
                System.out.println();
                System.out.print(aux + "|");
                for(int j=0; j<tablero[i].length; j++){
                    if(tablero[i][j].equals("O")){ // Oculta los barcos del oponente
                        System.out.print(" ");
                    }else{
                        System.out.print(tablero[i][j]);
                    }
                }
                System.out.print("|"+ aux++);
            }   
            System.out.println();
            System.out.println("  0123456789");
        }

    
        public static void mapaOceano(){
           
            for(int i=0;i<tablero.length; i++){
                for(int j=0; j<tablero[i].length; j++){
                    tablero[i][j]=" ";
                }
            }
        }

        public static void barcosJugador(){
          
            for(int i=0; i<HundirLaFlota.barcosJugador;i++){
                
                System.out.println("¿En que fila quieres el barco " + (i+1) + "?");
                int fila=consola.nextInt();
                System.out.println("¿En que columna quieres el barco " + (i+1) + "?");
                int columna=consola.nextInt();

                while(fila>9 || columna>9 || !(tablero[fila][columna].equals(" "))){
                    System.out.println("¿En que fila quieres el barco " + (i+1) + "?");
                    fila=consola.nextInt();
                    System.out.println("¿En que columna quieres el barco " + (i+1) + "?");
                    columna=consola.nextInt();
                }
                tablero[fila][columna]="J";
            }
            System.out.println("Los barcos del jugador estan situados");
        }

        public static void barcosOrdenador(){
            
            for(int i=0; i<HundirLaFlota.barcosOrdenador; i++){
                int fila = (int) (Math.random()*10);
                int columna = (int) (Math.random()*10);
                while(fila>9 || columna>9 || !(tablero[fila][columna].equals(" "))){
                    fila = (int) (Math.random()*10);
                    columna = (int) (Math.random()*10);
                }
                tablero[fila][columna]="O";
            }
            System.out.println("Los barcos del ordenador estan situados");
        }

        public static void turnoJugador(){

            System.out.println("TU TURNO \n Fila a disparar:");
            int fila = consola.nextInt();
            System.out.println("Fila a columna: ");
            int columna = consola.nextInt();
            
            if(fila>9 || columna>9){
                System.out.println("Tu disparo se ha ido fuera");
            }else if(tablero[fila][columna].equals("O")){
                tablero[fila][columna]="!";
                System.out.println("Bien, le has dado a un barco de tu oponente");
                barcosOrdenador--;
            }else if(tablero[fila][columna].equals("J")){
                tablero[fila][columna]="X";
                System.out.println("Le has dado a tu propio barco");
                barcosJugador--;
            }else if(tablero[fila][columna].equals(" ")){
                tablero[fila][columna]="-";
                System.out.println("Tu disparo ha caido en el mar");
            }else{
                System.out.println("Tu disparo ha caido donde otro disparo anterior");
            }
        }
        public static void turnoOrdenador(){

            System.out.print("ORDENADOR \n Fila a disparar: ");
            int fila = (int) (Math.random()*10);
            System.out.println(fila);
            System.out.print("Fila a columna: ");
            int columna = (int) (Math.random()*10);
            System.out.println(columna);
            if(tablero[fila][columna].equals("J")){
                tablero[fila][columna]="X";
                System.out.println("Te ha dado");
                barcosJugador--;
            }else if(tablero[fila][columna].equals("O")){
                tablero[fila][columna]="!";
                System.out.println("Bien, el oponente se ha autodisparado");
                barcosOrdenador--;
            }else if(tablero[fila][columna].equals(" ")){
                tablero[fila][columna]="-";
                System.out.println("Su disparo ha ido al mar");
            }else{
                System.out.println("Su disparo ha caido donde otro disparo anterior");
            }
        }
        public static void gameOver(){
            if(barcosJugador==0){
                System.out.println("   GAME OVER \n ERES UN PERDEDOR");
            }
            if(barcosOrdenador==0){
                System.out.println("HAS GANADO CAMPEON");
            }
        }

        public static void convate(){

            while(barcosJugador!=0 && barcosOrdenador!=0){
                turnoJugador();
                turnoOrdenador();
                imprimirMapaOceano();
            }
            gameOver();
        }
        public static void main(String[] args) {
            
            mapaOceano();
            barcosJugador();
            barcosOrdenador();
            imprimirMapaOceano();
            convate();
        }
    }
 