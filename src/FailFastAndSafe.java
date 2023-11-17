import java.util.*;
import java.util.concurrent.*;
//https://www.youtube.com/watch?v=PILSlTw4ZDc

public class FailFastAndSafe{

    public static void main(String[] args) {
//        failSafeIterator();
        failFastIterator();
    }

//    public static void failSafeIterator()
//    {
//        String[] data = {"1", "2", "3", "4"};
//        CopyOnWriteArrayList<String> dataList = new CopyOnWriteArrayList<String>(data);
//        Iterator<String> iterator = dataList.iterator();
//        while(iterator.hasNext()){
//            String server = iterator.next();
//            System.out.println(server);
//            if (server.equals("1")) {
//                dataList.add("11");
//            }
//        }
//        System.out.println(dataList);
//
//    }

    public static void failFastIterator() {
        ArrayList<String> servers = new ArrayList<String>();
        servers.add("Tomcat");

        Iterator<String> iterator = servers.iterator();
        while (iterator.hasNext()){
            String server = iterator.next();
           
            System.out.println(server);
//            servers.add("Jetty"); //provokes an exception
        }
    }
}
