package 추상클래스;
// 추상클래스는 객체를 생성할 수 없는 클래스를 의미
// 추상클래스에서는 추상메소드와 일반메소드가 혼용되어있음
// 다중상속을 지원하지않음
// 추상메소드는 "반드시" 자식클래스에서 오버라이딩해서 사용해야함(Why? 부모가 해당 메소드를 구현하지 않았기 때문

public class AbstractEx {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy S23");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

    }
}
