import java.util.Scanner;

/*
*Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
Ejemplo:
*
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.

* @author KuzaFkto;
* */
public class Ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer día de la semana");
        String nameDay =sc.next();
        int day = 0;
        switch (nameDay){
            case "lunes":
                 day = 1;
                break;
            case "martes":
                 day = 2;
                break;
            case "miercoles":
                 day = 3;
                break;
            case "jueves":
                 day = 4;
                break;
            case "viernes":
                 day = 5;
                break;
            case "sabado":
                 day = 6;
                break;
            case "domingo":
                 day = 7;
                break;
            default:
                System.out.println("Error al ingresar el día");
                break;
        }
        System.out.println("Ingresa la hora del " + nameDay + " (solo números)");
        int hour = sc.nextInt();
        int day2 = 0;
        System.out.println("Ingresa el segundo día de la semana");
        String nameDay2= sc.next();
        switch (nameDay2){
            case "lunes":
                day2 = 1;
                break;
            case "martes":
                day2 = 2;
                break;
            case "miercoles":
                day2 = 3;
                break;
            case "jueves":
                day2 = 4;
                break;
            case "viernes":
                day2 = 5;
                break;
            case "sabado":
                day2 = 6;
                break;
            case "domingo":
                day2 = 7;
                break;
            default:
                System.out.println("Error al ingresar el día");
                break;
        }
        System.out.println("Ingresa la hora del " + nameDay2 + " (solo números)");
        int hour2 = sc.nextInt();
        int total = ((day2-day)*24) + (hour2-hour);//horas transcurridas entre dos días
        System.out.println("Entre las "+ hour +":00h del " + nameDay + " y las "+ hour2 + ":00h del martes hay " + total+ " hora/s");
        sc.close();
    }
}
