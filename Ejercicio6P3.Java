import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, minute, second;
        System.out.print("Introduce la hora (0-23): ");
        hour = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        minute = sc.nextInt();
        System.out.print("Introduce los segundos (0-59): ");
        second = sc.nextInt();
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            System.out.println("La hora introducida es válida.");
        } else {
            System.out.println("La hora introducida no es valida.");
        }
        sc.close();
    }
}