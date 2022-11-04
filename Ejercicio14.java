/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.

 * @author KuzaFkto
 */

 import java.util.Scanner;
 import java.lang.Math;
public class Ejercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la base");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente");
        int exp = sc.nextInt();
        if (exp > 0){
            System.out.println(base + " elevado a " + exp + " es igual a " + Math.pow(base,exp));
        }else {
            System.out.println("No se puede tener un exponente negativo");
        }
        sc.close();
    }
}