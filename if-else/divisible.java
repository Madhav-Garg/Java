import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println(num + " is divisible by 3 or 5.");
        } else {
            System.out.println(num + " is NOT divisible by 3 or 5.");
        }
    }
}