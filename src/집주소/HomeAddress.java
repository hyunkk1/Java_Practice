package 집주소;

import java.util.Scanner;
// 각숫자사이에는 1의 여백
// 1은 2cm 0은 4cm else 3cm
//
public class HomeAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("호수판 입력");
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0;

        String num = "";
        while (!num.equals("0")) {
            num = sc.nextLine();
            for (int i = 0; i < num.length(); i++) {
                sum = sum + numSize[num.charAt(i) - '0'] + 1;
            }
            if (!num.equals("0")) {
                System.out.println(sum + 1);
                sum = 0;
            }

        }
    }
}
