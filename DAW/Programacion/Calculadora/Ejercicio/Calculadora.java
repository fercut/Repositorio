import java.util.*;
public class Calculadora {

    public static int indice=0;
    public static int numJ1=0;
    public static int numJ2=0;
    public static int suma=0;
    public static int aux=0;
    public static int [][] taclado= new int[3][3];
    public static Scanner consola = new Scanner(System.in);

    public static void teclado(){
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
               taclado[i][j]=++indice;
            }
        }
    }

    public static void imprimirTeclado(){
        for (int i=2;0<=i; i--) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(taclado[i][j]);
            }
        }
        System.out.println();
    }

    public static void turnoJugador1(){
        System.out.println("Numero de Jugador 1:");
        numJ1=consola.nextInt();
        if(aux==0){
            aux++;
            suma+=numJ1;
        }else if(numJ1!=numJ2 && numJ1<10 && numJ1>0){
            suma+=numJ1;
        }
    }
    public static void turnoJugador2(){
        System.out.println("Numero de Jugador 2:");
        numJ2=consola.nextInt();
        if(numJ1!=numJ2 && numJ2<10 && numJ2>0){
            suma+=numJ2;
        }
    }

    public static void gameOver(){
        turnoJugador1();
        System.out.println("La suma acumulada es de: " + suma);
        if(suma>=31){
            System.out.println("Has perdido Jugador 1");
            System.exit(0);
        }
        turnoJugador2();
        System.out.println("La suma acumulada es de: " + suma);
        if(suma>=31){
            System.out.println("Has perdido Jugador 2");
            System.exit(0);
        }else{
            partida();
        }

    }
    
    public static void partida(){
        imprimirTeclado();
        gameOver();
        
    }
    public static void main(String[] args) {

        System.out.println("<<<<<<<<REGLAS DEL JUEGO>>>>>>>>\n\n"+
        "Cada jugador en cada turno debe sumar un número nuevo de un dígito (1-9), \n"+
        "dónde los valores se irán acumulando en cada suma.\n"+
        "Quién llegue a sumar más de 31 o igual, pierde. Es decir, en cada ronda se irá sumando lo que cada\n"+
        "jugador haya marcado.\n"+
        "-En cada turno un jugador sólo podrá utilizar los números situados en la misma fila o columna\n"+
        "que el dígito marcado por su oponente en el turno anterior, sin repetir un número que ya haya\n"+
        "sido usado.\n"+
        "-El número 0 no puede utilizarse nunca.\n"+
        "Por ejemplo, imagina que, durante una partida, un jugador recibe la calculadora mostrándole el número\n"+
        "28, y el oponente acaba de introducir el número 9.\n"+
        "A partir de la disposición de los números de la calculadora, sabemos que en su turno únicamente podrá\n"+
        "jugar los números 3, 6, 7 y 8:");
        teclado();
        partida();
       

    }
}
