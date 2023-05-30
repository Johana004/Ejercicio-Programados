import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number, square;
        System.out.print("Introduce un número: ");
        number = sc.nextDouble();
        while (number >= 0) {
            square = Math.pow(number, 2);
            System.out.println("El cuadrado de " + number + " es " + square);
            System.out.print("Introduce un número: ");
            number = sc.nextDouble();
        }
        sc.close();
    }
}