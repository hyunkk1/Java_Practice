package 자동차만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택하세요 : [1]부산, [2]대전, [3]강릉, [4]광주");
        int end = sc.nextInt();

       // int oil = 0;

        while (true) {
            System.out.print("이동할 승객수를 입력하세요 : ");
            int people = sc.nextInt();

            if (people >= 1 && people <= 100) {
                System.out.println("승객수는 " + people + "명 입니다.");
                break;
            } else {
                System.out.println("승객수를 잘못 입력했습니다.");
            }
            // System.out.print("이동 수단을 선택하세요 : [1]스포츠카, [2]승용차, [3]버스");
            // int ride = sc.nextInt();
        }
        // 총거리를 시속으로 나누면 그것이 이동시간.
        // 부산 400km, 강릉 200km, 대전 150km,  광주 300km
        // 시속 스포츠카 250, 승용차 200, 버스 150
        int[] distance = {0, 400, 200, 150, 300};
        // Car





    }
}
