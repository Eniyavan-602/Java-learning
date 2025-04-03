import java.util.Scanner;

public class ProgrammingDay11 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int arraySize = scan.nextInt();
        int[]array = new int[arraySize];
        System.out.print("Enter the Array Values: ");
        for (int i : array) {
            array[i] = scan.nextInt();
        }
        int res = indexOfK(array);
        {
            System.out.println(res);
        }
    }
    public static int indexOfK(int[]array){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the K value: ");
        int k = scan.nextInt();
        for(int i : array){
            if (array[i] == k) {
                return i;
            }
        }
        return -1;
    }
    
}
