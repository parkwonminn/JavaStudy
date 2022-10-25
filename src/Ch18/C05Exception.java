package Ch18;

public class C05Exception {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.toString());
            int[] arr = new int[3];
            arr[4] = 10; //배열 idx 제외
            System.out.println(10 / 0); //산술 오류
            Animal cat = new Cat();
            Dog dog = (Dog) cat;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
