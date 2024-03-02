package 스위치문연습;

import java.util.Scanner;

// 세자리의 정수를 입력 받아 가장 큰 수 출력
public class SwitchExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("세자리 정수를 입력하세요 : ");
        int oo = sc.nextInt();
        int kk,hh,ee;


        kk = oo / 100;
        hh = (oo % 100) / 10;
        ee = oo % 10;
        if (kk > hh) {
            System.out.println(Math.max(kk, ee));
        } else {
            System.out.println(Math.max(hh, ee));
        }

    }
}

//Scanner sc = new Scanner(System.in);
//        System.out.println("100의 자리 정수를 입력하세요 : ");
//int num = sc.nextInt();
//int a = num / 100;  // 100으로 나눈 몫을 구함
//int b = (num % 100)/10; // 100으로 나눈 몫을 구하고, 10으로 다시 나눈 몫을 구함
//int c = (num % 10);     // 10으로 나누면 c가 소수첫째자리
// Math.max 를 활용하자***