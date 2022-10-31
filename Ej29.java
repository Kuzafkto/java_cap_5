/*
*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.

* @KuzaFkto
* */
import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i=1; i<n ;i++){
            if(i%n2!=0){
                System.out.println(i);
            }
        }
    }
}
