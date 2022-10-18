package C14;

//상속관계에서 생성자 호출
//상위클래스의 생성자 호출 -> 하위클래스 생성자 호출
//상위 클래스 생성자 호출시 super() 예약어를 사용하여 상위클래스의 오버로딩된 생정자에 접근이 가능하다.

class Parent {
    int x,y;
    Parent(){
        System.out.println("Parent() 생성자 호출!");
    }
    Parent(int x) {
        System.out.println("Parent(x) 생성자 호출!");
        this.x = x;
    }
    Parent(int x,int y) {
        System.out.println("Parent(x,y) 생성자 호출!");
        this.x = x;
        this.y = y;
    }
}

class Son extends Parent{
    int z;
    Son() {
        super(); // 상위클래스 디폴트 생성자 호출!
        System.out.println("Son() 생성자 호출!");
    }
}
public class C02InheritanceMain{
    public static void main(String[] args) {
        Son ob = new Son();
    }
}
