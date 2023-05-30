import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        do {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            suma += num;
        } while (num != 0);
        System.out.println("La suma de los numeros introducidos es: " + suma);
        sc.close();
    }
}