/*
 *
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura del reloj de arena: 5
*****
 ***
  *
 ***
*****

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura del reloj");
        int height = sc.nextInt();
        if (height%2!=0&& height>=3){
            for (int i = 1 ; i<=height/2; i++){
                for (int x = 0 ; x <= i ; x++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int y = height-i*2; y>0;y--){
                    System.out.print("*");
                }
                System.out.print("*");
                System.out.println("");
            }
            for (int z = 0 ; z <=(height/2)+1 ; z++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");


            for (int i = 1 ; i<=height/2; i++){
                for (int x = 0 ; x <= ((height/2)+1)-i ; x++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int y = 1; y<(i*2);y++){
                    System.out.print("*");
                }
                System.out.print("*");
                System.out.println("");
            }

        }else {
            System.out.println("Error, la altura debe ser impar y mayor a 3");
        }
        sc.close();
    }
}
