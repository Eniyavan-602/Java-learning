
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Given an array  of n integer. write a program to print the number of pairs present in the array
 * I/P:
 * 10
 * 3 1 7 7 1 7 7 1 4 3
 * o/p;
 * 4
 * logic : 3 occur 2 time By that 1 pair made (3=1(pair means 2))
 *         1 occur 3 time By that 1 pair made (3=1(pair means 2))
 *         7 occur 4 time By that 2 pair made (4=2(pair means 2))
 *         4 occur 1 time By that 0 pair made (1=0(pair means 2))
 *        -------------------------------------------------------
 *                  totaly =>  |4 pairs|
 * *  */
public class Map3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter Array Values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        countPairs(array);
    }
    public static void countPairs(int[]array){
    LinkedHashMap<Integer, Integer> map =  new LinkedHashMap<Integer, Integer>();
    for (int i = 0; i < array.length; i++) {
        if(map.containsKey(array[i])){
            int c = map.get(array[i]);
            map.put(array[i], c+1);
        }
        else{
            map.put(array[i], 1);
        }
    }
    int sum = 0;
            Set<Entry<Integer,Integer>> entrys=map.entrySet();
            for(Entry<Integer,Integer> e : entrys){
                //System.out.println(e);
                sum+=e.getValue()/2;
            }
            System.out.println(sum);
    }
}
