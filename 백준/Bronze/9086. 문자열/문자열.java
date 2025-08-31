import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력할 문자열 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 문자열 입력
        String v[] = new String[n];

//        문자열 읽고 서브스트링으로 첫번째 글자랑 마지막 글자 가져오기
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            v[i] = str.substring(0, 1) + str.substring(str.length() -1, str.length());
        }
//          가져온거 출력
        for (int i=0; i <n; i++){
            System.out.println(v[i]);
        }
    }
}