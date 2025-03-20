/* LCD is also called as LCM 
 * LCM of 2 numbers 2 and 5
 * 2 -> 2,,6,8,10,12.............
 * 5 -> 5,10,15,20,25............
 * common between them is 10 so we have to start loop from 5
 * //Bruete Force Method :*/
import java.util.Scanner;
 
public class Lcm {
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
        System.out.print("Enter an  First  Number: ");
        int n = scan.nextInt();
        System.out.print("Enter an Second Number: ");
        int m = scan.nextInt();
        int res = lowestCommonDivisor(n, m);
        System.out.println("LCM of "+n+" and "+m+" is: "+res);
    }
    
    public static int lcd(int a, int b){
        int res = Math.max(a, b); // Start from the maximum of a and b
        while (true) { 
            if (res % a == 0 && res % b == 0) { // Check if res is a multiple of both a and b
                break;
            }  
            res++; // Increment res
        }
        return res; // Return the LCMs contains the max value
    }

    /*
     * formula : lcm(a,b) * gcd(a, b) = a*b
     * we want lcm so lcm(a,b) = (a*b) / gcd(a,b)
     */
    public static  int  gcd(int a, int b){
        while(a!= 0 && b!= 0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;          
                }
    }
        if(a != 0){
            return a;
        }
        return b;
    }
    public static int lowestCommonDivisor(int a,int b){
        //formula : lcm(a,b) * gcd(a, b) = a*b
            return (a*b)/gcd(a, b);
    }
}
