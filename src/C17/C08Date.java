package C17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C08Date {
    public static void main(String[] args) throws ParseException {


        Date today = new Date();

        Scanner sc = new Scanner(System.in);
        System.out.println("YYYY/MM/DD 입력 : ");

        String str = sc.nextLine();

        //포매터
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

        String toDayFormatAdd = fmt.format(str);

        System.out.println(toDayFormatAdd);

        //문자열 -> Date
        Date date = fmt.parse(str);



        //포맷설정 후 출력
        System.out.println(fmt.format(fmt));

    }
}
