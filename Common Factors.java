import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Common factors are:");

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}