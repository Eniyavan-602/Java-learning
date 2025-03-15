/*n
Write a program to print even numbers present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print space separated even integer values in an array.

Sample Inputs & Outputs
Sample Input 1

5
1 4 6 3 10
Sample Output 1

4 6 10
Sample Input 2

4
20 30 40 50
Sample Output 2

20 30 40 50
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6
n*/
import java.util.Scanner;

class evenArray{
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter size of an Array: ");
    int n = scan.nextInt();
    int[]arr = new int[n];
    System.out.print("Enter an Array: ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = scan.nextInt();
    }
        printEvenArray(arr);
    }
    public static void printEvenArray(int[]arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}