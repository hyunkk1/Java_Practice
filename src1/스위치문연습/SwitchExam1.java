package 스위치문연습;

import java.util.Scanner;

public class SwitchExam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받이귀해 한번만 생성
 //               System.out.print("성적을 입력하세요 : ");
//        int score = sc.nextInt();
// 내가한거
//        if (score >= 90 && score <= 100) {
//            System.out.println("등급은 A 입니다.");
//        } else if (score <= 89 && score >= 80) {
//            System.out.println("등급은 B 입니다.");
//        } else if (score <= 79 && score >= 70) {
//            System.out.println("등급은 C 입니다.");
//        } else if (score <= 69 && score >= 60) {
//            System.out.println("등급은 D 입니다.");
//        } else if (score <= 59) {
//            System.out.println("등급은 F 입니다.");
//        } else {
//            System.out.println("성적을 잘못입력했습니다. 다시 입력하세요");
//        }
        int score = 0; // 0;은 초기화
        while (true) { //성적이 잘못 입력된경우 재 입력처리를 하기위해
            System.out.println("성적을 입력하세요 : ");
            score = sc.nextInt();
            if (score < 0 || score > 100) continue; // 아래 코드를 수행하지않고 반복문의 조건으로 돌아감
            if (score >= 90) System.out.println("A");
            else if (score >= 80) System.out.println("B");
            else if (score >= 70) System.out.println("C");
            else if (score >= 60) System.out.println("D");
            else System.out.println("F");
            break; // 반복문과 switch - case의 탈출 조건으로 사용
        }
// 답안
    }
}
