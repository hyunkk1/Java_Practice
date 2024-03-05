package 메소드오버로딩;
// 메소드 오버로딩이란? 같은 이름의 메소드를 중복하여 정의하는것
// 규칙 1. 메소드 이름이 같아야한다.
// 규칙 2. 매개변수의 개수나 타입이 달라야함
// 규칙 3. 반환 타입은 의미 없음(해당 사항 없음)
public class MethodOver {
    public static void main(String[] args) {
        System.out.println(sum(100, 200 ,300));
        System.out.println(sum("KOREA", "SEOUL"));
        System.out.println(sum(100, "KK", 200));
    }
    static int sum(int x, int y) {
        return x + y;
    }
    static String sum(String x, String y) {
        return  x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
    static int sum(int x, String y, int z) {
        if(y.equals("KK")) return x + 10000 + z;
        else return x + z;
    }

}
