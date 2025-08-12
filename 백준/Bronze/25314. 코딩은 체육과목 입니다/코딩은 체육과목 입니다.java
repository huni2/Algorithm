import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //N바이트
        String str = "";

        for (int i = 0; i < N/4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");

    }
}