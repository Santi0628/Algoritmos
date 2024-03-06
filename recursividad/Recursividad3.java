package recursividad;

public class Recursividad3 {

        public static boolean esCodigoCorrecto(String codigo, int indice, int suma) {
            if (indice < 0) {
                // Si la suma es múltiplo de 10, entonces el código es correcto
                return suma % 10 == 0;

            } else {
                // Convertir el carácter en la posición 'indice' a un dígito
                int digito = codigo.charAt(indice) - '0';

                // Multiplicar el dígito por 3 si 'indice' es par, de lo contrario por 1
                int factor = (indice % 2 == 0) ? 3 : 1;

                // Agregar el producto a la suma y continuar con el siguiente dígito
                return esCodigoCorrecto(codigo, indice - 1, suma + digito * factor);
            }
        }

        public static boolean esCodigoCorrecto(String codigo) {
            return esCodigoCorrecto(codigo, codigo.length() - 2, codigo.charAt(codigo.length() - 1) - '0');
        }

        public static void main(String[] args) {
            System.out.println(esCodigoCorrecto("65839522"));  // Debería imprimir 'true'
        }

}
