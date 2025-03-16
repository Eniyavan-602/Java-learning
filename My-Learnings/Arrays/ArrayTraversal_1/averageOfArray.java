/*
Problem
Write a program to find the average of all elements present in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print float value of average of all elements in an array. [it has to print 2 decimal points]

Sample Inputs & Outputs
Sample Input 1

5
1 4 6 3 10
Sample Output 1

4.80
Sample Input 2

5
5 -10 -15 20 -25
Sample Output 2

-5.00
*/

import java.util.Scanner;
public class averageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an size of an Array: ");
        int N = sc.nextInt();
        // implement your logic here
        int[]arr = new int[N];
        float c =0;
        System.out.print("Enter an Array: ");
        for(int i =0;i<arr.length;i++)
        {
             arr[i]= sc.nextInt();
        }
        for(int i =0;i<arr.length;i++)
        {
            c+= arr[i];
        }
        float average =(float) c / N;
        System.out.printf( "%.2f",average);
    }
}