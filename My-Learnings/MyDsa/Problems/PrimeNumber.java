
import java.util.Scanner;

public class PrimeNumber {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int n = scan.nextInt();
     //boolean res = isPrime(n);
     //System.out.println("Is Prime: "+res);
     sievePrintPrimeEfficien(n);
    
    }
    public static boolean prime(int n){  // normal Method
        if(n<2){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                return  false;
            }
        }
        return true;
    }   
    /*     i=1    i = 2 |i%3=0| i%2=0 |  i=5     i%2=0
            
            01     02   | 03  |   04  |   05    | 06 |
                                          ^
                                          |+6------------
            07     08   | 09  |   10  |   11    | 12 |  |
           +2|-------------------------------------------
            13     14   | 15  |   16  |   17    | 18 |
            
            19     20   | 21  |   22  |   23    | 24 |
    */
    public static  boolean  isPrime(int n){
        if(n==1){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for(int i = 5; i*i <=n; i+=6){
            if ((n%i == 0)  || (n% i+2 == 0)) {
                return false;
            }
        }
        return true;
    }
    public static void sievePrintPrime(int n){
        boolean[]arr = new boolean[n+1];
        for(int i = 2; i <= n; i++){
            if(arr[i] == false){
                for(int j = 2*i; j <= n; j+=i){ // we can also write as j = i*i ex : 2*2 =4 3*3 = 9 ...
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(arr[i] == false){
                System.out.println(i);
            }
        }
    }
    public static void  sievePrintPrimeEfficien(int n){
        boolean[]arr = new boolean[n+1];
        for(int i = 2; i*i <= n; i++){
            if(arr[i] == false){
                for(int j = i*i; j <= n; j+=i){ 
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(arr[i] == false){
                System.out.print(i+" ");
            }    /*               _      */
        }//Time complexity is O(_/n(log n) )
    }
}
