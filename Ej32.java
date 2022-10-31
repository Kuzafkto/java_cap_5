/*
 *Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
*
Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
*
Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0
*
Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        String numS = "";
        int rest= num;
        String pos = "";
        int total = 0;

        while (rest>=10){
            numS+=rest%10;
            rest = rest/10;
        }
        numS+=rest;
        int  numInv=Integer.parseInt(numS);
        rest = numInv;

        while (rest>=10){
            if (((rest%10)%2)==0){
                total+=rest%10;
                if (pos==""){
                    pos+=rest%10;
                }else {
                    pos+=", "+rest%10;
                }
            }
            rest/=10;
        }
        if (rest%2==0){
            total+=rest%10;
            if (pos==""){
                pos+=rest%10;
            }else {
                pos+=", "+rest%10;
            }
        }
        System.out.println("Dígitos pares: " + pos);
        System.out.println("Suma de los dígitos pares: "+total);

        sc.close();
    }
}
