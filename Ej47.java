/*
 *
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres.
Ejemplo 1:
Por favor, introduzca la altura (número impar mayor o igual a 5): 8
La altura introducida no es correcta
Ejemplo 2:
Por favor, introduzca la altura (número impar mayor o igual a 5): 3
La altura introducida no es correcta
Ejemplo 3:
Por favor, introduzca la altura (número impar mayor o igual a 5): 5
MMMMMM
M    M
MMMMMM
M    M
MMMMMM
Ejemplo 4:
Por favor, introduzca la altura (número impar mayor o igual a 5): 9
MMMMMM
M    M
M    M
M    M
MMMMMM
M    M
M    M
M    M
MMMMMM

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenght = 6;
        System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int height = sc.nextInt();

        if (height >= 5 && height%2!=0) {


            for (int i = 0 ; i<lenght; i++){
                System.out.print("M");
            }
            System.out.println("");

            for (int i = 0 ; i <height-2 ; i++){
                if (i == (height/2)-1){
                    for ( int z = 0 ; z<lenght; z++){
                        System.out.print("M");
                    }

                }else {
                    System.out.print("M");
                    for (int z =0; z< lenght-2;z++){
                        System.out.print(" ");

                    }
                    System.out.print("M");
                }
                System.out.println("");

            }
            for (int i = 0 ; i<lenght; i++){
                System.out.print("M");
            }
            System.out.println("");
        } else {
            System.out.println("La altura introducida no es correcta");
        }
        sc.close();
    }
}
