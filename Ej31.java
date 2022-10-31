/*
 *Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
Ejemplo:
*
Introduzca la altura de la L: 5
*
*
*
*
* * *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura deseada de la L");
        int height = sc.nextInt();
        for (int i = 1 ; i<height ; i++){
            System.out.println("*");
        }
        for(int i = 1; i<=(height/2)+1;i++){
            System.out.print("* ");
        }
        sc.close();
    }
}
