import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if( y < 45 ) {
            x --;
            y = 60 - (45 - y);
            if( x < 0 ) {
                x = 23;
            }
            System.out.println(x + " " + y);
        } else  {
            System.out.println(x + " " + (y- 45));
        }
        }
    }

