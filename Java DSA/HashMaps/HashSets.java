import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSets {
    public static void main(String[] args) {
        // HashSet is a collection of elements that does not allow duplicates
        // HashSet is not ordered
        HashSet<String> cities = new HashSet<>();
        cities.add("Mangaluru");
        cities.add("Bangaluru");
        cities.add("Mumbai");
        cities.add("Udupi");
        System.out.println(cities);
        System.out.println(cities.contains("Udupi"));
        cities.remove("Udupi");
        System.out.println(cities.contains("Udupi"));

        // iterations
        @SuppressWarnings("rawtypes")
        Iterator itr = cities.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // for each
        for(String city : cities){
            System.out.println(city);
        }

        // linked hashset
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mangaluru");
        lhs.add("Bangaluru");
        lhs.add("Mumbai");
        lhs.add("Udupi");
        System.out.println(lhs);

        // tree hashset
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mangaluru");
        ts.add("Bangaluru");
        ts.add("Mumbai");
        ts.add("Udupi");
        System.out.println(ts);
        
    }
}
