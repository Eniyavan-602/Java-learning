/*
Problem
Given an array of integers of size N, find and display the smallest element present in the array.

Input Format
The first line contains an integer N, the size of the array.

The second line contains N space-separated integers representing the array elements.

Output Format
Print the smallest element present in the array.

Sample Inputs & Outputs
Sample Input 1

5
1 5 7 3 2
Sample Output 1

1
Sample Input 2

6
0 -1 -2 -3 -4 -5
Sample Output 2

-5
*/
import java.util.Scanner;
public class smallestElement {
    public static int smmallestElement(int[] arr)
    {
       int  smallest = arr[0];
        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i]< smallest)
            {
                smallest = arr[i];
            }
            }
            return smallest;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Sizr of an Array: ");
        int N = sc.nextInt();
        int []arr = new int[N];
        System.out.print("Enter an Array: ");
        for(int i =0;i <arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int smallest = smmallestElement(arr);
        System.out.print(smallest);
    }
}
