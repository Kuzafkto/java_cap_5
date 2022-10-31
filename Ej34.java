/*
 *Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
*
Ejemplo 1:
*
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97
*
Ejemplo 2:
*
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        long num = sc.nextLong();
        System.out.println("Ingrese otro número");
        long num2 = sc.nextLong();
        String numS = "";
        String numS2 = "";
        long rest= num;
        long rest2= num2;
        String oddString ="";
        String evenString="";

        while (rest>=10){
            numS+=rest%10;
            rest = rest/10;
        }

        while (rest2>=10){
            numS2+=rest2%10;
            rest2 = rest2/10;
        }
        numS+=rest;
        numS2+=rest2;


        long  numInv=Long.parseLong(numS);
        long  numInv2=Long.parseLong(numS2);
        rest = numInv;
        rest2 = numInv2;
        numS="";
        numS2="";

        while (rest>=10 && rest2>=10){
            if((rest%10)%2==0){
                evenString+=rest%10;
            }else {
                oddString+=rest%10;
            }
            if((rest2%10)%2==0){
                evenString+=rest2%10;
            }else {
                oddString+=rest2%10;
            }
            rest = rest/10;
            rest2 = rest2/10;
        }
        if(rest%2==0){
            evenString+=rest%10;
        }else {
            oddString+=rest%10;
        }
        if(rest2%2==0){
            evenString+=rest2%10;
        }else {
            oddString+=rest2%10;
        }

        System.out.println(" El número formado por los dígitos pares es " + evenString);
        System.out.println("El número formado por los dígitos impares es " + oddString);
        sc.close();
    }
}
