import java.util.Scanner;

public class FactorialRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        for (int i = start; i <= end; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
