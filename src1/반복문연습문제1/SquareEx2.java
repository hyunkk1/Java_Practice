package 반복문연습문제1;
// 10을 입력하면 10 미만의 소수의 합 출력
import java.util.Scanner;

public class SquareEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        System.out.print("숫자 n을 입력하세요: "); // 사용자에게 숫자 n을 입력하라는 메시지 출력
        int n = sc.nextInt(); // 사용자로부터 정수 n을 입력받음

        int isPrimes = 0; // 소수의 합을 저장할 변수 초기화

        // 2부터 n 미만까지의 숫자에 대해 반복문 실행
        for (int num = 2; num < n; num++) { // num이 소수인지 확인하여 소수이면 isPrimes에 더함
            if (isPrime(num)) {
                isPrimes += num;
            }
        }
        // n 미만의 소수의 합을 출력
        System.out.println("n 미만의 소수의 합: " + isPrimes);
    }

    // 소수인지 판별하는 함수
    public static boolean isPrime(int num) {
        // 1보다 작거나 같은 수는 소수가 아님
        if (num <= 1) {
            return false;
        }
        // 2부터 num의 제곱근까지의 수 중에 나누어 떨어지는 수가 있으면 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        // 위의 조건을 모두 통과하면 소수임
        return true;
    }
}
