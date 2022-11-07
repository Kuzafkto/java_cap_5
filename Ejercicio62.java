/*
 *Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no.
*
* Ejemplo 1:
*
Introduzca un número: 772
El 772 es un número afortunado.
*
Ejemplo 2:
*
Introduzca un número: 7720
El 7720 no es un número afortunado.
*
Ejemplo 3:
*
Introduzca un número: 43081
El 43081 no es un número afortunado.
*
Ejemplo 4:
*
Introduzca un número: 888
El 888 es un número afortunado.
*
Ejemplo 5:
*
Introduzca un número: 1234
El 1234 no es un número afortunado.
*
Ejemplo 6:
*
Introduzca un número: 6789
El 6789 es un número afortunado.
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String worm ="";
        System.out.println("Introduzca un número: ");
        long n =sc.nextLong();
        int luckycounter=0;
        int unluckycounter=0;
        long n2=n;

        if (n>0){
            while (n>=10){
                if (luckycounter<4){
                    if (n%10==3){
                        luckycounter++;
                    } else if (n%10==7){
                        luckycounter++;

                    } else if (n%10==8) {
                        luckycounter++;

                    } else if (n%10==9) {
                        luckycounter++;

                    }
                }

                 else if (unluckycounter<6){

                    if (n%10==0){
                        unluckycounter++;
                    } else if (n%10==1){
                        unluckycounter++;

                    } else if (n%10==2) {
                        unluckycounter++;

                    } else if (n%10==4) {
                        unluckycounter++;

                    } else if (n%10==5) {
                        unluckycounter++;

                    } else if (n%10==6) {
                        unluckycounter++;

                    }
                }
                n/=10;
            }

            if (luckycounter<4){
                if (n%10==3){
                    luckycounter++;
                } else if (n%10==7){
                    luckycounter++;

                } else if (n%10==8) {
                    luckycounter++;

                } else if (n%10==9) {
                    luckycounter++;

                }
            }

            else if (unluckycounter<6){

                if (n%10==0){
                    unluckycounter++;
                } else if (n%10==1){
                    unluckycounter++;

                } else if (n%10==2) {
                    unluckycounter++;

                } else if (n%10==4) {
                    unluckycounter++;

                } else if (n%10==5) {
                    unluckycounter++;

                } else if (n%10==6) {
                    unluckycounter++;

                }
            }
            if (unluckycounter>luckycounter){
                System.out.println("El " + n2 + " no es un número afortunado");
            }else {
                System.out.println("El "+n2+ " es un número afortunado");
            }
        }else {
            System.out.println("El número ingresado debe ser mayor a 0");
        }
        sc.close();

    }
    }