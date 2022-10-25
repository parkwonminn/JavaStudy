package Ch20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01Prac {
    public static void main(String[] args) {
        int num = 0;
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("=======M E N U =======");
            System.out.println("1 이름 등록");
            System.out.println("2 이름 조회");
            System.out.println("3 이름 삭제");
            System.out.println("4 전체 조회");
            System.out.println("5 종료");
            System.out.println("=======M E N U =======");
            System.out.print("번호 : " );
            num = sc.nextInt();
            switch(num)
            {
                case 1:
                    //이름 입력받아서 ArrayList 에  add
                    System.out.println("이름을 등록하세요");
                    list.add(sc.next());
                    break;
                case 2:
                    //이름 입력받아서 조회(있다,없다로 조회) 이름이 있으면 "있다" 없으면 "없다"..
                    System.out.println("이름을 입력하세요. 조회하기");
                    String name = sc.next();
                    if (list.contains(name)) {
                        System.out.println("있다");
                    } else {
                        System.out.println("없다.");
                    }
                    break;
                case 3:
                    //이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패"
                    System.out.println("이름을 입력하세요(삭제하기)");
                    String name2 = sc.next();
                    if (list.contains(name2)) {
                        list.remove(name2);
                        System.out.println("삭제 완료");
                    } else {
                        System.out.println("그런거 없는데용?");
                    }
                    break;
                case 4:
                    //전체 조회
                    System.out.println("전체 조회");
                    for (String tmp : list) {
                        System.out.println(tmp);
                    }
                    break;
                case 5:
                    System.out.println("종료 하겟습니다.");
                    System.exit(-1);
                default:
                    System.out.println("다시 입력...");
            }
        }
    }
}