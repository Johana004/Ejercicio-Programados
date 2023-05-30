import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Los numeros introducidos son iguales.");
        } else {
            System.out.println("Los numeros introducidos no son iguales.");
        }
        sc.close();
    }
}