import java.util.Scanner;

public class printEvenIndexElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter an Array: ");
        for (int i = 0 ; i < arr.length ; i++)
    {
        arr[i]=scanner.nextInt();
    }

       printEvenIndexArrayElements(arr);
       

    }

    public static void printEvenIndexArrayElements(int[] arr) {
        // Your logic here
        for(int i = 0; i < arr.length ; i++)
        {
            if(i % 2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
