package CollectionFramework;

import javax.sound.midi.SysexMessage;
import java.util.Stack;

public class Stackcode {

    public static void main(String arggs[]){

        Stack<Integer> stack = new Stack<>();

        stack.push(10); // first in
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // last in

        System.out.println("All PUSH Elements:- "+stack);
        stack.pop();
        System.out.println("After POP Element:- "+stack);

        System.out.println("Peek Element:- "+stack.peek());

        System.out.println("Stack Size:- "+stack.size());
    }
}
