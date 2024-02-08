package iniciando;

import javax.swing.*;

public class Exercise1 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));
        calcularCifras1(numero);
        calcularCifras2(numero);
    }

    public static void calcularCifras1(int num) {
        int aux = num, con = 0;
        if (num == 0) {
            JOptionPane.showMessageDialog(null, "Cifras de " + num + " es : " + 1);
        }
        for (int i = 10; num != 0; i += 10) {
            con = con + 1;
            num = num / i;
            i = i - 10;
        }
        if (con != 0) {
            JOptionPane.showMessageDialog(null, "Cifras de " + aux + " es : " + con);
        }
    }

    public static void calcularCifras2(int num) {
        int cifras;
        if (num == 0) {
            cifras = 1;
        } else {
            cifras = (int) (Math.log10(Math.abs(num)) + 1);
        }
        JOptionPane.showMessageDialog(null, "Cifras de " + num + " es : " + cifras);
    }


}