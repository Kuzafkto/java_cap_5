/*
 *Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.
Ejemplo 1:

 *Introduzca la altura de la V (un número mayor o igual a 3): 7
***           ***
 ***         ***
  ***       ***
   ***     ***
    ***   ***
     *** ***
     *******
Ejemplo 2:
Introduzca la altura de la V (un número mayor o igual a 3): 4
***      ***
 ***    ***
  ***  ***
   ******
Ejemplo 3:
Introduzca la altura de la V (un número mayor o igual a 3): 9
***               ***
 ***             ***
  ***           ***
   ***         ***
    ***       ***
     ***     ***
      ***   ***
       *** ***
       *******
Ejemplo 4:
Introduzca la altura de la V (un número mayor o igual a 3): 2
La altura debe ser mayor o igual a 3.

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int height=sc.nextInt();
        for (int i = 1 ; i<=height; i++){
            for (int x = 0 ; x <= i ; x++){
                System.out.print(" ");
            }
            System.out.print("***");
            for (int y = (height*2)-i*2; y>0;y--){
                System.out.print(" ");

            }
            System.out.print("***");
            System.out.println("");
        }

        for (int z = 0 ; z <=(height/2)+3 ; z++){
            System.out.print(" ");
        }

        sc.close();
    }
}
