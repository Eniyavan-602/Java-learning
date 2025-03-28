
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicateArrayInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int n = scan.nextInt();
        int[]arr = new int[n];// size = 5
        System.out.print("Enter the Array Values: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt(); // arr[i] = 5 7 4 3
        }
        TreeSet<Integer> res = removeDuplicates(arr);
        for(Integer x : res){
            System.out.println(x); // output in each line
        }
    }
    public static TreeSet<Integer> removeDuplicates(int[]arr){
       TreeSet<Integer> set = new TreeSet<Integer>();// to remove duplicates Tree set
       for(int i =0; i < arr.length; i++){
        set.add(arr[i]);// added into treeset
       }
      return set;
    }
}
