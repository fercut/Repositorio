import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        char caracter;
        String caracterIntroducido;

        Scanner cm = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        caracterIntroducido = cm.nextLine();

        while (!caracterIntroducido.equals(" ")) {
            caracter = caracterIntroducido.toUpperCase().charAt(0);
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                System.out.println("El caracter es una vocal");
            } else {
                System.out.println("El caracter no es una vocal");
            }
            System.out.println("Introduce un caracter");
            caracterIntroducido = cm.nextLine();
        }
    }
}