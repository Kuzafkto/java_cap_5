/*

 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();
        System.out.println("------------------");
        for (int i = 1 ; i<=10; i++){
            System.out.printf("%-1s %-14s %-1s\n","|",num+ "X"+ i + " = "+ i*num,"|");
        }
        System.out.println("------------------");
        sc.close();
    }
}