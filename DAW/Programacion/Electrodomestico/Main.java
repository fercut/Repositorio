import clases.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Lavadora PWM300 = new Lavadora("Miele", 2119, 1100, false);
        double horasFuncionamiento = Double.parseDouble(JOptionPane.showInputDialog("Escribe las horas de consumo"));
        JOptionPane.showMessageDialog(null, PWM300.toString());
        JOptionPane.showMessageDialog(null, "El consumo en kwh de " + horasFuncionamiento + " horas es de "
                + PWM300.getConsumo(horasFuncionamiento) + "Kwh");

    }
}