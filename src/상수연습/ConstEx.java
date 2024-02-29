package 상수연습;

import java.util.Scanner;

public class ConstEx {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // 세율 상수로 정의
        Scanner sc = new Scanner(System.in); // 키보드로부터 값을 입력 받기 위해 스캐너 객체 생성
        System.out.print("수입을 입력하세요"); // 문구 출력 후 줄바꿈을 하지 않기 위해서 print 사용
        int income = sc.nextInt(); // 정수값을 입력 받아 income 변수에 대입
        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE));


    }
}
