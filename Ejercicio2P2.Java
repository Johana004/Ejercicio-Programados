import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String []args){
      Scanner entrada = new Scanner(System.in);
 int numero1, numero2;

         // Introducir por pantalla un numero

         System.out.println("Introduce un numero entero:");
         numero1 = entrada.nextInt();
         System.out.println("Introduce otro numero entero:");
         numero2 = entrada.nextInt();
         
         // If para comprobar si son iguales
         if (numero1 % numero2 == 0) {
              System.out.println("Son multiplos");
         }

         else {
              System.out.println("No son multiplos");
         }
     }

    }