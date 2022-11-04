/*
 * Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.

*@author KuzaFkto
 */
import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un número para comprobar si es primo");
        int num = sc.nextInt();
        boolean cousin = true;
        if (num > 0) {
            if (num%2==0){
                cousin=false;
                System.out.println("El número no es primo");

            }
            for(int i = 3 ; i<=num/i && cousin ; i+=2 ){
                if (num%i==0){
                    cousin=false;
                    System.out.println("El número no es primo");
                }
            }
            if (cousin){
                System.out.println("El número es primo");
            }

        }else {
            System.out.println("El número no puede ser igual o menor que 0");
        }

        
        sc.close();
    }
}