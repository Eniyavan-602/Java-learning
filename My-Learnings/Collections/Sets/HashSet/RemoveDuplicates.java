
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * Given a String s, Write a program to remove duplicate character from the string and print them in insertion order
 * Input : mississippi
 * Output : misp
 * We can use LinkedHashset as it have to remove duplicates as well as to print on insertion order.
 */
public class RemoveDuplicates{
    public static void main(String[] args) {
      Scanner scan =  new Scanner(System.in);
    System.out.print("Enter an String: ");
    String s = scan.nextLine();
    String s1 = removeDuplicates(s);
    System.out.println(s1);
    }
    public static String removeDuplicates(String s){
        String  t = "";
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(int i = 0; i< s.length(); i++){
            set.add(s.charAt(i));
        }
        for(Character c : set){
            t+=c;
        }
        return t;
    }   
}
