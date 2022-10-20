package C17;

import java.util.Calendar;
import java.util.Date;

public class C07Date {
    public static void main(String[] args) {

        Date d1 = new Date();
//        System.out.println(d1);
//        System.out.println(d1.getYear());
//        System.out.println(d1.getMonth()+1);
//        System.out.println(d1.getDay());
//        System.out.println(d1.getHours());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(cal.YEAR));                  //연
        System.out.println(cal.get(Calendar.MONTH) + 1);        //월
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));     //일
        System.out.println(cal.get(Calendar.HOUR));     //시
        System.out.println(cal.get(Calendar.MINUTE));     //분
        System.out.println(cal.get(Calendar.SECOND));     //초

    }
}
