package 반복문1번;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : " );
        int num = sc.nextInt(); // 입력받은 정수를 num에 대입
        int sum = 0; // 주어진 합을 구하기위한 변수
//        while(num > 0) {
//            sum += num; // sum = sum + num
//            num--;
        //}
        // 초기값; 조건식; 증가값
    int i = 1;
    for (;;) {
        sum += i;
        if(i == num) break;
        i++;
    }
    System.out.println("정수의 합 ; " + sum);
    }
}
