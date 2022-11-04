/*
 *
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos.
*
Ejemplo 1:
*
Introduzca un número entero: 67706
Dígitos que aparecen en el número: 0 6 7
Dígitos que no aparecen: 1 2 3 4 5 8 9
*
Ejemplo 2:
*
Introduzca un número entero: 555
Dígitos que aparecen en el número: 5
Dígitos que no aparecen: 1 2 3 4 6 7 8 9
*
Ejemplo 3:
*
Introduzca un número entero: 9876543210
Dígitos que aparecen en el número: 0 1 2 3 4 5 6 7 8 9
Dígitos que no aparecen:
*
Ejemplo 4:
*
Introduzca un número entero: 13247721
Dígitos que aparecen en el número: 1 2 3 4 7
Dígitos que no aparecen: 0 5 6 8
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        long n = sc.nextLong();
        long nCopy = n;
        String included = "";
        String nonIncluded ="";
        String showed ="";

        for (int i = 0 ; i <= 9 ; i++){
            nCopy=n;
            while (nCopy>=10){
                if (nCopy%10==i){
                    included= i + included;
                    showed+=i;
                    nCopy=-1;
                }else {
                    nCopy/=10;
                }
            }
            if (nCopy==i){
                included = i + included ;
                showed+=i;
            }
        }
        System.out.println("Dígitos que aparecen en el número: "+showed);
        long  longIncluded=Long.parseLong(included);

        for (int z=876543210; z>=1; z/=10){
            if (z%10==longIncluded%10){
                longIncluded/=10;
            }else {
                nonIncluded+=z%10 ;
            }
        }
        if (longIncluded%10!=9){
            nonIncluded+="9";
        }
        System.out.println("Dígitos que no aparecen: " + nonIncluded);
        sc.close();
    }
}
