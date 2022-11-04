/*
* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
*
* @author KuzaFkto
* */
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para mostrar los múltiplos de 3");
        int n= sc.nextInt();
        for (int i = 1; i*3<=n; i++){
            System.out.print(i*3 +", ");
        }
        sc.close();
    }
}
