/*
 *
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
*
Ejemplo 1
 *
 * Introduzca la altura de la figura: 8
********
 *     *
  *    *
   *   *
    *  *
     * *
      **
       *
Ejemplo 2:
Introduzca la altura de la figura: 5
*****
* *
* *
**
*

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int height = sc.nextInt();

        for (int z= height ; z>0;z--){
            System.out.print("*");
        }

        System.out.println("");

        for (int i = 1; i < height-1 ; i++){
            for (int x = 1; x<i; x++){
                System.out.print(" ");
            }

            System.out.print("*");
            for (int z= height-i ; z>1;z--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int z= height ; z>1;z--){
            System.out.print(" ");
        }
        System.out.print("*");


        sc.close();
    }
}
