/*
 *
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.
Ejemplo 1:
Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
Ahora introduzca la altura (como mínimo 2): 1
Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altur\
a es 2.
Ejemplo 2:
Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
Ahora introduzca la altura (como mínimo 2): 4
* * * * * *
*         *
*         *
* * * * * *
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca la anchura del rectángulo (como mínimo 2):");
        int lenght = sc.nextInt();
        System.out.println("Ahora introduzca la altura (como mínimo 2): ");
        int height = sc.nextInt();

        if (lenght>2 && height>2){

            for (int i = 0 ; i<lenght; i++){
                System.out.print("*");
            }
            System.out.println("");

            for (int i = 0 ; i <height-2 ; i++){
                System.out.print("*");
                for (int z =0; z< lenght-2;z++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");

            }
            for (int i = 0 ; i<lenght; i++){
                System.out.print("*");
            }
            System.out.println("");
        } else {
            System.out.println("La altura y la anchura deben ser mayores a 2");
        }
        sc.close();
    }
}
