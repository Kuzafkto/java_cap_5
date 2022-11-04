/*
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
*
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
El 406783 contiene 4 dígitos pares y 2 dígitos impares.
*
Ejemplo 2:
Por favor, introduzca un número entero positivo: 3177840
El 3177840 contiene 3 dígitos pares y 4 dígitos impares.

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        long n=sc.nextLong();
        long rest = n;
        int oddCounter = 0;
        int evenCounter=0;
        while (rest>=10){
            if ((rest%10)%2 == 0) {
                evenCounter++;
            }else {
                oddCounter++;
            }
            rest/=10;
        }
        if (rest%2 == 0) {
            evenCounter++;
        }else {
            oddCounter++;
        }
        System.out.println("El " + n + " contiene " + evenCounter + " digitos pares y " + oddCounter + " digitos impares");
        sc.close();
    }
}
