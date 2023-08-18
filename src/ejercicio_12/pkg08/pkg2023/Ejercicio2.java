package ejercicio_12.pkg08.pkg2023;

public class Ejercicio2 {

    public static void main(String args[]) {
        int arreglo[] = new int[50];
        int bandera = 1;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = bandera;
            bandera += 2;

            System.out.print("[" + arreglo[i] + "]");
        }
    }
}
