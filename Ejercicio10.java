/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 *
 *
 * @author KuzaFkto
 */
import java.util.Scanner;
 public class Ejercicio10{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num=sc.nextInt();
        int cont = 0;
        double sum = 0;
        while (num>0) {
            cont ++;
            sum+=num;
            System.out.println("Ingrese otro número");
            num = sc.nextInt();
        }
        System.out.println("La media de " + sum + " es "+ sum/cont);
        sc.close();
    }
 }