import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int min1 = 1;
        final int min2 = 20;
        final int min3 = 250;
        final int min4 = 1000;
        if (n < min1) {
            System.out.println("no army");
        } else if (n < min2) {
            System.out.println("pack");
        } else if (n < min3) {
            System.out.println("throng");
        } else if (n < min4) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}