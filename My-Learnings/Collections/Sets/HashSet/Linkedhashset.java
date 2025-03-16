
import java.util.LinkedHashSet;

public class Linkedhashset{
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet(); 
        set.add(75);
        set.add(75.089898);
        set.add("String");
        //set.add(new Scanner(System.in));
        set.add(false);
        set.add('a');

        System.out.println(set);
    }
}
