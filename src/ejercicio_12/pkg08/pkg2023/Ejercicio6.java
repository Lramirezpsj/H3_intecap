
package ejercicio_12.pkg08.pkg2023;


public class Ejercicio6 {
    
    public static void main(String args[]){
       
       String arreglo[][]= new String[2][5];
       
       arreglo[0][0] = "Nombre";
       arreglo[0][1] = "Apellido";
       arreglo[0][2] = "Telefono";
       arreglo[0][3] = "Cumpleaños";
       arreglo[0][4] = "DPI";
       arreglo[1][0] = "Luis";
       arreglo[1][1] = "Ramírez";
       arreglo[1][2] = "4008-9034";
       arreglo[1][3] = "17/08/1985";
       arreglo[1][4] = "2676 28900 0509";
       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+arreglo[i][j]+"]");
                
            }
            System.out.println("");
        }
    }
    
}
