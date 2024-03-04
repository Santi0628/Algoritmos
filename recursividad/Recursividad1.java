package recursividad;

public class Recursividad1 {

    public static void main(String[] args) {
        int n = 21;
        int [][] matrizLlenar = new int[n][n];
        int [] [] matrizFull = llenarMatrizEspiral(matrizLlenar, 0, n, 0, n, 1);

        for (int[] enteros : matrizFull) {
            System.out.print("|");
            for (int y = 0; y < enteros.length; y++) {
                System.out.print(enteros[y]);
                if (y != enteros.length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    /*
    - Escriba algoritmo iterativo que permita llenar una matriz de n x n en forma de espiral,
     tal como se muestra a continuación.
     */
    public static int [] [] llenarMatrizEspiral (int[][] matriz, int filaInicio, int filaFin, int colInicio,
                                                 int colFin, int num){

        if (filaInicio >= filaFin && colInicio >= colFin ){
            return  matriz;
        }

        // Llenar hacia abajo
        for (int i = filaInicio; i < filaFin - 1; i++){
            matriz[i][colInicio] = num++;
        }

        // Llenar hacia la derecha
        for (int j = colInicio ; j < colFin; j++){
            matriz[filaFin-1][j] = num++;
        }

        // Llenar hacia arriba
        for (int k = filaFin-2; k > filaInicio; k--){
            matriz[k][colFin - 1] = num++;
        }

        // Llenar hacia la izquierda
        for (int z = colFin-1; z > colInicio; z--){
            matriz[filaInicio][z] = num++;
        }

        return llenarMatrizEspiral(matriz, filaInicio+1, filaFin-1,
                colInicio+1 , colFin-1, num);
    }

}
