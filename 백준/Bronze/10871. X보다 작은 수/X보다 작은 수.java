import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // 배열 안에 있는 정수
        int x = in.nextInt();   // 비교할 정수
        int[]arr = new int[n];

        for (int i = 0; i < n; i++) {   // 주어진 n개의 정수 출력
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {  // 배열 안에 있는 숫자 확인
            if (x > arr[i])
            {
                System.out.print(arr[i] + " "); //배열[i]에서 x보다 작은 수 출력
            }
        }

        }
    }