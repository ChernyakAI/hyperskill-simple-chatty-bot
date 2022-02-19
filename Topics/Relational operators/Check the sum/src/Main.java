import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int checkSum = 20;

        boolean result = a + b == checkSum || a + c == checkSum || b + c == checkSum;

        System.out.println(result);
    }
}