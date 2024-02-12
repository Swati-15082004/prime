import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check Prime or Not: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
    
}