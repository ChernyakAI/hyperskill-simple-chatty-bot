import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();

        final int limit = 1000;
        int currentRoot = 1;
        final int maxRoots = 3;

        for (int x = 0; x <= limit; x++) {
            boolean result = a * x * x * x + b * x * x + c * x + d == 0;
            if (currentRoot <= maxRoots  && result) {
                System.out.println(x);
                currentRoot += 1;
            }
        }
    }
}