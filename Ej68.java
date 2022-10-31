/*
 *Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
*
Ejemplo 1:
Por favor, introduzca un número: 9402
Dislocando el 9402 sale el 8513.
*
Ejemplo 2:
Por favor, introduzca un número: 870958422
Dislocando el 870958422 sale el 961849533.
*
Ejemplo 3:
Por favor, introduzca un número: 137
Dislocando el 137 sale el 26

 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long n= sc.nextLong();
        long aux = n;
        String changed="";
        while (n>=10){
            if ((n%10)%2==0){
                changed=(n%10)+1+changed;
            }else{
                changed= (n%10)-1+changed;
            }
            n/=10;
        }
        if (n%2==0){
            changed=(n+1)+changed;
        }else{
            changed=(n-1)+changed;
        }
        System.out.println("Dislocando el "+aux+" sale el "+changed);
        sc.close();
    }
}
