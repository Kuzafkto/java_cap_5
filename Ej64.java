/*
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ej64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int heigth=3;
        int length=6;
        int aux=0;
        int choice=0;
      while (choice!=4){
            switch (choice){
                case 1:
                    heigth++;
                    length++;
                 break;

                case 2:
                    if (heigth>2&&length>2){
                        heigth--;
                        length--;
                    }
                    else {
                        System.out.println("La altura o anchura del rectangulo tiene la altura/anchura mas pequeña posible (2)");
                    }
                 break;

                case 3:
                    aux=heigth;
                    heigth=length;
                    length=aux;
                 break;
                default:
                    System.out.println("La opcion elegida es incorrecta");
                    break;
            }
          for (int i = 0 ; i <length; i++){
              System.out.print("*");
          }
          System.out.println("");
          for ( int i = 0 ; i<heigth-2; i++){
              System.out.print("*");
              for (int x = 0 ; x<length-2; x++){
                  System.out.print(" ");
              }
              System.out.print("*");
              System.out.println("");
          }

          for (int i = 0 ; i < length; i++){
              System.out.print("*");
          }
          System.out.println("");
          System.out.printf("1. Agrandarlo \n" + "2. Achicarlo \n"+ "3. Cambiar la orientacion \n"+ "4. Salir \n" + "Indique que quiere hacer con el rectangulo: ");
          choice=sc.nextInt();

      }
        sc.close();
    }
}
