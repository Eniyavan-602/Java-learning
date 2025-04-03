
import java.util.Scanner;


 /*
* Given an arrya of n int write a program to print the max and min of sum of n-1 elements present in the array.
* I/P: 5 3 1 2 4 5
* O/P  14, 10
*/
public class Permutation{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an Array size: ");
    int n = scan.nextInt();
    int[]array = new int[n];
    System.out.print("Enter Array Values: ");
    for(int i =0; i < array.length; i++){
        array[i] = scan.nextInt();
    }
    //int sum = sumOfArray(array);
    //int product = productOfArray(array);
      //int max = largestArrayValue(array);
    //int min = smallestArrayValue(array);
   // {
   //     System.out.println(sum-min); 
  //  }
  int[]res = productpermutation(array);
  for(int i= 0; i < res.length; i++){
    System.out.print(res[i]+" ");
  }

}





public static int sumOfArray(int[]arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum+=arr[i];
    }
      return sum;
}




public static int largestArrayValue(int[]arr){
    int max = Integer.MIN_VALUE;// if we give 0  negative will cause test case failed
  
    for(int i = 0; i < arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;

}



public static int smallestArrayValue(int[]arr){
    int min = Integer.MAX_VALUE;
    
    for(int i = 0; i < arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
            
        }
    }
    return min;
}






public static int productOfArray(int[]arr){
    int pro = 1;
    for(int i = 0; i < arr.length; i++){
        pro*=arr[i];
    }
      return pro;

    }








    
    /*
     * Given an array of n integers. Write a program to print the resultant array with the product of n-1 elements present in the array
     * I/P : 5
     *       3 5 2 1 4
     * O/P:
     *      40 24 60 120 30
     */
    public static int[] productpermutation(int[] array) {
        int[] res = new int[array.length];
        int product = 1;
        for (int i =0; i < array.length; i++) {
            product *= array[i];
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = product / array[i];
        }
        return res;
    }
}
