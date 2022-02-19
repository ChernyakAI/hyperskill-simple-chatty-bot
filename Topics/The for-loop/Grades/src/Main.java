import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        while (scanner.hasNext()) {
            String i = scanner.next();
            if ("A".equals(i)) {
                countA += 1;
            } else if ("B".equals(i)) {
                countB += 1;
            } else if ("C".equals(i)) {
                countC += 1;
            } else if ("D".equals(i)) {
                countD += 1;
            }
        }
        System.out.print(countD);
        System.out.print(" ");
        System.out.print(countC);
        System.out.print(" ");
        System.out.print(countB);
        System.out.print(" ");
        System.out.print(countA);
    }
}