import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int x1 = scanner.nextInt();
        final int y1 = scanner.nextInt();
        final int x2 = scanner.nextInt();
        final int y2 = scanner.nextInt();

        if (x1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}