/*
 *Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).
*
Ejemplo:
*
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición a partir de la cual quiere partir el número: 5
Los números partidos son el 4067 y el 83.
*
 *@author KuzaFkto
 */

import java.util.Scanner;
import java.lang.Math;
public class Ej43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        double n = sc.nextLong();
        double length = 0;
        System.out.println("Introduzca la posición a partir de la cual quiere partir el número: ");
        double split= sc.nextLong();
        double half= 0;
        double counter = n;
        // First we check the length of the number
 if ( n > 0 ){
     for (int i =1; counter>=10;i++){
         length++;
         counter/=10;
     }
     length++;

     // Now we check if the splitting length is tinier than the real length

     if (length>split){

         for (int i = 0 ; i < length-split ; i ++ ){
             half += (int)(n%10)*Math.pow(10,i);
             n/=10;
         }

         System.out.println("Los números partidos son el " + (int)n + " y el "+ (int)half );

     } else {
         System.out.println(" La posición a la que debe ser partido el numero debe ser mayor a la longitud del número");
     }
 } else {
     System.out.println(" El número ingresado debe ser positivo");
 }
        sc.close();
    }
}
