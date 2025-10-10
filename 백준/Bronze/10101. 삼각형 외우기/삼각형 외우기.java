import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int angle[] = new int[3]; //각도를 저장하는 배열
        int wholeangle = 0;

        for(int i = 0; i < 3; i++){
            angle[i] = Integer.parseInt(br.readLine());
            wholeangle += angle[i];
        }
        br.close();

        if(wholeangle != 180){
            bw.write("Error");
        }else{
            int[] distinct = removeDuplicate(angle);

            if(distinct.length == 1){ //세각이 전부 같을 경우(중복값을 제거한 후 1개가 남은거니까)
                bw.write("Equilateral");
            }else if(distinct.length == 2){//세각 중 두각이 같을 경우(중복값을 제거한 후 2개가 남은거니까)
                bw.write("Isosceles");
            }else if(distinct.length == 3){ //세각이 전부 다를 경우(중복값을 제거해도 3개가 남은거니까)
                bw.write("Scalene");
            }
        }
        bw.flush();
        bw.close();
    }
	//배열의 중복값을 삭제하여 배열을 반환해주는 메서드
    public static int[] removeDuplicate(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}