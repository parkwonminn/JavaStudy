package C11;

import java.util.Scanner;

public class C01ArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];
        ar1[0]=sc.nextInt();
        ar1[1]=sc.nextInt();
        ar1[2]=sc.nextInt();
        ar1[3]=sc.nextInt();
        ar1[4]=sc.nextInt();

        //for
        for (int i = 0; i < ar1.length; i++) {
            System.out.printf(ar1[i]+" ");
        }
        System.out.println();
        //
        for (int val : ar1) {
            System.out.println(val + " ");
        }
        System.out.println();


        //길이가 7인 double형 1차원 배열의 생성
        double[] ar2 = new double[7];

        //배열의 참조변수와 인스턴스 생성 분리
        float[] ar3;
        ar3 = new float[9];

        // 배열의 인스턴스 변수 접근
        System.out.println("배열 ar1의 길이 : " + ar1.length);
        System.out.println("배열 ar2의 길이 : " + ar2.length);
        System.out.println("배열 ar3의 길이 : " + ar3.length);

    }
}
