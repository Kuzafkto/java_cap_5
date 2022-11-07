/*
 *
 * La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
no es un número impar mayor o igual que 3, el programa debe mostrar un
mensaje de error.
Ejemplo 1:
Por favor, introduzca la altura de la figura: 7
*    *
 *     *
  *     *
   *     *
  *     *
 *     *
*     *
Ejemplo 2:
Por favor, introduzca la altura de la figura: 3
*     *
 *     *
*     *
Ejemplo 3:
Por favor, introduzca la altura de la figura: 4
La altura no es correcta, debe ser un número impar mayor o igual que 3.

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la figura: ");
        int heigth = sc.nextInt();

        if (heigth >=3 && heigth %2!=0){
            for (int i = 0 ; i< heigth/2; i ++ ) {
                for (int y = 0 ; y<i; y ++ ){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int m  = 0 ; m<4; m++){
                    System.out.print(" ");
                }

                System.out.print("*");
                System.out.println("");
            }
            for (int i = heigth/2; i >= 0; i--) {


                for (int y = 0 ; y<i; y ++ ){
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int m  = 0 ; m<4; m++){
                    System.out.print(" ");
                }


                System.out.print("*");
                System.out.println("");

            }
        }else {
            System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
        }

        sc.close();
    }
}
