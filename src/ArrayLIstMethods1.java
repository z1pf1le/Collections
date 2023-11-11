import java.util.ArrayList;

public class ArrayLIstMethods1{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("qwe");
        arrayList.add("wer");
        arrayList.add("ert");
        arrayList.add(0,"rty");
        arrayList.set(1, "anus");
        for(String s: arrayList)
            System.out.println(s);



//        System.out.println(arrayList.get(2));


    }
}
