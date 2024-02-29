package 스위치문연습;

import java.util.Scanner;

public class SwitchExam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("이름을 입력해주세요 : ");
            String name = sc.nextLine();
            System.out.println("제목을 입력해주세요 : ");
            String title = sc.nextLine();
            System.out.println("날짜('YYMMDD')을 입력해주세요 : ");
            String date = sc.nextLine();
            System.out.println("시간을 입력해주세요 : ");
            String time = sc.nextLine();


            String month = date.substring(4, 6);
            String greeting = "";
            switch (month) {
                case "01" : case "02" : case "12" :
                    System.out.println("한파의 연속인 1월입니다.");
                case "03" :
                    System.out.println("봄의 기운이 느껴지는 3월입니다.");
                case "04" :
                    System.out.println("새싹이 피어나는 4월입니다.");
                case "05" :
                    System.out.println("계절의 여왕 5월입니다.");
                case "06" :
                    System.out.println("활동하기 좋은 6월입니다.");
                case "07" :
                    System.out.println("휴가가 기다려지는 7월입니다.");
                case "08" :
                    System.out.println("무더운 8월입니다.");
                case "09" :
                    System.out.println("신선한 9월입니다.");
                case "10" :
                    System.out.println("천고마비의 계절 10월입니다.");
                case "11" :
                    System.out.println("쓸쓸한 늦가을 11월입니다.");
            }
    }
}
