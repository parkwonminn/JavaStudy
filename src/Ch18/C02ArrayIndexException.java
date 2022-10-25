package Ch18;

public class C02ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {10,20,30};

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
