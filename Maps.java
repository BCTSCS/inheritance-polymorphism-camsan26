import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Maps {
    
    public static void main(String[] args) {
        long start = System.nanoTime();
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("8",1);
        map1.put("5",4);
        map1.put("2",6);
        map1.put("6",5);
        map1.put("1",1);
        map1.put("3",4);
        map1.put("7",0);
        map1.put("0",3);
        map1.put("9",7);
        map1.put("4",5);
        long end = System.nanoTime();

        long time = end - start;
        System.out.println("Hashmap : " + time + " ns");
        System.out.println(map1);

        start = System.nanoTime();
        Map<String,Integer> map2 = new TreeMap<>();
        map2.put("8",1);
        map2.put("5",4);
        map2.put("2",6);
        map2.put("6",5);
        map2.put("1",1);
        map2.put("3",4);
        map2.put("7",0);
        map2.put("0",3);
        map2.put("9",7);
        map2.put("4",5);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Treemap : " + time + " ns");
        System.out.println(map2);

    }
}