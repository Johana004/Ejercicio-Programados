import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}