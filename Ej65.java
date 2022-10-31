/*
 *Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
Ejemplo 1:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 5
      *
     * *
    *   *
   *     *
  *********
 *         *
*           *

* Ejemplo 2:
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 6
      *
     * *
    *   *
   *     *
  *       *
 ***********
*           *
*
Ejemplo 3:
*
Introduzca la altura de la A (un número mayor o igual a 3): 7
Introduzca la fila del palito horizontal (entre 2 y 6): 7
La fila introducida no es correcta.
*
Ejemplo 4:
Introduzca la altura de la A (un número mayor o igual a 3): 2
La altura introducida no es correcta.
*
Ejemplo 5:
Introduzca la altura de la A (un número mayor o igual a 3): 4
Introduzca la fila del palito horizontal (entre 2 y 3): 2
   *
  ***
 *   *
*     *
Ejemplo 1:
Introduzca la altura de la A (un número mayor o igual a 3): 5
Introduzca la fila del palito horizontal (entre 2 y 4): 4
    *
   * *
  *   *
 *******
*       *

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        int heigth = sc.nextInt() - 1;
        System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+ heigth+"):");
        int line = sc.nextInt();

        if (heigth>=2&&line<=heigth&&line>=2){
            for (int x= heigth ; x>0; x--){
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println("");

            for (int i = 1 ; i <= heigth; i ++){
                for (int x= heigth- i ; x>0; x--){
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i+1 == line){
                    for (int z = 0; z < i*2-1; z++){
                        System.out.print("*");
                    }
                }else{
                    for (int z = 0; z < i*2-1; z++){
                        System.out.print(" ");
                    }
                }

                System.out.print("*");
                System.out.println("");

            }
        }else {
            System.out.println("Error al ingresar la altura de la A o del palito horizontal");
        }

        sc.close();
    }
}
