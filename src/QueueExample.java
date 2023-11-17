//import java.util.*;
//
//public class QueueExample{
//    public static void main(String []args){
//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));
//        priorityQueue.add("Andrew");
//        priorityQueue.add("John");
//        priorityQueue.add("Rob");
//
//        while (!priorityQueue.isEmpty()) {
//            System.out.println(priorityQueue.remove());
//        }
//        System.out.println(priorityQueue);
//    }
//}


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");

        System.out.println(queue.peek());

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
}