package 손익분기점문제;


import java.util.Scanner;

// 손익분기점 계산
// 노트북 판매 대수에 상관없이 매년 A만원의 고정비용이 발생
// 재료비와 인건비등 B라는 가변비용 발생
// ex) A = 1000, B = 70 일때 노트북 1대는 1,070만원, 10대는 1700만원 비용 발생
// 노트북 가격이 C만원으로 책정됬다고 했을때, 생산대수를 늘려가다보면 어느 순간
// 수입이 고정+가변비용보다 많아지게 된다(수익발생). 이를 손익분기점이라 하는데
// A, B, C가 주어졌을때 손익분기점을 구하는 프로그램 작성
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("고정비용을 입력하세요 : ");
        int A = sc.nextInt(); // 고정비용
        System.out.println("가변비용을 입력하세요 : ");
        int B = sc.nextInt(); // 가변(생산)비용
        System.out.println("판매금액을 입력하세요 : ");
        int C = sc.nextInt(); // 판매금액

        int bep = 0; // 판매대수 누적
        if(B < C) { // 가변비용이 판매비용보다 작으면
            bep = A / (C - B) + 1 ; // 손익분기점 공식: A / (C - B)
            System.out.println("손익분기점은 " + bep + "대 입니다. ");
        } else {
            System.out.println(-1);
            System.out.println("손익분기점이 존재하지 않습니다.");
        }
    }
}
 // 24번째 줄부터
// if(B >= C) 가변비용이 판매금액과 같거나 크면 절대 이익이 발생할 수 없음
// System.out.println(-1);
// return;
// }
// System.out.println((A / (C - B)) + 1);