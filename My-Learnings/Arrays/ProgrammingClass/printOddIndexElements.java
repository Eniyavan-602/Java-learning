import java.util.Scanner;

public class printOddIndexElements {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = scanner.nextInt();
        int[] arr = new int [size];
        System.out.print("Enter the Array: ");
        for(int i = 0 ; i < arr.length ; i++)
        {
        arr[i] = scanner.nextInt();
        }
        
        printOddIndexElement(arr);
    }

    public static void printOddIndexElement(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++)
        {
        if(i%2 != 0)
        {
            System.out.print(arr[i]+" ");
        }
        
       
    }
}
}
