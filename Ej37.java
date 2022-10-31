/*
 *Realiza un conversor del sistema decimal al sistema de “palotes”.
Ejemplo:
* 
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
* 
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = sc.nextInt();
        String numS = "";
        int rest= num;
        String sticks="";

        while (rest>=10){
            numS+=rest%10;
            rest = rest/10;
        }
        numS+=rest;
        int numInv=Integer.parseInt(numS);
        rest = numInv;
        while (rest>=10){
            int minirest=0;
            minirest = rest%10;
            while (minirest>0){
                sticks+="| ";
                minirest--;
            }
            sticks+=" - ";

            rest = rest/10;
        }
        while (rest>0){
            sticks+="| ";
            rest--;
        }
        System.out.println("El "+ num + " en decimal es el "+sticks + "en el sistema de palotes.");
        
        sc.close();
    }
}
