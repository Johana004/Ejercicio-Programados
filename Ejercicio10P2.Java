import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduce el numero " + i + ": ");
            num = sc.nextInt();
            suma += num;
        }
        System.out.println("La suma total de los numeros introducidos es: " + suma);
        sc.close();
    }
}
