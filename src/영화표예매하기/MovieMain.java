package 영화표예매하기;

import java.util.Scanner;

// 예매하기와 종료하기 메뉴 작성
// 극장의 좌석은 10개 입니다.
// 각 좌석당 판매 가격은 생성자를 통해 정의입니다.
public class MovieMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicketEx movieTicket = new MovieTicketEx(13000);
        while (true) {
            System.out.print("[1]예매하기");
            System.out.print("[2]종료하기");
            int selMenu = sc.nextInt();
            if (selMenu == 1) movieTicket.selectSeat();
            else {
                System.out.println(movieTicket.totalAmount());
                return;
            }
        }
    }
}