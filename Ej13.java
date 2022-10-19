/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.

@author KuzaFkto
 */

 import java.util.Scanner;
public class Ej13{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int posCounter=0;
        int negCounter=0;
        for (int i = 1 ; i<=10; i++){
            int num = sc.nextInt();
            if (num<0){
                negCounter++;
            }else if (num>0){
                posCounter++;
            }
        }

        System.out.println("Hay "+posCounter+" números positivos y "+negCounter+" números negativos");

        sc.close();
    }
}