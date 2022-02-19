import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final int z = 1000;
        final int y = 100;
        final int x = 10;
        final int otherNumber = 24;

        final int firstDigit = n / z;
        final int secondDigit = n / y % x;
        // final int thirdDigit = n / 10 % 100;
        // final int fourthDigit = n % 1000;

        final int number = firstDigit * z + secondDigit * y + secondDigit * x + firstDigit;

        if (n == number) {
            System.out.println(1);
        } else {
            System.out.println(otherNumber);
        }
    }
}