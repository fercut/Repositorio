import java.util.Scanner;

public class TresEnRaya {

    public static String[][] tablero = new String[3][3];
    public static Scanner consola = new Scanner(System.in);
    public static int ganado = 0;
    public static int perdido = 0;
    public static boolean aux = true;

    public static void imprimirtablero() {

        int aux = 0;
        System.out.print("  012");
        for (int i = 0; i < tablero.length; i++) {
            System.out.println();
            System.out.print(aux + "|");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }

            System.out.print("|" + aux++);
        }
        System.out.println();
        System.out.println("  012");
    }

    public static void mesa() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " ";
            }
        }
    }

    public static void turnoJugador() {

        System.out.print("Intoduce la fila de tu ficha: ");
        int fila = consola.nextInt();
        System.out.print("\n Intoduce la columna de tu ficha: ");
        int columna = consola.nextInt();
        while (fila > 3 || columna > 3 || !(tablero[fila][columna].equals(" "))) {
            System.out.println("La ficha que has puesto se sale del tablero o ya hay otro ficha colocada ahi");
            System.out.print("Intoduce la fila de tu ficha: ");
            fila = consola.nextInt();
            System.out.print("\n Intoduce la columna de tu ficha: ");
            columna = consola.nextInt();
        }
        tablero[fila][columna] = "X";
    }

    public static void turnoOrdenador() {

        System.out.print("Intoduce la fila de tu ficha: ");
        int fila = (int) (Math.random() * 3);
        System.out.print(fila);
        System.out.print("\n Intoduce la columna de tu ficha: ");
        int columna = (int) (Math.random() * 3);
        System.out.print(columna + "\n");
        while (fila > 3 || columna > 3 || !(tablero[fila][columna].equals(" "))) {
            columna = (int) (Math.random() * 3);
            fila = (int) (Math.random() * 3);
        }
        tablero[fila][columna] = "O";
    }

    public static void gameOver() {

        int space = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                int aux1 = 0;
                if (tablero[aux1][j].equals("X") && tablero[aux1 + 1][j].equals("X") && tablero[aux1 + 2][j].equals("X")
                        ||
                        tablero[i][aux1].equals("X") && tablero[i][aux1 + 1].equals("X")
                                && tablero[i][aux1 + 2].equals("X")) {
                    ganado = 1;
                    aux = false;
                }
                if (tablero[aux1][j].equals("O") && tablero[aux1 + 1][j].equals("O") && tablero[aux1 + 2][j].equals("O")
                        ||
                        tablero[i][aux1].equals("O") && tablero[i][aux1 + 1].equals("O")
                                && tablero[i][aux1 + 2].equals("O")) {
                    perdido = 1;
                    aux = false;
                }
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals(" ")) {
                    space++;
                }
            }
        }
        if (!(space > 0)) {

            imprimirtablero();
            System.out.println("El tablero esta lleno");
            aux = false;
        }
        if (perdido == 1) {

            imprimirtablero();
            System.out.println("HAS PERDIDO");

        } else if (ganado == 1) {

            imprimirtablero();
            System.out.println("HAS GANADO");
        }

        if (aux == false) {
            System.out.println("¿Quieres volver a jugar? \n true=Si \n false=No");
            aux = consola.nextBoolean();

            if (aux == true) {
                partida();
            }else{
                System.exit(0);
            }
        }
    }

    public static void partida() {
        
        mesa();
        ganado=0; perdido=0;
        while (aux) {
            imprimirtablero();
            turnoJugador();
            gameOver();
            turnoOrdenador();
            gameOver();
        }
    }

    public static void main(String[] args) {
        mesa();
        partida();

    }
}