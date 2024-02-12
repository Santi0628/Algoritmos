package iniciando;

public class Exercise3 {

    public static void main(String[] args) {
        metodo(6);
    }

    public static void metodo(int n)
    {
        int temp, arreglo[] = new int[n];
        for ( int i = 0 ; i <= n; i++ )
        {
            if ( i <= n )
            {
                temp = arreglo[ i ];
                arreglo [ i-1 ] = arreglo[ i ];
            }
        }
    }
}
