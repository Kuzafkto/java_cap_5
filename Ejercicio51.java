/*
 *
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.
*
Ejemplo 1:
*
Introduzca un número entero (mayor que cero): 51803458
Después de haber sido comido por el gusano numérico se queda en 51345
*
Ejemplo 2:
*
Introduzca un número entero (mayor que cero): 29614
El gusano numérico no se ha comido ningún dígito.
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String worm ="";
        System.out.println("Introduzca un número entero (mayor que cero): ");
        long n =sc.nextLong();
        boolean eaten=false;

        if (n>0){
            while (n>=10){
                if (n%10==8||n%10==0){
                    n/=10;
                    eaten=true;
                }  else {
                    worm = n%10+worm;
                    n/=10;
                }
            }
            if (n!=8||n!=0){
                worm = n+worm;
            }
            if (eaten){
                System.out.println("Después de haber sido comido por el gusano numérico se queda en "+worm);

            }else {
                System.out.println("El gusano numérico no se ha comido ningún dígito.");

            }

        } else {
            System.out.println("El número ingresado debe ser mayor a 0");
        }

        sc.close();
    }
}
