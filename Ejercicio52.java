/*
 *
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual.
 *
 *Ejemplo 1:
 *
Introduzca un número: 609831
El número resultado es 98316
*
Ejemplo 2:
*
Introduzca un número: 78201345
El número resultado es 82013457
*
Ejemplo 3:
*
Introduzca un número: 24
El número resultado es 42
*
Ejemplo 4:
*
Introduzca un número: 8
El número resultado es 8
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = sc.nextLong();
         long aux=n;
         int longitud=0;
            while(aux>0){
            aux/=10;
            longitud++;
            }
         int primero=(int)(n/Math.pow(10,longitud-1));
         int resto=(int)(n%Math.pow(10,longitud-1));
         System.out.printf("El número resultado es %d \n",resto*10+primero);

        sc.close();
    }
}

/*CLASS VERSION
*
* import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        long n = sc.nextLong();
        * long aux=n;
        * int longitud=0;
        * while(aux>0){
        * aux/=10;
        * longitud++;
        * }
        * int primero=(int)(n/Math.pow(10,longitud-1));
        * int resto=(int)(n%Math.pow(10,longitud-1));
        * System.out.printf("El número resultado es %d \n",resto*10+primero)

        sc.close();
    }
}
*
* --------------------VERSION MADE BY ME-------------------------
*
* import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        long n = sc.nextLong();
        String n2 ="";

        while (n>=10){
            n2=n%10+n2;
            n/=10;
        }
        System.out.println("El número resultado es "+ n2+n);
        sc.close();
    }
}
*
* */
