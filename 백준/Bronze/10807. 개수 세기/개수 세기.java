import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int[]arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int b = in.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (b == arr[j]){count++;}
        }
        System.out.println(count);
        }
    }