package ejercicio_12.pkg08.pkg2023;

public class Ejercicio1 {

    public static void main(String args[]) {

        int arreglo[] = new int[51];
        int bandera = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=bandera;
            bandera +=2;
            
            System.out.print("["+arreglo[i]+"]");
        }
    }
}
