package 스위치문연습;

import java.util.Scanner;

public class SwitchExam4_Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간 입력(시 분) : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int calc = (hour * 60) + min; // 계산의 편의를 위해서 모두 분으로 환산
        if(calc < 45) {
            calc = (24 * 60) + min; // 24시간 곱하기 60분
        }
        calc -= 45;
        System.out.println((calc / 60) + ":" + (calc % 60));
    }
}
