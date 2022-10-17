package C11;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //10 크기의 int형 배열을 만들어서
        //반복문과 함께 해당 배열의 0-9 까지 요소에 각각 정수값을 입력
        // 합,평균,최대값 최소값을 구합시다.

        int[] arr = new int[10];
        System.out.println("정수 10개를 입력하세요.");
        int sum = 0;
        int avg = 0;
        int max = arr[0];
        int min = arr[0];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        arr[5] = sc.nextInt();
        arr[6] = sc.nextInt();
        arr[7] = sc.nextInt();
        arr[8] = sc.nextInt();
        arr[9] = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("가장 작은 수는? " + arr[0]);
        System.out.println("가장 큰 수는? " + arr[9]);




        //합,평균 구하기
//        for (int i = 0; i <= arr.length; i++) {
//            sum = sum+i;
//
//            avg = sum / 10;
//        }

        //최댓값,최솟값
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }


//        System.out.println(sum);
//        System.out.println(avg);
//        System.out.println(max);
//        System.out.println(min);
    }
}