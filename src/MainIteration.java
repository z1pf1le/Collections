import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
//https://www.youtube.com/watch?v=LG-q2VBUSCw

public class MainIteration{
    public static void main(String[] args) {
        Integer[] array = new Integer[] {64, 42, 73, 41, 32};

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, array);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
