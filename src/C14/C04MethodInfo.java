package C14;

class Super {
    int num1;
    public void sound() {
        System.out.println("Sound1()");
    }
}
class Sub extends Super {
    int num2; //확장
    public void move(){
        System.out.println("Sub1 move1()");
        //확장

    }
    public void sound() {
        System.out.println("Sub1's move1()");
    }
}

public class C04MethodInfo {
    public static void main(String[] args) {
        //정상범위
        Super ob1 = new Super();
        Super ob2 = new Sub();

        Super ob3 = new Sub();

        ob1.sound();
        ((Sub) ob2).move();
        ob3.sound();
        System.out.println(ob1);
        System.out.println(ob2);
    }
}
