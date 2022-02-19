import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        final int n = scanner.nextInt();
        boolean b = scanner.nextBoolean();

        final int n1 = 10;
        final int n2 = 20;
        final int n3 = 15;
        final int n4 = 25;

        boolean r1 = n >= n1 && n <= n2 && !b;
        boolean r2 = n >= n3 && n <= n4 && b;

        System.out.println(r1 || r2);
    }
}