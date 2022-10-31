/*
 *
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual.
 *
 *Ejemplo 1:
 *
Introduzca un número: 609831
El número resultado es 98316
*
Ejemplo 2:
*
Introduzca un número: 78201345
El número resultado es 82013457
*
Ejemplo 3:
*
Introduzca un número: 24
El número resultado es 42
*
Ejemplo 4:
*
Introduzca un número: 8
El número resultado es 8
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n = sc.nextInt();
        String n2 ="";

        while (n>=10){
            n2=n%10+n2;
            n/=10;
        }
        System.out.println("El número resultado es "+ n2+n);
        sc.close();
    }
}
