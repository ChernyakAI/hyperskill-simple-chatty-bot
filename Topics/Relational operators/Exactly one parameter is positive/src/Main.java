import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n1 = scanner.nextInt();
        final int n2 = scanner.nextInt();
        final int n3 = scanner.nextInt();

        boolean firstExpression = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean secondExpression = n2 > 0 && n1 <= 0 && n3 <= 0;
        boolean thirdExpression = n3 > 0 && n1 <= 0 && n2 <= 0;

        System.out.println(firstExpression || secondExpression || thirdExpression);
    }
}