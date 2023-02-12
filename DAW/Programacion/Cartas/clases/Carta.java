package clases;

import java.util.Arrays;

public class Carta {

    private String valor;
    private String palo;
    private Carta[] barajaEspañola = new Carta[40];

    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Carta(Carta[] barajaEspañola) {
        this.barajaEspañola = barajaEspañola;
    }

    public Carta() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Carta[] barajaEspañola() {

        Carta baraja = new Carta(valor, palo);
        String p1 = "oro";
        String p2 = "espadas";
        String p3 = "bastos";
        String p4 = "copas";

        for (int i = 0; i < barajaEspañola.length; i++) {

            if (i < 7) {
                baraja.palo = p1;
                baraja.valor = String.valueOf(i + 1);
                barajaEspañola[i] = baraja;
            } else if (i == 7) {
                baraja.palo = p1;
                baraja.valor = "Sota";
                barajaEspañola[i] = baraja;
            } else if (i == 8) {
                baraja.palo = p1;
                baraja.valor = "Caballo";
                barajaEspañola[i] = baraja;
            } else if (i == 9) {
                baraja.palo = p1;
                baraja.valor = "Rey";
                barajaEspañola[i] = baraja;
            } else if (i > 9 || i < 17) {
                baraja.palo = p2;
                baraja.valor = String.valueOf(i + 1);
                barajaEspañola[i] = baraja;
            } else if (i == 17) {
                baraja.palo = p2;
                baraja.valor = "Sota";
                barajaEspañola[i] = baraja;
            } else if (i == 18) {
                baraja.palo = p2;
                baraja.valor = "Caballo";
                barajaEspañola[i] = baraja;
            } else if (i == 19) {
                baraja.palo = p2;
                baraja.valor = "Rey";
                barajaEspañola[i] = baraja;
            } else if (i > 19 || i < 27) {
                baraja.palo = p3;
                baraja.valor = String.valueOf(i + 1);
                barajaEspañola[i] = baraja;
            } else if (i == 27) {
                baraja.palo = p3;
                baraja.valor = "Sota";
                barajaEspañola[i] = baraja;
            } else if (i == 28) {
                baraja.palo = p3;
                baraja.valor = "Caballo";
                barajaEspañola[i] = baraja;
            } else if (i == 29) {
                baraja.palo = p3;
                baraja.valor = "Rey";
                barajaEspañola[i] = baraja;
            } else if (i > 29 || i < 37) {
                baraja.palo = p4;
                baraja.valor = String.valueOf(i + 1);
                barajaEspañola[i] = baraja;
            } else if (i == 37) {
                baraja.palo = p4;
                baraja.valor = "Sota";
                barajaEspañola[i] = baraja;
            } else if (i == 38) {
                baraja.palo = p4;
                baraja.valor = "Caballo";
                barajaEspañola[i] = baraja;
            } else if (i == 39) {
                baraja.palo = p4;
                baraja.valor = "Rey";
                barajaEspañola[i] = baraja;
            }
        }

        return barajaEspañola;

    }

    @Override
    public String toString() {
        return "Carta [barajaEspañola=" + Arrays.toString(barajaEspañola) + "]";
    }

}