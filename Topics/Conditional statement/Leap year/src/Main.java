import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int year = scanner.nextInt();
        final int a = 4;
        final int b = 100;
        final int c = 400;
        if (year % a == 0 && year % b != 0 || year % c == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}