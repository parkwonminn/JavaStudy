package C14;

class employee //직원
{
    String name;
    String age;
    String addr;

    public employee(String name, String age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
}

class Parttimer extends employee {
    int hourpay;

    public Parttimer(String name, String age, String addr, int hourpay) {
        super(name, age, addr);
        this.hourpay = hourpay;
    }

    @Override
    public String toString() {
        return "Parttimer{" +
                "hourpay=" + hourpay +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}

class Reguluar extends employee {
    int salary;

    public Reguluar(String name, String age, String addr, int salary) {
        super(name, age, addr);
        this.salary = salary;
    }

}

public class C03PRac {

    public static void ShowInfo(employee tmp) {
        //다운캐스팅을 통해서 parttimer or regular 를 선별해서
        //모든 정보를 출력해 보세요
        if (tmp instanceof Parttimer) {
            Parttimer parttimer = (Parttimer) tmp;
            System.out.println(parttimer.name + " " + parttimer.age + " " + parttimer.addr + " " + parttimer.hourpay);
        }
        if (tmp instanceof Reguluar) {
            Reguluar reguluar = (Reguluar) tmp;
            System.out.println(reguluar.name + " " + reguluar.age + " " + reguluar.addr + " " + reguluar.salary);
        }
    }

    public static void main(String[] args) {
        Parttimer emp1 = new Parttimer("홍길동", "25", "대구", 20000);
        Reguluar emp2 = new Reguluar("서길동", "45", "울산", 50000000);
        ShowInfo(emp1);
        System.out.println("----------------");
        ShowInfo(emp2);

    }
    //1 상속관계 만들기
    //2 적절한 생성자 만들기 (super 예약어 사용)
    //3 ShowInfo 함수 안에서 Downcasting 을 통해서 모든 멤버변수정보 출력하기
}
