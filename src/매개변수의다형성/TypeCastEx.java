package 매개변수의다형성;

import 상속적용TV.ProductTV;

import java.util.Scanner;

public class TypeCastEx {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("구입할 제품을 입력([1] TV /[2] Computer /[3] Audio / [4] 종료) : ");
            int selNumber = sc.nextInt();
            switch (selNumber) {
                case 1:
                    System.out.println("TV를 구입합니다.");
                    buyer.buy(tv);
                    break;
                case 2:
                    System.out.println("Computer를 구입합니다.");
                    buyer.buy(computer);
                    break;
                case 3:
                    System.out.println("Audio를 구입합니다.");
                    buyer.buy(audio);
                    break;
                case 4:
                    buyer.viewinfo();
                    return;
                default:
                    System.out.println("잘못입력했습니다. 다시 입력하세요");
                    break;
            }
        }
    }
}

class Product {
    int price;
    int bounsPoint;
}
class TV extends Product {
    TV() {
        this.price = 100;
        this.bounsPoint = 10;
    }
}

class Computer extends Product {
    Computer() {
        this.price = 200;
        this.bounsPoint = 20;
    }
}
class Audio extends Product {
    Audio() {
        this.price = 120;
        this.bounsPoint = 12;
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) {
        money = money - p.price;
        bonusPoint = bonusPoint + p.bounsPoint;
    }
    void viewinfo() {
        System.out.println("잔액" + money);
        System.out.println("보너스 포인트" + bonusPoint);
    }
}


