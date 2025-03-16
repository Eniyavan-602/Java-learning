import java.util.Scanner;

public class printProductOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter an Array: ");
        for(int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scanner.nextInt();
        }
       int res = calculateProduct(arr);
       System.out.print(res);
      
       
    }

    public static int calculateProduct(int[] arr) {
        int product = 1;
        for(int i =0 ; i< arr.length ; i++)
        
    {
   product=  product*arr[i];
      
    }       
    return product;
    }
}
