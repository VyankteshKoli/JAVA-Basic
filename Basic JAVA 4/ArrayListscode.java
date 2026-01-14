package CollectionFramework;
import java.util.ArrayList;

class ArrayListcode{

    public static void main(String args[]){

        // For Integers
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(80);
        list.add(90);
        System.out.println(list.get(3));

        list.add(2,50);

            System.out.println(list);

            list.remove(2);

            System.out.println(list);

        // For Strings
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Manogo");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits);

        fruits.remove("Banana");
        System.out.println(fruits);
    }
}
