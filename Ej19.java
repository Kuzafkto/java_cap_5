/*
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ej19{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la altura de la piramide");
        int height = sc.nextInt();
        System.out.println("Ingrese el caracter para pintar la piramide");
        char c = sc.next().charAt(0); 

        for ( int i=1; i<=height; i++){
            for (int x=height-i; x>=0; x--){
                System.out.print(" ");
            }
                for (int z=1;z<=i*2-1;z++){
                    System.out.print(c);
                }
            System.out.println("");
        }
        sc.close();
    
    }
}