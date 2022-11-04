/*
*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
*
*  1
  121
 12321
1234321

* @author KuzaFkto
* */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la altura de la piramide");
        int height = sc.nextInt();

        for ( int i=1; i<=height; i++){
            for (int x=height-i; x>0; x--){
                System.out.print(" ");
            }

                for (int a = 1; a<=i; a++){
                    System.out.print(a);
                }
                for (int b = i-1  ; b>=1;b--){
                    System.out.print(b);
                }

            System.out.println("");
        }
        sc.close();
    }
}
