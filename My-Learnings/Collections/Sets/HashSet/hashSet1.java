/*
 *Collections :
 1.HashSet:
 -> In the HashSet Duplicates are Not allowed
 ->Output order is not same as insertion because it follows Hashing
 -> It helps to store hetrogeneous Type of Data
 -> It does not store primitive Data Type(int,float,double,byte...) Instead we can use Class(Integer, Float, Byte)
 -> If we want to store an Homogeneous value By using Generics we can achieve (HashSet<Integer> set = new HashSet<Integer>())
 -> To print output in one by one we can use for each loop
 */
import java.util.HashSet;
public class hashSet1 {
    public static void main(String[] args) {
        HashSet set =new HashSet<Integer>();
        set.add(56);
        set.add(25);
        set.add(12);
        System.out.println(set);
    }
}