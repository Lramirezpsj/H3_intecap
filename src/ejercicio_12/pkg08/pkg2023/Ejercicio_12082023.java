package ejercicio_12.pkg08.pkg2023;

import java.util.Scanner;

public class Ejercicio_12082023 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int filas = 0, columnas = 0, contador = 1;

        

        System.out.print("Cuantas filas deseas : ");
        filas = entrada.nextInt();

        System.out.print("Cuantas columnas deseas : ");
        columnas = entrada.nextInt();
        
        int arreglo[][] = new int[filas][columnas];
        
        System.out.println("");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arreglo[i][j] = contador;
                contador++;
                
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");

        }

    }
}
