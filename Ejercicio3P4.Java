import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int number, count = 0;
        System.out.print("Introduce un número para adivinar (entre 1 y 100): ");
        number = sc.nextInt();
        while (number != numberToGuess) {
            count++;
            if (number > numberToGuess) {
                System.out.println("El número a adivinar es menor.");
            } else {
                System.out.println("El número a adivinar es mayor.");
            }
            System.out.print("Introduce otro número: ");
            number = sc.nextInt();
        }
        System.out.println("¡Has acertado! El número era " + numberToGuess + ".");
        System.out.println("Te ha llevado " + count + " intentos.");
        sc.close();
    }
}