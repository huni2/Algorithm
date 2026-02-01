import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M; // 카드 개수
    static int[] NArray; // 상근이의 카드 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine()); // 상근이의 카드 개수
        NArray = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            NArray[i] = Integer.parseInt(st.nextToken()); // 상근이의 카드
        }

        Arrays.sort(NArray); // 이진 탐색을 위한 정렬

        M = Integer.parseInt(br.readLine()); // 기준 카드 개수
        st = new StringTokenizer(br.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            result.append(binarySearch(num)).append(" ");
        }

        bw.write(result.toString().trim()); // 최종 결과 출력
        br.close();
        bw.flush();
        bw.close();
    }

    public static int binarySearch(int num) {
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int middleValue = NArray[middle];

            if (num > middleValue) {
                left = middle + 1;
            } else if (num < middleValue) {
                right = middle - 1;
            } else {
                return 1; // 찾았을 경우
            }
        }
        return 0; // 찾지 못했을 경우
    }
}
