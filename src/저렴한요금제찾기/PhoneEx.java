package 저렴한요금제찾기;

import java.util.Scanner;

public class PhoneEx {
    public static void main(String[] args) {
        int[] time = new int[20]; // 통화시간
        int ys = 0;
        int ms = 0; // 영식 민식 요금제 요금 누적하는 변수

        Scanner sc = new Scanner(System.in);
        System.out.println("통화 횟수 : "); // 통화횟수 입력
        int n = sc.nextInt();
        System.out.println("통화 시간 : "); // 횟수별 통화시간 입력
        for(int i = 0; i < n; i++ ) {
            time[i] = sc.nextInt();
        }
        for(int f : time) { // 향상된 for문을 이용한 영식 민식 요금제 계산
            ys = ys + (f / 30) * 10 + 10; // 각 배열의 통화시간을 요금으로 환산하고 누적
            ms = ms + (f / 60) * 15 + 15;
        }
        if(ys > ms) { // 영식 민식중 더 저렴한 요금제 출력
            System.out.println("M" + ms);
        } else if(ys < ms) {
            System.out.println("Y" + ys);
        } else {
            System.out.println("Y M" + ys);
        }

    }
}
