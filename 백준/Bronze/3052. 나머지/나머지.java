import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //hashset
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++){    //과제 낸 사람 1~28명
            h.add(in.nextInt() % 42);
        }
        System.out.println(h.size());
    }
}