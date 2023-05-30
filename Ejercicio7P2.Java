import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
            System.out.println("El cuadrado de " + num + " es " + (num*num));
        }
        sc.close();

    }
}