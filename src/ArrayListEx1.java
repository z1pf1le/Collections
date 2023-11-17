import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(200);
        arrayList.add("qwe");
        arrayList.add("wer");
        arrayList.add("ert");
        System.out.println(arrayList);
//        List<Integer> nums = new List<Integer>();
//        nums.add(5);
//        System.out.println(nums);
    }
}
