import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //30명의 학생 1번~30번
        Scanner in = new Scanner(System.in);
        int[] arr = new int[31];  // 배열 생성 학생 0은 버리고 1~30

        for (int i=1; i <= 28; i++){    //과제 낸 사람 1~28명
            int n = in.nextInt();
            arr[n] = 1;
        }

        for (int i = 1; i < arr.length; i++)    //과제 안 낸 사람 2명
            if (arr[i]!= 1 ){
                System.out.println(i);
            }
        in.close();
    }
}