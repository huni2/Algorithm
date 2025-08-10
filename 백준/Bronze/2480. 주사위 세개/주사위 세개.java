import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        int total = 0;

        if (x1 == x2 && x1 == x3){
        total = 10000 + (x1 *1000);
        } else if(x1 == x2 || x1 == x3){
            total = 1000 +  (x1 * 100);
        } else if(x2 == x3){
            total = 1000 +  (x2 * 100);
        } else if(x1 != x2 && x2 != x3 && x1 != x3){
            if (x1 > x2){
                if(x3 > x1){
                    total = x3;
                } else {
                    total = x1;
                }
            }
            else {
                if(x3 > x2){
                    total = x3;
                } else { total = x2;}
            }
            total = 100 * total;
        }
        System.out.println(total);
    }
}