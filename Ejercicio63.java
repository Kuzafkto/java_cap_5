/*
 *
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base.
Ejemplo 1:
Introduzca la altura de la primera pirámide: 7
Introduzca la altura de la segunda pirámide: 3
      *
     ***
    *****
   *******
  *********     *
 ***********   ***
************* *****

* Ejemplo 2:
Introduzca la altura de la primera pirámide: 4
Introduzca la altura de la segunda pirámide: 5
*
            *
   *       ***
  ***     *****
 *****   *******
******* *********
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int alturaP1 = sc.nextInt();
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        int alturaP2 = sc.nextInt();
        int alturaMaxima = Math.max(alturaP1, alturaP2);
        int espaciosP1 = alturaP1 - 1;
        int espaciosP2 = alturaP2 - 1;
        int baseP1 = alturaP1 * 2 - 1;
        int baseP2 = alturaP2 * 2 - 1;
        int asteriscosP1 = 1;
        int asteriscosP2 = 1;
        for (int i = alturaMaxima; i > 0; i--) {
// Pirámide 1
            if (i > alturaP1) {
// Si la pirámide 1 queda por debajo, pinta el hueco.
                for (int j = 0; j <= baseP1; j++) {
                    System.out.print(" ");
                }
            } else {
// Espacios por delante de la pirámide 1
                for (int j = 0; j < espaciosP1; j++) {
                    System.out.print(" ");
                }
// Pirámide 1
                for (int j = 0; j < asteriscosP1; j++) {
                    System.out.print("*");
                }
// Espacios por detrás de la pirámide 1
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }

                espaciosP1--;
                asteriscosP1 += 2;
            }
// Pirámide 2
            if (i > alturaP2) {
// Si la pirámide 2 queda por debajo, pinta el hueco.
                for (int j = 0; j < baseP2; j++) {
                    System.out.print(" ");
                }
            } else {
// Espacios por delante de la pirámide 1
                for (int j = 0; j < espaciosP2; j++) {
                    System.out.print(" ");
                }
// Pirámide 1
                for (int j = 0; j < asteriscosP2; j++) {
                    System.out.print("*");
                }
// Espacios por detrás de la pirámide 1
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }
                espaciosP2--;
                asteriscosP2 += 2;
            }
            System.out.println();
        }
                sc.close();
    }
}


/*
*   Better version By Adrian
 *
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
 * una al lado de la otra y separadas por un espacio en su base.
 *
 * @author Adrián Perogil Fernández
 *
 *
import java.util.Scanner;
public class Ej63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int altura1 = sc.nextInt();
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        int altura2 = sc.nextInt();
        // Variable alturaMaxima copiada de la solución
        int alturaMaxima = Math.max(altura1, altura2);

        int espacios1 = altura1 - 1;
        int espacios2 = altura2 - 1;
        int asteriscos1 = 1;
        int asteriscos2 = 1;
        int base1 = altura1 * 2 - 1;
        int base2 = altura2 * 2 - 1;

        for (int i = alturaMaxima; i > 0; i--) {
            // Primera pirámide
            if (i > altura1) {
                // Si la pirámide 1 queda por debajo, pinta el hueco.
                for (int j = 0; j <= base1; j++) {
                    System.out.print(" ");
                }
            } else {

                // Espacios izquierdos de la pirámide
                for (int j = 0; j < espacios1; j++) {
                    System.out.print(" ");
                }

                // Asteríscos de la pirámide
                for (int j = 0; j < asteriscos1; j++) {
                    System.out.print("*");
                }

                // Espacios derechos de la pirámide (Realizamos una espacie de cuadrado
                // que contendrá el triángulo realizado para pintar la segunda pirámide)
                for (int j = 0; j <= espacios1; j++) {
                    System.out.print(" ");
                }

                // Rebajamos un espacio tanto de la parte izquierda como de la parte derecha
                espacios1--;
                // Hace que pintemos ** por línea en vez de *
                asteriscos1 += 2;
            }

            // Segunda pirámide
            if (i > altura2) {
                // Si la pirámide 2 queda por debajo, pinta el hueco.
                for (int j = 0; j < base2; j++) {
                    System.out.print(" ");
                }
            } else {
                // Espacios izquierdos de la pirámide
                for (int j = 0; j < espacios2; j++) {
                    System.out.print(" ");
                }

                // Asteríscos de la pirámide
                for (int j = 0; j < asteriscos2; j++) {
                    System.out.print("*");
                }

                // Espacios derechos de la pirámide
                for (int j = 0; j <= espacios1; j++) {
                    System.out.print(" ");
                }

                // Rebajamos un espacio tanto de la parte izquierda como de la parte derecha
                espacios2--;
                // Hace que pintemos ** por línea en vez de *
                asteriscos2 += 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
*
*
* */
