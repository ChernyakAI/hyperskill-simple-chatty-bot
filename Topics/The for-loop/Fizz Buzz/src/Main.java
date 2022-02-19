import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int start = scanner.nextInt();
        final int finish = scanner.nextInt();
        final int three = 3;
        final int five = 5;
        for (int i = start; i <= finish; i++) {
            if (i % three == 0 && i % five == 0) {
                System.out.println("FizzBuzz");
            } else if (i % five == 0) {
                System.out.println("Buzz");
            } else if (i % three == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}