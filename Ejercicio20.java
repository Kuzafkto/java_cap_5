/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

 *@author KuzaFkto  
 */

import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la altura de la piramide");
        int height = sc.nextInt();
        System.out.println("Ingrese el caracter para pintar la piramide");
        char c = sc.next().charAt(0); 

       


        for ( int i=1; i<=height-1; i++){
            for (int x=height-i; x>0; x--){
                System.out.print(" ");
            }if (i==1){
                System.out.print(c);
            }else{
                System.out.print(c);
                for (int z=1;z<=i*2-3;z++){
                    System.out.print(" ");
                }
            System.out.print(c);

            }
         
           
                System.out.println("");
        }

        for (int z=1;z<=height*2-1;z++){
            System.out.print(c);
        }
        sc.close();
    
    }
}