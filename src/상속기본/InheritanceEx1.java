package 상속기본;
// 상속이란? 자식클래스가 부모클래스의 기능을 물려 받는것(필드, 메소드)
// 자식클래스는 부모클래스를 상속받으면 부모클래스의 크기와 같거나 커진다.
// 상속을 받아서 그대로 사용하몀ㄴ 상속개념이 적용되고, 기능을 개선하거나 새롭게 만들면 다형성(오버라이딩)이 적용

public class InheritanceEx1 {
    public static void main(String[] args) {
        HouseDog dog = new HouseDog(); // Dog 클래스의 기본 생성자로 객체 생성
        dog.setName("댕댕이1번");
        System.out.println(dog.name);
        dog.sleep();
        dog.sleep(3);


    }
}

class Animal { // Animal 다음에 extends Object 라는 조상격 클래스가 숨겨져있음
    String name; // 인스턴스 필드
    void setName(String name) {
        this.name = name;
    }
}
// Animal을 상속받아 Dog 만들기
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "zzz");
    }
}
class HouseDog extends Dog {
    @Override // 오버라이드 관계가 성립하는지를 문법적으로 확인
    void sleep() {
        System.out.println(name + "zzz in house");
    }
    // 메소드 오버로딩
    void sleep(int hour) {
        System.out.println(name + "zzz in for " + hour + "hours");
    }
}

