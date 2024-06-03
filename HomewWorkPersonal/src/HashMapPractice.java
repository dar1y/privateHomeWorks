import java.util.HashMap;
import java.util.Map;


public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(5,"five");
        hm.put(6,"six");
        hm.put(7,"seven");
        hm.put(8,"eight");
        hm.put(9,"nine");
        hm.put(10,"ten");
        for(Map.Entry<Integer,String> item : hm.entrySet()){
            System.out.println(item.getKey()+ " " + item.getValue());
        }
    }

}
