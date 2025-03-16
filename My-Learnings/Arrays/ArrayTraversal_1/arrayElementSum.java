/*
Problem
Write a program to find the sum of all elements present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print sum of all elements in an array.

Sample Inputs & Outputs
Sample Input 1

5
1 4 6 3 10
Sample Output 1

24
Sample Input 2

6
1 2 3 4 5 6
Sample Output 2

21 */

import java.util.Scanner;
public class arrayElementSum {
    public static int sumArray(int arr [])
    {
        int sum = 0; // initialize sum to add
        for(int i =0 ; i<arr.length;i++)
        {
            sum += arr[i]; // sum of array
        
        }
        return sum; // return to Main method
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an size of Array: ");
        int N = sc.nextInt(); // Get size of array
        // implement your logic here
        int arr[] =  new int [N];
        System.out.print("Enter an  Array: ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt(); // getting input from user
        }
        int result = sumArray(arr); //returned output storing
        System.out.print(result);//printing sumofarray
    
    }
}