/*
 *Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.

Ejemplo 1:
Introduzca la altura de la U: 5
*     *
*     *
*     *
*     *
 * * *
 *
Ejemplo 2:

Introduzca la altura de la U: 4
*   *
*   *
*   *
 * *

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la altura de la U");

        int height = sc.nextInt();



        if (height%2==0){

            for (int i = 0 ; i<height-1; i++){
                System.out.print("*") ;
                for (int x = 0; x< height-1 ; x++){
                    System.out.print(" ");
                }
                System.out.print("*") ;

                System.out.println("");
            }

            for (int x = 1; x<= height/2 ; x++){
                System.out.print(" *");
            }
            System.out.println("");
        }else {

            for (int i = 0 ; i<height-1; i++){
                System.out.print("*") ;
                for (int x = 0; x< height ; x++){
                    System.out.print(" ");
                }
                System.out.print("*") ;

                System.out.println("");
            }

            for (int x = 1; x<= height/2+1 ; x++){
                System.out.print(" *");
            }
            System.out.println("");
        }

        sc.close();
    }
}
