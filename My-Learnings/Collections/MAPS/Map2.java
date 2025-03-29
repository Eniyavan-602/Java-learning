import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
/*
 * Given a String S, write a program to count the number of occurences of each character and concat the counts to correspond charaacter,
 * maintaining the order of their first appearence in the string;
 * I/P: mississippi
 * O/P:m1i4s4p2
 */
public class Map2{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an String: ");
    String s = scanner.nextLine();
    countCharacters(s);
    }
    public static void countCharacters(String s){
        String s1 = "";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        //TreeMap<Character,Integer> map = new TreeMap<Character,Integer>(); for sorted order   

        for(int i = 0; i < s.length();i++){
                char ch = s.charAt(i);
                if (map.containsKey(ch)) {
                    int c = map.get(ch);
                    map.put(ch, c+1);
                }
                else{
                    map.put(ch, 1);
                }
            }
            Set<Entry<Character, Integer>> entrys = map.entrySet();
            for (Entry<Character, Integer> e : entrys) {
                s1 = s1 + e.getKey() + e.getValue(); // Ensure correct order
            }
    
            System.out.println(s1);
        }
}

