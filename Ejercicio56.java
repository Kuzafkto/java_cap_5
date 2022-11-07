/*
 *Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
*
Ejemplo 1:
*
Introduzca la altura de la figura: 8
********
 *******
  ******
   *****
    ****
     ***
      **
       *

Ejemplo 2:
*
Introduzca la altura de la figura: 5
*****
 ****
  ***
   **
    *
 *
 *@author KuzaFkto
 */

import java.util.Formattable;
import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int height = sc.nextInt();

        for (int i = 0; i < height ; i++){
            for (int x = 0; x<i; x++){
                System.out.print(" ");
            }
            for (int z= height-i ; z>0;z--){
                System.out.print("*");
            }
            System.out.println("");
        }


        sc.close();
    }
}
