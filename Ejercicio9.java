/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).

 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        int count = 1;

        while (num/10!=0){
           count++;
           num/=10;
        }
        System.out.println("El número tiene " + count + " cifras");
        sc.close();
    }
}