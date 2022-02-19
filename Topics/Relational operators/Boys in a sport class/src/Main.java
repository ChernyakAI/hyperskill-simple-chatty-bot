import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int h1 = scanner.nextInt();
        final int h2 = scanner.nextInt();
        final int h3 = scanner.nextInt();

        boolean asc = h1 >= h2 && h2 >= h3;
        boolean desc = h3 >= h2 && h2 >= h1;

        System.out.println(asc || desc);

    }
}