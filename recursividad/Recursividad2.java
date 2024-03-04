package recursividad;

public class Recursividad2 {

    public static void main(String[] args) {
        // Probamos la función con algunos números
        int[] numeros = {6, 12, 4, 496, 8128, 33550336};

        for (int numero : numeros) {
            if (esNumeroPerfecto(numero, numero - 1, 1) == 1) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto.");
            }
        }
    }

    public static int esNumeroPerfecto(int num, int divisor, int count) {
        if (divisor == 1 || divisor == 0 && count == num) {
            return 1;
        }

        if (num % divisor == 0 && divisor != num) {
            return count + esNumeroPerfecto(num, divisor - 1, count);
        }

        return esNumeroPerfecto(num, divisor - 1, count);
    }
}
