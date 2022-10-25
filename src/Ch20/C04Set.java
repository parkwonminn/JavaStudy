package Ch20;

import java.util.*;

public class C04Set {
    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();
        Set<Integer> lotto = new HashSet();

//        로또 만들기
        while (lotto.size()<7)
        {
            lotto.add(rand.nextInt(45) + 1);
        }
        for (int n : lotto) {
            System.out.println(n+" ");
            Thread.sleep(500);
        }
        System.out.println("정렬 전");
        //정렬
        List<Integer> list = new ArrayList<>(lotto);
        for (int n : list) {
            System.out.println(n+ " ");
        }
        // Collections.sort(list); //오름차순

        System.out.println("내림 차순");
        list.sort(Collections.reverseOrder()); // 내림차순

        for (int n : list) {
            System.out.println(n + " ");
        }


        //난수만들기 코드
//        while (true)
//        {
//            System.out.println(rand.nextInt(45 + 1));
//            Thread.sleep(500);
//        }
    }
}
