/*
 *
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.
Ejemplo 1:
Por favor, introduzca la altura del árbol: 7
*
^
^ ^
^ ^
^ ^
^^^^^^^^^
Y
Ejemplo 2:
Por favor, introduzca la altura del árbol: 4
*
^
^^^
Y
Ejemplo 3:
Por favor, introduzca la altura del árbol: 10
*
^
^ ^
^ ^
^ ^
^ ^
^ ^
^ ^
^^^^^^^^^^^^^^^
Y

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del árbol: ");
        int height = sc.nextInt();
        for (int x=height-3; x>0; x--){
            System.out.print(" ");
        } System.out.print("*");
        System.out.println("");

        for ( int i=1; i<=height-3; i++){
            for (int x=height-i; x>2; x--){
                System.out.print(" ");
            }if (i==1){
                System.out.print("^");
            }else{
                System.out.print("^");
                for (int z=1;z<=i*2-3;z++){
                    System.out.print(" ");
                }
                System.out.print("^");

            }


            System.out.println("");
        }

        for (int z=1;z<=height*2-5;z++){
            System.out.print("^");
        }
        System.out.println("");
        for (int x=height-3; x>0; x--){
            System.out.print(" ");
        } System.out.print("Y");
        System.out.println("");

        sc.close();
    }
}
