/*
 *
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
Ejemplo 1
*
* Introduzca el número de escalones: 4
Introduzca la altura de cada escalón: 2
****
****
********
********
************
************
****************
****************
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de escalones: ");
        int heigth=sc.nextInt();
        System.out.print("Introduzca la altura de cada escalon: ");
        int esc=sc.nextInt();

        for (int i = 1 ; i<=heigth; i++){
            for (int z = 0 ; z<esc; z++){
                for (int x = 0; x<i; x++){
                    System.out.print("****");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
