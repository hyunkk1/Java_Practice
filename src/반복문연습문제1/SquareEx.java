// package 반복문연습문제1;
// 양의 정수 n을 입력받아 n * n 크기의 행렬을 출력하는 프로그램 작성
// 정수 입력 : 4
//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16

//import java.util.Scanner;
//
//public class SquareEx {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("양의 정수 n 입력 : ");
//        int n = sc.nextInt();
//        boolean isPrime = true; // 소수인지 아닌지 판별하는 변수
//        for(int i = 1; i <= n * n; i++) {
//            if( n % i == 0) isPrime = false;
//        }
//        if (n == 1) System.out.println();
//        if(isPrime) System.out.println(n + "은 소수 입니다.");
//        else System.out.println(n + "은 소수가 아닙니다.");
//    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("양의 정수 n 입력 : ");
//        int n = sc.nextInt();
//        int[][] matrix = new int[n][n]; // gpt
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = i * n + j + 1; // n*n까지 순차적으로 출력
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println(); // 다음 행으로 이동
//        }
//
//
//    }
//}
