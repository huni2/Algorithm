import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[]arr = new int[9];  // 배열 생성
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {   // 주어진 n개의 정수 하나하나 입력해서 i에 저장
            arr[i] = in.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
        }
    }