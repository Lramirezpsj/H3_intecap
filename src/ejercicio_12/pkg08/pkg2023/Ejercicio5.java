package ejercicio_12.pkg08.pkg2023;

public class Ejercicio5 {

    public static void main(String args[]) {

        String llave1 = "(", llave2 = ")";
        int fila = 20, contador = 1;
        int arreglo[] = new int[5];  // El arreglo tiene un tamaño fijo de 5 elementos

        for (int i = 0; i < fila; i++) {

            System.out.print(llave1);

            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = contador;
                contador++;
            }

            for (int j = 0; j < arreglo.length; j++) {
                System.out.print(arreglo[j]);
                if (j < arreglo.length - 1) {
                    System.out.print("-");
                }
            }

            System.out.print(llave2);
            System.out.println("");  // Agrega un salto de línea al final de cada fila
        }
        
    }
}


