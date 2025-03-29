
import java.util.Scanner;
import java.util.TreeSet;

//write a program to print the urls in lexicographical and in separate urls
//i/p ; www.fb.com,www.insta.com,www.angleone.com
//o/p ; 
//www.angleone.com
//www.fb.com
//www.insta.com
public class PrintLexicoGraphical {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter an String: ");
        String s = scan.nextLine();
       lexicographical(s);
        
    
    }
    public static void  lexicographical(String s){
        String[]arr =s.split(",");
        TreeSet<String>set =new TreeSet<String>();
        for(int i = 0; i < arr.length; i++){
          set.add(arr[i]);
        }
        for(String x : set){
            System.out.println(x);
        }
        
    }
}
