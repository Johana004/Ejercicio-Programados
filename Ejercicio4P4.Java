import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 100;
        while (number >= 0) {
            System.out.println(number);
            number -= 7;
        }
        sc.close();
    }
}