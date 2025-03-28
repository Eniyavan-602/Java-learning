
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
        for(int i = 0; i< s.length(); i++){// reverse another method (i = s.length()-1; i >= 0; i--)
            set.add(s.charAt(i)); // if we directly print here the o/p will be in square brackets[m, i , s, p]
        }
        for(Character c : set){// if we print in a for loop we can get single single value
            t= t+c; // if we want reverse t = c+t (1 method to rev)
        }
        return t; 
    }   
}
