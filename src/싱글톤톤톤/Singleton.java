package 싱글톤톤톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private Singleton() { // 생성자를 통해서 객체 생성이 되는걸 막기위해ㅔㅐ private  정의
        name = "test";
        id = 100;
    }
    static Singleton getSingleton() {
        return singleton;
    }
}
