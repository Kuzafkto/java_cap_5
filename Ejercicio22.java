/*
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

 * @KuzaFkto
 */
public class Ejercicio22{
    public static void main(String[] args) {
        boolean cousin = true;
        System.out.print("2");
        for (int i = 2 ; i<=100 ; i++){
            if (i%2==0){
                cousin=false;    
            }
            for(int x = 3 ; x<=i/x && cousin ; x+=2 ){
                if (i%x==0){
                    cousin=false;
                }
            }
            if (cousin){
                System.out.print(" "+i);
            }
            cousin=true;
        }
        System.out.print(" 100");

    }
}