
import java.util.Scanner;

public class ProgrammingClass20 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter an Array Size: ");
    int n = scan.nextInt();
    int[]arr = new int[n];

    System.out.print("Enter Array Values: ");
    for(int i=0; i < arr.length; i++){
        arr[i] = scan.nextInt();
    }
    rearrangeZeroOnLast(arr);

    for(int i=0; i < arr.length; i++){
        System.out.print(arr[i]+" ");
    }


}



/*
 * rearrange -1 on first
 */
public static void reArrangeArray(int[]arr){
    int i = arr.length-1;
    int j = arr.length-1;
    while(i>=0){
        if(arr[i] == -1){
            i--;
        }
        else{
            arr[j--] = arr[i--];
    
        }
    }
    while(j>=0){
        arr[j--] = -1;
    }
}




/*
 * rearrange 0 on first
 */
public static void rearrangeZero(int[]arr){
    int i = arr.length-1;
    int j = arr.length-1;

    while(i>=0){
        if(arr[i]== 0){
            i--;
        }
        else{
            arr[j--] = arr[i--];
        }
    }
    while(j>=0){
        arr[j--] = 0;
    }
}



/*
 * rearrange 0 on last
 */
public static void rearrangeZeroOnLast(int[]arr){
    int i = 0;
    int j = 0;

    while(i< arr.length){
        if(arr[i]== 0){
            i++;
        }
        else{
            arr[j++] = arr[i++];
        }
    }
    while(j<arr.length){
        arr[j++] = 0;
    }
}



}
