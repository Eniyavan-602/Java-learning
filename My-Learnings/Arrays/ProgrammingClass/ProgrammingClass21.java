
import java.util.Scanner;

public class ProgrammingClass21 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the Array Size : ");
    int n = scan.nextInt();
    int[]arr = new int[n];

    System.out.print("Enter the Array Values: ");
    for(int i =0; i < arr.length; i++){
    arr[i] = scan.nextInt();
    }
    longestConsecutiveSubArray(arr);

    }





    /*
     * Given an array of integers, write a program to print all the consecutive subarray.
     * 
     * i/p : 10
     *       5 12 13 14 9 2 3 4 5 8
     * o/p: 5
     *      12 13 14
     *      9
     *      2 3 4 5
     *      8
     */


    public static void consecutiveSubArray(int[]arr){
        for(int i =0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] == 1){
                System.out.print(arr[i]+" ");
            }
          
            else{
                System.out.print(arr[i]+" ");
                System.out.println();
            }
           
        }
        System.out.println(arr[arr.length-1]);
    }






        /*
     * Given an array of integers, write a program to print the longest consecutive subarray length.
     * 
     * i/p : 10
     *       5 12 13 14 9 2 3 4 5 8
     * o/p: 4
     */


     public static void longestConsecutiveSubArrayLength(int[]arr){
        
        int count  =1;
        int max  = 0;
        for(int i =0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] == 1){
                count++;
            }
          
            else{
                if(count > max){
                    max = count;
                }
                count = 1;
            }
           
        }
        if(count > max){
            max = count;
        }
        System.out.println(max);
    }




   /*
     * Given an array of integers, write a program to print the longest consecutive subarray length.
     * 
     * i/p : 10
     *       5 12 13 14 9 2 3 4 5 8
     * o/p: 4
     */

     public static void longestConsecutiveSubArray(int[] arr) {
        int count = 1, max = 1;
        int ei = 0, si = 0, startIndex = 0;
    
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    ei = i;  // End index of the longest sequence
                    startIndex = ei - max + 1;
                }
                count = 1;
            }
        }
    
        // Final check for the last sequence
        if (count > max) {
            max = count;
            ei = arr.length - 1;
            startIndex = ei - max + 1;
        }
    
        // Print the longest consecutive subarray
        for (int i = startIndex; i <= ei; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For proper output formatting
    }
    
}
