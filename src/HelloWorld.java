import java.util.*;
public class HelloWorld{

    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.replaceAll(list, 4, 6);
        System.out.println(list);
    }
}