import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int x1 = -15;
        final int y1 = 12;
        final int x2 = 14;
        final int y2 = 17;
        final int x3 = 19;

        boolean v1 = x1 < n && n <= y1;
        boolean v2 = x2 < n && n < y2;
        boolean v3 = x3 <= n;

        if (v1 || v2 || v3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}