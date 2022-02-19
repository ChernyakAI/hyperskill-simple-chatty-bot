import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //final int count = scanner.nextInt();
        final int div = 6;
        int total = 0;
        while (scanner.hasNext()) {
            final int n = scanner.nextInt();
            if (n % div == 0) {
                total += n;
            }
        }
        System.out.println(total);
    }
}