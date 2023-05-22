import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String []args){
 int numero1, numero2;
         // Introducir por pantalla un numero

         System.out.println("Introduce un numero entero:");
         numero1 = Entrada.entero();
         System.out.println("Introduce otro numero entero:");
         numero2 = Entrada.entero();
         
         // If para combrobar si son iguales
         if (numero1 % numero2 == 0) {
              System.out.println("Son multiplos");
         }

         else {
              System.out.println("No son multiplos");
         }
     }







    }