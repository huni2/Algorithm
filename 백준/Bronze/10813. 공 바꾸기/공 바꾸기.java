import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //바구니 총 n개
        //바구니 별로 1~n번까지 번호가 매겨져있음(index = i + 1)
        //1번째 바구니에는 공이 0개 고정 바구니에 공 최대 1개만 넣을 수 있음
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();   // 바구니 총 n개
        int m = in.nextInt();   // m번 공 바꾸기

        int[]arr = new int[n];  // 배열 생성

        int n1, n2, temp = 0;   // 공을 바꿀 바구니 1,2, 서로 교환하는 데 쓸 temp

        for (int i = 0; i < arr.length; i++) {   // 주어진 n개의 정수 하나하나 입력해서 i에 저장
            arr[i] = i + 1;               // 바구니 초기값
        }
        for (int i = 0; i < m; i++) {
            n1 = in.nextInt() - 1;
            n2 = in.nextInt() - 1;

            temp = arr[n1]; // arr[n1] -> temp로
            arr[n1] = arr[n2];  //arr[n2] -> arr[n1]로
            arr[n2] = temp; // 기존 arr[n1]은 arr[n2]로
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}