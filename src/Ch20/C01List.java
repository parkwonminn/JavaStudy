package Ch20;

import java.util.ArrayList;
import java.util.List;

public class C01List {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("OracleDB");
        list.add("JSP");
        list.add("Servlet");
        list.add("SpringFrameWork");

        //확인(저장 수)
        System.out.println("총 개체수 : " + list.size());

        //조회(요소)
        System.out.println("확인 idx 2 : " + list.get(2));
        System.out.println("-------------------------");

        //전체 조회
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------");
        for (String tmp : list)
        {
            System.out.println(tmp);
        }
        //삭제
        list.remove(2);
        System.out.println("----------------------");
        for (String tmp : list)
        {
            System.out.println(tmp);
        }
    }
}
