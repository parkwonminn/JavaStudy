package C11;

import java.util.Scanner;

public class C02ArrayPrac {
    public static void main(String[] args) {
        //문제
        //5명의 학생의 국/영/수 점수를 입력받아 출력을 해 봅시다
        //이차원배열
        //int score[5][3]
        //반복문을 이용해서 값을 입력받기
        //각 행의 합 과 전체합 // 각행의 평균 전체 평균을 출력하세요
        //출력예
        //1 학생 점수입력(국/영/수 순서) : 100 70 60
        //2 학생 점수입력(국/영/수 순서) : 99 98  66
        //3 학생 점수입력(국/영/수 순서) : 99 88 77
        //4 학생 점수입력(국/영/수 순서) : 100 55 66
        //5 학생 점수입력(국/영/수 순서) : 55 66 77
        //1 학생 총점 : ? 평균 ?
        //2 학생 총점 : ? 평균 ?
        //3 학생 총점 : ? 평균 ?
        //4 학생 총점 : ? 평균 ?
        //5 학생 총점 : ? 평균 ?
        //국어 총점 : ? 국어 평균 :?
        //영어 총점 : ? 영어 평균 :?
        //수학 총점 : ? 수학 평균 :?

        Scanner sc = new Scanner(System.in);
        int[][] score = new int[5][3];
        int kor = 0, eng = 0, mat = 0, korAvg = 0, engAvg = 0, matAvg = 0;
        for (int i = 0; i < score.length; i++) {
            int sum = 0, avg = 0;
            System.out.print(i + 1 + "학생 점수 입력(국/영/수 순서)\n");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
                sum += score[i][j];
                avg = sum / 3;
            }
            kor += score[i][0];
            eng += score[i][1];
            mat += score[i][2];
            korAvg = kor / 5;
            engAvg = eng / 5;
            matAvg = mat / 5;

            System.out.println(i + 1 + "학생 총점" + sum);
            System.out.println(i + 1 + "학생 평균" + avg);

//              학생별 총점 구하기
//            int std[] new int[5];   학생별 총점
//            for (int tmp[] :score) {
//                int i = 0;
//                for (int n: tmp) {
//                    std[i]+=n;
//                }
//                i++;
//            }
//            for (int i = 0; i < std.length; i++) {
//                System.out.println(i+" 번째 학생 총점" + std[i]);
//            }
//        }
        }
        System.out.println();
        System.out.printf("국어 총점%d\n", kor);
        System.out.printf("영어 총점%d\n", eng);
        System.out.printf("수학 총점%d\n", mat);
        System.out.printf("국어 평균%d\n", korAvg);
        System.out.printf("영어 평균%d\n", engAvg);
        System.out.printf("수학 평균%d", matAvg);
    }
}
