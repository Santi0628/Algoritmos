package iniciando;

public class Exercise2 {

    public static void main(String[] args) {

        // int [] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int dato = 5;

        // boolean resultado = busqueda(arreglo, dato);
        // System.out.println(resultado);

        /* double[][] matriz = {
                {1,  2,  3,  4,  5},
                {2,  7,  8,  9,  10},
                {3,  8,  13, 14, 16},
                {4,  9,  14, 20, 21},
                {5,  10, 16, 21, 26}
        }; */

        // boolean resultado = simetrica(matriz);
        // System.out.println(resultado);

        // double [] [] matriz = new double[10][10];
        // double [] [] matrizLlena = fullMatrix(0, 0, matriz);

        int [] [] matrizSebas = new int[5][5];
        int [] [] matrizSebasFull = crearMatriz(0, 0, 0, matrizSebas);

        for (int[] enteros : matrizSebasFull) {
            System.out.print("|");
            for (int y = 0; y < enteros.length; y++) {
                System.out.print(enteros[y]);
                if (y != enteros.length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }

        /*for (double[] doubles : matrizLlena) {
            System.out.print("|");
            for (int y = 0; y < doubles.length; y++) {
                System.out.print(doubles[y]);
                if (y != doubles.length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }*/
    }

    static boolean busqueda(int[] arreglo, int dato)
    {
        boolean estado = false;
        for(int i = 0; i < arreglo.length; i++ )
        {
            if (arreglo[i] == dato) {
                estado = true;
                break;
            }
        }
        return estado;
    }

    public static boolean simetrica(double[][] arreglo)
    {
        boolean auxiliar = true;
        for (int i = 0; i < arreglo.length && auxiliar; i++ )
        {
            for (int j = 0; j < arreglo[0].length && auxiliar; j++ )
            {
                if (arreglo[i][j]!= arreglo[j][i] && i!=j)
                {
                    auxiliar=false;
                }
            }
        }
        return auxiliar;
    }

    public static double [][] fullMatrix(int i, int j, double [][] matriz){

        if (i == (matriz.length - 1) && j == (matriz[0].length - 1)){
            return matriz;
        }

        if(i!=j){
            int num = (int) (Math.random() * 10) + 1;
            matriz[i][j] = num;
            matriz[j][i] = num;
        }

        if(j == matriz[0].length - 1){
            return fullMatrix(i+1, 0, matriz);
        }

        return fullMatrix(i, j+1, matriz);
    }

    public static int[][] crearMatriz (int i, int j, int e, int[][] matriz)
    {
        if (i==matriz.length- 1 && j==matriz[0].length -1)
        {
            return matriz;
        }

        if (j!=i)
        {
            int num = (int)(Math.random() * 9) + 1;
            matriz[i][j] = num;
            matriz[j][i] = num;
        }

        if (j==matriz[0].length - 1)
        {
            e += 1;
            return crearMatriz (i + 1, e, e, matriz);
        }

        return crearMatriz (i, j + 1, e, matriz);
    }

}
