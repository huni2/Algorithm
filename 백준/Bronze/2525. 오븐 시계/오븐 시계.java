import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int min = 60 * x + y;
        min = min + z;
        
        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println( hour + " " + minute);
        }
    }