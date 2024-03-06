package 객체타입확인;
// 객체 타입을 확인하는 instanceof
public class ObjectType {
    public static void main(String[] args) {
        Parent parent = new Parent("부모 클래스");
        Child child = new Child("자식 클래스");
        System.out.println(parent instanceof Parent); // true
        System.out.println(child instanceof Parent); // (A가 B에 상속인지)상속관계가 성립하므로 true
        System.out.println(parent instanceof Child); // false
        System.out.println(child instanceof Child); // true


    }
}


class Parent {
    String name;
    Parent(String name) {
        this.name = name;
    }
}

class Child extends  Parent {

    Child(String name) {
        super(name); // 부모 생성자 호출
        this.name = name;
    }
}

