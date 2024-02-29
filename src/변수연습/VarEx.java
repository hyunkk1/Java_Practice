package 변수연습;

public class VarEx {
    public static void main(String[] args) {
        int age; // 나이를 저장하기 위해 4Byte 공간을 확보함.
        age = 100; // age라는 변수에 100이라는 값을 넣어줌.
        double taxRate = 1.0; // 자바는 Camel 표기법으로 두번째글자에 대문자 선언
        int jobs; // 변수이름은 소문자로 지어야 함.

        int year = 2024; // 선언과 동시에 값을 할당
        int day = 0; // 선언과 동시에 값을 0으로 초기화
        String name = ""; // 이름이라는 문자열을 담는 변수를 선언하고 초기화
        // String name = null; 도 가능

        int n = 20;
        int m = 30;
        if(n > 10) {
            m = n - 10;
        }
        int k = n + m; // m은 이미 메모리에서 사라지고  없음. 윗줄에서 중괄호를 닫음으로써 사라짐.
        System.out.println("k : " + k);
        /* int switch; // 예약어라서 안됨
        int 23rate; // 숫자가 앞에 오면 안됨
        int kor$#; // 특수문자는 _, $만 사용가능 */
        // 자바에서 = 는 대입 연산자이고, 같다는 == 사용.

        String addr = "서울시 강남구 역삼동 KH정보교육원"; // address 주소 addr = 8byte
        String addr2 = "서울시 강남구 역삼동 KH정보교육원"; // 둘이 같은주소. 같은 문자로 입력되면 선언된 변수가 2개더라도 같은 주소
        // 실수형 : 지수와 가수로 표현되면 가수 부분이 정밀도 연관이 있음, 근사치 표기법
        float height = 170.55f; // float형은 표기시 F, f를 붙여야함
        double pi = 43.145992653589793;

        // 변수 (variable), 상수 (constant) : 고정된 값을 표기할 때 사용
        final double PI = 3.141592; // 한번 값이 대입되면 더이상 변경되지 않음. = final
        final int YEAR = 365;

    }
}
