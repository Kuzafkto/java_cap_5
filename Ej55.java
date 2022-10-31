/*
 *
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual.
*
Ejemplo 1:
*
Introduzca un número: 609831
El número resultado es 160983
*
Ejemplo 2:
*
Introduzca un número: 78201345
El número resultado es 57820134
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
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = sc.nextLong();
        long digit = n%10;
        String changedN = "";
        n/=10;
        changedN= digit +""+ n;
        System.out.println("El número resultado es "+changedN);
        sc.close();
    }
}
