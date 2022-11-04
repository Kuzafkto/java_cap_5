/*
 * 
 */
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio15{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese la base");
    int base = sc.nextInt();
    System.out.println("Ingrese el exponente");
    int exp = sc.nextInt();
    for (int i = 1; i<=exp; i++){
        System.out.println(base + " elevado a "+ i + " = " + Math.pow(base, i));
    }
    sc.close();
}
}