/*
 *Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de longya que el primero admite números más largos.
*
Ejemplo 1:
Por favor, introduzca un número entero positivo: 678
El 678 no es capicúa.
*
Ejemplo 2:
Por favor, introduzca un número entero positivo: 2019102
El 2019102 es capicúa.

 *
 *@author KuzaFkto
 */

import java.util.Scanner;
import  java.lang.Math.*;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        long num = sc.nextInt();
        String numS = "";
        long rest= num;
        String pos = "";
        long counter = 0;

        while (rest>=10){
            numS+=rest%10;
            rest = rest/10;
        }
        numS+=rest;
        long numInv=Integer.parseInt(numS);
        if (num==numInv){
            System.out.println("El número ingresado es capicúa");
        }else{
            System.out.println("El número ingresado no es capicúa");
        }
        sc.close();
    }
}
