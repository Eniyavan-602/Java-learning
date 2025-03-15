
import java.util.Scanner;

class evenArray{
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter size of an Array: ");
    int n = scan.nextInt();
    int[]arr = new int[n];
    System.out.print("Enter an Array: ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = scan.nextInt();
    }
        printEvenArray(arr);
    }
    public static void printEvenArray(int[]arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}