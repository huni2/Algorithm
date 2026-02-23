import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i =0; i< t; i++){
            long n = Long.parseLong(br.readLine());
            if (n <= 1) n = 2;  
            while(true){
                int count = 0;
                for(int j = 2; j<=Math.sqrt(n); j++){
                    if(n%j==0){
                        count++;
                        break;
                    }
                }
                
                if(count == 0){
                    System.out.println(n);
                    break;
                }
            n++;
            }
        }
    }
}