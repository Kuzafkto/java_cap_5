import java.util.Scanner;

/*
* Escribe un programa que calcule el factorial de un número entero leído por
teclado.
Ejemplo:
*
Por favor, introduzca un número entero: 6
6! = 720
*
* @author KuzaFkto
* */
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número");
    int num= sc.nextInt();
    int fact = 1;
        for (int i = 1; i<=num;i++){
            fact*=i;
        }
        System.out.println("!"+num+" = "+fact);
        sc.close();
    }
    }
