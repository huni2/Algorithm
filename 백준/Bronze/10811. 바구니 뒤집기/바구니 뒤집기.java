import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        N, M입력
        int N = in.nextInt();
        int M = in.nextInt();
        int temp = 0;

//        정수a,b 입력받아 역순 후 출력
        int arr[] = new int[N];
        for (int i = 0; i<arr.length; i ++) {   //1번부터 N번
            arr[i] = i +1;
        }
//        스위칭
        for (int i =0; i<M; i++){
            int a = in.nextInt() -1;
            int b = in.nextInt() -1;

            while(a < b){
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a ++;
                b --;
            }
        }
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}