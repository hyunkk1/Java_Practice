package 형변환연습;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


// 형변환이란? 하나의 데이터 타입을 다른 타입으로 변환하는 것
// 형변환에는 묵시적 형변환과 명시적 형변환이 있음
// 묵시적 형변환 : 자동으로 일어남, 자바 컴파일러가 유리한 방향으로 형을 변경해줌.
// 명시적 형변환 : 개발자가 의도를 가지고 형을 변경하는 것
public class TypeCastEx {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        // 아래의 코드는 명시적 형변환과 묵시적 형변환이 일어났음.
        double rst1 = (double) num1 / num2; // 정수를 나누기 연산을 했기 때문에 소수점 이하가 없어짐. num1 / num2를 컴파일러가
        // 묵시적 형변환을 했기 때문에 앞에 개발자가 (double)로 명시적 형변환을 해줌.
        System.out.println(rst1);

        // 타입 변환 메소드
        // 문자열을 정수로 변환하는 메소드
        int value1 = parseInt("123"); // 123, "123"
        double value2 = parseDouble("123.55555");
        System.out.println(value1);
        System.out.println(value2);



    }
}
