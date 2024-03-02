package 반복문2번;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

// 반복문의 종류 : while, do - while, for
// while 문은 대부분의 경우 횟수가 정해지지 않는 경우에 사용
// for 문은 반복 횟수가 정해져 있는경우에 사용

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("나이 입력 : ");
        int age;
//        while (true) {
//            age = sc.nextInt();
//            if (age >= 0 && age < 200) break; // 한줄짜리 코드는 중괄호 생략가능
//            System.out.println("나이를 잘못 입력했습니다.");
//        }
        boolean isRetry = false;
        do {
            System.out.println("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(isRetry) {
                System.out.println("나이를 잘못 입력했습니다.");
            }
            isRetry = true;

        } while (age < 0 || age >= 200 );
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
