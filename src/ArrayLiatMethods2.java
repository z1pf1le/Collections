import java.util.ArrayList;

public class ArrayLiatMethods2{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("qwe");
        arrayList.add("wer");
        arrayList.add("ert");
        arrayList.add(0,"rty");
        arrayList.set(1, "anus");
        System.out.println(arrayList);

        arrayList.remove(0);

        System.out.println(arrayList);
    }
}
