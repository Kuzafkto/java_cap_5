/*
 *
 * Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada.
*
Ejemplo 1:
*
Introduzca la altura de la pirámide maya: 5
*
     ******
    **    **
   **********
  ****    ****
 **************
Ejemplo 2:
Introduzca la altura de la pirámide maya: 8
*
        ******
       **    **
      **********
     ****    ****
    **************
   ******    ******
  ******************
 ********    ********

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        System.out.println("Introduzca la altura de la pirámide maya: ");
        int heigth = sc.nextInt();
        int befSpace= 2;
        int line=6;

        for (int i = 1; i<=heigth; i++){
            for (int z=0; z< heigth-i;z++){
                System.out.print(" ");
            }
            if (i%2==0){
                for (int y=0; y<befSpace; y++){
                    System.out.print("*");
                }
                for (int m=0; m<4; m++){
                    System.out.print(" ");
                }

            for (int y=0; y<befSpace; y++){
                System.out.print("*");
            }
            befSpace+=2;
            }else{
                for (int c=0; c<line;c++){
                    System.out.print("*");
                }
                line+=4;
            }
            System.out.println("");
        }
        sc.close();
    }
}
