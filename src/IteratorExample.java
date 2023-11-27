import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(978);
        System.out.println(nums);
//        for (int element : nums){
//            if (element == 1) {
//                nums.remove(element);
//            }
//            System.out.print(element + " ");
//        }
        Iterator<Integer> intIterator = nums.iterator();
        while(intIterator.hasNext()) {
            Integer nextInt = intIterator.next();
            System.out.println(nextInt);
            if (nextInt==978) {intIterator.remove();}
        }
        System.out.println(nums);
    }
}
