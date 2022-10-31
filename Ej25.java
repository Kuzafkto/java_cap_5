/*
* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
*
* @author KuzaFkto
* */

import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
    System.out.println("Ingrese un número");
    int num = sc.nextInt();
    String numS = "";
    int rest= num;

    while (rest>=10){
        numS+=rest%10;
        rest = rest/10;
    }
    System.out.println(numS+rest);

    sc.close();
    }
}
