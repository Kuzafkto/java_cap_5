/*
* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
*
* @author KuzaFkto
* */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
    System.out.println("Ingrese un número");
    long num = sc.nextLong();
    long inverted = 0;
    long aux=num;
    while (aux>0){
        inverted=inverted*10+aux%10;
       aux/=10;
    }
    System.out.println("El número " + num + " volteado es " + inverted);

    sc.close();
    }
}
