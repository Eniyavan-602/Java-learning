/*
Divisor means when a number perfectly divide by an given number
 */
import java.util.Scanner;
public class FindDivisor{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int n = scan.nextInt();
        efficientApproach(n);
    }
    public static void printFactor(int n){ // O(n)
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }
    /*
            n= 40
            i         n
            1        40
            2        20
            4        10
            5        08
     * Divisor can be made into pairs
     * a*a <= n; square on both sides a <= squareroot n
     * Find first factor appear before Square root of(n)
     * a*b <= n; b <= n/a;
     * Second factor can be get by b <= n/a;
     */
    public static void efficientApproach(int n){
        int i; // We initialize it globally
        for(i = 1; i*i <= n; i++){ // for Root n reduce time complexity O(root(n))
            if(n%i == 0){
                System.out.println(i);
            }
        }
        for( ; i>= 1; i--){ // we can also leave empty initialization of i if we globally declare inside an method
            if(n%i == 0 && i != n/i){
                System.out.println(n/i);
            }
        }
    }
    
}
