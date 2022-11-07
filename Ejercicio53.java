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
Introduzca la altura de la figura: 5
*****
****
***
**
*

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la figura: ");
        int heigth=sc.nextInt();
        for (int i = 0 ; i <heigth ; i++){
            for (int x= heigth-i ; x>0;x--){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
