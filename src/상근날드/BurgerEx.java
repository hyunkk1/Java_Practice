package 상근날드;

import java.util.Scanner;

// 햄버거 3가지 종류
// 음료수 2가지 종류
// 햄버거 3가지 중 가장 싼거, 음료 2가지 중 가장 싼거 가격을 선택하고
// 세트메뉴이므로 50원 할인해서 금액 계산
// 1차원 배열 사용하는 문제
public class BurgerEx {
    public static void main(String[] args) {
        // 메뉴를 저장할 5개 배열 생성
        int[] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 입력 : ");
        // 배열에 햄버거와 음료 가격을 입력 받음
        for (int i = 0; i <menu.length; i++) {
            menu[i] = sc.nextInt();

        //int[] burger = new int[3];
        //for (int i = 0; i < 3; i++) {
        //    burger[1] = sc.nextInt();

        //int[] drink = new int[2];
        //for (int j = 0; j < 2; j++) {
        //    drink[1] = sc.nextInt();
        }
        // 햄버거와 음료의 값을 비교하기 위한 기준값 결정(배열의 값 중 한개)
        int minBurger = menu[0]; // 버거중 한개의 임의의 값
        int minDrink = menu[3]; // 음료 중 한개의 임의의 값

        // 햄버거와 음료 중 제일 싼 메뉴 찾기
        for(int i = 0; i < menu.length; i++) {
            if ((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if ((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        // 50원 할인해서 결과 출력하기
        System.out.println(minBurger + minDrink - 50);
    }
}
