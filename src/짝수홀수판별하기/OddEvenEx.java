package 짝수홀수판별하기;

import java.util.Scanner;

// 임의의 정수를 입력받아 해당 값이 짝수인지 홀수인지 출력하는 문제
public class OddEvenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다");
        }
        else
        {
            System.out.println(num + "은 홀수입니다");
        }


    }
}
