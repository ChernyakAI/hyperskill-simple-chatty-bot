import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int div = 3;

        int countNumbers = 0;
        double sum = 0;
        double average = 0;

        for (int i = a; i <= b; i++) {
            if (i % div == 0) {
                sum += i;
                countNumbers += 1;
            }
        }
        average = sum / countNumbers;
        System.out.println(average);
    }
}