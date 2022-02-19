import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLarger = 0;
        int countSmaller = 0;
        int countPerfect = 0;

        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i == 1) {
                countLarger += 1;
            } else if (i == -1) {
                countSmaller += 1;
            } else if (i == 0) {
                countPerfect += 1;
            }
        }
        System.out.print(countPerfect);
        System.out.print(" ");
        System.out.print(countLarger);
        System.out.print(" ");
        System.out.print(countSmaller);
    }
}