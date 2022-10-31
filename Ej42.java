/*
 *
 * Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.
Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo

 *@author KuzaFkto
 */

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Ej42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo:");
        int n = sc.nextInt();
        boolean prime = true;
        if (n>0){
            for(int i =n ; i<=n+5; i++) {

                 }
        }else {
            System.out.println("El número ingresado debe ser positivo");
        }
        sc.close();
    }
    }
