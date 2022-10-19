/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

 * @author KuzaFkto
 */

 import java.util.Scanner;
public class Ej23{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int total = 0;
        int counter = 0;
        System.out.println("Ingrese un número");
        int n = sc.nextInt();

       while (total+n<=10000){
        total+=n;
        counter ++ ; 
        System.out.println("Ingrese un número");
        n = sc.nextInt();
       }
       System.out.println(" Se han ingresado " + counter +" números,  el total acumulado es de " + total + " y la media es de " + total/counter);
        sc.close();
    }
}