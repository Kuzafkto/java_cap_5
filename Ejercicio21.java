/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int oddCounter =0 ; 
        int numCounter = 0;
        int evenBig =0;
        float total = 0;
        System.out.println("Ingrese un número (negativo para terminar el proceso)");
        int num= sc.nextInt();
        while (num>0){
            numCounter++;
            if (num%2==0){
                if (num>evenBig){
                    evenBig=num;
                }
            }else{
                total+=num;
                oddCounter++;
            }
            System.out.println("Ingrese un número (negativo para terminar el proceso)");
            num=sc.nextInt();
    }

    System.out.println("Se han introducido "+ numCounter+ " números, el número par más grande es el " + evenBig + " y la media de los números impares es "+ total + " / " + oddCounter + " = " + total/oddCounter);
    sc.close();
}
}