/*
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.

 * @author KuzaFkto
 */

 import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int passwd = 1234;
        int intent=0;

        for (int i = 4; i>=1 && passwd!=intent;i--){
            System.out.println("Ingrese un número de 4 cifras, te quedan " + i +" intentos");
            intent=sc.nextInt();
            if (passwd==intent){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }else{
                System.out.println("  Lo siento, esa no es la combinación");
            }
        }
        sc.close();
    }
}