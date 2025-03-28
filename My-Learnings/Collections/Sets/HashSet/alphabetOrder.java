import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AlphabetOrder{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);  
     System.out.println("Enter an String: ");
    String s = scan.nextLine();
    String s1 = sortedOrder(s);
    System.out.println(s1);
    
    }
    public static String sortedOrder(String s){
    String t = "";
    TreeSet<Character> set = new TreeSet<Character>();
    for(int i = 0; i< s.length(); i++){
        set.add(s.charAt(i));
    }
    for(Character x : set){
        t+=x;
    }    
    return t;
    }
    }

