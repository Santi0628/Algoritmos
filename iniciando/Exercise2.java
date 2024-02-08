package iniciando;

public class Exercise2 {

    public static void main(String[] args) {

        // int [] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int dato = 5;

        // boolean resultado = busqueda(arreglo, dato);
        // System.out.println(resultado);

        double[][] matriz = {
                {1,  2,  3,  4,  5},
                {2,  7,  8,  9,  10},
                {3,  8,  13, 14, 16},
                {4,  9,  14, 20, 21},
                {5,  10, 16, 21, 26}
        };

        boolean resultado = simetrica(matriz);
        System.out.println(resultado);
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

}
