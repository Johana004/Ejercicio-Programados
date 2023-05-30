import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Introduce un anio: ");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("El anio introducido es bisiesto.");
        } else {
            System.out.println("El anio introducido no es bisiesto.");
        }
        sc.close();
    }
}