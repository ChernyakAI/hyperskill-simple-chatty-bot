import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n1 = scanner.nextInt();
        final int n2 = scanner.nextInt();
        final int n3 = scanner.nextInt();
        boolean r1 = n1 >= n2 && n1 <= n3;
        boolean r2 = n1 >= n3 && n1 <= n2;
        System.out.println(r1 || r2);
    }
}