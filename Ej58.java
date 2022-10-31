/*
 *Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado.
*
Ejemplo 1:
*
Introduzca un número: 609831
La media de sus dígitos es 4.5
*
Ejemplo 2:
*
Introduzca un número: 78201345
La media de sus dígitos es 3.75
*
Ejemplo 3:
*
Introduzca un número: 24
La media de sus dígitos es 3.0
*
Ejemplo 4:
*
Introduzca un número: 8
La media de sus dígitos es 8.0

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        long n = sc.nextLong();
        double total = 0;
        int counter=1;
        while (n>=10){
            total+=n%10;
            n/=10;
            counter++;
        }
        total+=n;
        total=total/counter;
        System.out.println("La media de sus dígitos es "+ total);
        sc.close();
    }
}
