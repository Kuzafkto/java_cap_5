/*
*
*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
*
* @author KuzaFkto
* */
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        System.out.println("Ingrese el dígito a buscar");
        int search = sc.nextInt();
        String numS = "";
        int rest= num;
        String pos = "";
        int counter = 0;

        while (rest>=10){
            numS+=rest%10;
            rest = rest/10;
        }
        numS+=rest;
        int  numInv=Integer.parseInt(numS);
        rest = numInv;

        while (rest>=10){
            counter++;
            if (rest%10==search){
                if (pos==""){
                    pos+=counter;
                }else {
                    pos+=", "+counter;
                }
            }
                rest/=10;
        }

        System.out.println("El número "+ search+ " se encuentra en las posiciones " + pos);
        sc.close();
    }
}
