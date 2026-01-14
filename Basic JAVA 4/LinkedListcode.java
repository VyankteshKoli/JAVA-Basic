package CollectionFramework;

import java.util.LinkedList;

public class LinkedListcode {

    public static void main(String args[]){

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.addLast(4);
        linkedList.addFirst(0);

        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
