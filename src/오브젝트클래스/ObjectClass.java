package 오브젝트클래스;

public class ObjectClass {
    public static void main(String[] args) {
        Student student = new Student();
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.equals(car2));
        car1 = car2; // 두 참조 변수가 같은 주소를 가리킴.
        System.out.println(car1.equals(car2));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}

class Student {
    int id;
    String name;
}

class Car {

}
