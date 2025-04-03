/*
Output Format
Print the array elements on a single line, each element separated by a space.

Sample Inputs & Outputs
Sample Input 1

4
2 4 5 6
Sample Output 1

2 4 5 6
Sample Input 2

5
11 22 33 44 55
Sample Output 2

11 22 33 44 55

*/

import java.util.Scanner;

class printArrayElements{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = scanner.nextInt();
        int []arr = new int[size];
        System.out.print("Enter an Array: ");
        for(int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scanner.nextInt();
        }
      printArray(arr);
    }

    public static void printArray(int[] arr) {
        // Your logic here
        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}