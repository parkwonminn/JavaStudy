package C13;

class C02Simple {
    int n1;
    static int n2;

    void Func1() {
        n1 = 10;
        n2 = 20;
    }
    static void Func2() {
        //n1=10;  //문제발생 : static 메서드에서는 기본멤버젼수 사용은 불가능
        n2=20;
    }
}
public class C02Static {
    public static void main(String[] args) {

    }
}
