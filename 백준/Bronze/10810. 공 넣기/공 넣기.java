import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //바구니 총 n개
        //바구니 별로 1~n번까지 번호가 매겨져있음(index = i + 1)
        //1번째 바구니에는 공이 0개 고정 바구니에 공 최대 1개만 넣을 수 있음
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[]arr = new int[n];  // 배열 생성
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {   // 주어진 n개의 정수 하나하나 입력해서 i에 저장 m번 공 넣기
            int I = in.nextInt();
            int J = in.nextInt();
            int K = in.nextInt();

            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }