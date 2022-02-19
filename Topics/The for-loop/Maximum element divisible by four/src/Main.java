import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int limit = scanner.nextInt();
        final int div = 4;
        int maxDivisibleNumber = 0;

        for (int i = 1; i <= limit; i++) {
            if (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();
                if (nextInt % div == 0 && maxDivisibleNumber < nextInt) {
                    maxDivisibleNumber = nextInt;
                }
            }
        }
        System.out.println(maxDivisibleNumber);
    }
}