import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // 배열 안에 있는 정수
        int[]arr = new int[n];  // 배열 생성

        for (int i = 0; i < n; i++) {   // 주어진 n개의 정수 하나하나 입력해서 i에 저장
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);
        }
    }