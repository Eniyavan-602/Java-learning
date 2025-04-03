import java.util.Scanner;
public class ProgrammingDay19 {
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
        int Size = scan.nextInt();
        smallestSubArrayEqualsK(arr,Size);
        
    }



    /*
     * Given an array of n integers write a program to print all the subarrays of the array
     * i/p : 5
     *       3 5 1 7 2
     *o/p  : 3
             5
             1
             7
             1
             3 5
             5 1
             1 7
             3 5 1
             5 1 7
             1 7 2
             3 5 1 7
             5 1 7 2
             3 5 1 7 2
     */
    public static void printAllPossibleSubArray(int[]arr, int Size){
        for(int i = 0; i <= arr.length -Size; i++){
            for(int j = i; j < i+Size; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

        /*
         * (or)
         * static void printAllSubarrays(int[] arr) {
       for(int size =1; size <= arr.length; size++){
        for(int i = 0; i <=  arr.length-size; i++){
            for(int j = i; j < i+size; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
       }
     }
         */
    }
    
    public static void  printAllPossibleSubArray(int[]arr){
        for(int Size =1; Size < arr.length; Size++){ // Size = 0 will cause the function to print empty subarrays.Start from Size = 1.
            printAllPossibleSubArray(arr, Size); // calling method
        }
    }




    /*
     * output in decreasing order
     * Enter the Array Size: 9
Enter the Array Values: 5 1 2 4 9 3 1 3 3
5 1 2 4 9 3 1 3 3
5 1 2 4 9 3 1 3
1 2 4 9 3 1 3 3
5 1 2 4 9 3 1
1 2 4 9 3 1 3
2 4 9 3 1 3 3
5 1 2 4 9 3
1 2 4 9 3 1
2 4 9 3 1 3
4 9 3 1 3 3
5 1 2 4 9
1 2 4 9 3
2 4 9 3 1
4 9 3 1 3
9 3 1 3 3
5 1 2 4
1 2 4 9
2 4 9 3
4 9 3 1
9 3 1 3
3 1 3 3
5 1 2
1 2 4
2 4 9
4 9 3
9 3 1
3 1 3
1 3 3
5 1
1 2
2 4
4 9
9 3
3 1
1 3
3 3
5
1
2
4
9
3
1
3
3
     * 
     */
    public static void decreasingOrder(int[]arr){
        for(int size =arr.length; size >= 1; size--){
            for(int i = 0; i <=  arr.length-size; i++){
                for(int j = i; j < i+size; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
           }
         }










         /*
          * Given an array of integer. Write a program to print all the sum of all subarrays of the array
          I/P: 5 -> 3 5 1 7 2
          O/P: 3
               5
               1
               7
               2
               8
               6
               8
               9
               9
               13
               10
               16
               15
               18

          */

        public static void printSumOfSubArray(int[]arr){
            for(int size = 1; size <= arr.length; size++){
                for(int i =0; i <= arr.length - size; i++){
                    int sum = 0;
                    for(int j =i ; j < i+size; j++){
                        sum+=arr[j];
                    }
                    System.out.println(sum);
                }
            }
        }


        /*
           * Given an array of integers and an integer value k . write a program to print all the count of subarrays whose sum is equal to k.
           */
        public static void subArrayEqualToK(int[]arr, int k){
            int count = 0;
            for(int size =1; size <= arr.length; size++){
                for(int i =0; i <= arr.length - size; i++){
                    int sum = 0;
                    for(int j = i; j < i+size; j++){
                        sum+=arr[j];
                    }
                    if(sum == k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }




        /*
         * Problem
Print all possible subarrays whose sum is equal to K.

Input Format
The first line contains a single integer n, representing the number of elements in the array.

The second line contains n space-separated integers, representing the elements of the array.

The third line contains a single integer K, representing the target sum.

Output Format
Print all the possible subarrays whose sum is equal to K, separated by a space. If no such subarrays exist, print "None".

Sample Inputs & Outputs
Sample Input 1

5
1 2 3 4 5
9
Sample Output 1

4 5 
2 3 4 
Sample Input 2

4
-1 -2 -3 -4
-7
Sample Output 2

-3 -4
Constraints
1 <= n <= 2000, -10000 <= elements of the array <= 10000
         */



        public static void printSubArrayEqualsK(int[]arr, int k){
            for(int size = 1; size <= arr.length; size++){
                for(int i =0; i <= arr.length-size; i++){
                    int sum = 0;
                    for(int j =i; j < i+size; j++){
                        sum+=arr[j];
                    }
                    if(sum == k){
                        for(int j = i; j < i+size; j++){
                            System.out.print(arr[j]+" ");
                        }
                        System.out.println();
                    }
                }
            }
        }


        /*
         * Problem
Print all possible subarrays whose sum is even.

Input Format
The first line contains a single integer n, representing the number of elements in the array. The second line contains n space-separated integers, representing the elements of the array.

Output Format
Print all the possible subarrays whose sum is even, separated by a space. If no such subarrays exist, print "None".

Sample Inputs & Outputs
Sample Input 1

5
1 2 3 4 5
Sample Output 1

2 
4 
1 2 3 
3 4 5 
1 2 3 4 
2 3 4 5 
Sample Input 2

4
-1 -2 -3 -4
Sample Output 2

-2 
-4 
-1 -2 -3 
-1 -2 -3 -4 
Constraints
1 <= n <= 20, -100 <= elements of the array <= 100
         */



    public static void printEveneSubArrays(int[]arr){
        for(int size = 1; size <= arr.length; size++){
            for(int i =0; i <= arr.length-size; i++){
                int sum =0 ;
                for(int j =i; j < i+size; j++){
                    sum+=arr[j];
                }
                if(sum %2  == 0){
                    for(int j = i; j < i+size; j++){
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }





    /*
     * Print all possible subarrays whose sum is prime.

Input Format
The first line contains a single integer n, representing the number of elements in the array. The second line contains n space-separated integers, representing the elements of the array.

Output Format
Print all the possible subarrays whose sum is prime, separated by a space. If no such subarrays exist, print "None".

Sample Inputs & Outputs
Sample Input 1

5
1 2 3 4 5
Sample Output 1

2 
3 
5 
1 2 
2 3 
3 4 
Sample Input 2

4
-1 -2 -3 -4
Sample Output 2

None

     */



    public static  void printSubArrayIsPrime(int[]arr){
        for(int size = 1; size <= arr.length; size++){
            for(int i =0; i <= arr.length - size; i++){
                int sum = 0;
                for(int j =i; j < i+size; j++){
                    sum+=arr[j];
                }
                if(isPrime(sum)){
                    for(int j =i; j < i+size; j++){
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static boolean isPrime(int sum){
        if(sum < 2){
            return false;
        }
        for(int i = 2; i*i <= sum; i++){
            if(sum % i == 0){
                return false;
            }
        }
        return true;
    }




    /*
    print the largest subarray which equals the sum of k
    I/P: 5
        3 1 7 5 2
        o/p:

     */
    public static void largestSubArrayEqualsK(int[]arr, int k){
        boolean res = false;
        for (int size = arr.length; size >= 1; size--) {
            for (int i = 0; i <= arr.length - size; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                if (sum == k) {
                    res = true;
                    for (int j = i; j < i + size; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
        if (!res) {
            System.out.println("No subarray found.");
        }
    }





    /*
     * Smallest Subarray equals k     */
    public static void smallestSubArrayEqualsK(int[]arr, int k){
        boolean res = false;
        for (int size = 1; size < arr.length; size++) {
            for (int i = 0; i <= arr.length - size; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                if (sum == k) {
                    res = true;
                    for (int j = i; j < i + size; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
        if (!res) {
            System.out.println("No subarray found.");
        }
    }
}

