package 버스문제_3월3일연습;

import java.util.Scanner;

public class bus_0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("버스 정보를 입력하세요 : ");

        String bus = sc.nextLine();

        if (bus.equals("상암08")) {
            System.out.println(bus + "번 버스");
            System.out.println("약 3분 후 도착");
            System.out.println("남은거리 1.2km");
        } else if (bus.equals("1234")) {
            System.out.println(bus + "번 버스");
            System.out.println("약 5분 후 도착");
            System.out.println("남은거리 0.8km");
        } else {
            System.out.println("버스번호를 다시 입력하세요");
        }
    }

}
// equals 대신 == 사용시 1234나 상암08을 입력해도 버스 번호를 다시 입력하라는 결과가 출력됨. equals를 쓰지 않고 가능한 방법이 있을까?


