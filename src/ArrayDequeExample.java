import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
//        Deque<String> stack = new ArrayDeque<>();
//        Deque<String> queue = new ArrayDeque<>(2);
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//        stack.push("D");
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop() + " ");
//        }
//        System.out.println();
//
//        queue.add("A");
//        queue.add("B");
//        queue.add("C");
//        queue.add("D");
//        while (!queue.isEmpty()) {
//            System.out.print(queue.remove() + " ");
//        }
        Deque<Integer> anus = new ArrayDeque();
        for(int i = 0; i < 5; i++){
            anus.add(i);
            System.out.println(anus);
        }
        for(int i = 0; i < 5; i++){
            anus.push(i);
            System.out.println(anus);
        }
        System.out.println(anus);
    }
}