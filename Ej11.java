/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.

 * @author KuzaFkto
 */

import java.util.Scanner;
import java.lang.Math;
public class Ej11{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.printf("%-10s %-10s %-10s","número","cuadrado","cubo");
        for (int i = n; i <=n+5; i++) {
            System.out.printf("\n%-3s %13s %9s", i, Math.pow(i, 2), Math.pow(i,3));
            
        }
        sc.close();

    }
}