/*
 *Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.
Ejemplo:
Por favor, introduzca un número entero positivo: 7
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num= sc.nextInt();
        int fact = 1;
        for (int y=1 ; y<=num;y++){
            for (int i = 1; i<=y;i++){
                fact*=i;
            }
            System.out.println(y+"! = "+fact);
            fact=1;
        }

        sc.close();
    }
}
