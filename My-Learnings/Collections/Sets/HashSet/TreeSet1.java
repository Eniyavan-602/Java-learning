// output in sorted order
import java.util.TreeSet;

public class TreeSet1{
        public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<>(); // we not have to give <Integer on right side>
            set.add(23);
            set.add(73);
            set.add(33);
            set.add(93);
            set.add(103);
            set.add(83);
    
            for(Integer x : set){
                System.out.println(x);
            }
        }
}
