
import java.util.Scanner;

/*
 * Given two numbers, calculate the greatest GCD/HCF.
 * Divisor / Factor means - Any Digit which can perfectly divides or factor reminder must be 0.
 * a = 20, b = 15
 * a = 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20.
 * b = 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15.
 * common Gcd / HCF = 5.
 * Burte force Algorithm :
 * int min = 0;
 * if(a < b){
 * min = a
 * }
 * else{
 * min = b;
 * }
 * for(i = min; i >= 0; i--){
 * if(a%i == 0 && b%i == 0)
 * return i;
 * }  // It's not efficient Time complexity is O(min(a,b))
 * Eculids Algorithm:
 * -> find the largest Number between Them.
 * ->Replace larger numb by diff b/w larger and smaller number
 * ->Return any one value, which is GCD/HCF
 * [Efficient Better Than Previous]
 * while(a!=b){
 * if(a>b){
 * a= a-b;
 * }
 * else{
 * b = b -a;
 * }
 * }
 * return a; // Time Complexity O(min(a,b))
 * By Gabrien Fame Method (Optimised Euclids Method)
 * ->Instead of find diff, find % between larger and smaller and replace larger number by reminder and once if get zero any one, the other non- zero
 * was ther GCD/HCF
 */ 
public class Gcd{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter the FirstValue: ");
        int a = scan.nextInt();
        System.out.print("Enter the secondValue: ");
        int b =  scan.nextInt();
        int res = gcdHcf(a,b);
        System.out.println("The Gcd/Hcf of "+a+" and "+b+" is : " +res);
    }
    public static int gcdHcf(int a, int b){
        while(a !=0 && b != 0){
            if(a > b){
                a = a%b;
            }
            else{
                b =  b % a;
            }
            if(a != 0){
                return a;
            }
        }
        return b;
    }

}