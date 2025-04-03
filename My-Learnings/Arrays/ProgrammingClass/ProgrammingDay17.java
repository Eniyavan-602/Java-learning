import java.util.Scanner;
public class ProgrammingDay17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter an 1st Array Size: ");
        int n1 = scan.nextInt();
        int[]array1 = new int[n1];


        System.out.print("Enter 1st Array Values: ");
        for(int i =0; i < array1.length; i++){
            array1[i] = scan.nextInt();
        }


        System.out.print("Enter an 2nd Array Size: ");
        int n2 = scan.nextInt();
        int[]array2 = new int[n2];


        System.out.print("Enter 2nd Array Values: ");
        for(int i =0; i < array2.length; i++){
            array2[i] = scan.nextInt();
        }


        mergeThreeArray(array1, array2);
}


/*
 * Given an two sorted Array of integer values write a program to merge the two array such that the resultant array is sorted
 * I/p : 5 -> 3 5 7 9 13
 *       8 -> 1 2 3 4 9 15 17 19
 * o/p : 1 2 3 3 4 5 7 9 9 13 15 17 19 
 */

public static void mergeArray(int[]array1, int[]array2){
    int[]res = new int[array1.length + array2.length];

    int i =0, j=0, k =0;


    while(i<array1.length && j < array2.length){
        
        if(array1[i] < array2[j]){
            res[k++] = array1[i++];
            
        }


        else{
            res[k++] = array2[j++];
        }
    }

    while (i < array1.length) {
        res[k++] = array1[i++];
    }
        
    while(j< array2.length){
        res[k++] = array2[j++];
    }


   System.out.print("Merged Array: ");
        for (int a = 0; a < res.length; a++) {
            System.out.print(res[a] + " ");
}
}




/*Given an three sorted Array of integer values write a program to merge the two array such that  is sorted array as shown as output
 * I/p : 3 -> 2 3 4
 *       4 -> 5 8 7 8                           (if Not understand ouput see notes(JAVA PROGRAMMING NOTE))
 *       5 -> 9 10 11 12 13
 * o/p : 2 5 9 3 8 10 4 7 11 8 12 13*/
public static void mergeThreeArray(int[]array1, int[]array2){

   Scanner scan = new Scanner(System.in);
    System.out.print("Enter 3rd Array Size: ");
    int n3 = scan.nextInt();
    int[]array3 = new int[n3];

    System.out.print("Enter the 3rd Array Values: ");
    for(int j = 0; j < array3.length; j++)
        {
            array3[j] = scan.nextInt();
        }


    int i =0, k = 0;


    int[] res = new int[array1.length + array2.length + array3.length];

    while(k < res.length){


        if(i< array1.length){
            res[k++] = array1[i];
            
        }
        
        if(i< array2.length){
            res[k++] = array2[i];
            
        }
        
        if(i< array3.length){
            res[k++] = array3[i];
           
        }
        i++;
    }
    for(int x : res){
        System.out.print(x+" ");
    }
    
}

}