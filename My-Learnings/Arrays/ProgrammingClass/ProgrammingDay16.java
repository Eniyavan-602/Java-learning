import java.util.Scanner;
public class ProgrammingDay16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int n = scan.nextInt();
        int[]array = new int[n];
        System.out.print("Enter Array Values: ");
        for(int i =0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        printRepeating(array);
    }


    /*Given an sorted array of n integers. Write a pr   ogram to count number of unique elemets present in an array
     * i/P : 8 -> 2 2 2 3 4 4 4 23
     * o/p: 3 23
     */
    public static void printUniquCount(int[]array){
        int count = 1;
        int unique = 0;
        for(int i = 0; i < array.length-1;  i++){
            if(array[i] == array[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    unique++;
                }
                count =1;
            }
        }
        if(count == 1){
            unique++;
        }
        System.out.println(unique);
    }





/*Given an sorted array of n integers. Write a program to count largest repeating element present in an array  */
public static void printLargestRepeating(int[]array){
    for(int i =array.length-1; i >= 0; i--){
        if(array[i]== array[i-1]){
            System.out.print(array[i]+" ");
            return;
        }
    }
    System.out.println("-1");
}

/*Given an two sorted array of n integers. Write a program to print repeating element present in both array 
 * IP: 5 -> 3 5 6 8 9
 *     7 -> 2 3 4 5 7 8 8
 * op : 3 6 8
*/
public static void printRepeating(int[]array){
    
    int i =0;
    int j = 0;
    Scanner scan  = new Scanner(System.in);
    System.out.print("Enter Size of 2nd Array: ");
    int n = scan.nextInt();
    int[] array2 = new int[n];
    System.out.print("Enter the 2nd Array Values: ");
    for(int a = 0;  a < array2.length; a++){
        array2[a] = scan.nextInt();
    }
    
    while (i < array.length && j < array2.length) { 
        if(array[i] == array2[j])
        {
            System.out.print(array[i]+" ");
            i++;
            j++;
        }
        else if(array[i]>array2[j]){
            j++;
        }
        else{
            i++;
        }
    }


}

}
