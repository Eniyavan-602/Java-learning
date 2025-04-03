import java.util.Scanner;
public class ProgrammingDay13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int n = scan.nextInt();
        int[]array = new int[n];
        System.out.print("Enter Array Values: ");
        for(int i =0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        countInversion(array);
}




/*we have to follow this for min pair product */
public static int minPairProduct(int[]array){// method 3
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
    int p3 = firstLargest * firstSmallest;
    if(p1<p2 && p1  < p3){
        return p1;
    }
    else if (p2 < p1 && p2 < p3){
        return p2;
    }
    else{
    return p3;
        }
}




/*Given an array of n integers. Write a program to print the second largest elemnt present in an array */
//IP: 7 -> 3 2 5 7 1 
/*
 * o.p:
 * 3 2
 * 3 5
 * 3 7
 * 3 1
 * 2 5
 * 5 7
 * 5 1
 * 7 1
 */
public static  void  printPairs(int[]array){
    for(int i = 0;i < array.length-1;i++){
        for (int j = i+1; j < array.length; j++) {
            System.out.println(array[i]+" "+array[j]);
        }
}
}




/*Given an array of n integers and an integer value of K. Write a program to print all the pairs present in the array whose value is equal to k*/
public static void greaterThanK(int[]array){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the K value: ");
    int k = scan.nextInt();
    boolean res = false;
    for(int i = 0; i < array.length-1; i++){
        for(int j = i+1; j< array.length; j++){
            if(array[i]+array[j]> k){
                System.out.println(array[i]+" "+array[j]);
                res = true;
            }
        }
    }
    if(!res){
        System.out.println("None");
    }
}


/*
 * Given an array of n integer and an integer value k. Write a program to print all the pairs present in the array whose difference is equal to k>
 *
 */
public static void prinDiffEqualsK(int[]array){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the K value: ");
    int k = scan.nextInt();
    boolean res = false;
    for(int i = 0; i < array.length-1; i++){
        for(int j = i+1; j< array.length; j++){
            if((array[i]-array[j]== k) || (array[j]-array[i] == k)){
                System.out.println(array[i]+" "+array[j]);
                res = true;
            }
        }
    }
    if(!res){
        System.out.println("None");
    }
}



/*
 * print the pairs which first number is even and second number is odd
 */
public static void printEvenOddPairs(int[]array){
    boolean res = false;
    for(int i = 0; i < array.length-1; i++){
        for(int j = i+1; j< array.length; j++){
            if(array[i]%2 == 0 && array[j]%2 != 0) {
                System.out.println(array[i]+" "+array[j]);
                res = true;
            }
        }
    }
    if(!res){
        System.out.println("None");
    }
}






/*
 * What is an Inversion?
An inversion in an array (arr[i], arr[j]) occurs when i < j and arr[i] > arr[j].
 */
public static void countInversion(int[]array){
    int count = 0;
    for(int i = 0; i < array.length-1;i++){
        for(int j = i+1; j < array.length; j++){
            if(array[i]>array[j]){
                System.out.println(array[i]+" "+array[j]);
                count++;
            }
        }
    }
    System.out.println("Total Inversion: "+count);
}

}
