
import java.util.Scanner;

public class countDigits {

    public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
       System.out.print("Enter an NUmber: ");
       int n  = scan.nextInt();
       int res = countNumbers(n);
       System.out.print("Number of Digits: "+res);
    }
    public static int countNumbers(int n){
        int count= 0;
        while(n>0){
            n/=10;
            count++;
        }
        return  count;
    }
}