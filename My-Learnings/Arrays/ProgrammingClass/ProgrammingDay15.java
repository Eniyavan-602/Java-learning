/*Sorted Array */
import java.util.Scanner;
public class ProgrammingDay15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int n = scan.nextInt();
        int[]array = new int[n];
        System.out.print("Enter Array Values: ");
        for(int i =0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        kNumberRepeatingElement(array);
    }



    /*
     * Given an array f n integers . Write a program to print the occurence of each eleements present in the array.
     * I/P: 8 -> 2 2 2 3 4 4 4 23
     * O/P: 2-3
     *      3-1
     *      4-3
     *     23-1
     */
    public static void printOccurence(int[]array){
        int count  = 1;
        for(int i =0; i < array.length-1;i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else{
                System.out.println(array[i]+"-"+count);
                count = 1;
            }

        }
        if(count == 1){
            System.out.println(array[array.length-1]+"-"+count);
        }

    }





    /*
     * Given an sorted array of n integers, write a programm to print all the array elements without repeating
     * I/P:
     * 8 -> 2 2 2 3 4 4 4 23
     * o/p: 
     * 2 3 4 23
     */
    public static void printWithoutRepeating(int[]array){
        for(int i =0; i < array.length-1; i++){
            if(array[i] != array[i+1]){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println(array[array.length-1]);
    }
    


/*
 * Given an Sorted Array of n integers. Write a program to print all the unique elements present in array 
 * i/p: 8 -> 2 2 2 3 4 4 4 23
 * o/p: 3 23
 */
    public static void printUniqueElements(int[]array){
        int count  = 1;
        for(int i =0; i < array.length-1;i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else{
                if(count == 1){
                System.out.print(array[i]+" ");
                }
                count = 1;
            }

        }
        if(count == 1){
            System.out.println(array[array.length-1]);
        }
    }


    /*print the even number of repeating array
     * i/p: 8 -> 2 2 2 3 4 4 4 23
 * o/p: 3 23
     */
    public static void eveneRepeatingElements(int[]array){
        int count  = 1;
        for(int i =0; i < array.length-1;i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else{
                if(count % 2 == 0){
                    System.out.print(array[i]+" ");
                    }
                count = 1;
            }

        }
        if(count % 2 == 0){
            System.out.println(array[array.length-1]);
        }
    }




    /*Print the Odd number of repeating element in an array 
     * i/p: 8 -> 2 2 2 3 4 4 4 23
 * o/p: 3 23
    */
    public static void oddRepeatingElement(int[]array){
        int count  = 1;
        for(int i =0; i < array.length-1;i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else{
                if(count %2 != 0){
                    System.out.print(array[i]+" ");
                    }
                count = 1;
            }

        }
        if(count %2 != 0){
            System.out.println(array[array.length-1]);
        }
    }


    /*print the primeNumber number of repeating element in array 
     * i/p: 8 -> 2 2 2 3 4 4 4 23
 * o/p: 3 23
    */
    public static boolean  isPrime(int n){
        if(n<2){
            return  false;
        }
        for(int i =2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return  true;
    }
    public static void primeRepeatingElement(int[]array){
        int count  = 1;
        for(int i =0; i < array.length-1;i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else{
                if(isPrime(count)){
                    System.out.print(array[i]+" ");
                    }
                count = 1;
            }

        }
        if  (isPrime(count)){
            System.out.println(array[array.length-1]);
        }
    }
/* print the k number of repeating element in array
 * i/p: 8 -> 2 2 2 3 4 4 4 23
 * o/p: 3 23
*/
public static void kNumberRepeatingElement(int[]array){
    int count  = 1;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a k Value: ");
    int k = scan.nextInt();
    for(int i =0; i < array.length-1;i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else{
                if(count == k){
                    System.out.print(array[i]+" ");
                    }
                count = 1;
            }

        }
        if(count == k){
            System.out.println(array[array.length-1]);
        }
}

}
