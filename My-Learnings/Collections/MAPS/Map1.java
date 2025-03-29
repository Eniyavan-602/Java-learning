
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/*

 * Maps are similiar to Sets
 * But in sets we store only one value
 * But in Maps we store Two values(key , Value)
 *key - Doesnt be Dupicate   value - Have Duplicates
 Ex : India 300
      China 300
 Keys are the all key (India, China, USA)
 Values ares the all Value(300,3000,500)
 Map -> Map is a collection of key value Pair or (Multiple Entry)
 All keys and values are together called EntrySet

 MAP :
 -> HashMap
 -> LinkedHashMap
 -> TreeMap

 Methods:
 1.Put(object key, object Value) - To add
2. If we want to add two Map Put All(map second Map name)
3. remove(obj key) - > remove both key and value
4. clear() -> clear all
5. size() - > size of value pair
6. get(objKey)-> get the value
7. containskey(obj key) -> to check that key present in map or not
8. containsvalue(obj value) -> to check the value present in map or not
9. key set() -> return all keys
10. values() -> return all values
11. entry set() -> to get all key and values
12. get key()
13. get value() 
{USA=1500, China=6000, India=3000} map output is in Currly Brrackets
Sets output in [USA=1500, China=6000, India=3000] square brracket */
public class Map1{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("India", 3000);
        map.put("USA", 1500);
        map.put("China", 6000);
        //System.out.println(map);
        Set<Entry<String,Integer>>entrys = map.entrySet(); //Entry is an interface so we have to import Map.Entry
        for(Entry<String, Integer> res : entrys){
            //System.out.println(res);
            System.out.println(res.getKey()+" : "+res.getValue());
        }

    }
}