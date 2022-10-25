package Ch20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03Set {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("OracleDB");
        set.add("JSP");
        set.add("Servlet");
        set.add("SpringFrameWork");
        //확인(저장 수)
        System.out.println("총 개체수 : " + set.size());

        for (String tmp : set) {
            System.out.println(tmp);
        }

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String tmp = iter.next();
            System.out.println(tmp);
        }
        set.remove("Java");
        //확인(저장 수)
        System.out.println("총 개체수 : " + set.size());
    }
}