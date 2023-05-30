import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary, sum = 0, count = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el salario " + i + ": ");
            salary = sc.nextInt();
            sum += salary;
            if (salary > 10000) {
                count++;
            }
        }
        System.out.println("La suma de los salarios es: " + sum);
        System.out.println("Hay " + count + " salarios mayores de 10000 colones.");
        sc.close();
    }
}