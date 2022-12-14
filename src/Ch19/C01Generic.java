package Ch19;

class 팥
{
    String meterial;
    팥(String meterial){this.meterial=meterial;}
    //toString재정의

    @Override
    public String toString() {
        return "팥{" +
                "meterial='" + meterial + '\'' +
                '}';
    }
}

class 야채
{
    String meterial;
    야채(String meterial){this.meterial=meterial;}

    @Override
    public String toString() {
        return "야채{" +
                "meterial='" + meterial + '\'' +
                '}';
    }
}

class 피자
{
    String meterial;
    피자(String meterial){this.meterial = meterial;}

    @Override
    public String toString() {
        return "피자{" +
                "meterial='" + meterial + '\'' +
                '}';
    }
}

class 호빵<T>
{
    private T meterial;
    호빵(T meterial) {
        this.meterial = meterial;
    }
    void ShowInfo() {
        System.out.println(meterial.toString()+" 으로 만든 호빵");
    }
}

public class C01Generic {
    public static void main(String[] args) {
        호빵<팥> ob1 = new 호빵<>(new 팥("단팥"));
        ob1.ShowInfo();

        호빵<야채> ob2 = new 호빵<>(new 야채("맛있는 야채"));
        ob2.ShowInfo();;

        호빵<피자> ob3 = new 호빵<>(new 피자("피자피자"));
        ob3.ShowInfo();
    }
}
