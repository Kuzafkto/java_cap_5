/*
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
 * @author KuzaFkto
 */

 import java.util.Scanner;
public class Ejercicio18{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingresa el primer número");
    int n1= sc.nextInt();
    System.out.println("Ingresa el segundo número");
    int n2 = sc.nextInt();
    if (n1 != n2){
        if (n1>n2){
            System.out.println(n2);
            for(int i = n2 ; i<n1 ; i+=7){
                System.out.println(i);
            }
            System.out.println(n1);

        }else {
            System.out.println(n1);
            for(int i = n1 ; i<n2 ; i+=7){
                System.out.println(i);
            }
            System.out.println(n2);

        }
    }else {
        System.out.println("Los números ingresados deben ser diferentes");
    }
    sc.close();
}
}