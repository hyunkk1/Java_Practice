package 평균은넘겠지;

import java.util.Scanner;

public class AverageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 케이스 갯수 입력 : ");
        int testCase = sc.nextInt();
        for(int i = 0; i < testCase; i++) {
            int N = sc.nextInt();

            int[] score = new int[N];
            int sum = 0;
            for(int p = 0; p < N; p++) {
                score[p] = sc.nextInt();
                sum += score[p];
            }
            double avr = (double) sum / N;
            int aac = 0;
            for (int k : score) {
                if (k > avr) {
                    aac++;
                }
            }
            double raa = (double) aac / N * 100;
            System.out.printf("%.3f%%\n", raa);
        }

    }
}
