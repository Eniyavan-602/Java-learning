
import java.util.Scanner;

/*
 * Given an array of integers, write a program to find the second largest element in an array
 *I/p : 7 -> 3 5 4 7 6 10 8
 */
public class ProgrammingDay12{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an Array Size: ");
    int n = scan.nextInt();
    int[]array = new int[n];
    System.out.print("Enter Array Values: ");
    for(int i =0; i < array.length; i++){
        array[i] = scan.nextInt();
    }
        System.out.println(printLargestPairValue(array));
    }



    public static int condLargestElement(int[]array){
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for(int i =0; i < array.length; i++){
        if(array[i]>firstLargest){
            secondLargest = firstLargest;
            firstLargest = array[i];
        }
        else if (array[i]>secondLargest && array[i] != firstLargest){
            secondLargest = array[i];
        }
    }
    return secondLargest;
}



public static int printLargestPairValue(int[]array){
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for(int i =0; i < array.length; i++){
        if(array[i]>firstLargest){
            secondLargest = firstLargest;
            firstLargest = array[i];
        }
        else if (array[i]>secondLargest){
            secondLargest = array[i];
        }
    }
    return firstLargest+secondLargest;
}



public static int printSmallestPairValue(int[]array){
    int firstSmallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for(int i =0; i < array.length; i++){
        if(array[i]<firstSmallest){
            secondSmallest = firstSmallest;
            firstSmallest = array[i];
        }
        else if (array[i]<secondSmallest){
            secondSmallest = array[i];
        }
    }
    return firstSmallest+secondSmallest;
}


public static int maxProduct(int[]array){ // method 2
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int firstSmallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    
    for(int i =0; i < array.length; i++){
        if(array[i]>firstLargest){
            secondLargest = firstLargest;
            firstLargest = array[i];
        }
        else if (array[i]>secondLargest){
            secondLargest = array[i];
        }
    }
    for(int i =0; i < array.length; i++){
        if(array[i]<firstSmallest){
            secondSmallest = firstSmallest;
            firstSmallest = array[i];
        }
        else if (array[i]<secondSmallest){
            secondSmallest = array[i];
        }
    }
    int p1 = firstLargest * secondLargest;
    int p2 = firstSmallest * secondSmallest;
    return p1 > p2 ? p1 : p2;

}

}
