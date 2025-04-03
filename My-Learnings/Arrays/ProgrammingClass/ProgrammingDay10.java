/*
 * Enter Array Size: -10(Negative Array Size)
Exception in thread "main" java.lang.NegativeArraySizeException: -10
        at ProgrammingDay09.main(ProgrammingDay09.java:9)
        Method Creartion Steps:
      1.  Create an new MEthod name
      2.  Provide Parameter
      3.  Data type of parameter
      4.  Body Of method
      5.  Return Type
      6.  Public static
 */
import java.util.Scanner;

public class ProgrammingDay10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scan.nextInt();//Scan to get input from user
        int[]arr = new int[n];
        System.out.print("Enter Array Values: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();//Scan to get input from user 
        }
        int res =occurenceOfK(arr);
        System.out.println(res);    
    }
        public static void printArray(int[]arr){
            for(int i =0; i < arr.length; i++){
                System.out.print(arr[i]+" ");//Printing output
            }
    }
    public static void evenIndexArray(int[]arr){
        for(int i =0; i < arr.length; i+=2){ // odd we want (i= 1 ; i < arr.length; i+=2)
            //if(i%2 == 0) // odd (i%2 != 0)
            System.out.print(arr[i]+" ");//Printing output
            
        }
    }
    public static int sumOfArray(int[]arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
          return sum;
    }
    public static int productOfArray(int[]arr){
        int pro = 1;
        for(int i = 0; i < arr.length; i++){
            pro*=arr[i];
        }
          return pro;
    
        }
public static void largestArrayValue(int[]arr){
    int max = Integer.MIN_VALUE;// if we give 0  negative will cause test case failed
  
    for(int i = 0; i < arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println(max);

}
public static int largestArrayValueIndex(int[]arr){
    int max = Integer.MIN_VALUE;
    int index = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
            index = i;
        }
    }
    return index;
}
public static int smallestArrayValueIndex(int[]arr){
    int min = Integer.MAX_VALUE;
    
    for(int i = 0; i < arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
            
        }
    }
    return min;
}
public static int occurenceOfK(int[]arr){
    int Count  = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the K value: ");
    int k= scan.nextInt();
    for(int i = 0; i<arr.length; i++){
        if(arr[i]== k){
        Count++;
        }
    }
    return Count;
}
}
