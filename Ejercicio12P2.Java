import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean negativo = false;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el numero " + i + ": ");
            num = sc.nextInt();
            if (num < 0) {
                negativo = true;
            }
        }
        if (negativo) {
            System.out.println("Se ha introducido al menos un numero negativo.");
        } else {
            System.out.println("No se ha introducido ningún numero negativo.");
        }
        sc.close();
    }
}




