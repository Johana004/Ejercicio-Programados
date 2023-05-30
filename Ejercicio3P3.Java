import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un numero entero: ");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El numero introducido es múltiplo de tres y de cinco.");
        } else {
            System.out.println("El numero introducido no es múltiplo de tres y de cinco.");
        }
        sc.close();
    }
}