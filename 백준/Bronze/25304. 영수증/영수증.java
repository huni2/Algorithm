import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); //총 금액
        int n = scan.nextInt(); //종류 수

        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt(); //각 물건 가격
            int b = scan.nextInt(); //물건 개수
            total += a * b;
        }
        if (x == total) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}