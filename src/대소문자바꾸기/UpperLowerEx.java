package 대소문자바꾸기;

import java.util.Scanner;

// 영어 소문자와 대문자로이루어진단어를 입력받은 뒤, 대문자는 소문자로
// 소문자는 대문자로 바꾸어 출력하는 프로그램 작성
// AbCdEf = aBcDeF
public class UpperLowerEx {
    public static void main(String[] args) {
        // 문자열을 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // 해당 인덱스의 문자열 추출
            if(ch < 'a') System.out.println((char)(ch + ('a' - 'A')));
            else System.out.println((char)(ch - ('a' - 'A')));
        }
    }
}
