package main.java.com.github.movetojava.MapTest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("miao", 1);
        map.put("nya", 2);
        map.put("mua", 3);
        Set<String> set = map.keySet();

        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            String key = i.next();
            Integer val = map.get(key);
            System.out.print(val+" ");
        }
        Map<String, Integer> map2 = Map.of("miao", 1,"nya", 2 ,"mua", 3);

        System.out.println(" ====== ");
        for (String key : map2.keySet()){
            final Integer val = map2.get(key);
            System.out.print(val+" ");
        }


    }
}
