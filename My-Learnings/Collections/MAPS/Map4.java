
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Given a String write a programm to print all the words that occur more than 3 times. Each word should be printed on a new line.
 * I/p: fear leads to anger leads to hatred hatred leads to conflict leads to suffering.
 * O/p: to leads
 */
public class Map4 {
   public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter an String : ");
        String s = scan.nextLine();
        countWords(s);
    } 
    public static void countWords(String s){
        String[]ar = s.split(" ");
       LinkedHashMap<String,Integer> map = new LinkedHashMap<String, Integer>();
       for(int i = 0; i < ar.length; i++){
        if (map.containsKey(ar[i])) {
            int c = map.get(ar[i]);
            map.put(ar[i], c+1);
        }
        else{
            map.put(ar[i], 1);
        }
    }
    Set<Entry<String, Integer>> entry = map.entrySet();
    int max = 0;
    String maxKey = null;
    for(Entry<String, Integer> e: entry){
          if(e.getValue()>=max){ // last occurence if ex: leads 4 to 4 e.getValue()>=max// if we want firsr occurence e.getValue() > max
              max = e.getValue();
              maxKey = e.getKey();
       }
    }
    System.out.println(maxKey);

   // for(Entry<String, Integer> e: entry){
     //   if(e.getValue()>3){
     //       System.out.println(e.getKey());
     //   }

    //}

    }
}
