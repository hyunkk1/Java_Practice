package 배열기본;

public class ArrayBasicEx {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 길이가 3개인 정수타입 배열 생성

        arr[0] = 85;
        arr[1] = 100;
        arr[2] = 67;
        // 기본적인 for문
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += 5;
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//        // 향상된 for 문 : 자동 순회, 자동 순회하면서 요소의 값을 가져옴
//        for (int e : arr) {
//            e += 3;
//            System.out.println(e + " ");
//        }
//        System.out.println();
//        for (int e : arr) {
//            System.out.print( e + " ");
//        }
        String[] weeks = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        for (int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i]);

        System.out.println();}

        for (String e : weeks) System.out.print(e);

    }
}
