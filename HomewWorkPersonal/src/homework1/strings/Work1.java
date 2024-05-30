package homework1.strings;

import java.util.ArrayList;
import java.util.List;


public class Work1 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        String input = "1 3 45 13 23 16";
        String[] numbers= input.split(" ");

        for(String n : numbers){
            al.add(Integer.valueOf(n));
        }
        System.out.println(al);

        List<Integer> reversedlList = new ArrayList<>();
        for(int j= al.size()-1;j!=-1;j--){
            reversedlList.add(al.get(j));
        }
        System.out.println(reversedlList);
    }
}