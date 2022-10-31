/*
 *
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
*
Ejemplo:
Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:
6
8
15
12
23
Ha introducido 4 números no primos.
Máximo: 15
Mínimo: 6
Media: 10.25
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean prime = false;
        int maxNum=0;
        int minNum=2147483647;
       int  counter = 0 ;
       double total = 0;

        System.out.println(" Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");

        while (!prime){
            n=sc.nextInt();
            //prime check
            prime = true;
            if (n == 0) {
                prime = false;
            } else if (n%2 == 0) {
                prime = false;
            } else {
                for (int x = 3; x <= n/x && prime; x++) {
                    if (n % x == 0) {
                        prime = false;
                    }
                }
            }
            if (!prime){
                counter ++;
                if (n<minNum){
                    minNum=n;
                }
                if (n>maxNum){
                    maxNum=n;
                }
                total+=n;
                //prime check
            }
       }
        System.out.println("Ha introducido "+ counter + " numeros no primos \n" + " Máximo: " + maxNum + "\n Mínimo: " + minNum + "\n Media: " + total/counter );
        sc.close();
    }
}
