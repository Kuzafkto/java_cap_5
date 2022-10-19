/*
 * Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.

 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ej12{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de números a mostrar de la serie de Fibonacci");
        int cant = sc.nextInt();
        int num =0;
        int num2 = 1;
            if (cant>=1){
                System.out.print("0 ");
                for (int i = 1; i<cant;i++){
                    System.out.print(num+num2 +" ");
                    num2=num+num2;
                    num=num2-num;
                }
            }
            
            sc.close();

        }
    }
