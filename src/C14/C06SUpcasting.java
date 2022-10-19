package C14;

class A{
    int n1 =10;

}

class B extends A{
    int n2 = 20;
}
class C extends B{
    int n3 = 30;
}
class D extends C{
    int n4 = 40;
}
class E extends D{}
class F extends E{}

public class C06SUpcasting {

    public static void UpcastingTest(A tmp) {

        System.out.println(tmp.n1);
        System.out.println();
        //instanceof : 상속을 받고 있는지 확인
        if (tmp instanceof B){
            B down = (B)tmp;
            System.out.println(down.n2);
            System.out.println();
        }
        if (tmp instanceof C) {
            C down = (C)tmp;
            System.out.println(down.n3);
            System.out.println();
        }
        if (tmp instanceof D) {
            D down = (D)tmp;
            System.out.println(down.n4);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        A ob6 = new A();
        B ob1 = new B();
        C ob2 = new C();
        D ob3 = new D();
        E ob4 = new E();
        F ob5 = new F();
        UpcastingTest(ob6);
        UpcastingTest(ob1);
        UpcastingTest(ob2);
        UpcastingTest(ob3);
//        UpcastingTest(ob4);
//        UpcastingTest(ob5);

        //UPCASTING
        //상위클래스 참조변수 = 하위객체
        //자동형변환
        //상속관계의 하위객체 연결
        //하위클래스의 확장된 멤버 접근 불가능
        // ->downcasting

        //DOWNCASTING
        //하위클래스 참조변수 = 상위객체
        //강제형변환

        //instanceof
        //객체타입을 확인하는 연산자
    }
}
