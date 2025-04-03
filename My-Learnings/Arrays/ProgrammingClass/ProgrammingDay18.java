import java.util.Scanner;
public class ProgrammingDay18 {
   public static void main(String[] args) {
     Scanner scan  =  new Scanner(System.in);

      System.out.print("Enter the Array Size: ");
      int n = scan.nextInt();
      int[]arr = new int[n];

      System.out.print("Enter the Array Values: ");
      for(int i =0; i < arr.length; i++){
         arr[i] = scan.nextInt();
      }

      System.out.print("Enter the value Size: ");
      int k = scan.nextInt();

      printSubArrayOfSizeK(arr, k);
   }



   /*
    * Given an array of integers and an integer value size. Write a program of all the subarray of given length size
    i/P: 9 -> 5 1 2 4 9 3 1 3 3
    o/p: 5 1 2
         1 2 4
         2 4 9
         4 9 3
         9 3 1
         3 1 3
         1 3 3
    */
   public static void subarray1(int[]arr, int k){
      for(int i =0; i <= arr.length - k ; i++){
         for(int j = i; j < i+3; j++){
            System.out.print(arr[j]+" ");
         }
         System.out.println();
      }
   }






   /*
    * Calculate the sum of all subarrays of given size from a given array.
    Sample Input 1
         3
         5
         1 2 3 4 5
Sample Output 1

6 9 12
    */
public static void sumOfSubarrays(int[] arr,int size){
      //Write your code here
      int res =0;
      for(int i =0; i <= arr.length-size; i++){
         for(int j =i; j < i+size; j++){
            res+=arr[j];
         }
         System.out.print(res+" ");
         res = 0;
      }
      
}



/*
 * Given an array of n integer, along with integer values size and k. Write a program to print all the count of subarrays of length size whose sum 
 * it equal to k
 * i/P: 9 -> 5 1 2 4 9 3 1 3 3, 3 , 7
   o/p: 3
 */
   public static void countSubarrays(int[]arr, int size){
         
      Scanner scan =   new Scanner(System.in);

      
      System.out.print("Enter the k value: ");
      int k = scan.nextInt();
      
      int count =0;

      for(int i=0 ;i <= arr.length-size; i++){
         int sum = 0;
         for(int j =i; j < i+size; j++){
            sum+=arr[j];
         }
            if(sum == k){
               count++;
         }
      }
      System.out.println(count);
      
      }
      


      /*
       * Given an array of n integer, along with integer values size and k. Write a program to print all the count of subarrays of length size whose sum 
 * it equal to k
 * i/P: 9 -> 5 1 2 4 9 3 1 3 3, 3 , 7
   o/p: 1 2 4
        3 1 3
        1 3 3
       */

   public  static void printSubArrayOfSizeK(int[]arr,int size){ 
      
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the K value: ");
      int k = scan.nextInt();


      for(int i =0; i <= arr.length - size; i++){
         int sum =0;
         for(int j =i; j < i+size; j++){
            sum+=arr[j];
         }
         if(sum == k){
            for(int j = i; j < i+size ; j++){
               System.out.print(arr[j]+" ");
            }
            System.out.println();
         }
         
      }
   }
}
