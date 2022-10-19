/*
 * Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).

 * 
 * @author KuzaFkto
 */

 import java.util.Scanner;
public class Ej17{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un número para mostrar los 100 primeros despues de ese");

        int n = sc.nextInt();
        if (n>0){
            for (int i = 1; i <n+99; i++) {
                System.out.println(n+i);
            }
        }else {
            System.out.println("El número ingresado no puede ser negativo");
        }
        sc.close();

    }
}