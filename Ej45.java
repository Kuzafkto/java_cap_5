/*
 *
 * Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
*
Ejemplo:
*
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double n = sc.nextLong();
        double length = 0;
        System.out.println("Introduzca la posición a partir de la cual quiere partir el número: ");
        double split= sc.nextLong();
        System.out.println("Introduzca el dígito que quiere remplazar: ");
        int digit = sc.nextInt();
        double half= 0;
        double counter = n;
        String numS="";
        // First we check the length of the number
        if ( n > 0 && digit <10 && digit >0){
            for (int i =1; counter>=10;i++){
                length++;
                counter/=10;
            }
            length++;

            // Now we check if the splitting length is tinier than the real length

            if (length>split){

                for (int i = 0 ; i < length-split ; i ++ ){
                    half += (int)(n%10)*Math.pow(10,i);
                    n/=10;
                }
                n/=10;
                numS=""+(int)n+""+digit;

                System.out.println( numS + ""+ (int)half );

            } else {
                System.out.println(" La posición a la que debe ser partido el numero debe ser mayor a la longitud del número");
            }
        } else {
            System.out.println(" Error al ingresar dato");
        }
        sc.close();
    }
}
