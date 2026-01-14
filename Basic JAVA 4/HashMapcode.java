
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapcode {

    public static void main(String args[]){

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Vyanktesh");
        hm.put(2,"Virat");

        String student = hm.get(2);
        System.out.println(student);
        System.out.println(hm);

        System.out.println(hm.containsKey(2));

        Set<Map.Entry<Integer,String>> entries = hm.entrySet();

        for(Map.Entry<Integer,String> entry:entries){


            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(hm);
    }

}
