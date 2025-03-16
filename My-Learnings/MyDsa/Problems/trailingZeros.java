import java.util.Scanner;

public class trailingZeros {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        trailingZero(n);

    }
    public static void trailingZero(int n){
        int res = 0;
        int powerOf5 = 5;
        while(n>=powerOf5){
            res = res+(n/powerOf5);
            powerOf5 *=5;
        }
        System.out.println("NumberOfTrailingZeros: "+res);
    }
}
