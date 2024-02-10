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

        double [] [] matriz = new double[5][5];
        double [][] matrizLlena = fullMatrix(matriz.length, matriz[0].length, matriz, 0, 0);
        for (double[] doubles : matrizLlena) {
            System.out.print("|");
            for (int y = 0; y < doubles.length; y++) {
                System.out.print(doubles[y]);
                if (y != doubles.length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
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

    public static double [][] fullMatrix(int fila, int columna, double [][] matriz, int countRow, int countColumn){
        if(countColumn < columna && countRow < fila && matriz[4][1] == 0){
           matriz[countRow] [0] = 4;
           countRow += 1;
           return fullMatrix(fila, columna, matriz, countRow, countColumn);
        }else {
            countRow = 0;
        }

        if(matriz[0][4] == 0){
            matriz[0][countColumn] = 4;
            countColumn += 1;
            return fullMatrix(fila, columna, matriz, countRow, countColumn);
        }



        return matriz;
    }

}
