package C17;

class C02Simple {
    int n;
    C02Simple(int n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object obj)       //Object obj=ob2; 업캐스팅
    {
        if (obj instanceof C02Simple)       //받은 객체가 C02Simple 클래스형이 마즌ㄴ지 확인
        {
            C02Simple down = (C02Simple)obj; // 확장된 멤버변수 n 에 접근하기 위한 다운캐스팅
            return this.n == down.n;
        }
        return super.equals(obj);
    }
}

public class C02ObjectEquals {
    public static void main(String[] args) {
        C02Simple ob1 = new C02Simple(10);
        C02Simple ob2 = new C02Simple(10);
        C02Simple ob3 = new C02Simple(14);
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.equals(ob3));
    }


}
