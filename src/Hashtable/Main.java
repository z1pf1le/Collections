package Hashtable;

import java.util.*;

public class Main{
    public static <HashTable> void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Victor1");
        table.put(200, "Victor2");
        table.put(300, "Victor3");
        table.put(400, "Victor4");
        table.put(500, "Victor5");


        for (Integer key : table.keySet()){
            System.out.println(key + " " + table.get(key) + " " + table.get(key).hashCode() + " " + key.hashCode());
        }

//        for(int i=0; i < table.size(); i++){
//            System.out.println(table.get(i)); //так не катит, у объектов хэштаблица номеров порядковых нет
//        }
    }
}
