import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;
        System.out.print("Introduce un número: ");
        number = sc.nextInt();
        while (number >= 0) {
            count++;
            System.out.print("Introduce otro número: ");
            number = sc.nextInt();
        }
        System.out.println("Se han introducido " + count + " números.");
        sc.close();
    }
}