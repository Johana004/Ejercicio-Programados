import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();
        System.out.println("El doble de " + num + " es " + (2*num));
        System.out.println("El triple de " + num + " es " + (3*num));
        sc.close();
    }
}