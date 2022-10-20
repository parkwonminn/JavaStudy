package C15;

class par1
{
    //일반 메서드
    void method1(){

    }
}
class son1 extends par1 {
    void method1() {
        System.out.println("Son1의 자율적 재정의된 메서드");
    }
}

//--------------------추상 클래스 상속관계 ----------------------
abstract class par2 {
    //추상메서드
    abstract void method2();
}
class son2 extends par2 {
    @Override
    void method2() {
        System.out.println("Son의 강제 재정의된 메서드 ");
    }
}

public class C01AbstractMain {
    public static void main(String[] args) {
        par1 obj1 = new par1(); //상위 클래스로 객체 생성가능
        son1 obj2 = new son1(); //하위 클래스로 객체 생성가능
        obj1=obj2;              //업캐스팅(자동형변환)
        obj1.method1();         //재정의된 메서드 이용 가능

        //추상 클래스
//        par2 obj3 = new par2();
//        par2 obj3 = null;
        son2 obj4 = new son2();
    }
}
